SELECT
        CHI.CHECK_ID as checkId      ,
        RES.CHECK_YN as checkYn      ,
        RES.ADULT_COUNT as adultCount      ,
        RES.CHILD_COUNT as childCount      ,
        RES.MEMBER_Yn as memberYn,
        RES.AIRLINE_RESERVATION_NUMBER as airlineReservationNumber 
    FROM
        TB_CHECKIN CHI,
        TB_RESERVATION RES 
    WHERE
        CHI.AIRLINE_RESERVATION_NUMBER = RES.AIRLINE_RESERVATION_NUMBER
        AND CHI.AIRLINE_RESERVATION_NUMBER = 100000;


SELECT CHI.CHECK_ID
     , RES.CHECK_YN
     , RES.ADULT_COUNT
     , RES.CHILD_COUNT
     , RES.AIRLINE_RESERVATION_NUMBER
FROM TB_CHECKIN CHI, TB_RESERVATION RES
WHERE CHI.AIRLINE_RESERVATION_NUMBER = RES.AIRLINE_RESERVATION_NUMBER
AND RES.AIRLINE_RESERVATION_NUMBER = 100000;

SELECT
        CHI.CHECK_ID as checkId      ,
        RES.CHECK_YN as checkYn      ,
        RES.ADULT_COUNT as adultCount      ,
        RES.CHILD_COUNT as childCount      ,
        RES.AIRLINE_RESERVATION_NUMBER as airlineReservationNumber 
    FROM
        TB_CHECKIN CHI,
        TB_RESERVATION RES 
    WHERE
        CHI.AIRLINE_RESERVATION_NUMBER = RES.AIRLINE_RESERVATION_NUMBER 
        AND RES.AIRLIE_RESERVATION_NUMBER = 100000;
        
        
SELECT 
       RES.AIRLINE_RESERVATION_NUMBER as airReservationNumber,
       OPI.START_AIRPORT as startAirport,
       OPI.FINAL_AIRPORT as finalAirport,
       OPI.OPERATION_ID as operationId
       FROM
       TB_RESERVATION RES,
       TB_OPERATION_INFO OPI
       WHERE RES.OPERATION_ID = OPI.OPERATION_ID
       AND RES.OPERATION_ID = 1;
        
        
        
SELECT CHI.CHECK_ID
        , RES.CHECK_YN
        , RES.ADULT_COUNT
        , RES.CHILD_COUNT
        , RES.AIRLINE_RESERVATION_NUMBER
        , RES.MEMBER_yN
        FROM TB_CHECKIN CHI, TB_RESERVATION RES
        WHERE CHI.AIRLINE_RESERVATION_NUMBER = RES.AIRLINE_RESERVATION_NUMBER
        AND RES.AIRLINE_RESERVATION_NUMBER = 100000;
        
        
SELECT PAS.PASSPORT_ID as passportid
       , MEM.MEMBER_ENAME as memberEname
       , MEM.MEMBER_SEX as memberSex
       , MEM.MEMBER_DATE as memberDate
       , MEM.MEMBER_COUNTRY as memberCountry
       , MEM.MEMBER_ID as memberId
       FROM TB_PASSPORT PAS, 
            TB_MEMBERS_INFO MEM
       WHERE PAS.MEMBER_ID = MEM.MEMBER_ID
       AND MEM.MEMBER_ID = 'qwe123';
       
       
       
SELECT PAS.PASSPORT_ID as passportid
       , NON.USER_NAME as userName
       , NON.USER_SEX as userSex
       , NON.USER_DATE as userDate
       , NON.USER_COUNTRY as userCountry
       , NON.USER_NUMBER as userNumber
       FROM TB_PASSPORT PAS, 
            TB_NON_MEMBERS_INFO NON
       WHERE PAS.USER_NUMBER = NON.USER_NUMBER
       AND NON.USER_NUMBER = 123;
       
INSERT INTO TB_RESERVATION 
VALUES (100000, '1', '0', 'N', '비지니스', 'Y', 'Y', 'qwe123', null, 1, SYSDATE, NULL, NULL, 'N');
COMMIT;
       
INSERT INTO tb_passport VALUES ('M10000001','대한민국','2025-11-01',NULL,'123','23/11/28',NULL,NULL,'N');       
SELECT * FROM tb_passport;
INSERT INTO tb_non_members_info VALUES (12,'박유빈','female','test','1999-4-7','010-2111-1111','fgjdikfg@naver.com','23/11/27',Null,Null,'N');
SELECT * FROM tb_non_members_info;
SELECT * FROM tb_reservation;
INSERT INTO tb_reservation VALUES (100002,'2','1','N','비지니스','N','N', NULL,12,1,'23/11/28',NULL,NULL, 'N');
COMMIT;


       
       




        

