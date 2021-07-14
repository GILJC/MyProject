select * from tab;

select * from emp;

select empno, ename from emp;
/* �޸� ',' �� ����*/

/*���̺��� ���� Ȯ�� */
desc emp;
/* describe : �����ϴ�*/
desc professor;

select name,'������~����Ŀ�~'
from professor;


select * from student;

select studno "�й�", name as "�̸�", profno ����������ȣ from student;


/* distinct = �ߺ� ���� */
select deptno1 from student;
select DISTINCT deptno1 from student;

SELECT deptno ,job FROM emp;
SELECT DISTINCT deptno FROM emp;
SELECT DISTINCT deptno ,job FROM emp;

SELECT DISTINCT deptno ,job FROM emp;


/* ����(�ռ�) ������(Concatenation)��Į�����ٿ�������ϱ� */
SELECT name, position FROM professor;
SELECT name || position FROM professor;
/* ��� ĭ ������ �κ��� ������� �پ ���� */
/* ex) 3 �۵��� ���Ӱ��� -> 3 �۵������Ӱ���  */

SELECT name || '�� Ű��' || height || 'cm, �����Դ�' || weight || 'kg �Դϴ�' from student;
/* 3. �̹̰��� Ű��168cm, �����Դ�52kg �Դϴ� */

SELECT sal , sal+100/2 , (sal+100)/2 FROM emp;
/* ����(+,*,-,/), ��ȣ '( )' ��� ���� */

SELECT ename, sal, deptno FROM emp WHERE deptno = 10;
SELECT ename, sal FROM emp WHERE sal > 4000;

SELECT NAME, PAY, HIREDATE FROM  PROFESSOR WHERE HIREDATE >= '08/12/17';
select * from professor;

SELECT name, height FROM student WHERE height >= 180;
SELECT name, weight FROM student WHERE weight BETWEEN 60 and 80;
/* ������ 60~80 ���� -> 60�̻�, 80���ϰ� ��. -> 60, 80 ����*/
/* �ݵ�� BETWEEN ������ �ݵ�� �������� ������, �ڿ� ū���� ���;� �� */
SELECT name, weight FROM student WHERE weight >=60 AND weight <= 80;

SELECT name, deptno1 FROM student WHERE deptno1 IN (101, 201);
/* deptno1�� 101�� �л�, 201�� �л� �� ��� */

SELECT name FROM student WHERE name LIKE '��%';

SELECT name FROM student WHERE name LIKE '��_ȣ';
/* ����� �ϳ� ( _ ) �� �ѱ��� ��� */


SELECT name, grade, height, weight FROM student
WHERE grade = 2
AND height > 180
AND weight > 70 ;

SELECT name, grade, height, weight FROM student
WHERE grade = 2
AND (height > 180 OR weight > 70);
/* AND�� OR���� �켱���� �켱. OR�� ��ȣ( ) �ʿ� */

SELECT name, height FROM student WHERE grade = 1;
SELECT name, height FROM student WHERE grade = 1 ORDER BY height;

/* ���������� ASC, ���������� DESC */
SELECT name, height, weight FROM student WHERE grade = 1 
ORDER BY height ASC, weight DESC;

SELECT name, birthday, height, weight FROM student WHERE grade = 1;
SELECT name, birthday, height, weight FROM student WHERE grade = 1 ORDER BY 2;
/* SELECT ������2��°Į����birthday Į�����������϶���ǹ� */



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
/* SELECT ���� Į�� ������ �ٸ� ��� �߻��ϴ� ���� */

SELECT studno, name
FROM student
UNION
SELECT name, profno
FROM professor;
/* SELECT ���� Į���� ������ Ÿ���� �ٸ� ��� �߻��ϴ� ���� */


/* DDL (Data Definition Language) */
/* ������Ʈ�������ϰ�, �����ϰ�, �����ϴ¸�ɾ� -> ������ ���� */
/*
* DML(Data Manipulation Language) : 
INSERT(�Է�) , UPDATE(����) , DELETE(����) , MERGE(����)

* DDL(Data Definition Language) : 
CREATE (����) , ALTER (����) ,TRUNCATE (�߶󳻱�) ,DROP (����)

* DCL(Data Control Language) :
GRANT (�����ֱ�) , REVOKE (���ѻ���)

* TCL( Transaction Control Language):
COMMIT (Ȯ��) , ROLLBACK (���)

* SELECT: 
��з�������DQL (Data Query Language ����ϱ⵵�մϴ�
*/

/* CREATE = ���� */
CREATE TABLE DDL_TEST
( NO NUMBER(3),
  NAME VARCHAR2(20),
  BIRTH DATE DEFAULT SYSDATE);
  /*  Table DDL_TEST��(��) �����Ǿ����ϴ�.  */
  
  /* Ȯ�� */
DESC DDL_TEST;

/*  SELCT * DESC DDL_TEST;   ->  �ȿ� �ԷµȰ��� �ƹ��͵� ����  */
SELECT * FROM DDL_TEST;
  
CREATE TABLE DEPT3
AS
SELECT * FROM DEPT2;  /* -> SELECT ���� ������ ���� CREATE TABLE�� �״�� ����ְڴ�. */
/*  -> DEPT2�� ������ ��.  DEPT3��  */

/* DEPT2���� �Ϻ� Į���� �����ͼ� TABLE�� ����ڴ�. */
CREATE TABLE DEPT4
AS
SELECT DCODE, DNAME FROM DEPT2;
SELECT * FROM DEPT4;

/* Į���� �����ʹ� �� ����, ��ݸ� �������� �ʹ� */
CREATE TABLE DEPT5
AS
SELECT * FROM DEPT2 WHERE 1=2; /* ���� */
SELECT * FROM DEPT5;

