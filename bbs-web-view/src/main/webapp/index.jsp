<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
   String base = request.getContextPath();
   response.sendRedirect(base+"/admin/index.do");
%>