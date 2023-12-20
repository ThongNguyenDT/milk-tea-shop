<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css" rel="stylesheet"/>
    <!-- Google Fonts -->
    <link href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap" rel="stylesheet"/>
    <link href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.4.2/mdb.min.css" rel="stylesheet"/>

    <link rel="stylesheet" href="/resources/static/css/auth/login.css">

</head>

<body>
<header></header>
<!-- Section: Design Block -->
<section class="text-center text-lg-start">
    <style>
        .cascading-right {
            margin-right: -50px;
        }

        @media (max-width: 991.98px) {
            .cascading-right {
                margin-right: 0;
            }
        }
    </style>

    <!-- Jumbotron -->
    <div class="container py-4">
        <div class="row g-0 align-items-center">
            <div class="col-lg-6 mb-5 mb-lg-0">
                <div class="card cascading-right" style="
              background: hsla(0, 0%, 100%, 0.55);
              backdrop-filter: blur(30px);
              ">
                    <div class="card-body p-5 shadow-5 text-center">
                        <h2 class="fw-bold mb-5">Sign up now</h2>
                        <span style="
                        <c:if test="${log.get('type') == 'error'}">
                                color:red;
                                background: lightblue;
                        </c:if>
                        <c:if test="${log.get('type') == 'success'}">
                                color:green;
                                background: lightblue;
                        </c:if>
                                width: 100%;
                                height: 25px;
                                margin-bottom: 24px;
                                display: block;
                                border-radius: 3px;">
                            ${log.get("message")}
                        </span>
                        <sf:form action="/alotra/register/save" method="post" modelAttribute="user">
                            <!-- Name input -->
                            <div class="form-outline mb-4">
                                <sf:input type="text" id="name" path="name" class="form-control"/>
                                <label class="form-label" for="name">Name</label>
                            </div>


                            <!-- UserName input -->
                            <div class="form-outline mb-4">
                                <sf:input type="text" id="username" path="username" class="form-control"/>
                                <label class="form-label" for="username">User Name</label>
                            </div>

                            <!-- Email input -->
                            <div class="form-outline mb-4">
                                <sf:input type="email" id="email" path="email" class="form-control"/>
                                <label class="form-label" for="email">Gmail address</label>
                            </div>


                            <!-- Password input -->
                            <div class="form-outline mb-4">
                                <sf:input type="password" id="password" path="password" class="form-control"/>
                                <label class="form-label" for="password">Password</label>
                                <sf:errors path="password"/>

                            </div>

                            <!-- PasswordConfirm input -->
                            <div class="form-outline mb-4">
                                <input type="password" id="PasswordConfirm" class="form-control"/>
                                <label class="form-label" for="PasswordConfirm">PasswordConfirm</label>
                                <sf:errors path="password"/>

                            </div>

                            <!-- PhoneNumber input -->
                            <div class="form-outline mb-4">
                                <sf:input type="tel" id="phoneNumber" path="phoneNumber" class="form-control"/>
                                <label class="form-label" for="phoneNumber">Phone Number</label>

                            </div>

                            <!-- Address input -->
                            <div class="form-outline mb-4">
                                <sf:input type="text" id="address" path="address" class="form-control"/>
                                <label class="form-label" for="address">Address</label>

                            </div>

                            <!-- Submit button -->
                            <button type="submit" class="btn btn-primary btn-block mb-4">
                                Sign up
                            </button>

                            <%--                                <!-- Register buttons -->--%>
                            <%--                                <div class="text-center">--%>
                            <%--                                    <p>or sign up with:</p>--%>
                            <%--                                    <button type="button" class="btn btn-link btn-floating mx-1">--%>
                            <%--                                        <i class="fab fa-facebook-f"></i>--%>
                            <%--                                    </button>--%>

                            <%--                                    <button type="button" class="btn btn-link btn-floating mx-1">--%>
                            <%--                                        <i class="fab fa-google"></i>--%>
                            <%--                                    </button>--%>

                            <%--                                    <button type="button" class="btn btn-link btn-floating mx-1">--%>
                            <%--                                        <i class="fab fa-twitter"></i>--%>
                            <%--                                    </button>--%>

                            <%--                                    <button type="button" class="btn btn-link btn-floating mx-1">--%>
                            <%--                                        <i class="fab fa-github"></i>--%>
                            <%--                                    </button>--%>
                            <%--                                </div>--%>
                        </sf:form>
                    </div>
                </div>
            </div>

            <div class="col-lg-6 mb-5 mb-lg-0">
                <img src="/resources/static/assets/image/landing-page/right-content.jpg" class="rounded-4 shadow-4"
                     alt=""/>
            </div>
        </div>
    </div>
    <!-- Jumbotron -->
</section>
<!-- Section: Design Block -->
<!-- MDB -->
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.4.2/mdb.min.js"></script>
<script type="text/javascript">
    var password = document.getElementById("password"),
        confirm_password = document.getElementById("PasswordConfirm");
    <c:forEach var="errorKey" items="${log.get('errors').keySet()}">
    var e_${errorKey} = document.getElementById("${errorKey}");
    </c:forEach>

    function validatePassword() {
        if (password.value != confirm_password.value) {
            confirm_password.setCustomValidity("Passwords Don't Match");
        } else {
            confirm_password.setCustomValidity('');
        }

    }

    password.onchange = validatePassword;
    confirm_password.onkeyup = validatePassword;
    <c:forEach var="errorKey" items="${log.get('errors').keySet()}">
    var error${errorKey} = document.createElement("span");
    error${errorKey}.style.cssText = "color:red; width: 100%; height: 25px; display: block; border-radius: 3px; margin-bottom:5px";
    error${errorKey}.innerText = "${log.get('errors').get(errorKey)}";
    <c:if test="${log.get('errors').get(errorKey) == null}">
    error${errorKey}.innerText = "${log.get('errors').get(errorKey)}";
    </c:if>
    e_${errorKey}.parentNode.after(error${errorKey});
    e_${errorKey}.parentNode.style.setProperty("margin-bottom", "0px", "important");
    </c:forEach>
</script>

</body>

</html>