// 1) 1부터 100까지 출력하기
//for문 사용 

// for(let i=1; i<100; i++) {
// console.log(i);
//}


// 2)  1부터 n까지 출력하기
// 입력 예시 : 5
// 출력 예시 : 1 2 3 4 5
// let num = Number(prompt("정수를 입력하세요 "))
// //문자열 붙이기 변수
// let result="";  //빈 문자열
// for(i=1; i<=num; i++){
//     result = result + i + " "; // 문자열 붙이기
// }
// console.log(result);

//3) a부터 b까지 출력하기
// 입력 예시  1: 8
// 입력 예시  2: 3
// 출력 예시 : 3 4 5 6 7 8
// let num1 = Number(prompt("정수를 입력하시오"))
// let num2 = Number(prompt("정수를 입력하시오"))

// //최대값(Math.max()), 최소값(Math.min())
// let maxNum = Math.max(num1, num2); // 큰 값
// let minNum = Math.min(num1, num2); // 작은 값

// // 문자열 붙이기 
// let result=""; //빈 문자열로 초기화 

// //for(시작값; 시작값<=끝값;증감식){}
// for(let i=minNum; i <= maxNum; i++) {
//     //문자열 붙이기 : 문자열 + 숫자 => 문자열(자동 자료형변환)
//     result = result + i + " ";
// }

// alert(result);


// 4) 별 출력하기 
// 입력: 5 
// 출력: 5 
// let result = "";
// let num = Number(prompt("숫자를 입력하세요 "))

// for(i=0; i<=num; i++){
//     result = result * "*"
// }
// console.log(result);

//5) 1 ~ 10까지 합계를 구해서 아래와 같이 화면에 출력해 보세요
//  출력 : "1 ~ 10 까지의 합계 : 55"
// let sumVal = 0;
// for(let i=1; i<=10; i++) {
//     sumVal = sumVal + i;
// }
// console.log("1~10까지의 합계 : " + sumVal);
