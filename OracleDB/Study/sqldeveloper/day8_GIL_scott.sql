select * from tab;

select * from emp;

select empno, ename from emp;
/* 콤마 ',' 로 구분*/

/*테이블의 구조 확인 */
desc emp;
/* describe : 설명하다*/
desc professor;

select name,'교수님~배고파요~'
from professor;


select * from student;

select studno "학번", name as "이름", profno 지도교수번호 from student;


/* distinct = 중복 제거 */
select deptno1 from student;
select DISTINCT deptno1 from student;

SELECT deptno ,job FROM emp;
SELECT DISTINCT deptno FROM emp;
SELECT DISTINCT deptno ,job FROM emp;

SELECT DISTINCT deptno ,job FROM emp;


/* 연결(합성) 연산자(Concatenation)로칼럼을붙여서출력하기 */
SELECT name, position FROM professor;
SELECT name || position FROM professor;
/* 가운데 칸 나누는 부분이 사라지고 붙어서 나옴 */
/* ex) 3 송도권 전임강사 -> 3 송도권전임강사  */

SELECT name || '의 키는' || height || 'cm, 몸무게는' || weight || 'kg 입니다' from student;
/* 3. 이미경의 키는168cm, 몸무게는52kg 입니다 */

SELECT sal , sal+100/2 , (sal+100)/2 FROM emp;
/* 연산(+,*,-,/), 괄호 '( )' 사용 가능 */

SELECT ename, sal, deptno FROM emp WHERE deptno = 10;
SELECT ename, sal FROM emp WHERE sal > 4000;

SELECT NAME, PAY, HIREDATE FROM  PROFESSOR WHERE HIREDATE >= '08/12/17';
select * from professor;

SELECT name, height FROM student WHERE height >= 180;
SELECT name, weight FROM student WHERE weight BETWEEN 60 and 80;
/* 몸무게 60~80 사이 -> 60이상, 80이하가 됨. -> 60, 80 포함*/
/* 반드시 BETWEEN 다음에 반드시 작은수가 나오고, 뒤에 큰수가 나와야 함 */
SELECT name, weight FROM student WHERE weight >=60 AND weight <= 80;

SELECT name, deptno1 FROM student WHERE deptno1 IN (101, 201);
/* deptno1이 101인 학생, 201인 학생 다 출력 */

SELECT name FROM student WHERE name LIKE '김%';

SELECT name FROM student WHERE name LIKE '김_호';
/* 언더바 하나 ( _ ) 가 한글자 취급 */


SELECT name, grade, height, weight FROM student
WHERE grade = 2
AND height > 180
AND weight > 70 ;

SELECT name, grade, height, weight FROM student
WHERE grade = 2
AND (height > 180 OR weight > 70);
/* AND가 OR보다 우선순위 우선. OR에 괄호( ) 필요 */

SELECT name, height FROM student WHERE grade = 1;
SELECT name, height FROM student WHERE grade = 1 ORDER BY height;

/* 오른차순은 ASC, 내림차순은 DESC */
SELECT name, height, weight FROM student WHERE grade = 1 
ORDER BY height ASC, weight DESC;

SELECT name, birthday, height, weight FROM student WHERE grade = 1;
SELECT name, birthday, height, weight FROM student WHERE grade = 1 ORDER BY 2;
/* SELECT 절에서2번째칼럼인birthday 칼럼으로정렬하라는의미 */



SELECT name FROM student WHERE deptno1 = 101
UNION SELECT name FROM student WHERE deptno2 = 201;

SELECT name FROM student WHERE deptno1 = 101
UNION ALL SELECT name FROM student WHERE deptno2 = 201;

SELECT name FROM student WHERE deptno1 = 101
INTERSECT SELECT name FROM student WHERE deptno2 = 201;

SELECT studno, name
FROM student
UNION
SELECT profno
FROM professor;
/* SELECT 절의 칼럼 개수가 다를 경우 발생하는 에러 */

