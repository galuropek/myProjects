<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<c:set var="language" value="${not empty param.language ? param.language : not empty language ? language : pageContext.request.locale}" scope="session" />
<fmt:setLocale value="${language}" />
<fmt:setBundle basename="src.project.webapp.res.lang" />
<html lang="${language}">
<%@ include file="include/head.htm" %>
<body>
    <div class="container">
        <%@ include file="include/menu.htm" %>

        <form action="do?command=Index" method="post">
            <div class="row justify-content-end">
                <div class="col-2">
                    <div class="form-group">
                        <select class="form-control" id="language" name="language" onchange="submit()">
                            <option value="en" ${language == 'en' ? 'selected' : ''}>English</option>
                            <option value="ru" ${language == 'ru' ? 'selected' : ''}>Русский</option>
                        </select>
                    </div>
                </div>
            </div>
        </form>

        <h1 class="text-center">Welcome to the car rental website!</h1>

        <div class="row">
              <div class="col-1">
              </div>
              <div class="col">
                <div class="card mb-3" style="max-width: 18rem;">
                  <img class="card-img" src="img/figure.png">
                  <div class="card-img-overlay">
                    <h3 class="card-title">Registration</h3>
                    <p class="card-text">If you want to place an order you need to LOGIN or REGISTRATION (if you don`t have an account).</p>
                    <p class="card-text"><a href="do?command=SignUp"><ins>Click to go.</ins></a></p>
                  </div>
                </div>
              </div>
              <div class="col">
                <div class="card mb-3" style="max-width: 18rem;">
                  <img class="card-img" src="img/figure.png">
                  <div class="card-img-overlay">
                    <h3 class="card-title">Login</h3>
                    <p class="card-text">If you want to place an order you need to LOGIN or REGISTRATION (if you don`t have an account).</p>
                    <p class="card-text"><a href="do?command=Login"><ins>Click to go.</ins></a></p>
                  </div>
                </div>
              </div>
            </div>
            <div class="row">
              <div class="col-1">
              </div>
              <div class="col">
                <div class="card mb-3" style="max-width: 18rem;">
                  <img class="card-img" src="img/figure.png">
                  <div class="card-img-overlay">
                    <h3 class="card-title">Car list</h3>
                    <p class="card-text">Large fleet and many individual offers for you. Our fleet is updated every month.</p>
                    <p class="card-text"><a href="do?command=CarList"><ins>Click to go.</ins></a></p>
                  </div>
                </div>
              </div>
              <div class="col">
                <div class="card text-white bg-danger mb-3" style="max-width: 18rem; height: 214.5px;">
                  <div class="card-img-overlay">
                    <h3 class="card-title">Reset</h3>
                    <p class="card-text">Be careful!<br> Update all data to basic settings.</p>
                    <p class="card-text"><a href="do?command=Reset"><span class="text-white"><ins>Click to go.</ins></span></a></p>
                  </div>
                </div>
              </div>
            </div>
    </div>
</body>
</html>
