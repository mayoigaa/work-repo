// TODO: 선택한 자기자신 삭제
// 선택함수 : class = "one"인 것 
// 사용법 : document.querySelector(css선택지);
let liOne = document.querySelector(".one");

// TODO: 요소 삭제
// 사용법 : 태그.remove()
liOne.remove();

// TODO: 2) 부모의 자식 중 1개를 삭제 
// 부모 선택 : ul 태그 
let ulTag = document.querySelector("ul");
// 삭제할 자식 태그 선택 : class="removeTarget"
let removeTarget = document.querySelector(".removeTarget")

// TODO: 자식 태그 삭제하기
// 사용법 : 부모 태그.removeChild(삭제할 자식 태그);
ulTag.removeChild(removeTarget);