SELECT studno, name
FROM student
UNION
SELECT name, profno
FROM professor;
/* SELECT 절의 칼럼의 데이터 타입이 다를 경우 발생하는 에러 */


/* DDL (Data Definition Language) */
/* 오브젝트를생성하고, 변경하고, 관리하는명령어 -> 세로줄 생성 */
/*
* DML(Data Manipulation Language) : 
INSERT(입력) , UPDATE(변경) , DELETE(삭제) , MERGE(병합)

* DDL(Data Definition Language) : 
CREATE (생성) , ALTER (수정) ,TRUNCATE (잘라내기) ,DROP (삭제)

* DCL(Data Control Language) :
GRANT (권한주기) , REVOKE (권한뺏기)

* TCL( Transaction Control Language):
COMMIT (확정) , ROLLBACK (취소)

* SELECT: 
어떤분류에서는DQL (Data Query Language 라고하기도합니다
*/

/* CREATE = 생성 */
CREATE TABLE DDL_TEST
( NO NUMBER(3),
  NAME VARCHAR2(20),
  BIRTH DATE DEFAULT SYSDATE);
  /*  Table DDL_TEST이(가) 생성되었습니다.  */
  
  /* 확인 */
DESC DDL_TEST;

/*  SELCT * DESC DDL_TEST;   ->  안에 입력된것이 아무것도 없음  */
SELECT * FROM DDL_TEST;
  
CREATE TABLE DEPT3
AS
SELECT * FROM DEPT2;  /* -> SELECT 에서 나오는 것을 CREATE TABLE에 그대로 집어넣겠다. */
/*  -> DEPT2를 복제한 것.  DEPT3로  */

/* DEPT2에서 일부 칼럼만 가져와서 TABLE을 만들겠다. */
CREATE TABLE DEPT4
AS
SELECT DCODE, DNAME FROM DEPT2;
SELECT * FROM DEPT4;

/* 칼럼의 데이터는 다 빼고, 골격만 가져오고 싶다 */
CREATE TABLE DEPT5
AS
SELECT * FROM DEPT2 WHERE 1=2; /* 거짓 */
SELECT * FROM DEPT5;

DESC VT001;

CREATE TABLE VT001
( NO1 NUMBER,
  NO2 NUMBER,
  NO3 NUMBER GENERATED ALWAYS AS (NO1 + NO2) VIRTUAL); /* VIRTUAL:가상칼럼, NO1, NO2 다른것 합친것)
  
/* 데이터 삽입 */
INSERT INTO VT001 VALUES (1,2,3); /* values : 집어넣을 값,  INTO VT001; 001에 넣겠다 / 1=칼럼1에, 2=칼럼2에...*/
/* 이거 실행하면 에러 -> INSERT 작업은 가상 열(VIRTURE)에서 허용되지 않습니다. */
INSERT INTO VT001 (NO1, NO2) VALUES (10, 20);  /* -> 1 행이 삽입되었습니다 */
SELECT * FROM VT001;  /* -> NO1={10}, NO2={20}, NO3={30}  -> NO3=NO1+NO2 ALWAYS ->  NO3 NUMBER GENERATED ALWAYS AS (NO1 + NO2) VIRTUAL); */
/* NO1 이나 NO2 값을 바꾸면 NO3도 바뀜 */

/* 특정 값을 바꾸기 = UPDATE */
UPDATE VT001 SET NO1=100;  /* SET : 새로운 값으로 설정하겠다. */   /* 1 행 이(가) 업데이트되었습니다. */
SELECT * FROM VT001;  /*  -> NO1={100}, NO2={20}, NO3={120} */


create table dept6 as select dcode ,dname from dept2 where dcode in (1000, 1001, 1002);
select * from dept6;  /* Table DEPT6이(가) 생성되었습니다.*/

alter table dept6
add (loc varchar2(10));  /* Table DEPT6이(가) 변경되었습니다. */
select * from dept6;
/* loc 칼럼이 null값으로 채워짐 */

alter table dept6
add ( loc2 varchar2(10) default '서울');  /* 새로운 위치가 추가되면 기본 위치는 서울 */
select * from dept6; /* loc2 서울로 채워짐 */


