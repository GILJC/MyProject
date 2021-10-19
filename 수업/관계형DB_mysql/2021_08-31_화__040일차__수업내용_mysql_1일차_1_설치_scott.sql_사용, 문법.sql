desc scott_emp;
#----------------------------------------------select 문
select * from scott_emp;   # 전체 데이터
select empno, ename, sal
from scott_emp;   # 지금 프로젝션을 한 것

select job from scott_emp;
# job이 어떤 종류만 있는지 알고 싶다. -> distinct -> 중복 제거
select distinct job from scott_emp;

select ename, job, sal
from scott_emp
where sal >= 1200;   # 월급이 1200달러 이상인 사람만 뽑겠다.

select ename, sal from scott_emp;  # 월급과 이름만 나옴
# select절에 연산을 넣을 수 있음
select ename, sal*12 from scott_emp;  # 이러면 연봉이 됨
# 이걸 보고서 형태로 제출할땐, 이대로면 성의없어보임.
select ename as 이름, sal*12 as 연봉 from scott_emp;  # 이렇게 별칭이 가능
# 근데 솔직히 별칭은 as를 뺴도 먹음
select ename 이름, sal*12 연봉 from scott_emp;
# 빼도 되는데 그냥 항상 붙임 -> sql문이 복잡해지면, as 안쓰면 콤마로만 구분해야됨, 눈알 빠짐

#------------------------------------------------------------------null값 0으로 바꾸기
select ename, comm from scott_emp;
# 보고서엔 보기 안좋음 ->  null값을 뺴는 기능이 있음.
select ename, ifnull(comm, 0) from scott_emp;  # MySQL은 ifnull임
#  ->  comm이 null값이면 0으로 바꿔줌


select ename, empno from scott_emp;
# select절에 리터럴 쓸 수 있음
select 'Name is', ename, 'No is', empno from scott_emp;
#----------------------------------------------------------------cocat으로 2개 항목 1개로 합치기
select concat('Name is ', ename) as name,
  concat('No is ', empno) as No from scott_emp;
# -> Name is 랑 ename 이랑 붙이고(name으로 명명) , No is 랑 empno 랑 붙이는 것(No 로 as써서 이름 바꿈 -> 2개 항목이 1개 항목으로 붙음)  -> (concat 사용)


select ename, job, hiredate
from scott_emp
where job != 'CLERK';   # 담당 업무가 CLERK이 아닌 사람

select ename, job
from scott_emp
where job in ('CLERK', 'SALESMAN');

select ename, job, hiredate
from scott_emp
where hiredate between '1981-01-01' and '1981-06-30';  # 입사일이(형식이 대시( - - )
# between A and B -> 요 사이의 값

# 컬럼문 등 대소문자 쓰는거 상관 없지만  -> 다른 DBMS는 안됨
select ename, job, hiredate
from SCOTT_EMP
where job in ('clerk', 'salesman');  # ('clerk', 'salesman') -> 요놈 오라클은 대소문자 구분해야함
# MySQL은 대소문자 바꿔도 사용 가능하지만, 오라클 같은 경우는 구분해줘야 하므로 여기서도 구분해주는게 정신건강에 좋음

# 데이터를 뽑을때 이름이 S로 시작하는 놈
select *
from scott_emp
where ename like 'S%';
# s로 시작하고, 뒤에는 뭐가 나와도 상관이 없다 -> 퍼센트 %
#--------------------------------------------------------이게 like

select *
from scott_emp
where ename like 'S%T';
# 끝에는 T가 나와야 한다

select *
from scott_emp
where comm is not null;   #  is null / is not null  -> null이냐 null이 아니냐.
# null 에 대해선 연산을 쓸 수 없음 -> != null  /   ==  null  ->  같은거 안됨


# 전체 표준이 있고, 각 DBMS마다 표준을 벗어나는 내용이 조금씩 있음.
# 표준만 잘 쓰면 다른것 쓰는데에도 크게 지장이 없음.

# 조건.
select ename, job, sal
from scott_emp
where sal >= 2000 and hiredate < '1981-06-01';   # and and or 같은 식으로 쓸 수 있음

