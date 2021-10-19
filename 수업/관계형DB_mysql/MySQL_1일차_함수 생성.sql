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



#------------------------------------
# (2번)

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