alter table dept6 rename column loc2 to area;
select * from dept6;  /* loc2 이름이  area로 바뀜 */

rename dept6 to dept7;  /* 테이블 이름이 변경되었습니다. */
select * from dept6; /* 이름이 바뀌어 테이블이 존재하지 않으므로 Error 발생 */ 
select * from dept7;


/* 칼럼의 데이터 크기를 변경 */
desc dept7;
/*
이름    널?       유형           
----- -------- ------------ 
DCODE          VARCHAR2(6)  
DNAME NOT NULL VARCHAR2(20) 
LOC            VARCHAR2(10) 
AREA           VARCHAR2(10) 
*/

alter table dept7
/* 딴걸로 수정한다 : modify */
modify (dcode varchar2(10));  /* 6자리였던걸 10자리로 변경 */
desc dept7;
/*
이름    널?       유형           
----- -------- ------------ 
DCODE          VARCHAR2(10) 
DNAME NOT NULL VARCHAR2(20) 
LOC            VARCHAR2(10) 
AREA           VARCHAR2(10) 
*/

/* 칼럼의 용도가 사라짐 -> 컬럼 삭제 */
alter table dept7 drop column loc;
select * from dept7;
desc dept7;
/*
이름    널?       유형           
----- -------- ------------ 
DCODE          VARCHAR2(10) 
DNAME NOT NULL VARCHAR2(20) 
AREA           VARCHAR2(10) 
*/



CREATE TABLE t_read
 ( no NUMBER,
   name VARCHAR2(10) ); 
/* Table created. */

INSERT INTO t_read
  VALUES (1,'AAA');
  /* 1 row created */
  
COMMIT;  /* 변경을 해도 실제로 적용 안되고 가상에 적용됨. */
/* -> 최종적으로 원본 데이터에다가 반영을 가하려면 커밋COMIT을 하야 됨 */
/* Commit complete. */

SELECT * FROM t_read;


ALTER TABLE t_read read only;  /* 이 테이블을 수정 불가능. 읽기 정용으로 변경합니다 */
/* Table altered */

/* 읽기 전용으로 변경된 테이블에 데이터를 입력 시도 */
INSERT INTO t_read
  VALUES (2,'BBB');
/* Error at live 1: */
/* SQL 오류: ORA-12081: "SCOTT"."T_READ" 테이블에 작업을 갱신하는 것이 허용되지 않습니다 */


/* 근데 테이블 삭제는 됨 */
/* 읽기 전용인 테이블 삭제 시도함 */
DROP TABLE t_read;
/* Table T_READ이(가) 삭제되었습니다. */


ALTER TABLE t_read read write;
/* 읽기 전용 테이블을 읽기, 쓰기 형태로 변환 */


/* DROP : 완전 삭제,  TRUNCATE: 구조는 유지한 채로 데이터만 날려버림 */
select * from dept7;  /* dcode:1000, dname:경영지원부, are:서울 */
TRUNCATE TABLE dept7; /* Table DEPT7이(가) 잘렸습니다. */
select * from dept7;  /* 컬럼만 남고 data 다 사라짐 /*
/* DCODE= , DNAME= , AREA=  */


/* DELETE는 데이터만 지워지고, 디스크 상의 공간은 그대로 유지 */
/* DELETE 후에 사이즈 비교하면 삭제 전, 후 똑같음. 데이터만 날린거. 용량은 같음 */
/* DELETE, TRUNCATE는 겉으로(눈으로) 보기엔 똑같음. 용량은 다름 */
/* DROP은 통채로 날려버리는거 */
/* DELETE, TRUNCATE, DROP 3개 차이*/


/* DELETE 문법    ->  조건 (WHERE)이 없으면 테이블 안의 내용 전부 다 삭제해버리니까.
DELETE FROM table       번드시 조건 WHERE을 달아줘야 함.
WHERE 조건 : */

DELETE FROM dept2
 WHERE dcode between 9000 and 9100;





