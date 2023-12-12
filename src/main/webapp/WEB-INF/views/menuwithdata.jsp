
<!doctype html>
<html lang="en">


<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="style1.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Moon Dance">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Neuton">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Rye">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Send Flowers">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <title>Menu</title>

</head>
<body>
<div class="bodywrap">
    <header></header>
    <div class="background">
        <div class="container">
            <div class="row1">
                <div class="col-12 d-flex justify-content-center align-items-center">
                    <div class="titlebox text-xs-left">
                        <h1 class="AloTra">
                            AloTra</h1>
                        <h1 class="DRINK">
                            DRINK</h1>
                    </div>
                </div>
            </div>
            <div class="row2">
                <div class="scroll-container">
                    <div class="content">
                        <div class="row">
                            <div class="col ">
                                <img src="https://www.koithe.com/uploads/products/59cf046c0efcc.png" id="golden"
                                     class="goldenbubble" alt="Nor foam" width="180" height="380">
                                <div id="customGolden" class="modal">
                                    <div class="modal-content">
                                        <p>

                                        <h1>Golden Bubble Milk Tea</h1> <br> <br>
                                        Our rich and creamy milk tea is further elevated to the next level
                                        when combined with our one-of-a-kind golden bubbles. Savor the
                                        different flavors and textures as the bubbles bounce around in your
                                        mouth.</p>
                                        <button id="closeGolden" class="close-button">Close</button>

                                    </div>
                                    <button style="background-color: rgb(248, 225, 175);"
                                            class="buybutton justify-content-center align-items-center"
                                            onclick="redirectToBuyPage(6)" >Buy</button>

                                </div>

                            </div>
                            <div class="col d-flex ">
                                <img src="https://www.koithe.com/uploads/products/59cf02bf0cc72.png" id="black"
                                     class="blacktea" alt="Nor foam" width="180" height="380">
                                <div id="customBlack" style="display: none;" class="modal">
                                    <div class="modal-content">
                                        <p>



                                        <h1>Black Tea Macchiato</h1> <br> <br>
                                        Cream is carefully whipped to the desired consistency before being
                                        added into our tea. The lustrous cream, when combined with a
                                        full-bodied black tea, really brings about a heavyweight of a drink.
                                        Sip it through an opening to allow the cream and tea to mix in your
                                        mouth.</p>
                                        <button id="closeBlack" class="close-button">Close</button>

                                    </div> <button  style="background-color: rgb(248, 225, 175);"
                                                    class="buybutton justify-content-center align-items-center"
                                                    onclick="redirectToBuyPage(1)">Buy</button>

                                </div>
                                <!-- <div id="click" style="display:none;">content</div> -->
                            </div>
                            <div class="col">
                                <img src="https://www.koithe.com/uploads/products/59cf27e7e8da2.png" id="matcha"
                                     class="matcha" alt="Nor foam" width="180" height="380">
                                <div id="customMatcha" style="display: none;" class="modal">
                                    <div class="modal-content">
                                        <p>
                                        <h1>Matcha Latte</h1> <br> <br>
                                        Made from Japan, our matcha powder contains no additives or
                                        preservatives. The rich yet slightly bitter matcha neutralizes with the
                                        smooth fresh milk to achieve the signature luscious green tea latte
                                        texture and flavor.</p>
                                        <button id="closeMatcha" class="close-button">Close</button>

                                    </div> <button  style="background-color: rgb(248, 225, 175);"
                                                    class="buybutton justify-content-center align-items-center"
                                                    onclick="redirectToBuyPage(7)">Buy</button>

                                </div>
                            </div>
                            <div class="col">
                                <img src="https://www.koithe.com/uploads/products/59cf27b3d7cde.png" id="milk"
                                     class="milktea" alt="Nor foam" width="180" height="380">
                                <div id="customMilk" style="display: none;" class="modal">
                                    <div class="modal-content">
                                        <p>
                                        <h1> Taro Q Milk Tea
                                        </h1> <br> <br>
                                        Yet another delight unique to KOI, our luscious milk tea paired with
                                        aromatic taro (yam) balls. The fragrance from these purple globes
                                        complements our milk tea perfectly, and they’re fun to chew at too!</p>
                                        <button id="closeMilk" class="close-button">Close</button>

                                    </div> <button style="background-color: rgb(248, 225, 175);"
                                                   class="buybutton justify-content-center align-items-center"
                                                   onclick="redirectToBuyPage(8)">Buy</button>

                                </div>
                            </div>
                            <div class="col ">
                                <img src="https://www.koithe.com/uploads/products/59cf2960ae59e.png" id="yakult"
                                     class="yakult" alt="Nor foam" width="180" height="380">
                                <div id="customYakult" style="display: none;" class="modal">
                                    <div class="modal-content">
                                        <p>
                                        <h1> Yakult Green Tea
                                        </h1> <br> <br>
                                        Don’t let this seemingly gimmicky drink fool you, it’s packed with
                                        anti-oxidants from green tea and beneficial probiotics from the popular
                                        health drinks brand. It’s slightly sweet and tangy, yet still retains
                                        the refreshing qualities of green tea. Not all healthy stuffs have to
                                        taste awful!</p>
                                        <button id="closeYakult" class="close-button">Close</button>

                                    </div> <button  style="background-color: rgb(248, 225, 175);"
                                                    class="buybutton justify-content-center align-items-center"
                                                    onclick="redirectToBuyPage(4)">Buy</button>

                                </div>
                            </div>
                        </div>

                    </div>

                </div>

            </div>
        </div>
    </div>
