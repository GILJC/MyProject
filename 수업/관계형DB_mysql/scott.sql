select * from tab;

select * from emp;
desc emp;
desc tab;
desc userlist2;

desc emp;

select * from student;

select * from tab;

select * from USERLIST;

drop table tabella;

desc MEMO_TABLE;

desc table MEMO_TABLE;

drop table MEMO_TABLE;

select * from MEMO_TABLE;



CREATE TABLE TBL_HUMAN
(    
     ID		INT,
     NAME 	VARCHAR(10),
     AGE	INT
);

INSERT INTO TBL_HUMAN( ID, NAME, AGE ) 
       VALUES ( '1', 'JACK', '35' );

INSERT INTO TBL_HUMAN( ID, NAME, AGE )
       VALUES ( '2', 'SUJAN', '34' );

SELECT * FROM TBL_HUMAN;

SELECT * FROM TBL_HUMAN

         WHERE ID = '1';

create table userlist (nameName varchar(25), usergender varchar(25), usernumber int);
desc userlist;
insert into userlist(name, gender, usernumber)
    values ( 'name', 'gender', '124');

select * from userlist; 

select name, gender, usernumber from userlist;

drop table userlist;

create table test1;
