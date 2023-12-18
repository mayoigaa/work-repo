// 문제 풀이
// 선택 함수
let cover = document.querySelector("#cover"); // img 태그

// 마우스가 위로 올라가면 함수
cover.addEventListener("mouseover", function(){
    // girl(./img/easys-1.jpg) -> boy(./img/easys-2.jpg)
    // img 태그의 src 속성 조작
    cover.src = "./img/easys-2.jpg"; // 이미지 바꾸기
})
// 마우스가 나가면 함수
cover.addEventListener("mouseout", function(){
    // boy -> girl 이미지
    cover.src = "./img/easys-1.jpg"; // 이미지 바꾸기
})
