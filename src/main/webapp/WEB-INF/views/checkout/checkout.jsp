<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <meta name="viewport" content="initial-scale=1, width=device-width"/>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="/resources/static/css/checkout/checkout.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Roboto:wght@500&display=swap">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Sora:wght@100;300;600&display=swap">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Tienne:wght@700&display=swap">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=ABeeZee:wght@400&display=swap">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="_csrf" th:content="${_csrf.token}" />
    <meta name="_csrf_header" th:content="${_csrf.headerName}" />

</head>
<body>
<div class="bodywrap">
    <header>
    </header>

    <div class="checkout2 backgroundimg">
        <div class="body1">
            <div class="container">
                <div class="col-12 d-flex align-items-center flex-column center">
                    <img class="credit-card-1-icon" alt="" src="/resources/static/assets/checkout/creditcard-1@2x.png">
                    <div class="please-check-your">Please check your Customer information and Shopping Cart information
                        before paying
                    </div>
                </div>

                <div class="row">
                    <div class="col-6 border-right my-4">
                        <div class="customer-information d-flex align-items-center flex-column center">Customer
                            information
                        </div>
                        <div class="information">
                            <div class="fullname mt-3 rounded rounded-20">
                                <div class="full-name">Full name</div>
                                <input class="fullname1 form-control" name="fullname" id="fullname" type="text"
                                       style="width: 90%;">
                                <div class="fullname-child"></div>
                            </div>

                            <div class="email mt-3 rounded rounded-20">
                                <div class="email1">Email</div>
                                <div class="email-child"></div>
                                <input class="email2 form-control" name="email" id="email" type="text"
                                       style="width: 90%;">
                            </div>

                            <div class="phone mt-3 rounded rounded-20">
                                <div class="phone1">Phone</div>
                                <input class="phone2 form-control" name="phone" id="phone" type="text"
                                       style="width: 90%;">
                                <div class="phone-child"></div>
                            </div>

                            <div class="address mt-3 rounded rounded-20">
                                <div class="address1">Address</div>
                                <input class="address2 form-control" name="address" id="address" type="text"
                                       style="width: 90%;">
                                <div class="address-child"></div>
                            </div>

                            <div class="note mt-3 rounded rounded-20">
                                <div class="note1">Note</div>
                                <textarea class="note2 form-control no-resize" name="note" id="note" rows="4"
                                          style="width: 90%;"></textarea>
                                <div class="note-child"></div>
                            </div>
                        </div>

                        <div class="payby mt-5">
                            <div class="pay-by mb-2"
                                 style="font-family: 'Roboto', sans-serif; font-weight: 100; font-size: 35px;">Pay by:
                            </div>
                            <div class="image-container d-flex align-items-center">
                                <input type="radio" id="visa" name="paymentOption" class="radio" checked>
                                <label for="visa">
                                    <img class="visa-logo-png-2026-1-icon2" alt=""
                                         src="/resources/static/assets/checkout/visalogopng2026-12@2x.png">
                                </label>
                            </div>
                            <div class="image-container d-flex align-items-center">
                                <input type="radio" id="atm" name="paymentOption" class="radio">
                                <label for="atm">
                                    <img class="visa-logo-png-2026-1-icon1" alt=""
                                         src="/resources/static/assets/checkout/visalogopng2026-11@2x.png">
                                </label>
                            </div>
                            <div class="image-container d-flex align-items-center">
                                <input type="radio" id="cash" name="paymentOption" class="radio">
                                <label for="cash">
                                    <img class="money-1-icon" alt=""
                                         src="/resources/static/assets/checkout/money-1@2x.png">
                                </label>
                            </div>
                        </div>


                    </div>
                    <div class="col-6 my-4">
                        <div class="cart-information d-flex align-items-center flex-column center">Cart information
                        </div>
                        <div class="cart d-flex flex-nowrap">
                                    <span class="cart-icon">
                                        <img src="/resources/static/assets/checkout/cart.png" alt="Cart Image">
                                    </span>
                            </a>
                            <c:set var="totalItems" value="${fn:length(Viewgiohang)}"/>
                            <div class="cart-count bg-danger text-white ms-1">
                                <span id="cartItemCountValue"><c:out value="${totalItems}"/></span>
                            </div>
                        </div>
                        <div class="oder" id="cartInformationContainer">
                            <c:if test="${not empty Viewgiohang}">


                                <c:forEach var="item" items="${Viewgiohang}">
                                    <div class="order1 mt-4 d-flex align-items-center">
                                        <input type="checkbox" class="item-checkbox"
                                               data-total-cost="${item.total_cost * 1000}"/>

                                        <div class="avatar-container">
                                            <img src="${item.avatar}" alt="Avatar" class="avatar2">
                                        </div>

                                        <div class="matcha-milk-tea-m-parent mx-2">
                                            <div class="product-name">
                                                <c:out value="${item.product_name}"/>
                                            </div>

                                            <div class="price">
                                                <c:out value="${item.product_cost * 1000} VNĐ x ${item.count}"/>
                                            </div>
                                        </div>

                                        <div class="total" style="margin-left: 50px">
                                            <c:out value="${item.total_cost * 1000} VNĐ"/>
                                        </div>
                                        <button class="delete-button" data-billinfo-id="${item.id_bill_info}" onclick="deleteBillinfo(this)">Delete</button>
                                    </div>
                                </c:forEach>

                            </c:if>

                            <c:if test="${empty Viewgiohang}">
                                <div>
                                    <div>Giỏ hàng của bạn trống.</div>
                                </div>
                            </c:if>
                        </div>
                    </div>

                    <div class="payment my-1">
                        <!-- Merchandise Subtotal -->
                        <div class="merchandise-subtotal-parent d-flex justify-content-between align-items-center">
                            <div class="merchandise-subtotal">
                                <p class="merchandise-subtotal1">Merchandise Subtotal:</p>
                            </div>
                            <div class="vn4">
                                <c:set var="merchandiseSubtotal" value="0"/>
                                <c:forEach var="item" items="${Viewgiohang}">
                                    <c:set var="merchandiseSubtotal"
                                           value="${merchandiseSubtotal + item.total_cost * 1000}"/>
                                </c:forEach>
                                <p id="merchandiseSubtotal" class="merchandise-subtotal1">${merchandiseSubtotal} VNĐ</p>
                            </div>
                        </div>


                        <!-- Shipping Total -->
                        <div class="merchandise-subtotal-parent d-flex justify-content-between align-items-center">
                            <div class="merchandise-subtotal">
                                <p class="merchandise-subtotal1">Shipping Total:</p>
                            </div>
                            <div class="vn4">
                                <p class="merchandise-subtotal1">30.000 VNĐ</p>
                            </div>
                        </div>

                        <!-- Total Payment -->
                        <div class="total-payment-parent d-flex justify-content-between align-items-center">
                            <div class="merchandise-subtotal">
                                <p class="merchandise-subtotal1">Total Payment:</p>
                            </div>
                            <div class="vn8 text-danger">
                                <c:set var="totalPayment" value="${merchandiseSubtotal + 30000}"/>
                                <p id="totalPayment" class="merchandise-subtotal1">${totalPayment} VNĐ</p>
                            </div>
                        </div>
                    </div>

                    <script>
                        function redirectToPaymentPage() {
                            var visaChecked = document.getElementById("visa").checked;
                            var atmChecked = document.getElementById("atm").checked;
                            var cashChecked = document.getElementById("cash").checked;

                            if (visaChecked) {
                                window.location.href = "/pay?totalPayment=${giatien}";
                            } else if (atmChecked) {
                                window.location.href = "/pay?totalPayment=${giatien}";
                            } else if (cashChecked) {
                                window.location.href = "/alotra/success";
                            }
                        }
                    </script>
                    <c:set var="totalPayment" value="${merchandiseSubtotal + 30000}"/>
                    <div class="row mt-3">
                        <div class="col-12 d-flex align-items-center flex-column center">
                            <div class="separator"></div>

                            <a href="javascript:void(0);" class="button-back-to-order" id="order"
                               onclick="redirectToPaymentPage()">
                                <div class="button-back-to-order-child"></div>
                                <div class="back-to-order" style="text-align: center;">Order</div>
                            </a>
                            <form action="/pay" method="get" id="paymentForm">
                                <input type="hidden" name="totalPayment" id="totalPaymentField"
                                       value="${totalPayment}"/>
                            </form>
                            <script>
                                function redirectToPaymentPage() {
                                    var totalPayment = "${totalPayment}";
                                    document.getElementById("totalPaymentField").value = totalPayment;
                                    document.getElementById("paymentForm").submit();
                                }
                            </script>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<script
        src="https://code.jquery.com/jquery-3.7.1.min.js"
        integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo="
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
        crossorigin="anonymous"></script>
