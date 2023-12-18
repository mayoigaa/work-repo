// 문제 
//  연습문제 1) 
// 현재 날짜를 아래와 같이 주어진다.
// 12시 이전이면 "오전입니다."라고 출력하고
// 12시 이후면 "오후입니다"라고 출력하는
// 프로그램을 코딩하세요 

// let date = new Date();
// let hours = date.getHours();
// if(hours < 12) {
//     console.log("오전입니다");
// }else if(hours > 12 ) {
//     console.log("오후입니다");
// }


// 2) 
// 현재 날짜를 이용해서 아래와 같이 코딩하세요
// 현재 시각이 5시 이전이면 "잠을 자렴..."
//            7시 이전이면 "준비"
//            9시 이전이면 "출근"
//            12시 이전이면 "빈둥빈둥"
//            14시 이전이면 "식사"

// if(hours <= 5) {
//     console.log("잠을 자렴...");
// }else if(hours <=7 && hours >= 5 ) {
//     console.log("준비")
// }else if(hours <=9&& hours >= 7) {
//     console.log("출근")
// }else if(hours <=12 && hours >= 9) {
//     console.log("빈둥빈둥")
// }else if(hours <=14&& hours >= 12) {
//     console.log("빈둥빈둥")
// }


// 3)
// 연도, 월, 일이 닷(.)으로 구분되어 입력된다.
// 대시를 구분기호로 사용해서 일-월-연도로 바꾸어서
// 코딩용어 : -(마이너스, 대시)
// 출력하세요

// let char1 = prompt("날짜를 입력해주세요 ").split(".");   // 잘리면 배열이 됨
// // char1[0] = 2020, char[1] = 3, char1[2] = 4
// //출력 : 문자열 붙이기 
// alert(char1[2]+ "-" + char1[1]+ "-" + char1[0]);

// 4) 
//
let result = "";

//2중 반복문 : 세로 (밖의 for문 : 줄 5번 반복 )
for(let i = 0; i < 5; i++) {
    // 가로 (안의 for문 : * 10번 반복)
    for(let k = 0; k <= 10; k++) {
        result = result + "*"  ;
    }
    result = result + "\n";// \n 5번 문자열 붙이기
}
alert(result); //결과 출력