package com.qp.core.base.realm;

import java.util.Collection;

import javax.annotation.Resource;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.stereotype.Component;

import com.qp.core.user.entity.Permission;
import com.qp.core.user.entity.Role;
import com.qp.core.user.entity.User;
import com.qp.core.user.service.UserService;

@Component
public class AppRealm extends AuthorizingRealm{
	
	@Resource
	private UserService userService;

	/**
	 * 授权方法
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
		
		Object principal = principalCollection.getPrimaryPrincipal();
		User user = userService.getUser((String)principal);
		if(user != null){
			SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
            for( Role role : user.getRoles() ) {
                info.addRole(role.getName());
                info.addObjectPermissions((Collection)role.getPermissions());
            }
            return info;
		}
		return null;
	}
	
	
	/**
	 * 验证方法
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken) throws AuthenticationException {		
		
		UsernamePasswordToken token = (UsernamePasswordToken) authcToken;
		User user = userService.getUser(token.getUsername());
		if( user != null ) {
            return new SimpleAuthenticationInfo(user.getEmail(), user.getPassword(), getName());
        }
        return null;
	
	}

}
