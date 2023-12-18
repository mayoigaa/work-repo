let charVal = prompt("입력하세요 ")
if(charVal === "y") {
    // 글쓰기 버튼 추가
    document.querySelector("#app").innerHTML = "<button>글쓰기</button>"
}else {
    // 글 수정 버튼이 나오게 하세요 
    document.querySelector("#app").innerHTML = "<button>글 수정</button>"
}