# or 사용
select ename, job, sal
from scott_emp
where job = 'MANAGER' or comm is not null;    #  job 이 'MANAGER'이거나 comm 이 null이 아닌 경우

# 조건을 not 을 주는 경우
select ename, job, sal
from scott_emp
where not (sal >= 2000);
# 월급이 2000불 이상인 사람 <-  의 부정  => not을 쓰고 감싸버리면 됨 ()

#----------------------------------------------------- # like 관련에서 하나 더 할게 있음
select *
from scott_emp
where ename like '_A%';
# 두번째 글자가 가 오고 그다음 은 아무거나 와도 된다
# 언더바_  는 1글자, 퍼센트(%)는 여러 글자ㅣ

select * from scott_emp where job like 'MANAGE_';  # 언더바는 1글자
# MANAGE다음 1글자 오는 것


select empno, ename, job
from scott_emp;  # table에 들어간 순서대로 나옴
# -> 순서 정렬 가능 -> order by

select empno, ename, job
from scott_emp
order by ename;  # 작은거에서 큰놈으로

select empno, ename, job
from scott_emp
order by ename desc;  # 이러면 디센딩

# order by 주의점!  ->  order by 는 항상 맨 마지막에 옴
# 정리가 끝난놈을 정렬하는 것이기 떄문에.

select empno, ename as name, job
from scott_emp
order by name;  # order by 는 알리아스도 사용이 가능하다 -> ?  -> as name 말하는듯

# 컬럼이 3개일때, 컬럼 순서 정하기 가능 ->2번째 컬럼으로 order by 함
select empno, ename as name, job
from scott_Emp
order by 2;

# 자 그다음 함수
# 파이썬에서 기본적으로 제공해주는 함수 ex: len, type 등
# 얘도 내장 함수가 있음.  내장 함수는 제품별로 조금씩 다름  (ex: MySQL은 : ifnull)
select initcap(ename), job from scott_emp;  # -> 이건 MySQL게 아니내;
# 필요한건 MySQL 홈페이지에서 찾아서 쓰세요.  ->  이부분은 통과할게.


#-------------------------------------------------------# case 문
#4번째 column은 기니까 줄 바꿔서 씀
select ename, job, sal,
	case job when 'CLERK' then 1.10 * sal
			when 'MANAGER' then 1.15 * sal
            when 'PRESIDENT' then 1.20 * sal
            else sal
	end as revised_salary
from scott_emp;    
# CLERK는 월급의 1.1배, 메니저는 월급의 1.15 곱해주고, 대통령하면 1.2배, 이도저도 아니면 그냥 sal
# 하고 end로 끝나주는게 case문.
# 어디에서? -> scott_emp 에서

# 이 case 구문은, 
# clumn 하나에 대등하는거야 -> case job 시작 ~ end as revised_salary 까지가 4번 하나(5줄)
# 1번: ename, 2번: job, 3번: sal



# 우리의 테이블을 보면.  scott_emp는 이렇게 생김  / scott_dept는 저렇게 생김
select * from scott_emp;
select * from scott_dept;
# 스미스랑 사람은 부서코드가 20이야
# 부서 정보를 갖고있는 테이블이 dept야.
# 20 대신에 리서치?등 같이 넣어도 되잖아 -> 근데 왜 짤랐을까. 테이블을
# 1) 데이터 중복을 최소화 하기 위해 -> 리서치등을 넣는 대신 부서20만 넣으면 중복 최소화 가능
# 2) 이건 데이터가 몇번 안되는데, 데이터가 수만개면?
# 조직개편이 일어나서 이름이 바뀌면
# 근데 테이블을 쪼개놓으면 DNAME의 RESEARCH 요거만 바꾸면 됨 -> 우지관리가 쉬움  -> 정규화 -> 라고 함
# 10~40 4개의 부서가 있음. -> DEPTNO는 10~40 4개만 올 수 있음. -> 50,60은 안됨.

