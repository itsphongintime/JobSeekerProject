<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- Navbar Start -->
        <nav class="navbar navbar-expand-lg bg-white navbar-light shadow sticky-top p-0">
            <a href="Home" class="navbar-brand d-flex align-items-center text-center py-0 px-4 px-lg-5">
                <h1 class="m-0 text-primary">JobEntry</h1>
            </a>
            <button type="button" class="navbar-toggler me-4" data-bs-toggle="collapse" data-bs-target="#navbarCollapse">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarCollapse">
                <div class="navbar-nav ms-auto p-4 p-lg-0">
                    <a href="Home" class="nav-item nav-link">Home</a>
                    <a href="about.jsp" class="nav-item nav-link">About</a>
                    <a href="JobList" class="nav-item nav-link">Jobs</a>
                    <a href="Category" class="nav-item nav-link">Categories</a>
                    <a href="contact.jsp" class="nav-item nav-link">Contact</a>
                </div>
                <c:if test="${empty sessionScope.user}">
                <a href="login.jsp" class="btn btn-primary rounded-0 py-4 px-lg-5 d-none d-lg-block">Log In<i class="fa fa-arrow-right ms-3"></i></a>
                </c:if>
                <c:if test="${not empty sessionScope.user}">
                <button class="btn btn-primary rounded-0 py-4 px-lg-5 d-none d-lg-block">Welcome ${user.name}</button>
                <a href="LogOut" class="btn btn-primary rounded-0 py-4 px-lg-5 d-none d-lg-block">Log Out</a>
                </c:if>
            </div>
        </nav>
     <!-- Navbar End -->
</body>
</html>