<script>
    function updateMerchandiseSubtotal() {
        var merchandiseSubtotal = 0;

        // Get all elements with the class 'item-checkbox'
        var checkboxes = document.getElementsByClassName('item-checkbox');

        // Loop through each checkbox
        for (var i = 0; i < checkboxes.length; i++) {
            // Check if the checkbox is checked
            if (checkboxes[i].checked) {
                // Get the corresponding item's total_cost attribute
                var totalCost = parseFloat(checkboxes[i].getAttribute('data-total-cost'));

                // Check if totalCost is a valid number
                if (!isNaN(totalCost)) {
                    // Add the total_cost to the merchandiseSubtotal
                    merchandiseSubtotal += totalCost;
                }
            }
        }

        // Update the HTML element with the new merchandiseSubtotal value
        document.getElementById('merchandiseSubtotal').innerText = merchandiseSubtotal + ' VNĐ';
    }

    // Call the updateMerchandiseSubtotal function when the page loads
    window.onload = updateMerchandiseSubtotal;

    // Add an event listener to each checkbox
    var checkboxes = document.getElementsByClassName('item-checkbox');
    for (var i = 0; i < checkboxes.length; i++) {
        checkboxes[i].addEventListener('click', updateMerchandiseSubtotal);
    }
</script>
<script>
    // Function to update totalPayment
    function updateTotalPayment() {
        // Call the existing function to update merchandiseSubtotal
        updateMerchandiseSubtotal();

        // Get the updated merchandiseSubtotal value
        var merchandiseSubtotal = parseFloat(document.getElementById('merchandiseSubtotal').innerText);

        // Check if merchandiseSubtotal is a valid number
        if (!isNaN(merchandiseSubtotal)) {
            // Calculate totalPayment by adding a fixed value (30000)
            var totalPayment = merchandiseSubtotal + 30000;

            // Update the HTML element with the new totalPayment value
            document.getElementById('totalPayment').innerText = totalPayment + ' VNĐ';
        } else {
            // Handle the case where merchandiseSubtotal is not a valid number
            console.error('Invalid merchandiseSubtotal value');
        }
    }

    // Call the updateTotalPayment function when the page loads
    window.onload = updateTotalPayment;

    // Add an event listener to each checkbox
    var checkboxes = document.getElementsByClassName('item-checkbox');
    for (var i = 0; i < checkboxes.length; i++) {
        checkboxes[i].addEventListener('click', updateTotalPayment);
    }

</script>
<script>
    function deleteBillinfo(button) {
        console.log("Deleting Billinfo");
        let billinfoId = $(button).data("billinfo-id");

        $.ajax({
            type: "POST",
            url: "/inexorability",
            data: { id_bill_info: billinfoId },
        });
        setTimeout(function() {
            window.location.href = "/alotra/checkout";
        }, 100);

    }


</script>
</body>
</html>