# -> DEPTNO에 들어가는 유니크한 값이어야 한다. -> FK라고 한다 = 포레인 키. 외래키. (FK의 조건)

# 집어 넣을때, 부서 코드를 10, 20, 30, 40만 올 수 있게 재약사항을 넣을 수 있는가. -> YES (다른값이 오면 오류 나오게 해줌)
# 그럼 그 제약사항은 어떻게 넣는가.

# 나눠준 scott 스크립트를 보면
# ALTER TABLE `SCOTT_EMP`
#  ADD CONSTRAINT `PK_EMP` FOREIGN KEY (`DEPTNO`) REFERENCES `SCOTT_DEPT` (`DEPTNO`) 
# 요부분은 나중에.  지금은 안봄 ON DELETE SET NULL ON UPDATE CASCADE; 
# 'PK_EMP' 는 유저가 잡아주는 것. Foreign 키는 scott_dept의 'DEPTNO'로 잡아줄 것

# 어차피 이 작업은 다 DB 관리자가 함. 근데 읽을 줄은 알아야 함.


#----------------------------------------------------------- join
# 직원의 이름과 직원이 속한 부서명을 함께 보고 싶으면?  ->  그게 join

# 두 테이블에서 그냥 결과를 선택하면?
select ename, dname
from emp, dept;
# 결과: 두 테이블의 행돌의 가능한 모든 쌍이 추출됨
# 일반적으로 사용자가 원하는 결과가 아님

select ename, dname
from scott_emp join scott_dept;

select ename, dname
from scott_emp cross join scott_dept;   # cross join -> 얘를 하면 50 몇개가 똑같이 나옴

# 5. cross join
# : 테이블간 join 조건이 없는 경우 생길 수 있는 모든 데이터의 조합을 말한다.
# : 두개의 테이블의 결과는 양쪽 집합의 M*N건의 데이터 조합이 발생한다......

# 1. inner join
# : default join
# : join 조건에서 동일한 값이 있는 행만 반환
# : cross join, outer join과 같이 사용 할 수 없다.

# 2. natural join 
# : inner join의 하위 개념
# : 두 테이블간의 join 조건에서 동일한 이름을 갖는 모든 칼럼들에 대해 equi join을 수행함
# : join이 되는 테이블의 데이터 도메인과 칼럼명 칼럼값이 동일해야 하는 제약조건이 있다. --> 따라서 on ~절이 없다!!!
# : 칼럼 값이 같지 않으면 결과 출력이 안됨
# : natrual inner join 이라고도 표시할 수 있음

select *
from scott_emp join scott_dept
on scott_emp.deptno = scott_dept.deptno;

# 참고로 옛날 문법은
select *
from scott_emp, scott_dept
where scott_emp.deptno = scott_dept.deptno;
# 옛날거보단 요즘거를 사용할 것을 추천함.

# 원하는 부분만 selection
select ename, dname
from scott_emp join scott_dept
on scott_emp.deptno = scott_dept.deptno;

# depno 추가하면 에러 발생
select ename, dname, depno
from scott_emp join scott_dept
on scott_emp.deptno = scott_dept.deptno;  # 둘중에 어느놈인지 묻는것
# 겹치는 이름이 없으면 알아서 해주는데, 겹치는 이름이 있으면 어느놈인지 물어봄.

# 명확하게 해줘야 함
select ename, dname, scott_emp.depno
from scott_emp join scott_dept
on scott_emp.deptno = scott_dept.deptno;  # 시발 에러
# 수정?
select E.ename, D.dname, E.deptno 
from scott_emp E join scott_dept D 
on E.deptno = D.deptno;

select *
from scott_emp, scott_dept
where scott_emp.deptno = scott_dept.deptno;


select E.ename, D.dname, E.deptno
from scott_emp E join scott_dept D
on E.deptno = D.deptno;

select * from scott_salgrade;  # lowSAL, HighSAL -> 700~1200받는 사람은 1등급