DESC VT001;

CREATE TABLE VT001
( NO1 NUMBER,
  NO2 NUMBER,
  NO3 NUMBER GENERATED ALWAYS AS (NO1 + NO2) VIRTUAL); /* VIRTUAL:����Į��, NO1, NO2 �ٸ��� ��ģ��)
  
/* ������ ���� */
INSERT INTO VT001 VALUES (1,2,3); /* values : ������� ��,  INTO VT001; 001�� �ְڴ� / 1=Į��1��, 2=Į��2��...*/
/* �̰� �����ϸ� ���� -> INSERT �۾��� ���� ��(VIRTURE)���� ������ �ʽ��ϴ�. */
INSERT INTO VT001 (NO1, NO2) VALUES (10, 20);  /* -> 1 ���� ���ԵǾ����ϴ� */
SELECT * FROM VT001;  /* -> NO1={10}, NO2={20}, NO3={30}  -> NO3=NO1+NO2 ALWAYS ->  NO3 NUMBER GENERATED ALWAYS AS (NO1 + NO2) VIRTUAL); */
/* NO1 �̳� NO2 ���� �ٲٸ� NO3�� �ٲ� */

/* Ư�� ���� �ٲٱ� = UPDATE */
UPDATE VT001 SET NO1=100;  /* SET : ���ο� ������ �����ϰڴ�. */   /* 1 �� ��(��) ������Ʈ�Ǿ����ϴ�. */
SELECT * FROM VT001;  /*  -> NO1={100}, NO2={20}, NO3={120} */


create table dept6 as select dcode ,dname from dept2 where dcode in (1000, 1001, 1002);
select * from dept6;  /* Table DEPT6��(��) �����Ǿ����ϴ�.*/

alter table dept6
add (loc varchar2(10));  /* Table DEPT6��(��) ����Ǿ����ϴ�. */
select * from dept6;
/* loc Į���� null������ ä���� */

alter table dept6
add ( loc2 varchar2(10) default '����');  /* ���ο� ��ġ�� �߰��Ǹ� �⺻ ��ġ�� ���� */
select * from dept6; /* loc2 ����� ä���� */


alter table dept6 rename column loc2 to area;
select * from dept6;  /* loc2 �̸���  area�� �ٲ� */

rename dept6 to dept7;  /* ���̺� �̸��� ����Ǿ����ϴ�. */
select * from dept6; /* �̸��� �ٲ�� ���̺��� �������� �����Ƿ� Error �߻� */ 
select * from dept7;


/* Į���� ������ ũ�⸦ ���� */
desc dept7;
/*
�̸�    ��?       ����           
----- -------- ------------ 
DCODE          VARCHAR2(6)  
DNAME NOT NULL VARCHAR2(20) 
LOC            VARCHAR2(10) 
AREA           VARCHAR2(10) 
*/

alter table dept7
/* ���ɷ� �����Ѵ� : modify */
modify (dcode varchar2(10));  /* 6�ڸ������� 10�ڸ��� ���� */
desc dept7;
/*
�̸�    ��?       ����           
----- -------- ------------ 
DCODE          VARCHAR2(10) 
DNAME NOT NULL VARCHAR2(20) 
LOC            VARCHAR2(10) 
AREA           VARCHAR2(10) 
*/

/* Į���� �뵵�� ����� -> �÷� ���� */
alter table dept7 drop column loc;
select * from dept7;
desc dept7;
/*
�̸�    ��?       ����           
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
  
COMMIT;  /* ������ �ص� ������ ���� �ȵǰ� ���� �����. */
/* -> ���������� ���� �����Ϳ��ٰ� �ݿ��� ���Ϸ��� Ŀ��COMIT�� �Ͼ� �� */
/* Commit complete. */

SELECT * FROM t_read;


ALTER TABLE t_read read only;  /* �� ���̺��� ���� �Ұ���. �б� �������� �����մϴ� */
/* Table altered */

/* �б� �������� ����� ���̺� �����͸� �Է� �õ� */
INSERT INTO t_read
  VALUES (2,'BBB');
/* Error at live 1: */
/* SQL ����: ORA-12081: "SCOTT"."T_READ" ���̺� �۾��� �����ϴ� ���� ������ �ʽ��ϴ� */


/* �ٵ� ���̺� ������ �� */
/* �б� ������ ���̺� ���� �õ��� */
DROP TABLE t_read;
/* Table T_READ��(��) �����Ǿ����ϴ�. */


ALTER TABLE t_read read write;
/* �б� ���� ���̺��� �б�, ���� ���·� ��ȯ */


/* DROP : ���� ����,  TRUNCATE: ������ ������ ä�� �����͸� �������� */
select * from dept7;  /* dcode:1000, dname:�濵������, are:���� */
TRUNCATE TABLE dept7; /* Table DEPT7��(��) �߷Ƚ��ϴ�. */
select * from dept7;  /* �÷��� ���� data �� ����� /*
/* DCODE= , DNAME= , AREA=  */


/* DELETE�� �����͸� ��������, ��ũ ���� ������ �״�� ���� */
/* DELETE �Ŀ� ������ ���ϸ� ���� ��, �� �Ȱ���. �����͸� ������. �뷮�� ���� */
/* DELETE, TRUNCATE�� ������(������) ���⿣ �Ȱ���. �뷮�� �ٸ� */
/* DROP�� ��ä�� ���������°� */
/* DELETE, TRUNCATE, DROP 3�� ����*/


/* DELETE ����    ->  ���� (WHERE)�� ������ ���̺� ���� ���� ���� �� �����ع����ϱ�.
DELETE FROM table       ����� ���� WHERE�� �޾���� ��.
WHERE ���� : */

DELETE FROM dept2
 WHERE dcode between 9000 and 9100;





