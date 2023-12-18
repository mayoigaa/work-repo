//연습문제
//h1 태그 1개만 선택해서 아래와 같이 변경하세요 
// style.color = "orange"
// style.background = "red"
// innerHTML = "From JavaScript"
// 힌트 : querySelector()
// window(생략) - document - html ... (dom 트리)
// let header = document.querySelector("h1");

// // 디자인 조작 : h1 태그, 속성(style)
// header.style.color =" orange";
// header.style.background = "red";
// // 문자열 조작: h1 태그 사이의 문자열 변경(innerHTML(Header))
// header.innerHTML = "From JavaScript";

// 2) h1 태그 모두 선택해서 아래와 같이 조작하세요 
let headers = document.querySelectorAll("h1");
// 반복문 실행 : header(배열) h1 태그 3개가 있음  
//              header[0] = h1 태그, header[1] = h1 태그, header[2] = h1 태그 
for(let i=0; i<headers.length; i++) {
    // 디자인 적용 
    headers[i].style.color = "orange";
    headers[i].style.background = "red";
    // 문자열 변경 : Header -> From Javascript
    headers[i].innerHTML = "From JavaScript"
}