# emp 테이블의 ename, emp테이블의 월급, side~~ grade의 ~~
select E.ename, E.sal, S.grade
from scott_emp E join scott_salgrade S
on E.sal between S.losal and S.hisal
where S.grade > 1
order by S.grade desc, E.ename;
# desc -> 높은거부터 (order by 에 사용)
# join 조건은 on에다가 쓰는 것.

# where 절 대신 and로
select E.ename, E.sal, S.grade
from scott_emp E join scott_salgrade S
on E.sal between S.losal and S.hisal
and S.grade > 1
order by S.grade desc, E.ename;


select E.ename as name, E.sal as salary, S.grade as grade
from scott_emp E inner join scott_salgrade S
on E.sal between S.losal and S.hisal
where S.grade > 1
order by grade desc, name;
# order by 를 알리아스 줘버림


#----------------------------------# inner join의 뜻 -> 조건에 맞는놈만 골라낸다.
# 그래서 그냥 쓰면 default로 inner join이 되는 것


select distinct deptno from scott_emp;   # 10, 20, 30 3개 들어있음
select * from scott_dept;  # 그런게 여기서 보면 40번도 있음 -> 신생부서인 모양. -> join하면 40번이 안나올 것.
# -> 40번도 join으로 뽑고 싶으면 아래처럼

select E.empno, E.ename, D.deptno, D.dname
from scott_emp E join scott_dept D
on E.deptno = D.deptno;  # join 기준으로 왼쪽, 오른쪽 테이블이 있는데, 어느쪽이 더 나와야 하는가.
# 신생부서(40포함) 이 더 나와야 하므로 -> join기준으로 오른쪽이 더 나와야 함
# 순서 : 1) from 먼저 E, D(as E, as D) 로 만듬 -> 2)on 조건 작성 -> 3) select문에 E,D포함 작성
select E.empno, E.ename, D.deptno, D.dname
from scott_emp E right outer join scott_dept D
on E.deptno = D.deptno;
#----------------------------------------------------------  outer join
# outer join은 outer 생략 가능 -> right outer join이란 말이 없기 떄문에->?
# 아무튼 outer 생략 가능 -> right outer join -> right join
select E.empno, E.ename, D.deptno, D.dname
from scott_emp E right join scott_dept D
on E.deptno = D.deptno;

# -> 양쪽 다 필요할땐? full join 사용 가능
select E.empno, E.ename, D.deptno, D.dname
from scott_emp E full outer join scott_dept D
on E.deptno = D.deptno;

# Full outer join
# Full-Outer-Join은 A와 B의 합집합을 얻습니다. 
# 만약 어떤 행의 A에는 데이터가 있고 B에는 비어있는 경우 B 부분은 null이며, 
# 반대의 경우에는 A 부분이 null입니다.
# ex: select * from a FULL OUTER JOIN b on a.a = b.b;

# MySQL에선 full outer join을 지원 안하나?  -> 그냥 넘어가죠 이건.


select * from scott_emp;
# 7566=JONES의 직속상관=메니저 = 7839
# 이런식으로 자기 테이블 안해서 관계 넣을 수 있음.
# 이럴때 사원, 메니저 뽑을 때
select E.empno, E.ename, M.ename
from scott_emp E join scott_emp M
on E.mgr = M.empno;  # E의 empno, E의 ename, M의 ename
# 이게 셀프절 (self ?)

# -> E, M -> as E, as M  을 뜻함
# E랑 M이 같은거지만 , join하고 on 해서 비교해야 하니까
# 이름만 다르게 해서 사용

select count(*) from scott_emp;
select count(empno) from scott_emp;
select count(comm) from scott_emp;
select sum(sal) from scott_emp;
select min(sal) from scott_emp;
select avg(sal) from scott_emp;   # 이러면 평균값 냄

# 부서별로 부서코드를 기준으로 평균(avg(sal))를 뽑고싶을때
select deptno, avg(sal)
from scott_emp;
# 오라클 같은 경우는 이럴떄 에러남 -> 여기선 에러는 아니지만, 우리가 원하는 값은 아님.
select deptno, avg(sal)
from scott_emp
group by deptno;

