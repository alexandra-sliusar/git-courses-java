<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!-- %@ taglib prefix="custom" uri="/WEB-INF/custom.tld"%>-->
<c:set var="lang" scope="session" value="${empty sessionScope.locale ? 'en_US' : sessionScope.locale}" />
<fmt:setLocale value="${lang}" scope="session" />
<fmt:setBundle basename="/i18n/messages" var="bundle" scope="session"/>


<head>
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">
    <link rel='stylesheet' type='text/css' href='http://fonts.googleapis.com/css?family=Cookie'>
    <link rel="stylesheet" href="<c:url value="/resources/css/msg.css" />">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>${title}</title>
</head>