</div>
<div class="background2">
    <div class="container">
        <div class="row">
            <div class="col-12 d-flex justify-content-center align-items-center">
                <div class="titlebox text-xs-left">
                    <h1 class="AloTraFD"
                        style="font-family: Rye, sans-serif;display: flex; color: #000000;flex-direction: column;align-items: flex-start;">
                        AloTra FOOD & DRINKS</h1>
                </div>
            </div>
        </div>
        <div class="row" style="margin-top: 50px">
            <div class="col-4 d-flex justify-content-center coltea">
                <img class="icontea" src="https://cdn-icons-png.flaticon.com/512/135/135535.png" width="60px"
                     height="60px">
                <div style="display: flex; flex-direction: column; align-items: flex-start; margin-top: 25px;">
                    <h1 class="AloTra"
                        style="font-family: 'Send Flowers', sans-serif; color: #060606; font-size: 35px; font-style: normal; font-weight: bold;">
                        Tea
                    </h1>
                    <hr class="line">

                    <ul class="listtea">
                        <c:forEach var="product" items="${products}">
                            <c:if test="${product.category eq 'Tea'}">
                                <li class="drink_list">
                                    <a href="/prebuy/${product.idProduct}">${product.name}</a>
                                    <span><c:out value="${product.cost}"/> $</span>
                                </li>
                            </c:if>
                        </c:forEach>
                    </ul>
                </div>
            </div>
            <!-- Milk Tea section -->
            <div class="col-4 d-flex justify-content-center colmilk">
                <img class="icontea2" src="https://cdn-icons-png.flaticon.com/512/5335/5335900.png" width="60px"
                     height="60px">
                <div style="display: flex; flex-direction: column; align-items: flex-start; margin-top: 25px;">
                    <h1 class="AloTra2"
                        style="font-family: 'Send Flowers', sans-serif; color: #060606; font-size: 35px; font-style: normal; font-weight: bold;">
                        Milk Tea
                    </h1>
                    <hr class="line">

                    <ul class="listtea">
                        <c:forEach var="product" items="${products}">
                            <c:if test="${product.category eq 'Tea'}">
                                <li class="drink_list">
                                    <a href="/prebuy/${product.idProduct}">${product.name}</a>
                                    <span><c:out value="${product.cost}"/> $</span>
                                </li>
                            </c:if>
                        </c:forEach>
                    </ul>
                </div>
            </div>

            <!-- Coffee section -->
            <div class="col-4 d-flex justify-content-center colcoffee">
                <img class="icontea3" src="https://cdn-icons-png.flaticon.com/512/751/751621.png" width="60px"
                     height="60px">
                <div style="display: flex; flex-direction: column; align-items: flex-start; margin-top: 25px;">
                    <h1 class="AloTra3"
                        style="font-family: 'Send Flowers', sans-serif; color: #060606; font-size: 35px; font-style: normal; font-weight: bold;">
                        Coffee
                    </h1>
                    <hr class="line">

                    <ul class="listtea">
                        <c:forEach var="product" items="${products}">
                            <c:if test="${product.category eq 'Coffee'}">
                                <li class="drink_list">
                                    <a href="/prebuy/${product.idProduct}">${product.name}</a>
                                    <span><c:out value="${product.cost}"/> $</span>
                                </li>
                            </c:if>
                        </c:forEach>
                    </ul>
                </div>
            </div>

            <!-- Cake section -->
            <div class="col-4 d-flex justify-content-center colcake">
                <img class="icontea4" src="https://cdn-icons-png.flaticon.com/512/2561/2561550.png" width="60px"
                     height="60px">
                <div style="display: flex; flex-direction: column; align-items: flex-start; margin-top: 25px;">
                    <h1 class="AloTra4"
                        style="font-family: 'Send Flowers', sans-serif; color: #060606; font-size: 35px; font-style: normal; font-weight: bold;">
                        Cake
                    </h1>
                    <hr class="line">

                    <ul class="listtea">
                        <c:forEach var="product" items="${products}">
                            <c:if test="${product.category eq 'Cake'}">
                                <li class="drink_list">
                                    <a href="/prebuy/${product.idProduct}">${product.name}</a>
                                    <span><c:out value="${product.cost}"/> $</span>
                                </li>
                            </c:if>
                        </c:forEach>
                    </ul>
                </div>
            </div>

            <!-- Bread section -->
            <div class="col-4 d-flex justify-content-center colbread">
                <img class="icontea5" src="https://cdn-icons-png.flaticon.com/512/4241/4241638.png" width="60px"
                     height="60px">
                <div style="display: flex; flex-direction: column; align-items: flex-start; margin-top: 25px;">
                    <h1 class="AloTra5"
                        style="font-family: 'Send Flowers', sans-serif; color: #060606; font-size: 35px; font-style: normal; font-weight: bold;">
                        Bread
                    </h1>
                    <hr class="line">

                    <ul class="listtea">
                        <c:forEach var="product" items="${products}">
                            <c:if test="${product.category eq 'Bread'}">
                                <li class="drink_list">
                                    <a href="/prebuy/${product.idProduct}">${product.name}</a>
                                    <span><c:out value="${product.cost}"/> $</span>
                                </li>
                            </c:if>
                        </c:forEach>
                    </ul>
                </div>
            </div>

            <!-- Other section -->
            <div class="col-4 d-flex justify-content-center colother">
                <img class="icontea6" src="https://cdn-icons-png.flaticon.com/512/3731/3731433.png" width="60px"
                     height="60px">
                <div style="display: flex; flex-direction: column; align-items: flex-start; margin-top: 25px;">
                    <h1 class="AloTra6"
                        style="font-family: 'Send Flowers', sans-serif; color: #060606; font-size: 35px; font-style: normal; font-weight: bold;">
                        Other
                    </h1>
                    <hr class="line">

                    <ul class="listtea">
                        <c:forEach var="product" items="${products}">
                            <c:if test="${product.category eq 'Other'}">
                                <li class="drink_list">
                                    <a href="/prebuy/${product.idProduct}">${product.name}</a>
                                    <span><c:out value="${product.cost}"/> $</span>
                                </li>
                            </c:if>
                        </c:forEach>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
        crossorigin="anonymous"></script>
