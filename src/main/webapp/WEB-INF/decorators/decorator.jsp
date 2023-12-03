<%@ include file="../common/taglib.jsp"%>
<html>
<head>
    <title><sitemesh:write property="title"/></title>
    <sitemesh:write property="head"/>
    <link rel="stylesheet" href="/resources/static/js/components/header/header.css">
    <link rel="stylesheet" href="/resources/static/js/components/header/button.css">
    <link rel="stylesheet" href="/resources/static/js/components/header/hover_btn.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <link rel="stylesheet" href="/resources/static/css/style.css">
</head>
<body>
    <head></head>
    <sitemesh:write property="body"/>


    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
            crossorigin="anonymous"></script>
    <script src="https://kit.fontawesome.com/ac291e7c29.js" crossorigin="anonymous"></script>
    <%@include file="../common/web/jsHeader.jsp"%>

</body>
</html>