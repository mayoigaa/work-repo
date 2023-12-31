//베열(객체) : 여러가지 값을 저장하는 곳(장소)
//비교) 변수 : 한가지 값을 저장하는 곳(장소)

// 배열의 형태
// 사용법 : 
//  1) 배열 정의
//       let 배열변수명= ["값", "값2",...,"값n"]
//  2) 배열 사용 : 인덱스번호( 0 ~ n-1까지 )
//     배열변수명[0] <- "값"
//     배열변수명[1] <- "값2"
//     ...
//     배열변수명[n-1] <- "값n"

// 예제) 아래와 같이 색깔 배열이 있다. 화면에 배열의 값을 모두 출력하세요 

// let color = ["red", "green", "blue", "yellow", "skyblue"]
// //  color === 배열변수명, 배열변수명[인덱스번호]

// for(let i=0; i<=4; i++) {
//     //i=0일때 color[0] === "red" 출력
//     //i=1일때 color[1] === "green" 출력
//     //i=2일때 color[2] === "blue" 출력
//     console.log(color[i]);
// }

// 예제 2) 아래와 같은 배열 값들이 있다.
// 아래처럼 출력하세요
// 출력 : 1번째 할 일: 우유구매
//        2번째 할 일: 업무 메일 확인하기
//        3번째 할 일: 필라테스 수업

// let todos = ["우유구매", "업무 메일 확인하기", "필라테스 수업"]

// for(let i=0; i<3; i++) {
//     console.log((i+1)  + "번째 할 일: " +todos[i]);
// }


// 예제 3) 화면에 배열 값들을 출력하세요
// 출력:12345
//힌트: 배열의 길이 : 배열변수명.length 사용해보세요
let array =[1,2,3,4,5];
let result = "" //초기화

//반복문 : array.length(베열의 크기(개수):5)
for(let i=0; i<array.length; i++) {
    //문자열 붙이기 
    result= result +array[i];
}
console.log(result);