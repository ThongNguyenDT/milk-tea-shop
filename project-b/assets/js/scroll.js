const pageHeight = window.innerHeight;
const pages = document.querySelectorAll('.cus-fullpage-items');
const pagePositions = document.querySelector('.sec_3 .cus-fullpage-position');
const curPages = document.querySelector('.cus-fullpage');
curPages.style.height = `${pageHeight * pages.length + pageHeight}px`;

const stylePage = `position:fixed; top: 0px;left: 0px; z-index: 5;`

let sections = document.querySelectorAll('section');
const sec_1 = document.querySelector('.sec_1');
const btn_animate = document.querySelector('.shop_btn button');
const sec_2 = document.querySelector('.slider');

window.onscroll = () => {
  sections.forEach(sec => {
    let top = window.scrollY;
    let offset = sec.offsetTop;
    let height = sec.offsetHeight;

    let earlyPoint = 500;
    if (top < sections[1].offsetTop-100) earlyPoint = 500;
    else earlyPoint = 0;

    if (top >= offset-earlyPoint && top < offset + height && top > 16) {
      let scrollper = top / 9479;
      console.log('top:', top);
      console.log('start:',offset-earlyPoint);
      console.log('end:', offset + height);
      console.log(scrollper);
      if (scrollper <= 1 && (sec_1.classList.contains('show-animate') || sec_2.classList.contains('show-animate'))) {
        // container.style.transform = `translateY(${top + offset + 950}px)`;
        if (scrollper > 0.01) {
          btn_animate.classList.add('Btn_hover--active')
          let scale = 1200 * scrollper - (1200 * 0.01);
          let movX = -5250 * scrollper;
          if (scrollper > 0.1){
            scale = 1200 * scrollper * 5 - (1200 * 0.01);
            movX = -5250 * scrollper * 5;
          }
            btn_animate.style.transform = `matrix(${scale},0,0,${scale},${movX},0)`;
          if (scrollper <= 0.9)
            btn_animate.style.opacity = `${scrollper*5 + 0.11}`;
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
      // if (offset-earlyPoint == 4242 && sections[2].children[0].children.length == 7 )

      sec.classList.add('show-animate');
    }
    else{
      sec.classList.remove('show-animate');
      pagePositions.style.display = 'none'
    }
  })

  let index = 0;
  pages.forEach(page => {
    let top = window.scrollY
    let offset = sections[2].offsetTop + pageHeight * index;
    index++;
    // console.log({
    //   index: `${index}`,
    //   page: `${page}`,
    //   top: `${top}`,
    //   offset: `${offset}`
    // })
    if (index > pages.length) index = 0;
    if (top >= offset && top < offset + pageHeight && index < 8) {
      page.style.cssText = stylePage;
      pagePositions.style.display = 'block'
      // console.log('indexchi ',pagePositions.children[index-1]);
      // console.log('indexchichi ',pagePositions.children[index-1].children[1]);
      pagePositions.children[index-1].style.color = 'wheat';
      pagePositions.children[index-1].children[1].style.color = 'green';
    }
    else
    {
      page.style.cssText = '';
      pagePositions.children[index-1].style.cssText = '';
      pagePositions.children[index-1].children[1].style.cssText = '';
    }

  })

}

function myFunction(i) {
  const index = [4242,5278,6314,7350,8386,9422,10458,12578]
  window.scrollTo(0, index[i]);
}