</body>
<script>
    var imageA = document.getElementById('golden');
    var imageB = document.getElementById('black');
    var imageC = document.getElementById('matcha');
    var imageD = document.getElementById('milk');
    var imageE = document.getElementById('yakult')


    var scrollContainer = document.querySelector('.scroll-container');

    var customModal = document.getElementById('customGolden');
    var closeModal = document.getElementById('closeGolden');
    var customModal1 = document.getElementById('customBlack');
    var closeModal1 = document.getElementById('closeBlack');
    var customModal2 = document.getElementById('customMatcha');
    var closeModal2 = document.getElementById('closeMatcha');
    var customModal3 = document.getElementById('customMilk');
    var closeModal3 = document.getElementById('closeMilk');
    var customModal4 = document.getElementById('customYakult');
    var closeModal4 = document.getElementById('closeYakult');

    imageA.addEventListener('click', function () {
        customModal.style.display = 'block';
    });
    imageB.addEventListener('click', function () {
        customModal1.style.display = 'block';
    });
    imageC.addEventListener('click', function () {
        customModal2.style.display = 'block';
    });
    imageD.addEventListener('click', function () {
        customModal3.style.display = 'block';
    });
    imageE.addEventListener('click', function () {
        customModal4.style.display = 'block';
    });

    closeModal.addEventListener('click', function () {
        customModal.style.display = 'none';
    })
    closeModal1.addEventListener('click', function () {
        customModal1.style.display = 'none';
    })
    closeModal2.addEventListener('click', function () {
        customModal2.style.display = 'none';
    })
    closeModal3.addEventListener('click', function () {
        customModal3.style.display = 'none';
    })
    closeModal4.addEventListener('click', function () {
        customModal4.style.display = 'none';
    })

    scrollContainer.addEventListener('scroll', function () {
        var scrollX = scrollContainer.scrollLeft;
        customModal.style.left = scrollX + 'px';
    })
    scrollContainer.addEventListener('scroll', function () {
        var scrollX = scrollContainer.scrollLeft;
        customModal1.style.left = scrollX + 'px';
    })
    scrollContainer.addEventListener('scroll', function () {
        var scrollX = scrollContainer.scrollLeft;
        customModal2.style.left = scrollX + 'px';
    })
    scrollContainer.addEventListener('scroll', function () {
        var scrollX = scrollContainer.scrollLeft;
        customModal3.style.left = scrollX + 'px';
    })
    scrollContainer.addEventListener('scroll', function () {
        var scrollX = scrollContainer.scrollLeft;
        customModal4.style.left = scrollX + 'px';
    })
    function redirectToBuyPage(productId) {
        // Tạo đường dẫn dựa trên productId
        var redirectUrl = '/prebuy/' + productId;

        // Chuyển hướng trang
        window.location.href = redirectUrl;
    }
</script>

<script>
    const jsonUser = [${jsonUser}];
</script>
<script src="/resources/static/js/components/header/header.js"></script>

</html>

