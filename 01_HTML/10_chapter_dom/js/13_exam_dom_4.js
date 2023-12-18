// 힌트 : style.display = "none" (사라짐)
//        style.display = "block" (나타남)
// 상세목록 글을 보이게 만드는 함수 
function showDetail() {
    document.querySelector("#desc").style.display = "block";
    document.querySelector("#open").style.display = "none";
    

}
// 상세목록 글을 안보이게 만드는 함수 
function hideDetail() {
    document.querySelector("#desc").style.display = "none";
    document.querySelector("#open").style.display = "block";
}


