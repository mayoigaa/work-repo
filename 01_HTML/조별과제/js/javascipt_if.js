// !-- TODO: 1151 ~ 1168 -->

//TODO: 1151
// let num = Number(prompt("입력"));
// if(num < 10) {
//     console.log("small");
// }

//TODO: 1152
// let num = Number(prompt("입력"));
// if(num < 10) {
//     console.log("small");
// }else {
//     console.log("big")
// }
//TODO: 1153
// let a = Number(prompt(" a입력"));
// let b = Number(prompt(" b입력"));
// if(a > b){
//     console.log(">");
// }else if(a < b){
//     console.log("<");
// }else{
//     console.log("=");
// }

//TODO: 1154
// let num1 = Number(prompt("num1 입력"));
// let num2 = Number(prompt("num2 입력"));
// if(num1 > num2){
//     console.log(num1 - num2);
// }else if(num1 < num2){
//     console.log(num2 - num1);
// }
//TODO: 1155
// let num = Number(prompt("입력"));
// if(num%7 === 0){
//     console.log("multiple");
// }else {
//     console.log("not multiple");
// }
//TODO: 1156
// let num = Number(prompt("입력"));
// if(num%2 === 0) {
//     console.log("even");
// }else{
//     console.log("odd");

// }
//TODO: 1157
// let num = Number(prompt("입력"));
// if(num >= 50 && num <= 60){
//     console.log("win");
// }else{
//     console.log("lose");
// }
//TODO: 1158
// let num = Number(prompt("입력"));
// if((num >= 40 && num <= 40) || (num>= 60 && num<=70) ){
//     console.log("win");
// }else{
//     console.log("lose");
// }

//TODO: 1159
// let num = Number(prompt("입력"));
// if((num >= 50 && num <= 70)|| num%6===0){
//     console.log("win");
// }else{
//     console.log("lose");
// }
//TODO: 1160
// let num = Number(prompt("입력"));
// if(num === 1) {
//     console.log("oh my god");
// }else if(num ===2) {
//     console.log("enjoy");
// }else if(num ===3) {
//     console.log("oh my god");
// }else if(num ===4) {
//     console.log("enjoy");
// }else if(num ===5) {
//     console.log("oh my god");
// }else if(num ===6) {
//     console.log("enjoy");
// }else if(num ===7) {
//     console.log("oh my god");
// }

//TODO: 1161
// let num1 = Number(prompt("1입력"));
// let num2 = Number(prompt("2입력"));
// if( num1%2 !== 0 && num2%2 === 0 ) {
//     console.log("홀수 + 짝수 = 홀수" );
// }else if(num1%2 !== 0 && num2%2 !== 0){
//     console.log("홀수 + 홀수 = 짝수");
// }else if(num1%2 === 0 && num2%2 !== 0){
//     console.log("짝수 + 홀수 = 홀수");
// }else if(num1%2 === 0 && num2%2 === 0){
//     console.log("짝수 + 짝수 = 짝수");
// }

//TODO: 1162
// let arr = prompt("생년월일입력").split(" ").map(Number);
// let year = arr[0]; //년
// let month = " "+ arr[1]; //월
// let day = " " + arr[2];  //일
// if(day%10 === 0){
//     console.log("대박");
// }else{
//     console.log("그럭저럭");
// }


//TODO: 1163
// let birth = prompt("생년월일 입력").split(" ").map(Number);
// let result = (birth[0] + birth[1] + birth[2])/ 100;
// if(result%2 == 0) {
//     console.log("대박")
// }else{
//     console.log("그럭저럭")
// }
//TODO: 1164
// let num1 = Number(prompt("입력"));
// let num2 = Number(prompt("입력"));
// let num3 = Number(prompt("입력"));
// let min = Math.min(num1, num2, num3)
// if (min <= 170) {
//     console.log("CRASH");
// }else{
//     console.log("PASS");
// }
//TODO: 1165
// let class1= Number(prompt("시간, 득점 입력")).split(" ").map(Number);
// let g

//TODO: 1166
// let year = Number(prompt("입력"));
// if(year%400 === 0){
//     console.log("Leap");
// }else if(year%4===0 && year%100 !== 0 ){
//     console.log("Leap")
// }else{
//     console.log("Normal")
// }

//TODO: 1167
// let num = prompt("세 정수 입력").split(" ").map(Number)
// num.sort(function (a, b){
//     return a - b;
// })

// console.log(num[1]);


//TODO: 1168
// let str = prompt("주민번호 7자리").split(" ").map(Number);
// let result = 0;
// if(str[1]=== 1 || str[1]===2){
//     result = 112 - Math.round(str[0]/10000) + 1 ;
// }else if(str[1] === 3 || str[1]===4){
//     result = 122 - Math.round(str[0]/10000) + 1 ;
// }
// console.log(result);


// !-- TODO: 1170 ~ 1173, 1180 -->

// TODO: 1170  
// let num = prompt("학번 입력 ").split(" ").map(Number);
// let result = 0;
// if(num[3] < 10 ){
//     result = num[0]+num[1] + "0" + num[2];
// }else{
//     result = num[0] + num[1] + num[2];
// }
// console.log(result);

// TODO: 1171
// let num = prompt("학번 입력 ").split(" ").map(Number);
// let result = "";
// if(num[1]<10 && num[2]<10){
//     result = num[0] + "0" + num[1] + "00" + num[2];
// }else if(num[1]<10 && num[2]<100){
//     result = num[0] + "0" +num[1] + num[2] ;
// }else{
//     result = num[0] + num[1] + num[2];
// }
// console.log(result);

// TODO: 1172 ** 
// let num = prompt("숫자 입력").split(" ").map(Number);
// let result = "";
// if()

// TODO: 1173
// let num = prompt("시간 입력").split(" ").map(Number);
// if(num[1]<30){
//     console.log((num[0]-1) , (num[1] + 30));
// }else if(num[1]>29 && num[1] < 60){
//     console.log(num[0] , (num[1] - 30 ));
// }

// TODO: 1180
let bin = prompt("휴지통 용량").split("").map(Number);
result = 0;
if(bin<100){
    result = ((bin[0]%10) + (bin[1]*10)) * 2
   if( result < 50 ) {
    console.log("Good");
   }else {
    console.log("OH MY GOD")
   } 

}

// !-- TODO: 1201 ~ 1207, 1210, 1212, 1214, 1216, 1218 -->



// !-- TODO: 1222, 1224, 1226  -->

// !-- TODO: 1228 ~ 1231  -->