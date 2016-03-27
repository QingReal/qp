<!DOCTYPE>
<html>
	
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>Insert title here</title>
		
	</head>

	<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">

	<link href="${rc.contextPath}/resources/system/css/custom.css" rel="stylesheet" type="text/css" />
	
	<script src="https://cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
	
	<script src="https://cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
	<body>
	<#include "../common/left.ftl"/>
	<div class="col-lg-10 no-padding full-height">
		<#include "../common/top.ftl"/>
			<div class="right-content">
				<div style="clear:both"></div>
				<div class="data-grid">
					<table style="width:100%;border-collapse: collapse;border-radius:1rem;">
						<thead>
					  		<tr>
								<td>姓名 <a><i class="fa fa-caret-down"></i></a></td>
								<td>邮箱 <a><i class="fa fa-caret-down"></i></a></td>
								<td>性别 <a><i class="fa fa-caret-down"></i></a></td>
								<td>创建时间 <a><i class="fa fa-caret-down"></i></a></td>
								<td>修改时间 <a><i class="fa fa-caret-down"></i></a></td>
								<td>状态 <a><i class="fa fa-caret-down"></i></a></td>
							</tr>
					  	</thead>

					  	<tbody>
					  		<#list page.data as item>
					  			<tr>
					  				<td>
					  					${item.name}
					  				</td>
					  				<td>
					  					${item.email}
					  				</td>
					  				<td>
					  					${item.sex}
					  				</td>
					  				<td>
					  					${item.createDate}
					  				</td>
					  				<td>
					  					${item.modifyDate}
					  				</td>
					  				<td>
					  					${item.status}
					  				</td>
					  			</tr>
					  		</#list>
					  	</tbody>
					  	<tfoot>
					  		<tr>
					  			<td>${page.totalCount}条记录</td>
					  			<td><a>上一页</a> | 当前${page.getCurrentPageNo()}页 | <a>下一页</a></td>
					  		</tr>
					  	</tfoot>
		  			</table>
					  			
				</div>
	  		</div>
		  	
		</div>	
	</body>
</html>