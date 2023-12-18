//js 함수 정의 
function changeText(event) {
    //event.target == 현재 클릭한 태그 
    //클릭하면 문자열 변경 : 클릭해보세요 -> 클릭하셨네요!
    event.target.innerHTML = "클릭하셨네요!";
}

// 마우스 위로 함수 : 배경색을 변경(orange) 
function mouseOver(event) {
    // event.target == 현재 마우스 위로 올라간 태그(div)
    event.target.style.backgroundColor = "orange";
}

// 마우스 나갔을 때 함수 : 배경색을 변경(skyblue)
function mouseOut(event) {
    // event.target == 현재 마우스 위로 올라간 태그(div)
    event.target.style.backgroundColor = "skyblue";
}