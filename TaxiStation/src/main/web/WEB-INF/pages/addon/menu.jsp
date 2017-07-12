<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page session="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="udt" uri="customtags"%>

<fmt:setLocale value="${empty sessionScope.locale ? 'en_US' : sessionScope.locale}"/>
<fmt:setBundle basename="/i18n/messages" var="i18n" />

<head>
    <title>Taxi Station</title>
     <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">
    <link rel="stylesheet" href="/resources/css/header-login-signup.css">
    <link rel="stylesheet" href="<c:url value="/resources/css/msg.css" />">
    <link rel="stylesheet" href="<c:url value="/resources/css/custom.css" />">
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>

<body>
	<div class="container main-container">

		<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand"
					href="${pageContext.request.contextPath}/controller/"><fmt:message
						key="taxistation.main" bundle="${rb}" /></a>
			</div>
			<ul class="nav navbar-nav">
				<li><a
					href="${pageContext.request.contextPath}/controller/books"><fmt:message
							key="library.books" bundle="${i18n}" /></a></li>
				<!-- c:if test="${not empty user}">
					<c:if test="${user.getRole().getValue() eq 'librarian' }">
						<li><a
							href="${pageContext.request.contextPath}/controller/librarian/authors"><fmt:message
									key="library.authors" bundle="${rb}" /></a></li>
					</c:if>
					<c:if test="${user.getRole().getValue() eq 'librarian' }">
						<li><a
							href="${pageContext.request.contextPath}/controller/librarian/readers"><fmt:message
									key="library.readers" bundle="${rb}" /></a></li>
					</c:if>
					<li><a href="${pageContext.request.contextPath}/controller/reader/orders"><fmt:message
								key="library.orders" bundle="${rb}" /></a></li>

				</c:if>-->
			</ul>

			<ul class="nav navbar-nav navbar-right">

				<c:if test="${not empty user}">
					<!-- Custom tag  -->
					<li><p class="navbar-text">
							<udt:user-data user="${user}" />
						</p></li>
				</c:if>
				<c:if test="${user.getRole().getValue() eq 'reader'}">
					<!-- <li><a
						href="${pageContext.request.contextPath}/controller/reader/changePassword">
							<fmt:message key="library.changePassword" bundle="${rb}" />
					</a></li>-->
				</c:if>
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#"> <i class="fa fa-globe"
						aria-hidden="true"></i> ${sessionScope.locale.getLanguage()} <span
						class="caret"></span></a>
					<ul class="dropdown-menu">
						<c:forEach items="${applicationScope.locales}" var="locale">
							<c:set var="lang" value="${locale.getLanguage()}" />
							<li><a
								href="${pageContext.request.contextPath}/controller/locale?lang=${lang}">${lang.toUpperCase()}</a></li>
						</c:forEach>
					</ul></li>
				<c:choose>
					<c:when test="${empty user}">
						<li><a
							href="${pageContext.request.contextPath}/controller/login"><span
								class="glyphicon glyphicon-log-out"></span> <fmt:message
									key="library.login" bundle="${rb}" /></a></li>
					</c:when>
					<c:otherwise>
						<li><a
							href="${pageContext.request.contextPath}/controller/logout"><span
								class="glyphicon glyphicon-log-in"></span> <fmt:message
									key="library.logout" bundle="${rb}" /></a></li>
					</c:otherwise>
				</c:choose>

			</ul>
		</div>
</nav>