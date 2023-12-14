<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!doctype html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Molengo">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Myanmar Khyay">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Mplus+1p">
    <link rel="stylesheet" href="/resources/static/css/user/style2.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <title>Checkout</title>
</head>

<body>

<div class="bodywrap">
    <header></header>
    <div class=" background1">
        <div class="body1">
            <div class="con1">
                <div class="background3  d-flex justify-content-center align-items-center ">
                    <div class="container d-flex  align-items-center ">
                        <div class="row w-lg-100">
                            <div class="col-12 col-lg-4 d-flex justify-content-center align-items-center">
                                <div class="circle">
                                    <img src="<c:out value='${product.avatar}'/>">
                                </div>
                            </div>
                            <div class="col-12 col-lg-8 Name d-flex justify-content-center align-items-center">
                                <h1><c:out value='${product.name}'/></h1>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <div class="con2">
                <div class="container">
                    <div class="row">
                        <div class="col">
                            <div class="sizeoption"
                                 style="font-family: Mplus1p, sans-serif;display: flex;flex-direction: column;align-items: flex-start;margin: 20px 15px 0 15px;">
                                <h1
                                        style="font-size: 35px;font-style: normal;font-weight: 400;line-height: normal;margin: 0;">
                                    Size option</h1>
                                <div class="line"
                                     style="width: 350px;height: 3px;background-color: #000; margin-top: 15px;">
                                </div>
                            </div>


                            <div class="sizeclass">
                                <div>
                                    <svg class="svgsize" xmlns="http://www.w3.org/2000/svg" width="47" height="43"
                                         viewBox="0 0 47 43" fill="none"
                                         style="margin-left: 10px; margin-top: 50px;"
                                         data-value="1">
                                        <path
                                                d="M36.7976 10.1587C36.7972 9.55213 36.5725 8.96352 36.16 8.4886C35.7476 8.01367 35.1717 7.68037 34.5259 7.54288L33.7818 5.07038C33.6459 4.67057 33.3722 4.32179 33.0015 4.07631C32.6308 3.83082 32.1831 3.70185 31.7255 3.70871H15.2559C14.8001 3.69956 14.3537 3.82794 13.9856 4.07405C13.6175 4.32015 13.3482 4.67029 13.2193 5.07038L12.4751 7.54288C11.8058 7.6973 11.2149 8.05748 10.8013 8.56307C10.3877 9.06866 10.1766 9.68894 10.2034 10.32C10.2018 10.8925 10.4033 11.45 10.7776 11.9088C11.1519 12.3675 11.6789 12.7028 12.2793 12.8641L12.4751 17.827C12.1616 17.8736 11.873 18.0119 11.6526 18.2212C11.5142 18.3548 11.4065 18.5124 11.3358 18.6847C11.2652 18.8571 11.2331 19.0406 11.2414 19.2245L11.7114 29.5445C11.7256 29.8617 11.8607 30.1643 12.0932 30.3999C12.3257 30.6355 12.6409 30.7892 12.9843 30.8345L13.1409 34.812C13.1813 36.0163 13.7341 37.1584 14.6815 37.9951C15.629 38.8319 16.8962 39.2969 18.213 39.2912H28.7684C30.0884 39.3007 31.36 38.8374 32.3114 38.0004C33.2629 37.1634 33.8187 36.0191 33.8601 34.812L34.0168 30.8345C34.3564 30.7851 34.6669 30.6296 34.8954 30.3944C35.1239 30.1593 35.2563 29.8589 35.2701 29.5445L35.7401 19.2245C35.7484 19.0406 35.7163 18.8571 35.6456 18.6847C35.575 18.5124 35.4673 18.3548 35.3289 18.2212C35.1163 18.0121 34.8339 17.8735 34.5259 17.827L34.7218 12.8641C35.3417 12.6802 35.8795 12.3168 36.2539 11.8288C36.6284 11.3408 36.8192 10.7546 36.7976 10.1587ZM15.2559 5.50038L31.8822 5.55413L32.4697 7.47121H14.5705L15.2559 5.50038ZM31.9018 34.7583C31.8772 35.5 31.5349 36.2031 30.9487 36.716C30.3625 37.2288 29.5794 37.5102 28.7684 37.4995H18.213C17.405 37.5069 16.626 37.2238 16.0438 36.7112C15.4615 36.1985 15.1223 35.4973 15.0993 34.7583L14.9426 30.8525H32.0584L31.9018 34.7583ZM19.388 24.3308C19.388 23.5866 19.6292 22.8592 20.0811 22.2405C20.533 21.6217 21.1753 21.1395 21.9267 20.8547C22.6782 20.5699 23.5051 20.4954 24.3028 20.6406C25.1006 20.7858 25.8334 21.1441 26.4085 21.6703C26.9836 22.1965 27.3753 22.8669 27.534 23.5968C27.6927 24.3266 27.6112 25.0831 27.3 25.7706C26.9887 26.4581 26.4616 27.0458 25.7853 27.4592C25.109 27.8726 24.3139 28.0933 23.5005 28.0933C22.4098 28.0933 21.3638 27.6969 20.5925 26.9913C19.8213 26.2857 19.388 25.3287 19.388 24.3308ZM32.5676 17.7912H14.4334L14.2376 13.0075H32.7439L32.5676 17.7912ZM33.8601 11.2158H13.1409C12.9984 11.2114 12.8584 11.1798 12.73 11.1229C12.6016 11.0661 12.4876 10.9853 12.3954 10.8857C12.3031 10.7862 12.2347 10.67 12.1945 10.5448C12.1543 10.4196 12.1431 10.2881 12.1618 10.1587C12.1618 9.92112 12.2649 9.69326 12.4486 9.52526C12.6322 9.35726 12.8813 9.26288 13.1409 9.26288H33.8601C34.0021 9.26886 34.1412 9.30155 34.2687 9.35891C34.3963 9.41627 34.5095 9.49707 34.6014 9.59627C34.6933 9.69546 34.7618 9.81092 34.8027 9.93544C34.8437 10.06 34.8561 10.1909 34.8393 10.32C34.8393 10.5575 34.7361 10.7854 34.5525 10.9534C34.3689 11.1214 34.1198 11.2158 33.8601 11.2158Z"
                                                fill="black"/>
                                    </svg>
                                </div>
                                <div>
                                    <svg class="svgsize" xmlns="http://www.w3.org/2000/svg" width="53" height="57"
                                         viewBox="0 0 53 57" fill="none"
                                         style=" margin-left: 100px; margin-top: -80px;"
                                         data-value="2">
                                        <path
                                                d="M41.4937 13.4663C41.4932 12.6622 41.2398 11.8819 40.7747 11.2524C40.3096 10.6228 39.6602 10.181 38.932 9.99876L38.0928 6.72126C37.9397 6.19128 37.6309 5.72895 37.2129 5.40354C36.7949 5.07813 36.2901 4.90716 35.7741 4.91626H17.202C16.688 4.90412 16.1846 5.07431 15.7695 5.40054C15.3544 5.72677 15.0507 6.1909 14.9053 6.72126L14.0662 9.99876C13.3114 10.2035 12.6451 10.6809 12.1787 11.3511C11.7123 12.0213 11.4743 12.8435 11.5045 13.68C11.5027 14.4389 11.7299 15.1779 12.152 15.7861C12.5741 16.3942 13.1683 16.8386 13.8453 17.0525L14.0662 23.6313C13.7126 23.693 13.3872 23.8763 13.1387 24.1538C12.9826 24.3308 12.8611 24.5398 12.7815 24.7682C12.7018 24.9967 12.6656 25.24 12.6749 25.4838L13.2049 39.1638C13.221 39.5841 13.3733 39.9852 13.6355 40.2975C13.8977 40.6098 14.2531 40.8137 14.6403 40.8738L14.817 46.1463C14.8625 47.7425 15.4859 49.2566 16.5543 50.3657C17.6227 51.4748 19.0517 52.0913 20.5366 52.0838H32.4395C33.9279 52.0963 35.3619 51.4822 36.4348 50.3727C37.5077 49.2632 38.1345 47.7463 38.1812 46.1463L38.3578 40.8738C38.7409 40.8082 39.0909 40.6021 39.3486 40.2903C39.6063 39.9786 39.7556 39.5805 39.7712 39.1638L40.3012 25.4838C40.3105 25.24 40.2743 24.9967 40.1946 24.7682C40.115 24.5398 39.9935 24.3308 39.8374 24.1538C39.5977 23.8766 39.2793 23.6929 38.932 23.6313L39.1528 17.0525C39.8519 16.8087 40.4583 16.327 40.8806 15.6801C41.3028 15.0332 41.518 14.2562 41.4937 13.4663ZM17.202 7.29126L35.9508 7.36251L36.6133 9.90376H16.4291L17.202 7.29126ZM35.9728 46.075C35.9451 47.0582 35.5591 47.9902 34.8981 48.67C34.2371 49.3499 33.354 49.7229 32.4395 49.7088H20.5366C19.6254 49.7185 18.747 49.3432 18.0904 48.6637C17.4338 47.9842 17.0513 47.0546 17.0253 46.075L16.8487 40.8975H36.1495L35.9728 46.075ZM21.8616 32.2525C21.8616 31.2661 22.1336 30.3018 22.6432 29.4816C23.1527 28.6614 23.877 28.0221 24.7244 27.6447C25.5718 27.2672 26.5042 27.1684 27.4038 27.3608C28.3034 27.5533 29.1297 28.0283 29.7783 28.7258C30.4269 29.4233 30.8685 30.312 31.0475 31.2795C31.2264 32.247 31.1346 33.2498 30.7836 34.1611C30.4326 35.0725 29.8382 35.8514 29.0756 36.3995C28.3129 36.9475 27.4163 37.24 26.4991 37.24C25.2692 37.24 24.0896 36.7145 23.2199 35.7792C22.3502 34.8439 21.8616 33.5753 21.8616 32.2525ZM36.7237 23.5838H16.2745L16.0537 17.2425H36.9224L36.7237 23.5838ZM38.1812 14.8675H14.817C14.6562 14.8617 14.4984 14.8198 14.3536 14.7444C14.2088 14.6691 14.0803 14.562 13.9763 14.43C13.8723 14.298 13.7951 14.1441 13.7497 13.9781C13.7044 13.8121 13.6918 13.6378 13.7128 13.4663C13.7128 13.1513 13.8292 12.8493 14.0362 12.6266C14.2433 12.4039 14.5242 12.2788 14.817 12.2788H38.1812C38.3413 12.2867 38.4981 12.33 38.6419 12.4061C38.7858 12.4821 38.9135 12.5892 39.0171 12.7207C39.1207 12.8522 39.198 13.0052 39.2442 13.1703C39.2903 13.3353 39.3043 13.5089 39.2853 13.68C39.2853 13.995 39.169 14.297 38.9619 14.5197C38.7549 14.7424 38.474 14.8675 38.1812 14.8675Z"
                                                fill="black"/>
                                    </svg>
                                </div>
                                <div>
                                    <svg class="svgsize" xmlns="http://www.w3.org/2000/svg" width="63" height="67"
                                         viewBox="0 0 63 67" fill="none"
                                         style="margin-left: 190px; margin-top: -140px;"
                                         data-value="3">
                                        <path
                                                d="M49.3244 15.8288C49.3238 14.8837 49.0226 13.9665 48.4698 13.2265C47.9169 12.4865 47.1449 11.9672 46.2794 11.753L45.2819 7.90046C45.0998 7.2775 44.7328 6.73406 44.2359 6.35156C43.739 5.96906 43.1389 5.7681 42.5256 5.77879H20.4494C19.8384 5.76453 19.24 5.96457 18.7466 6.34804C18.2532 6.7315 17.8922 7.27706 17.7194 7.90046L16.7219 11.753C15.8247 11.9936 15.0326 12.5548 14.4783 13.3426C13.9239 14.1303 13.641 15.0968 13.6769 16.08C13.6747 16.9721 13.9448 17.8408 14.4465 18.5556C14.9483 19.2704 15.6546 19.7928 16.4594 20.0442L16.7219 27.7771C16.3016 27.8497 15.9148 28.0652 15.6194 28.3913C15.4338 28.5994 15.2895 28.845 15.1948 29.1135C15.1001 29.3821 15.057 29.6681 15.0681 29.9546L15.6981 46.0346C15.7173 46.5288 15.8983 47.0002 16.2099 47.3673C16.5216 47.7344 16.9441 47.974 17.4044 48.0446L17.6144 54.2421C17.6684 56.1185 18.4094 57.8981 19.6794 59.2018C20.9494 60.5055 22.648 61.2302 24.4131 61.2213H38.5619C40.3311 61.2361 42.0356 60.5142 43.311 59.21C44.5863 57.9059 45.3314 56.1228 45.3869 54.2421L45.5969 48.0446C46.0521 47.9676 46.4683 47.7253 46.7746 47.3589C47.0808 46.9924 47.2583 46.5245 47.2769 46.0346L47.9069 29.9546C47.918 29.6681 47.8749 29.3821 47.7802 29.1135C47.6855 28.845 47.5412 28.5994 47.3556 28.3913C47.0707 28.0655 46.6921 27.8495 46.2794 27.7771L46.5419 20.0442C47.3729 19.7576 48.0937 19.1915 48.5956 18.4311C49.0975 17.6707 49.3533 16.7573 49.3244 15.8288ZM20.4494 8.57046L42.7356 8.65421L43.5231 11.6413H19.5306L20.4494 8.57046ZM42.7619 54.1584C42.7289 55.314 42.2701 56.4096 41.4843 57.2087C40.6986 58.0078 39.6489 58.4463 38.5619 58.4296H24.4131C23.33 58.4411 22.2859 58 21.5054 57.2012C20.7249 56.4025 20.2703 55.3099 20.2394 54.1584L20.0294 48.0725H42.9719L42.7619 54.1584ZM25.9881 37.9109C25.9881 36.7514 26.3114 35.6179 26.9171 34.6538C27.5229 33.6898 28.3838 32.9384 29.3911 32.4946C30.3984 32.0509 31.5067 31.9348 32.5761 32.161C33.6454 32.3872 34.6276 32.9456 35.3985 33.7655C36.1695 34.5853 36.6945 35.6299 36.9072 36.7672C37.1199 37.9044 37.0107 39.0831 36.5935 40.1544C36.1763 41.2256 35.4697 42.1412 34.5632 42.7854C33.6567 43.4295 32.5909 43.7734 31.5006 43.7734C30.0386 43.7734 28.6365 43.1557 27.6027 42.0563C26.5689 40.9569 25.9881 39.4657 25.9881 37.9109ZM43.6544 27.7213H19.3469L19.0844 20.2675H43.8906L43.6544 27.7213ZM45.3869 17.4759H17.6144C17.4233 17.4691 17.2356 17.4198 17.0635 17.3312C16.8914 17.2426 16.7386 17.1167 16.615 16.9616C16.4914 16.8065 16.3996 16.6255 16.3457 16.4304C16.2918 16.2353 16.2769 16.0304 16.3019 15.8288C16.3019 15.4586 16.4402 15.1036 16.6863 14.8418C16.9324 14.58 17.2663 14.433 17.6144 14.433H45.3869C45.5772 14.4423 45.7636 14.4932 45.9346 14.5826C46.1055 14.672 46.2573 14.7979 46.3805 14.9524C46.5037 15.107 46.5955 15.2869 46.6504 15.4809C46.7053 15.6749 46.7219 15.8789 46.6994 16.08C46.6994 16.4502 46.5611 16.8053 46.3149 17.067C46.0688 17.3288 45.735 17.4759 45.3869 17.4759Z"
                                                fill="black"/>
                                    </svg>
                                </div>
                                <div>
                                    <svg class="svgsize" xmlns="http://www.w3.org/2000/svg" width="76" height="80"
                                         viewBox="0 0 63 67" fill="none"
                                         style="margin-left: 290px; margin-top: -210px;"
                                         data-value="4">
                                        <path
                                                d="M49.3244 15.8288C49.3238 14.8837 49.0226 13.9665 48.4698 13.2265C47.9169 12.4865 47.1449 11.9672 46.2794 11.753L45.2819 7.90046C45.0998 7.2775 44.7328 6.73406 44.2359 6.35156C43.739 5.96906 43.1389 5.7681 42.5256 5.77879H20.4494C19.8384 5.76453 19.24 5.96457 18.7466 6.34804C18.2532 6.7315 17.8922 7.27706 17.7194 7.90046L16.7219 11.753C15.8247 11.9936 15.0326 12.5548 14.4783 13.3426C13.9239 14.1303 13.641 15.0968 13.6769 16.08C13.6747 16.9721 13.9448 17.8408 14.4465 18.5556C14.9483 19.2704 15.6546 19.7928 16.4594 20.0442L16.7219 27.7771C16.3016 27.8497 15.9148 28.0652 15.6194 28.3913C15.4338 28.5994 15.2895 28.845 15.1948 29.1135C15.1001 29.3821 15.057 29.6681 15.0681 29.9546L15.6981 46.0346C15.7173 46.5288 15.8983 47.0002 16.2099 47.3673C16.5216 47.7344 16.9441 47.974 17.4044 48.0446L17.6144 54.2421C17.6684 56.1185 18.4094 57.8981 19.6794 59.2018C20.9494 60.5055 22.648 61.2302 24.4131 61.2213H38.5619C40.3311 61.2361 42.0356 60.5142 43.311 59.21C44.5863 57.9059 45.3314 56.1228 45.3869 54.2421L45.5969 48.0446C46.0521 47.9676 46.4683 47.7253 46.7746 47.3589C47.0808 46.9924 47.2583 46.5245 47.2769 46.0346L47.9069 29.9546C47.918 29.6681 47.8749 29.3821 47.7802 29.1135C47.6855 28.845 47.5412 28.5994 47.3556 28.3913C47.0707 28.0655 46.6921 27.8495 46.2794 27.7771L46.5419 20.0442C47.3729 19.7576 48.0937 19.1915 48.5956 18.4311C49.0975 17.6707 49.3533 16.7573 49.3244 15.8288ZM20.4494 8.57046L42.7356 8.65421L43.5231 11.6413H19.5306L20.4494 8.57046ZM42.7619 54.1584C42.7289 55.314 42.2701 56.4096 41.4843 57.2087C40.6986 58.0078 39.6489 58.4463 38.5619 58.4296H24.4131C23.33 58.4411 22.2859 58 21.5054 57.2012C20.7249 56.4025 20.2703 55.3099 20.2394 54.1584L20.0294 48.0725H42.9719L42.7619 54.1584ZM25.9881 37.9109C25.9881 36.7514 26.3114 35.6179 26.9171 34.6538C27.5229 33.6898 28.3838 32.9384 29.3911 32.4946C30.3984 32.0509 31.5067 31.9348 32.5761 32.161C33.6454 32.3872 34.6276 32.9456 35.3985 33.7655C36.1695 34.5853 36.6945 35.6299 36.9072 36.7672C37.1199 37.9044 37.0107 39.0831 36.5935 40.1544C36.1763 41.2256 35.4697 42.1412 34.5632 42.7854C33.6567 43.4295 32.5909 43.7734 31.5006 43.7734C30.0386 43.7734 28.6365 43.1557 27.6027 42.0563C26.5689 40.9569 25.9881 39.4657 25.9881 37.9109ZM43.6544 27.7213H19.3469L19.0844 20.2675H43.8906L43.6544 27.7213ZM45.3869 17.4759H17.6144C17.4233 17.4691 17.2356 17.4198 17.0635 17.3312C16.8914 17.2426 16.7386 17.1167 16.615 16.9616C16.4914 16.8065 16.3996 16.6255 16.3457 16.4304C16.2918 16.2353 16.2769 16.0304 16.3019 15.8288C16.3019 15.4586 16.4402 15.1036 16.6863 14.8418C16.9324 14.58 17.2663 14.433 17.6144 14.433H45.3869C45.5772 14.4423 45.7636 14.4932 45.9346 14.5826C46.1055 14.672 46.2573 14.7979 46.3805 14.9524C46.5037 15.107 46.5955 15.2869 46.6504 15.4809C46.7053 15.6749 46.7219 15.8789 46.6994 16.08C46.6994 16.4502 46.5611 16.8053 46.3149 17.067C46.0688 17.3288 45.735 17.4759 45.3869 17.4759Z"
                                                fill="black"/>
                                    </svg>
                                </div>

                                <div class="small300" style="display: flex;">
                                    <h1
                                            style="font-family: Molengo, sans-serif; text-align: center;font-size: 20px; font-style: normal; font-weight: 20; line-height: normal; color: #000000; margin-left: 6px; margin-top:-40px">
                                        Small<br>300ml</h1>
                                </div>
                                <div class="medium500" style="display: flex; ">
                                    <h1
                                            style="font-family: Molengo, sans-serif; text-align: center; font-size: 20px; font-style: normal; font-weight: 20; line-height: normal; color: #000000; margin-left: 90px; margin-top: -58px;">
                                        Medium<br>500ml</h1>
                                </div>
                                <div class="large700" style="display: flex;">
                                    <h1
                                            style="font-family: Molengo, sans-serif; text-align: center; font-size: 20px; font-style: normal; font-weight: 20; line-height: normal; color: #000000; margin-left: 195px; margin-top: -58px;">
                                        Large<br>700ml</h1>
                                </div>
                                <div class="elarge1000" style="display: flex;">
                                    <h1
                                            style="font-family: Molengo, sans-serif; text-align: center; font-size: 20px; font-style: normal; font-weight: 20; line-height: normal; color: #000000; margin-left: 280px; margin-top: -58px;">
                                        Extra-Large<br>1000ml</h1>
                                </div>
                            </div>
                            <div class="Foam"
                                 style="font-family: Mplus1p, sans-serif;display: flex;flex-direction: column;align-items: flex-start;margin-left:10px; margin-top:30px">
                                <h1
                                        style="font-family: Mplus1p, sans-serif; font-size: 35px; font-style: normal; font-weight: 400; line-height: normal;">
                                    Foam</h1>
                                <div style="width: 350px; height: 3px; background-color: #000;"></div>
                            </div>

                            <div class="foamclass">
                                <img src="https://www.iconpacks.net/icons/2/free-foam-icon-1592-thumb.png"
                                     class="svgfoam" alt="Nor foam" width="70" height="70"
                                     style="margin-left: -11px; margin-top: 30px;"
                                     data-value="1">

                                <img src="https://cdn-icons-png.flaticon.com/512/684/684614.png" class="svgfoam"
                                     alt="milk foam" width="70" height="65"
                                     style="margin-left: 15px; margin-top: 30px;"
                                     data-value="2">

                                <img src="https://cdn-icons-png.flaticon.com/512/2964/2964191.png" class="svgfoam"
                                     alt="coffee foam" width="70" height="65"
                                     style="margin-left: 35px; margin-top: 30px;"
                                     data-value="3">


                                <img src="https://static-00.iconduck.com/assets.00/egg-icon-1755x2048-a5ij2iuj.png"
                                     class="svgfoam" alt="foam" width="50" height="65"
                                     style="margin-left: 40px; margin-top: 30px;"
                                     data-value="4">

                                <div class="foam" style="display: flex; ">
                                    <h1
                                            style="font-family: Molengo, sans-serif; text-align: center; font-size: 20px; font-style: normal; font-weight: 20; line-height: normal; color: #000000; margin-left: -5px; margin-top: 30px;">
                                        Normal</h1>
                                </div>
                                <div class="foam" style="display: flex;">
                                    <h1
                                            style="font-family: Molengo, sans-serif;  text-align: center;font-size: 20px; font-style: normal; font-weight: 20; line-height: normal; color: #000000; margin-left:95px; margin-top: -32px;">
                                        Milk</h1>
                                </div>
                                <div class="foam" style="display: flex;">
                                    <h1
                                            style="font-family: Molengo, sans-serif;  text-align: center;font-size: 20px; font-style: normal; font-weight: 20; line-height: normal; color: #000000; margin-left:193px; margin-top: -32px;">
                                        Coffee</h1>
                                </div>
                                <div class="foam" style="display: flex;">
                                    <h1
                                            style="font-family: Molengo, sans-serif;  text-align: center;font-size: 20px; font-style: normal; font-weight: 20; line-height: normal; color: #000000; margin-left:310px; margin-top: -32px;">
                                        Egg</h1>
                                </div>
                                <img src="https://static.thenounproject.com/png/705369-200.png" class="svgfoam"
                                     width="70" height="70" style="margin-left: -10px; margin-top:40px;"
                                     data-value="5">

                                <img src="https://cdn-icons-png.flaticon.com/512/2774/2774012.png" class="svgfoam"
                                     width="70" height="70" style=" margin-left: 25px; margin-top: 50px;"
                                     data-value="6">

                                <img src="https://static.thenounproject.com/png/1792780-200.png" class="svgfoam"
                                     width="70" height="70" style="margin-left: 30px; margin-top: 40px;"
                                     data-value="7">

                                <img src="https://cdn-icons-png.flaticon.com/512/686/686407.png" class="svgfoam"
                                     width="60" height="60" style="margin-left: 27px; margin-top: 38px;"
                                     data-value="8">

                                <div class="foam" style="display: flex;">
                                    <h1
                                            style="font-family: Molengo, sans-serif;  text-align: center;font-size: 20px; font-style: normal; font-weight: 20; line-height: normal; color: #000000; margin-left:5px; margin-top: 40px;">
                                        Salt</h1>
                                </div>
                                <div class="foam" style="display: flex;">
                                    <h1
                                            style="font-family: Molengo, sans-serif;  text-align: center;font-size: 20px; font-style: normal; font-weight: 20; line-height: normal; color: #000000; margin-left:95px; margin-top: -32px;">
                                        Sugar</h1>
                                </div>
                                <div class="foam" style="display: flex;">
                                    <h1
                                            style="font-family: Molengo, sans-serif;  text-align: center;font-size: 20px; font-style: normal; font-weight: 20; line-height: normal; color: #000000; margin-left:195px; margin-top: -32px;">
                                        Green<br>Tea</h1>
                                </div>
                                <div class="foam" style="display: flex;">
                                    <h1
                                            style="font-family: Molengo, sans-serif;  text-align: center;font-size: 20px; font-style: normal; font-weight: 20; line-height: normal; color: #000000; margin-left:295px; margin-top: -58px;">
                                        Ice<br>Cream</h1>
                                </div>
                            </div>
                        </div>
                        <div class="col">
                            <div class="Add-in" style=" font-family: Mplus1p, sans-serif;margin: 20px 0 0 20px;">
                                <h1
                                        style="font-size: 35px;font-style: normal;font-weight: 400;line-height: normal;margin: 0;">
                                    Add-in</h1>
                                <div class="line"
                                     style="width: 350px;height: 3px;background-color: #000;margin-top: 15px;"></div>
                            </div>
                            <div class="addclass">
                                <div>
                                    <svg xmlns="http://www.w3.org/2000/svg" width="55" height="59"
                                         viewBox="0 0 50 74" fill="none" style="margin-left: 30px; margin-top: 20px;"
                                         class="svgaddin"
                                         data-value="1">
                                        <path
                                                d="M0 0L5.55556 67.451C5.91667 71.151 8.25 74 11.1111 74H38.8889C41.6667 74 44.0833 71.151 44.4444 67.451L50 0H0ZM6.16667 7.4H43.8333L38.8889 66.6H11.1111L6.16667 7.4Z"
                                                fill="black"/>
                                    </svg>
                                </div>

                                <div>
                                    <svg xmlns="http://www.w3.org/2000/svg" width="55" height="59"
                                         viewBox="0 0 55 75" fill="none"
                                         style="margin-left: 120px; margin-top: -86px;" class="svgaddin"
                                         data-value="2">
                                        <path
                                                d="M55 0L45.7724 68.3289C45.2547 72.1184 42.727 75 39.6816 75H15.3184C12.273 75 9.74529 72.1184 9.22757 68.3289L0 0H55ZM7.27852 7.89474L15.3184 67.1053H39.6816L47.7215 7.89474H7.27852ZM18.3638 59.2105V43.4211H30.5454V59.2105H18.3638ZM30.5454 40.1842L20.861 27.6316L30.5454 15.0789L40.2298 27.6316L30.5454 40.1842Z"
                                                fill="black"/>
                                    </svg>
                                </div>

                                <div>
                                    <svg xmlns="http://www.w3.org/2000/svg" width="55" height="59"
                                         viewBox="0 0 55 75" fill="none"
                                         style="margin-left: 220px; margin-top: -135px;" class="svgaddin"
                                         data-value="3">
                                        <svg xmlns="http://www.w3.org/2000/svg" width="56" height="75"
                                             viewBox="0 0 56 75" fill="none">
                                            <path
                                                    d="M55.3329 0L46.0495 67.9303C45.5286 71.6976 42.9856 74.5624 39.9218 74.5624H15.4111C12.3473 74.5624 9.80428 71.6976 9.28342 67.9303L0 0H55.3329ZM7.32257 7.84867L15.4111 66.7137H39.9218L48.0103 7.84867H7.32257ZM18.4749 58.8651V43.1677H30.7303V58.8651H18.4749ZM30.7303 39.9498L20.9873 27.4704L30.7303 14.991L40.4733 27.4704L30.7303 39.9498Z"
                                                    fill="black"/>
                                            <path
                                                    d="M17.0117 31.0983L24.6905 40.3268L16.282 46.75L8.6032 37.5215L17.0117 31.0983Z"
                                                    fill="black"/>
                                            <path
                                                    d="M27.5684 65.6263L32.2334 54.7031L42.1861 58.6053L37.5211 69.5286L27.5684 65.6263Z"
                                                    fill="black"/>
                                        </svg>
                                    </svg>
                                </div>

                                <div>
                                    <svg xmlns="http://www.w3.org/2000/svg" width="63" height="67" class="svgaddin"
                                         viewBox="-5 0 93 131" fill="none"
                                         style=" flex-shrink: 0; margin-left: 315px; margin-top: -186px;"
                                         data-value="4">
                                        <path
                                                d="M84.0831 12.046L70.4037 116.304C69.6363 122.086 65.8891 126.483 61.3745 126.483H25.2574C20.7428 126.483 16.9957 122.086 16.2282 116.304L2.54883 12.046H84.0831ZM13.3388 24.092L25.2574 114.437H61.3745L73.2931 24.092H13.3388ZM29.7721 102.391V78.2989H47.8306V102.391H29.7721ZM47.8306 73.36L33.4741 54.2069L47.8306 35.0538L62.1871 54.2069L47.8306 73.36Z"
                                                fill="black"/>
                                        <rect width="17.6028" height="21.0037"
                                              transform="matrix(0.870526 0.492122 -0.375124 0.926975 24.0156 25.0958)"
                                              fill="black"/>
                                        <rect width="17.6028" height="21.0037"
                                              transform="matrix(0.870526 0.492122 -0.375124 0.926975 59.2617 21.0805)"
                                              fill="black"/>
                                        <rect width="17.6028" height="21.0037"
                                              transform="matrix(0.870526 0.492122 -0.375124 0.926975 54.166 66.7548)"
                                              fill="black"/>
                                        <rect width="17.6028" height="21.0037"
                                              transform="matrix(0.870526 0.492122 -0.375124 0.926975 21.043 49.6897)"
                                              fill="black"/>
                                    </svg>
                                </div>
                                <div class="noice" style="display: flex;">
                                    <h1
                                            style="font-family: Molengo, sans-serif; text-align: center;font-size: 20px; font-style: normal; font-weight: 20; line-height: normal; color: #000000; margin-left: 38px; margin-top:-27px">
                                        No<br>Ice</h1>
                                </div>
                                <div class="20ice" style="display: flex;">
                                    <h1
                                            style="font-family: Molengo, sans-serif; text-align: center;font-size: 20px; font-style: normal; font-weight: 20; line-height: normal; color: #000000; margin-left: 125px; margin-top:-56px">
                                        20%<br>Ice</h1>
                                </div>
                                <div class="40ice" style="display: flex;">
                                    <h1
                                            style="font-family: Molengo, sans-serif; text-align: center;font-size: 20px; font-style: normal; font-weight: 20; line-height: normal; color: #000000; margin-left: 225px; margin-top:-56px">
                                        40%<br>Ice</h1>
                                </div>
                                <div class="40ice" style="display: flex;">
                                    <h1
                                            style="font-family: Molengo, sans-serif; text-align: center;font-size: 20px; font-style: normal; font-weight: 20; line-height: normal; color: #000000; margin-left: 320px; margin-top:-56px">
                                        60%<br>Ice</h1>
                                </div>
                            </div>
                            <div class="Topping" style=" font-family: Mplus1p, sans-serif;margin: 30px 0 0 20px;">
                                <h1
                                        style="font-size: 35px;font-style: normal;font-weight: 400;line-height: normal;margin: 0;">
                                    Topping</h1>
                                <div class="line"
                                     style="width: 350px;height: 3px;background-color: #000;margin-top: 9px;"></div>
                            </div>
                            <div class="toppingclass">
                                <img src="https://static.thenounproject.com/png/395161-200.png" class="svgtopping"
                                     width="80" height="80" style="margin-left: 7px; margin-top: 38px;"
                                     data-value="1">
                                <img src="https://cdn-icons-png.flaticon.com/512/604/604813.png" class="svgtopping"
                                     width="60" height="60" style="margin-left: 40px; margin-top: 34px;"
                                     data-value="2">
                                <img src="https://static.thenounproject.com/png/486236-200.png" class="svgtopping"
                                     width="60" height="60" style="margin-left: 33px; margin-top: 28px;"
                                     data-value="3">
                                <img src="https://thenounproject.com/api/private/icons/1778028/edit/?backgroundShape=SQUARE&backgroundShapeColor=%23000000&backgroundShapeOpacity=0&exportSize=752&flipX=false&flipY=false&foregroundColor=%23000000&foregroundOpacity=1&imageFormat=png&rotation=0"
                                     class="svgtopping" width="100" height="100"
                                     style="margin-left: 300px; margin-top: -120px;"
                                     data-value="4">
                                <div class="Flan" style="display: flex;">
                                    <h1
                                            style="font-family: Molengo, sans-serif; text-align: center;font-size: 20px; font-style: normal; font-weight: 20; line-height: normal; color: #000000; margin-left: 28px; margin-top:-12px">
                                        Flan</h1>
                                </div>
                                <div class="Cheese" style="display: flex;">
                                    <h1
                                            style="font-family: Molengo, sans-serif; text-align: center;font-size: 20px; font-style: normal; font-weight: 20; line-height: normal; color: #000000; margin-left: 133px; margin-top:-32px">
                                        Cheese</h1>
                                </div>
                                <div class="Blackboba" style="display: flex;">
                                    <h1
                                            style="font-family: Molengo, sans-serif; text-align: center;font-size: 20px; font-style: normal; font-weight: 20; line-height: normal; color: #000000; margin-left: 233px; margin-top:-32px">
                                        Black<br>Boba</h1>
                                </div>
                                <div class="Whiteboba" style="display: flex;">
                                    <h1
                                            style="font-family: Molengo, sans-serif; text-align: center;font-size: 20px; font-style: normal; font-weight: 20; line-height: normal; color: #000000; margin-left: 323px; margin-top:-56px">
                                        White<br>Boba</h1>
                                </div>
                                <img src="https://cdn-icons-png.flaticon.com/512/4469/4469079.png" class="svgtopping"
                                     width="70" height="70" style="margin-left: 10px; margin-top: 20px"
                                     data-value="5">
                                <img src="https://cdn-icons-png.flaticon.com/512/272/272169.png" class="svgtopping"
                                     width="60" height="60" style="margin-left: 40px; margin-top: 10px"
                                     data-value="6">
                                <img src="https://static.thenounproject.com/png/3848049-200.png" class="svgtopping"
                                     width="80" height="80" style="margin-left: 20px; margin-top: 30px"
                                     data-value="7">
                                <img src="https://static.thenounproject.com/png/783423-200.png" class="svgtopping"
                                     width="60" height="60" style="margin-left: 12px; margin-top: 30px"
                                     data-value="8">
                                <div class="Coconut" style="display: flex;">
                                    <h1
                                            style="font-family: Molengo, sans-serif; text-align: center;font-size: 20px; font-style: normal; font-weight: 20; line-height: normal; color: #000000; margin-left: 5px; margin-top:27px">
                                        Coconut<br>Jelly</h1>
                                </div>
                                <div class="Fruit" style="display: flex;">
                                    <h1
                                            style="font-family: Molengo, sans-serif; text-align: center;font-size: 20px; font-style: normal; font-weight: 20; line-height: normal; color: #000000; margin-left: 135px; margin-top:-55px">
                                        Fruit<br>Jelly</h1>
                                </div>
                                <div class="Bean" style="display: flex;">
                                    <h1
                                            style="font-family: Molengo, sans-serif; text-align: center;font-size: 20px; font-style: normal; font-weight: 20; line-height: normal; color: #000000; margin-left: 225px; margin-top:-55px">
                                        Black<br>Beans</h1>
                                </div>
                                <div class="Oreo" style="display: flex;">
                                    <h1
                                            style="font-family: Molengo, sans-serif; text-align: center;font-size: 20px; font-style: normal; font-weight: 20; line-height: normal; color: #000000; margin-left: 305px; margin-top:-55px">
                                        Oreo<br>Cookies</h1>
                                </div>
                            </div>
                        </div>
                        <div class="linecnt">
                            <div class="vertical-line"
                                 style="width: 6px;height: 850px;background-color: #000;margin-left: 10px;"></div>
                        </div>
                        <div class="col">
                            <div class="cntt">
                                <div class="Count" style="display: flex;">
                                    <h1
                                            style="font-family: Molengo, sans-serif; text-align: center;font-size: 35px; font-style: normal; font-weight: 400; line-height: normal; color: #000000; margin-left: 55px; margin-top:25px">
                                        Count</h1>
                                </div>
                                <div class="Countbor">
                                    <input id="Countbor"
                                           style="border: 1px solid #00000062; border-radius: 10px; background: #d9d9d9; width: 350px; height: 45px; flex-shrink: 0; margin-left: 50px;margin-top:15px;"
                                           type="text">
                                </div>
                                <div class="Note" style="display: flex;">
                                    <h1
                                            style="font-family: Molengo, sans-serif; text-align: center;font-size: 35px; font-style: normal; font-weight: 400; line-height: normal; color: #000000; margin-left: 55px; margin-top:70px">
                                        No
                                        Note</h1>
                                </div>
                                <div class="Notebor">
                                    <div style="border: 1px solid #00000062; border-radius: 10px; background: #d9d9d9; width: 350px; height: 45px; display: flex; align-items: center; justify-content: center; margin-left: 50px; margin-top: 15px;">
                                        <span style="font-size: 25px; margin-left: -300px">No</span>
                                    </div>
                                </div>
                                <div class="Tips" style="display: flex;">
                                    <h1
                                            style="font-family: Molengo, sans-serif; text-align: center;font-size: 35px; font-style: normal; font-weight: 400; line-height: normal; color: #000000; margin-left: 55px; margin-top:50px">
                                        Tips</h1>
                                </div>
                                <div class="Tipsbor"><label>
                                    <input type="text"
                                           style="border: 1px solid #00000062; border-radius: 10px; background: #d9d9d9; width: 350px; height: 45px; flex-shrink: 0; margin-left: 50px;margin-top:15px; ">
                                </label>
                                    <span style="font-size: 25px; margin-left: -345px">0.00$</span>
                                </div>

                                <div>
                                    <button class="Orderbor"
                                            style="width: 184px; height: 48px; border-radius: 502px; border: none; background: rgba(2, 85, 34, 0.79); margin-left: 230px; margin-top:100px; flex-shrink: 0; box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.5);"
                                            id="addToOrderButton"
                                            onclick="addToOrder()">

                                        <h1 style="font-family:Mplus1p, sans-serif; font-size:22px; color:#ffffff">
                                            Add to Order
                                        </h1>
                                    </button>
                                </div>
                                </button>

                            </div>
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
    const removeClassActiveFromElements = function (elements) {
        for (var i = 0; i < elements.length; i++) {
            elements[i].classList.remove('active');
        }
    };

    const addClassActive = function (element) {
        element.classList.add('active');
    };

    const handleElementClick = function (elements, event) {
        removeClassActiveFromElements(elements);
        addClassActive(event.target);
    };

    let svgElements = document.getElementsByClassName('svgsize');
    for (var i = 0; i < svgElements.length; i++) {
        svgElements[i].addEventListener('mousedown', (e) => {
            handleElementClick(svgElements, e);
        });
    }

    let imageElements = document.getElementsByClassName('svgfoam');
    for (var i = 0; i < imageElements.length; i++) {
        imageElements[i].addEventListener('mousedown', (e) => {
            handleElementClick(imageElements, e);
        });
    }

    let svg1Elements = document.getElementsByClassName('svgaddin');
    for (var i = 0; i < svg1Elements.length; i++) {
        svg1Elements[i].addEventListener('mousedown', (e) => {
            handleElementClick(svg1Elements, e);
        });
    }

    let image1Elements = document.getElementsByClassName('svgtopping');
    for (var i = 0; i < image1Elements.length; i++) {
        image1Elements[i].addEventListener('mousedown', (e) => {
            handleElementClick(image1Elements, e);
        });
    }

