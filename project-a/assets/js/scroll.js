// const { innerHeight } = window;

// // gsap.to(".shop_btn",{ duration: 2}) 

// const tl = gsap.timeline({
//   scrollTrigger: {
//     trigger: ".shop_btn",
//     markers: true,
//     start: "-100px 50%",
//     end: "bottom 50%",
//     scrub:1
//   }
// });

// tl.to(".shop_btn", {scale:1200, x:-1855, duration:3})

// const tl1 = gsap.timeline({
//   scrollTrigger: {
//     trigger: ".shop_btn",
//     markers: true,
//     start: "-100px 50%",
//     end: "bottom 50%",
//     scrub:1
//   }
// });

// tl1.to(".section_1 .row{", {top:1028})


let sections = document.querySelectorAll('section');
const container = document.querySelector('.sec_1 .container');
const btn_animate = document.querySelector('.shop_btn button');
const sec_2 = document.querySelector('.slider');

window.onscroll = () => {
  sections.forEach(sec => {
    let top = window.scrollY;
    let offset = sec.offsetTop - 1000;
    let height = sec.offsetHeight;

    if (top >= offset && top < offset + height){
      let scrollper = top/9479;
      console.log(scrollper);
      if (scrollper <=1){
        container.style.transform = `translateY(${top+offset+950}px)`;
        if (scrollper > 0.01){
          btn_animate.classList.add('Btn_hover--active')
          let scale = 1200 * scrollper - (1200 * 0.01);
          let movX = -5250 * scrollper;
          btn_animate.style.transform = `matrix(${scale},0,0,${scale},${movX},0)`;
          if (scrollper <= 0.9)
            btn_animate.style.opacity = `${scrollper + 0.11}`;
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
}