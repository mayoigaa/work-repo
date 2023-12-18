// 함수 문제 풀이
// 연습문제 1
// 함수를 사용해서 출력하세요 
// 입력 : 10
// 출력 : 20

// function sumTen(params) {
//     alert(params + 10 );
// }
// // 함수 사용(호출)
// let num = Number(prompt("숫자")); // 10 
// sumTen(num); //함수 사용

// 연습문제 2
// 함수를 사용해서 출력하세요.
// 짝수이면 "even" 출력하고, 홀수이면 "odd" 출력하세요.
// 입력 : 2
// 출력 : even
// 함수 정의 : 2nd 형태(매개변수 : O, return : x)
// function name(params) {
//     // params 가 짝수이면
//     if(params % 2 == 0) {
//         alert("even");
//     } else {
//         alert("odd");
//     }
// }
// // 함수 사용
// // 사용법 : 함수명(값);
// let num = Number(prompt("숫자")); //2
// name(num); // 함수 사용


// 3)
// 함수를 이용해서 아래를 작성하세요.
// 1 ~ 10 까지의 합을 출력하세요.
// 입력 : 10
// 출력 : 55
// 함수 정의 : 2nd 함수 형태 (return 없음 )
 
// function name(params) {
//     //누적합 함수 초기화
//     let sumVal = 0;

//     //params : 끝값(입력된 값)
//     for(let i=1; i<=params; i++){
//         sumVal = sumVal + i; // 누적합(params까지의 누적합)
//     }
//     alert(sumVal);
// }
// // 함수 사용(호출)
// // 사용법 : 함수명(값)
// let num = Number(prompt("숫자")); //10
// name(num);

// 4) 함수로 만들어서 풀기(1st, 2nd, 3rd 아무거나)
// 입력 1: 1
// 입력 2: 2
// 입력 3: 3
// 출력 : 1
// 최소값 구하기

// function Mymin(num1, num2, num3) { 
//     //최소값 구하는 코딩
//    alert(Math.min(num1, num2, num3));
// }
// // 함수 사용 
// let num1 = Number(prompt("숫자1"));
// let num2 = Number(prompt("숫자2"));
// let num3 = Number(prompt("숫자3"));

// Mymin(num1, num2, num3);



// 5) 함수로 만들어서 풀기(1st, 2nd, 3rd 아무거나)
// 5의 배수이면 "5의 배수이다" 출력하고,
// 아니면 "5의 배수가 아니다" 라고 출력하세요.
// 입력 : 5
// 출력 : 5의 배수이다.
// 입력값 : 5
// 함수 정의 : 2nd 함수 형태(매개변수 있고, return 없음)
// function MultiFive(num) {
//     if(num%5==0) {
//         alert("5의 배수이다")
//     }else{
//         alert("5의 배수가 아니다");
//     }
  
// }

// let num = Number(prompt("숫자1"))
// MultiFive(num);

// 6) 함수를 이용해서 코딩하세요
// 3가지 숫자를 입력받아 합계와 평균 구하기 
// 입력 : 80
// 입력2 : 90
// 입력3 : 100
// 결과 : 270 
//        90


// 함수 정의 : 2nd 형태 
function f(num1, num2, num3) {
  //합계
  let sumVal = num1 + num2 + num3;
  //평균
  let sumAvg =  (num1 + num2 + num3) / 3;
  alert("합: " + sumVal +"\n" + "평균 : " + sumAvg);
}

let num1  = Number(prompt("숫자1"));
let num2  = Number(prompt("숫자2"));
let num3  = Number(prompt("숫자3"));
//함수 사용(호출)
// 사용법 : 함수명(값1, 값2, 값3)
f(num1, num2, num3);
