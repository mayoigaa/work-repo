-- sql_test.sql

CREATE TABLE DEPT03(
             DEPTNO NUMBER(3),
             DNAME VARCHAR2(14)
             );
             
COMMENT ON COLUMN DEPT03.DEPTNO IS '부서번호';
COMMENT ON COLUMN DEPT03.DNAME IS '부서명';
             


SELECT * FROM DEPT03;

COMMIT;

ALTER TABLE DEPT03
ADD(AREA VARCHAR2(20));
-- 결과 보기 
SELECT * FROM DEPT03;  

ALTER TABLE DEPT03 MODIFY DNAME VARCHAR2(20);
SELECT * FROM DEPT03;
DESC DEPT03;
COMMIT;

CREATE INDEX PK_DEPTNO 
ON DEPT03(DEPTNO);
SELECT * FROM DEPT03;
COMMIT;

CREATE TABLE EMP03(
     EMPNO VARCHAR(2),
     NAME VARCHAR2(20),
     DEPTNO VARCHAR2(3)NOT NULL,
     PEMPNO VARCHAR2(4),
     PAY NUMBER NOT NULL,
     POSITION VARCHAR2(20),
     REGDATE VARCHAR2(20),
     CONSTRAINT PK_EMPNO PRIMARY KEY(EMPNO)
);


SELECT * FROM EMP03;
COMMENT ON TABLE EMP03 IS '사원';
COMMENT ON COLUMN EMP03.EMPNO IS '사원코드';
COMMENT ON COLUMN EMP03.NAME IS '사원이름';
COMMENT ON COLUMN EMP03.DEPTNO IS '부서코드';
COMMENT ON COLUMN EMP03.PEMPNO IS '상사코드';
COMMENT ON COLUMN EMP03.PAY IS '급여';
COMMENT ON COLUMN EMP03.POSITION IS '직급';
COMMENT ON COLUMN EMP03.REGDATE IS '등록일';
SELECT * FROM EMP03;
DESC EMP03;




COMMIT;



CREATE SEQUENCE SEQ_EMP03_EMPNO
INCREMENT BY 1
START WITH 1001;






INSERT INTO DEPT03(DEPTNO, DNAME)
VALUES(101, '영업부');

INSERT INTO DEPT03(DEPTNO, DNAME)
VALUES(102, '총무부');

INSERT INTO DEPT03(DEPTNO, DNAME)
VALUES(103, '기획부');

INSERT INTO DEPT03(DEPTNO, DNAME)
VALUES(104, '홍보부');


INSERT INTO EMP03(EMPNO, NAME, DEPTNO, PEMPNO, PAY, POSITION, REGDATE)
VALUES(SEQ_EMP03_EMPNO.NEXTVAL, '가가가', 101, NULL, 450, '부장', SYSDATE);

INSERT INTO EMP03(EMPNO, NAME, DEPTNO, PEMPNO, PAY, POSITION, REGDATE)
VALUES(SEQ_EMP03_EMPNO.NEXTVAL, '나나나', 102, NULL, 400, '부장', SYSDATE);

INSERT INTO EMP03(EMPNO, NAME, DEPTNO, PEMPNO, PAY, POSITION, REGDATE)
VALUES(SEQ_EMP03_EMPNO.NEXTVAL, '다다다', 101, NULL, 350, '과장', SYSDATE);

INSERT INTO EMP03(EMPNO, NAME, DEPTNO, PEMPNO, PAY, POSITION, REGDATE)
VALUES(SEQ_EMP03_EMPNO.NEXTVAL, '라라라', 103, NULL, 410, '과장', SYSDATE);

INSERT INTO EMP03(EMPNO, NAME, DEPTNO, PEMPNO, PAY, POSITION, REGDATE)
VALUES(SEQ_EMP03_EMPNO.NEXTVAL, '마마마', 101, 1003, 300, '대리', SYSDATE);


INSERT INTO EMP03(EMPNO, NAME, DEPTNO, PEMPNO, PAY, POSITION, REGDATE)
VALUES(SEQ_EMP03_EMPNO.NEXTVAL, '바바바', 103, NULL, 400, '대리', SYSDATE);

INSERT INTO EMP03(EMPNO, NAME, DEPTNO, PEMPNO, PAY, POSITION, REGDATE)
VALUES(SEQ_EMP03_EMPNO.NEXTVAL, '가나다', 102, 1002, 320, '대리', SYSDATE);

INSERT INTO EMP03(EMPNO, NAME, DEPTNO, PEMPNO, PAY, POSITION, REGDATE)
VALUES(SEQ_EMP03_EMPNO.NEXTVAL, '홍길동', 102, 1007, 380, '사원', SYSDATE);

INSERT INTO EMP03(EMPNO, NAME, DEPTNO, PEMPNO, PAY, POSITION, REGDATE)
VALUES(SEQ_EMP03_EMPNO.NEXTVAL, '강감찬', 103, 1006, 250, '사원', SYSDATE);

INSERT INTO EMP03(EMPNO, NAME, DEPTNO, PEMPNO, PAY, POSITION, REGDATE)
VALUES(SEQ_EMP03_EMPNO.NEXTVAL, '이순신', 101, 1005, 200, '사원', SYSDATE);

 UPDATE DEPT03
 SET 
    AREA = "서울"
WHERE DNAME = "영업부";

 UPDATE DEPT03
 SET 
    AREA = "부산"
WHERE DNAME != "영업부";
SELECT * FROM DEPT03;


DELETE FROM EMP03
WHERE DEPTNO =101;
SELECT * FROM EMP03;
ROLLBACK;

SELECT NAME, POSITION, EMPNO
FROM EMP03
ORDER BY ASC;

SELECT EMPNO,TRUNC(AVG(PAY)),COUNT(*)
FROM EMP03;








      




