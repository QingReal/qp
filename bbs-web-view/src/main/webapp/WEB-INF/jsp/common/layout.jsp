<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="utf-8"%>
<!DOCTYPE>
<html>
	
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>Insert title here</title>
		
	</head>
	
	<!-- 新 Bootstrap 核心 CSS 文件 -->
	<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">

	<link href="<%=request.getContextPath()%>/resources/system/css/custom.css" rel="stylesheet" type="text/css" />
	
	<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
	<script src="https://cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
	
	<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
	<script src="https://cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
	<body>
		<div class="col-lg-2 left-base no-padding no-margin">
		  	<div class="left-top">
		  		<div class="left-brand">
		  			
		  		</div>	  		
		  	</div>
		  	<div class="left-bar">
		  		<ul class="no-padding no-margin">
		  			<li>1级菜单</li>
		  			<li>1级菜单</li>
		  		</ul>
				
		  	</div>
		</div>
		<div class="col-lg-10 no-padding full-height">
		  	<div class="right-top">
		  		<ul class="pull-right list-inline">
		  			<li>帮助</li>
		  			<li>用户</li>
		  		</ul>
		  	</div>
		  	
		  	<ol class="breadcrumb right-path">
				<li><a href="#">主页</a></li>
				<li><a href="#">面包屑</a></li>
				<li class="active">面包屑</li>
			</ol>
			<div class="right-content">
				<div style="clear:both"></div>
				<div class="data-grid">
					<table class="table">
						<thead>
							<tr>
								<td>编号</td>
								<td>编号</td>
								<td>编号</td>
								<td>编号</td>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td><span><input type="checkbox"></span></td>
								<td><span>12</span></td>
								<td><span>12</span></td>
								<td><span>12</span></td>
							</tr>
							<tr>
								<td><input type="checkbox"></td>
								<td><span>12</span></td>
								<td><span>12</span></td>
								<td><span>12</span></td>
							</tr>
						</tbody>
						<tfoot>
							<tr>
								<td colspan="4" align="right">
									<nav>
										<ul class="pagination">
										    <li>
										    	<a href="#" aria-label="Previous">
										        	<span aria-hidden="true">&laquo;</span>
										      	</a>
										    </li>
										    <li><a href="#">1</a></li>
										    <li><a href="#">2</a></li>
										    <li><a href="#">3</a></li>
										    <li><a href="#">4</a></li>
										    <li><a href="#">5</a></li>
										    <li>
										      <a href="#" aria-label="Next">
										        <span aria-hidden="true">&raquo;</span>
										      </a>
										    </li>
									  	</ul>
									</nav>
								</td>
							</tr>
						</tfoot>
					</table>
				</div>
	  		</div>
		  	
		</div>
	</body>
</html>