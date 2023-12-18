<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<%--header--%>
<jsp:include page="../../common/header.jsp"/>

<div class="container">
    <%--    todo: 검색어 시작--%>
    <%--     form 안에 input 태그의 value 값들이 -> springboot 함수로 전달됨 --%>
    <form class="row g-3 justify-content-center" action="/exam01/emp" method="get">
        <div class="col-auto">
            <%--            todo: 사원명 라벨 --%>
            <label for="ename" class="visually-hidden">Ename</label>
            <%--            todo: 검색창--%>
            <input type="text" class="form-control" id="ename" placeholder="ename" name="ename">
            <%--            todo: hidden(숨김) page = 0, size = 3 --%>
            <input type="hidden" class="form-control" id="page" name="page" value="0">
            <input type="hidden" class="form-control" id="size" name="size" value="3">
        </div>
        <%--     todo: 서브밋 버튼 --%>
        <div class="col-auto">
            <button type="submit" class="btn btn-primary mb-3">Search</button>
        </div>
    </form>
    <%--    todo: 검색어 끝--%>

    <%--    todo: 테이블 반복문 시작--%>
    <table class="table">
        <thead class="thead-dark">
        <tr>
            <th scope="col">사원번호</th>
            <th scope="col">사원명</th>
            <th scope="col">직위</th>
            <th scope="col">매니저</th>
            <th scope="col">입사일</th>
            <th scope="col">급여</th>
            <th scope="col">상여금</th>
            <th scope="col">부서번호</th>
            <th scope="col">등록일자</th>
            <th scope="col">수정일자</th>
        </tr>
        </thead>
        <tbody>

            <tr>
                <td>${emp.eno}</td>
                <td>${emp.ename}</td>
                <td>${emp.job}</td>
                <td>${emp.manager}</td>
                <td>${emp.hiredate}</td>
                <td>${emp.salary}</td>
                <td>${emp.commission}</td>
                <td>${emp.dno}</td>
                <td>${emp.insertTime}</td>
                <td>${emp.updateTime}</td>
            </tr>


        </tbody>
    </table>


<script>
    let obj = "${emp}";
    console.log(obj);
</script>


<%--footer--%>
<jsp:include page="../../common/footer.jsp"/>

</body>
</html>