# 여기에 dname을 추가하려고 함 -> join 해야함
select E.deptno, D.dname, avg(E.sal)
from scott_emp E join scott_dept D
on E.deptno = D.deptno
group by E.deptno;
# MySQL같은 경우는 이래도 되는데, 다른것들 같은 경우는, D.dname을 꼭 아래에 넣어줘야 함
select E.deptno, D.dname, avg(E.sal)
from scott_emp E join scott_dept D
on E.deptno = D.deptno
group by E.deptno, D.dname;
# MySQL은 group by만 잘 적으면 에러가 안나지만, 
# 다른건 select에 있는걸 싸그리 group by에 넣어주지 않으면 에러남.

#------------------------------------------------ group by 의 조건 = having
# sales는 뺴고 account랑 research만 뽑아내고 싶음
# where절은 반드시 from 다음에 오게 되어있음.
# group by 가 아래서 완성됐는데 위에서 where로 걸를 수 없음
# 그렇다고 where를 아래에서 쓰면 에러남
# group by 한 다음에 또 걸러낼때에는 having을 사용함
select E.deptno, D.dname, avg(E.sal) as avg_sal
from scott_emp E join scott_dept D
on E.deptno = D.deptno
group by E.deptno, D.dname
having avg_sal > 2000;


# CLARK의 월급이 2450$.  이사람보다 월급을 많이 받는 사람의 이름을 출력하고 싶음
select ename
from scott_emp
where sal > 'CLARK의 sal';
# ename = 이름, scott_emp 에서 , CLARK의 sal보다 큰 사람

# 밑에꺼 그대로 싹 copy 해서 위에 붙여넣기

# CLARK의 sal 뽑기
select sal
from scott_emp
where ename = 'CLARK';

# 그리고 tab으로 줄 예쁘게 맞춰주면 끝
select ename
from scott_emp
where sal > (select sal
			from scott_emp
			where ename = 'CLARK');

-- 회사 전체의 평균 급여보다 많이 받는 직원의 이름, 급여, 부서코드
select ename, sal, deptno
from scott_emp
where sal > (select avg(sal)
			from scott_emp);

-- 각 부서의 평균 급여보다 더 받는 직원의 이름, 급여, 부서코드
select ename, sal, deptno
from scott_emp E1
where sal > (select avg(sal)
			from scott_emp E2
			where E2.deptno = E1.deptno);

select E1.ename, E1.sal, E1.deptno
from scott_emp E1 join (select deptno, avg(sal) as avg_sal
			from scott_emp
			#where E2.deptno = E1.deptno);
            group by deptno) E2
on E1.deptno = E2.deptno
where E1.sal > E2.avg_sal;
# 이러면 똑같이 6줄이 나옴

-- 각 부서별 가장 급여를 많이 받는 직원정보를 출력
# 3가지 쿼리를 보여줄태니, 이해만 하시길
select deptno, empno, ename, sal
from scott_emp
where (deptno, sal) in (select deptno, max(sal)
						from scott_emp
						group by deptno);  # 20번 부서는 2명 있어서 2개 나옴
# 이렇게 짤 수 있고 - 1번째 방법

#2번째
select E.deptno, E.empno, E.ename, E.sal
from scott_emp E join
(select E2.deptno, max(E2.sal) as max_sal
from scott_emp E2
group by deptno) M
on E.deptno = M.deptno and E.sal = M.max_sal;
# 이게 2번째 방법

# 그리고 3번째 방법은
select deptno, empno, ename, sal
from scott_emp E
where E.sal = (select max(sal)
				from scott_emp
                where deptno = E.deptno);
# 각각을 비교해보기

#--------------------------------------------- 값 추가 => insrt into
# 새로운 값 추가하기
desc scott_emp;

insert into scott_emp
values(8888, 'PARK', 'CLERK', 7902, '2021-08-31', 3000, null, 20);
	# empno, 이름, 직업, 메니저 번호, 날짜, 연봉, comm, deptno
    #이 상태에서 한번 더 실행(총 2번)
