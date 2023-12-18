// 객체 : 실생활에서 보이는 모든 것을 객체라고 함 
//      예) 사람, 사물 등 
// 객체의 요소 : 1) 속성(특징을 나타냄, 80%)
// 비교) css 사용법
// 선택자 {
//     속성: 값;
//     속성2: 값2;
//     ...
// }

// TODO): 객체 사용법 
// let 변수명 = {
//     속성: 값,
//     속성2: 값2,
//     ...
// }
// 예제 ) 안지영이라는 사람의 속성(특징)을 나열하고 객체를 만드세요

// let member = {
//     name : "안지영",
//     email : "hong@naver.com",
//     phone : "010-1234-5678",
//     age : 24,
//     job : true
// }
// // 객체 속성 출력
// //사용법 : 객체명,속성명 => 값이 출력됨 
// console.log("name", member.name);
// console.log("email", member.email);
// console.log("phone", member.phone);
// console.log("age", member.age);
// console.log("job", member.job); 


// 연습문제 1) 
//  객체 정의 하고 객체 출력하기
// 고양이에 대한 특징을 alert 을 이용해서 화면에 출력하세요
// 속성 :
//     이름: 나비
//     색깔: 황토색
//     무게: 10kg
//  코드번호: 1234
//  전화번호: 010-1234-5678

// 객체 정의 
// let cat = {
//     name : "나비",
//     color : "황토색",
//     weight : "10kg",
//     code : 1234,
//     phone : "010-1234-5678"

// }
// console.log("name", cat.name);
// console.log("color", cat.color);
// console.log("weight", cat.weight);
// console.log("code", cat.code);
// console.log("phone", cat.phone);


let rabbit = {
    name : "삼식이",
    color : "갈색",
    weight : "5kg",
    code : 1234       // 자료형 모두 사용 가능 (문자열, 숫자, 참/거짓 등 )
}
// 객체 속성 출력 
// 사용법 : 객체명.속성명 
console.log("name", rabbit.name);
console.log("color", rabbit.color);
console.log("weight", rabbit.weight);
console.log("code", rabbit.code);

// 자료형 : 문자열(string), 숫자(number), 참/거짓(bool/boolean)
//        배열(객체), null, undefined, 참고)Symbol(1%)
// 총 6개 
// 예제) 변수에 null 넣기 
let char1 = null; // 사용법 , 과거 코딩(변수 초기화 많이 사용 )
// 현재는 null 초기화 권장하지 않음 (버그가 많이 발생함)
let char2 = ""; //빈 문자열 초기화 
let num = 0; //숫자 초기화

// 메모리 : 프로그램 실행시키면 -> 컴퓨터 메모리에 올라감 
// TODO: undefined 자료형 : (js만 있음, 다른 언어는 없음 )
//     : 객체의 속성명이 정의되지 않은 것 (않은 상태)
// 객체 정의
let dog = {
    name: "삼순이",
    age: 2
}
console.log ("name", dog.name);
console.log ("age", dog.age);
// undefined 에러가 발생함 
console.log ("code", dog.code);  //code 속성 정의되지 않았음 