const pageHeight = 1036;
const pages = document.querySelectorAll('.sec_3 .row');
document.querySelector('.cus-fullpage').style.height = `${pageHeight * pages.length}px`;

const stylePage = `background-image: url(https://www.koithe.com/uploads/tab-contents/59e5ac7097ee9.jpg); height: ${pageHeight}; position:fixed width: 100%; top: 0px;left: 0px; z-index: 5;`

let sections = document.querySelectorAll('section');
const sec_1 = document.querySelector('.sec_1 .container');
const btn_animate = document.querySelector('.shop_btn button');
const sec_2 = document.querySelector('.slider');

window.onscroll = () => {
  sections.forEach(sec => {
    let top = window.scrollY;
    let offset = sec.offsetTop;
    let height = sec.offsetHeight;

    let earlyPoint = 250;
    if (top < 5280) earlyPoint = 500;
    else earlyPoint = 0;

    if (top >= offset-earlyPoint && top < offset + height) {
      let scrollper = top / 9479;
      console.log(top)
      // console.log(scrollper);
      if (scrollper <= 1) {
        // container.style.transform = `translateY(${top + offset + 950}px)`;
        if (scrollper > 0.01) {
          btn_animate.classList.add('Btn_hover--active')
          let scale = 1200 * scrollper - (1200 * 0.01);
          let movX = -5250 * scrollper;
          if (scrollper > 0.25){
            scale = 1200 * scrollper * 2.2 - (1200 * 0.01);
            movX = -5250 * scrollper * 2.2;
          }
          btn_animate.style.transform = `matrix(${scale},0,0,${scale},${movX},0)`;
          if (scrollper <= 0.9)
            btn_animate.style.opacity = `${scrollper*2 + 0.11}`;
          if (scrollper > 0.98)
            btn_animate.classList.add('Btn_hover--active_last')
        }
        else {
          btn_animate.style.transform = `matrix(1,0,0,1,0,0)`;
          btn_animate.style.opacity = 1
          btn_animate.classList.remove('Btn_hover--active');
          btn_animate.classList.remove('Btn_hover--active_last')

        }
      }

      sec.classList.add('show-animate');
    }
    else
      sec.classList.remove('show-animate');
  })

  let index = 0;
  pages.forEach(page => {
    let top = window.scrollY
    let offset = 6314 + pageHeight * index;
    index++;
    // console.log({
    //   index: `${index}`,
    //   page: `${page}`,
    //   top: `${top}`,
    //   offset: `${offset}`
    // })
    if (index > pages.length) index = 0;
    if (top >= offset && top < offset + pageHeight) {
      page.style.cssText = stylePage;
    }

  })

}
