// 조건문 
// 5) x가 1일 경우 "x의 값은 1입니다"
// x가 2일 경우 "x의 값은 2입니다"
// x가 1도 2도 아닌 경우 "x의 값은 1 또는 2가 아닙니다"
// 입력 : 2
// 출력 : x의 값은 2입니다
// 단, 화면에 출력하세요 
// TODO : if문 풀이 
// let x =Number(prompt("입력해주세요"))

// if(x === 1 ){
//     alert("x의 값은 1입니다");
// }else if (x === 2 ){
//     alert("x의 값은 2입니다");
// }else {
//     alert("x의 값은 1 또는 2가 아닙니다");
// }

// TODO : switch 문 풀이 
// 조건문 : switch
// 사용법 : 조건변수와 값을 비교해서 각각의 case 따라 실행됨
//         switch(조건변수) {
//            case 값:
//                실행문;
//                break;
//            ...
//            default:
//                실행문;
//                break;               
//         }


// let num = Number(prompt("숫자를 입력해주세요 "));

// // 조건문 : switch
// switch(num) { 
//     // num === 1일 때
//     case 1:
//         alert("x의 값은 1입니다");
//         break;
//     // num === 2일 때 
//     case 2:
//         alert("x의 값은 2입니다");
//         break;
//     // 모두 아닐 때 아래가 실행됨     
//     default:
//         alert("x의 값은 1 또는 2가 아닙니다");
//         break; // 마지막은 생략가능 
// }

// TODO : 3항 연상자(조건문) : *****(React 에 시도때도 없이 사용함)
// 활용 : 자바, 자바 스크립트에서 간단한 조건 문제일 경우 사용함(주로 1줄로 표현)
// 사용법 : let 변수명 = (조건식)? 실행문 : 실행문2;
//    조건식을 판단하여 참이면 실행문1 실행되고, 거짓이면 실행문2가 실행됨
// 예제) 입력값을 받아서 값이 admin이면 "있음"라고 출력하고, 아니면 "없음" 출력하세요 
let strVal = prompt("아이디를 입력하세요");

// 조건식 : 3항 연산자 사용
// strVal 가 admin이면 있음 이라는 문자열이 result  변수에 저장됨
//            아니면 없음이라는 문자열이 result 변수에 저장됨
let result = (strVal === "admin")? "있음" : "없음";

//결과 출력 
alert(result);