# -> 2번 실행하면 에러 -> 8888 -> PRIMARY key 값으로 되어있으므로 중복되어서 추가 안됨

select * from scott_emp;  # 맨 아랫줄에 위에서 추가한 값이 보임

insert into scott_emp
values(9999, 'HONG', 'CLERK', 7902, '2021-08-31', 3000, null, 80);
# 마지막 값을 80을 넣으면 제약조건에 걸려서 값이 추가가 안됨
# 이렇게 제약조건을 걸어주면 아무값이나 막 들어가는걸 방지할 수 있음.

#--------------------------------------------------------  update
# 값을 잘못 넣었을 경우 수정하기.
update scott_emp
set sal = 2800
where empno = 8888;  # -> empno가 8888번인 사람의 sal 값이 2800이 됨
# 여기서 where 절을 안넣으면 싸그리 다 바뀌어버림

#------------------------------------------------ delete = 삭제
delete from scott_emp
where empno = 8888;

select * from scott_emp;  # 8888번인 사람이 삭제된것을 볼 수 있음.


# 유저가 함수를 직접 만들 수 있음.
# MySQL에서 함수를 만드려면 이것 먼저 확인해 봐야 함.
show databases;
show tables;  # 현재 선택된 DB상에서의 테이블들

# 여기서 이걸 봐야함
# 시스템 변수중에서 어쩌구~ -> %log_bin_trust_function_creators% 
# -> 얘가 OFF로 되어있으면 함수를 만들 수 없음 -> ON으로 바꿔줘야 함
show variables like '%log_bin_trust_function_creators%';

set global log_bin_trust_function_creators = 1;  # 이러면 내가 root가 아니라서 못바꿈
# root에서 바꿔줘야함
# 바꿔주고 돌아옴

show variables like '%log_bin_trust_function_creators%';
# 이러면 ON 된걸 확인 가능 -> 이제 함수 만들 수 있음.

show delimiter; # 이러면 안됨
show variables like '%delimiter%';  # 이래도 안나오내.

use scottdb;

# 델리미터를 바꿉시다
delimiter $$   # 델리미터 일단 아무거로나 바꿔줌
drop function if exists FN_GET_SALARY$$  # 함수명을 이렇게 만듬. -> 만약에 있으면 drop시켜라(다시 만들게)

# 함수가 이미 있는경우 계속 이렇게 지우고 만들고 해야함. -> 수정 불가
			
-- 함수 생성						# 여기서 타입 정해줘야 함
create function FN_GET_SALARY(IN_EMPNO int) returns int
begin
   declare OUT_SAL int;
    set OUT_SAL = 0;
    select sal
    into OUT_SAL
    from scott_emp
    where empno = IN_EMPNO;
    return OUT_SAL;
end$$
delimiter ;
    # 한 문장 끝날때마다 세미콜론 붙여줌
# return 다음에 끝났으니 end 쓰고 바꿔줬던 델리미터=$$ 붙여줌
# 다 끝났으면 델리미터 다시 바꿔줌 delimiter ;  <- 이걸로

# 위 전체가 1문장임 전체 한번에 실행시켜주면 됨
# 이러면 FN_GET_SALARY 라는 함수를 만들어 준 것

-- 함수 사용
select FN_GET_SALARY(7499);

show function status where db = 'scottdb';  # 함수 있는지, 언제 만들어졌는지 등 확인 가능


delimiter $$
drop procedure if exists SP_GET_SALARY $$

create procedure SP_GET_SALARY
(
	in in_empno int,
	out out_sal int
)
begin
	select sal
    into out_sal
    from scott_emp
    where empno = in_empno;
end $$
delimiter ;
# create procedure SP_GET_SALARY(in in_empno int.out out_sal int)b...

# 사용법 -> call '함수 이름' '(인자 2개)'
call SP_GET_SALARY(7369, @sal);
select @sal;
# @ <- 골뱅이로 값 가져올 수 있음  -> out이라서 @ 붙인건가?


# 함수 만들면 보안이 좋음 -> 자바 연결할때 협력업체에게 소스코드 다 안보여줘도 됨.