</script>

<script>





    // var currentURL = window.location.href;
    // var urlParts = currentURL.split('/');

    const idProduct = ${productId};


    function addToOrder() {

        var sizeSvgElement = document.querySelector('.svgsize.active');
        var addinSvgElement = document.querySelector('.svgaddin.active');
        var foamSvgElement = document.querySelector('.svgfoam.active');
        var toppingSvgElement = document.querySelector('.svgtopping.active');

        let idSize = '1';
        let idAddin = '1';
        let idFoam = '0';
        let idTopping = '0';

        if (sizeSvgElement) idSize = sizeSvgElement.getAttribute('data-value');
        if (addinSvgElement) idAddin = addinSvgElement.getAttribute('data-value');
        if (foamSvgElement) idFoam = foamSvgElement.getAttribute('data-value');
        if (toppingSvgElement) idTopping = toppingSvgElement.getAttribute('data-value');
        let count = parseInt(document.getElementById('Countbor').value);

        // Gửi yêu cầu HTTP POST đến endpoint của controller SaveBill
        $.ajax({
            type: "POST",
            url: "/addToOrder",
            data: {
                idProduct: idProduct,
                count: count,
                idSize: idSize,
                idAddin: idAddin,
                idFoam: idFoam,
                idTopping: idTopping,

            },
        });
    }
</script>

<script>
    const jsonUser = [${jsonUser}];
</script>
<script src="/resources/static/js/components/header/header.js"></script>
</body>

</html>