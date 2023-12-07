<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="initial-scale=1, width=device-width" />
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="checkout.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Roboto:wght@500&display=swap">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Sora:wght@100;300;600&display=swap">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Tienne:wght@700&display=swap">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=ABeeZee:wght@400&display=swap">
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
<div class="bodywrap">
    <header>
        <!-- Your header content goes here -->
    </header>

    <div class="checkout2 backgroundimg">
        <div class="body1">
            <div class="container">
                <div class="col-12 d-flex align-items-center flex-column center">
                    <img class="credit-card-1-icon" alt="" src="./public/creditcard-1@2x.png">
                    <div class="please-check-your">Please check your Customer information and Shopping Cart information before paying</div>
                </div>

                <div class="row">
                    <div class="col-6 border-right my-4">
                        <div class="customer-information d-flex align-items-center flex-column center">Customer information</div>
                        <div class="information">
                            <div class="fullname mt-3 rounded rounded-20">
                                <div class="full-name">Full name</div>
                                <input class="fullname1 form-control" name="fullname" id="fullname" type="text" style="width: 90%;">
                                <div class="fullname-child"></div>
                            </div>

                            <div class="email mt-3 rounded rounded-20">
                                <div class="email1">Email</div>
                                <div class="email-child"></div>
                                <input class="email2 form-control" name="email" id="email" type="text" style="width: 90%;">
                            </div>

                            <div class="phone mt-3 rounded rounded-20">
                                <div class="phone1">Phone</div>
                                <input class="phone2 form-control" name="phone" id="phone" type="text" style="width: 90%;">
                                <div class="phone-child"></div>
                            </div>

                            <div class="address mt-3 rounded rounded-20">
                                <div class="address1">Address</div>
                                <input class="address2 form-control" name ="address" id="address" type="text" style="width: 90%;">
                                <div class="address-child"></div>
                            </div>

                            <div class="note mt-3 rounded rounded-20">
                                <div class="note1">Note</div>
                                <textarea class="note2 form-control no-resize" name="note" id="note" rows="4" style="width: 90%;"></textarea>
                                <div class="note-child"></div>
                            </div>
                        </div>

                        <div class="payby mt-5">
                            <div class="pay-by mb-2" style="font-family: 'Roboto', sans-serif; font-weight: 100; font-size: 35px;">Pay by:</div>
                            <div class="image-container d-flex align-items-center">
                                <input type="radio" id="visa" name="paymentOption" class="radio" checked>
                                <label for="visa">
                                    <img class="visa-logo-png-2026-1-icon2" alt="" src="./public/visalogopng2026-12@2x.png">
                                </label>
                            </div>
                        </div>

                    </div>
                    <div class="col-6 my-4">
                        <div class="cart-information d-flex align-items-center flex-column center">Cart information</div>
                        <div class="cart d-flex flex-nowrap">
                            <a href="trangmuahang.html" style="display: flex; align-items: center;">
                                    <span class="cart-icon">
                                        <img src="./public/cart.png" alt="Cart Image">
                                    </span>
                            </a>
                            <div id="cartItemCount" class="cart-count bg-danger text-white ms-1">4</div>
                        </div>

                        <div class="oder">
                        </div>
                        <div class="voucher my-4 d-flex justify-content-start">
                            <input class="discount-code form-control" name="discount" id="discount" placeholder="Discount code" type="text" style="font-family: 'Roboto', sans-serif; font-weight: 500; font-size: 20px; width: 100%;">
                            <button class="button-confirm btn btn-lg" id="confirm" style="background-color: #F1A45D; color: white;">
                                Confirm
                            </button>
                        </div>
                        <div class="payment my-1">
                        </div>
                    </div>

                    <div class="row mt-3">
                        <div class="col-12 d-flex align-items-center flex-column center">
                            <div class="separator"></div>
                            <a href="momo.html" class="button-back-to-order" id="oder">
                                <div class="button-back-to-order-child"></div>
                                <div class="back-to-order" style="text-align: center;">Order</div>
                            </a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
        integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js"
        integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+"
        crossorigin="anonymous"></script>
<script src="components/header.js"></script>
</body>
</html>
