-- 1. 고객별 지불 금액의 총합을 구하라

-- 고객 Id, 금액

# 정답
use sakila;

select count(*) from sakila;  # 이런건 안됨, sakila는 조회 가능한 이름이 아님. 그안의 테이블(ex:film같은거)을 봐야함
#----------  #  amount가 지불 금액
select customer_id, sum(amount)
from payment
group by customer_id;


-- 2. 위 쿼리에서 고객ID 대신 고객의 first_name, last_name을 출력하라

select C.first_name, C.last_name, sum(P.amount)
from customer as C
join payment as P
on C.customer_id = P.payment_id;  # 내꺼 틀림 시발
# group by C.first_name, C.last_name;   # 틀린 부분

# 정답
select CS.first_name, CS.last_name, sum(amount)
from payment PM join customer CS
on PM.customer_id = CS.customer_id
group by CS.first_name, CS.last_name;


-- 3. 고객ID별 총 대여 수를 출력(대여 수 많은 고객부터)
-- 고객 ID, 총 대여수

select customer_id, count(rental_id)
from payment
group by customer_id
order by count(rental_id) desc;
# 오름차순 정렬
# SELECT * FROM 테이블 ORDER BY 컬럼1 ASC;
# 오름차순 정렬 (ASC 생략)
# SELECT * FROM 테이블 ORDER BY 컬럼1;
# 내림차순 정렬
# SELECT * FROM 테이블 ORDER BY 컬럼1 DESC;

# 정답
select customer_id, count(rental_id)
# select customer_id, count(*)  -> 요부분 별(*)로 해도 결과는 똑같다.
from rental
group by customer_id
order by count(rental_id) desc;


-- 4. 위 쿼리에서 고객 ID 대신 고객의 first_name, last_name을 출력하라
select CS.first_name, CS.last_name, count(RT.rental_id)
from customer as CS
join rental as RT
# on RT.customer_id = CS.customer_id   # -> 이부분 틀림
group by CS.first_name, CS.last_name
order by count(RT.rental_id) desc;   # 씨발 또 틀렸내. 병신같은새끼. 존나 할 줄 아는게 없어 시발

# 정답
select CS.first_name, CS.last_name, count(rental_id)
from rental RT
join customer CS
on RT.customer_id = CS.customer_id
group by CS.first_name, CS.last_name
order by count(rental_id) desc;

#-------------------------------------------------------- join 3개 이상
-- 5. action 분야 영화의 다음 속성들을 출력하시오
-- 필름번호, 제목, 설명, 분야, 발매년도, 언어
# 그럼 join 3개는 어떻게 할까

select F.film_id, F.title, F.description, CT.name, F.release_year, LN.name
from language as LN
join film as F
on LN.language_id = F.language_id
join film_category as FC
on F.film_id = FC.film_id
join category as CT
on FC.category_id = CT.category_id
where CT.category_id = 1;

select * from category;  # -> Action 카테고리id = 1

# 정답
select FL.film_id as 필름번호, FL.title as 제목,
		FL.description as 설명, CG.name as 분야
        , FL.release_year as 발매년도, LG.name as 언어
from film as FL join film_category as FC
	on FL.film_id = FC.film_id
join category as CG
	on FC.category_id = CG.category_id
join language as LG
	on FL.language_id = LG.language_id
where CG.name = 'action';


-- 6. 출연작이 많은 순으로 배우의 first_name, last_name, 작품수 를 출력하시오
select A.first_name, A.last_name, count(FA.film_id) as 작품수  # 또는 '작품 수' -> 띄어쓰기 할땐 묶어주기
from Actor as A
join film_actor as FA
on A.actor_id = FA.actor_id
group by A.first_name, A.last_name
order by count(FA.film_id) desc;

# 정답
select A.first_name, A.last_name, count(FA.film_id) as '작품 수'
from film_actor FA join actor as A
on FA.actor_id = A.actor_id
group by A.first_name, A.last_name  # 그룹 나머지 -> select 전부 긁어다가 붙이기
# -> 위에거(성, 이름)으로 돌리면 199row(s) returned가 나와서 총 199명
#group by A.actor_id
# -> 이놈(actor_id)로 돌리면 200row(s) returned로 총 200명  ->  1명 차이남
order by count(FA.film_id) desc;

# 여기서 actor_id랑 이름으로 할때랑 갯수 1개가 차이남 -> 이론상 차이가 나면 안되는데,
# -> 왜 차이가 나는지 확인해볼것
#  -->  동명이인 -> 이름이 같은 사람이 있음.

# 그럼 동명이인이 누군지 찾아보기

select count(first_name) from actor;  # 200
select count(last_name) from actor;  # 200
select count(actor_id) from actor;  # 200

select first_name, last_name, count(actor_id)
from actor
group by first_name, last_name
order by count(actor_id) desc;
# -> 이렇게 찾으면 SUSAN DAVIS가 2개 나옴

# 수잔 데이비스의 자세한 정보를 보자
select actor_id, first_name, last_name
from actor
where first_name = 'SUSAN' and last_name = 'DAVIS';
# -> 이러면 한사람은 101번, 한사람은 110번.


# 위의 내용을 완벽하게 보완해서 제출하려면?  -> actor_id를 추가해주면 됨.
select A.actor_id, A.first_name, A.last_name, 
			count(FA.film_id) as '작품 수'
from film_actor FA join actor as A
on FA.actor_id = A.actor_id
group by A.first_name, A.last_name, A.actor_id
order by count(FA.film_id) desc;



-- 7 MARY KEITEL의 출연작을 영화제목 오름차순으로 출력하시오.
-- 출력 컬럼은 다음고 같다.
-- first_name, last_name, 영화제목, 출시일, 대여 비용

# select first_name, last_name, title as '영화제목', release_year as '출시일', as '대여 비용'; # 시간안에 다 못품. 점심시간

# 정답
select A.first_name, A.last_name, F.title 영화제목, F.release_year 출시일, F.rental_rate '대여 비용'
from actor A join film_actor FA on A.actor_id = FA.actor_id
join film F on F.film_id = FA.film_id
where A.first_name = 'MARY' and A.last_name = 'KEITEL'
order by 영화제목;


-- 8. 배우의 'R'등급 영화 작품 수를 카운트하여, 가장 많은 작품수를 가지는
-- 배우부터 출력하시오, 출력 컬럼은 다음과 같다.

-- actor_id, first_name, last_name, 'R'등급 작품 수

select A.actor_id, A.first_name, A.last_name, count(F.film_id) as "'R'등급 작품 수"
from actor as A
join film_actor as FA
on A.actor_id = FA.actor_id
join film as F
on FA.film_id = F.film_id
where F.rating = 'R'
group by A.actor_id, A.first_name, A.last_name
order by count(F.film_id) desc;

# 정답
select AC.actor_id, AC.first_name, AC.last_name, count(FL.title)  # 작품 수를 새는거니 title을 세는게 맞다
from film FL join film_actor FA on FL.film_id = FA.film_id
join actor AC on AC.actor_id = FA.actor_id
where FL.rating = 'R'
group by AC.actor_id, AC.first_name, AC.last_name
order by count(FL.title) desc;


-- 9. 'R'등급 영화에 출현한 적이 없는 배우의 
-- first_name, last_name, 출연영화제목, 출시년도를 출시년도 순으로 출력하시오

select A.first_name, A.last_name, F.title as '출연영화제목', F.release_year as '출시년도'
from actor as A
join film_actor as FA
on A.actor_id = FA.actor_id
join film as F
on FA.film_id = F.film_id
where F.rating != 'R'  # -> 이러면 R등급에 출현한 적이 있는 사람도 포함되어버림.
group by A.first_name, A.last_name, F.title  # 집계하는놈을 제외한 모든 select를 적는게 정석.
order by F.release_year asc;

select release_year 
from film;  #  -> 왜 죄다 2006

select release_year 
from film
where release_year != 2006;

# 위에 답 틀렸음  --->  정답 25줄 나와야 함.
# 다시 풀어보자.
# 'R'등급에 출현한적이 없는 actor_id 를 구해야 함
#------------------------------------------------------- 이거 꾀 까다로운 문제

select A.first_name, A.last_name, F.title as '출연영화제목', F.release_year as '출시년도'
from actor as A
join film_actor as FA
on A.actor_id = FA.actor_id
join film as F
on FA.film_id = F.film_id
where F.film_id != (select F.film_id from film as F where F.rating = 'R') # -> 이러면 R등급에 출현한 적이 있는 사람도 포함되어버림.
group by A.first_name, A.last_name, F.title  # 집계하는놈을 제외한 모든 select를 적는게 정석.
order by F.release_year asc;
#  -->  작품이 아니라 배우를 구하는 것.  film_id 가 아니라 -> actor_id 를 구해야 함.

select film_id from film where rating = 'R';

#----------------------------------------------------------- where 조건절 안에 (sele 문) 넣을때
#-----------------------------------------------------------  != 쓰면 안되고, not in, 이나 in 써야함

# 정답
select AC.first_name, AC.last_name, FL.title, FL.release_year
from film FL join film_actor FA on FL.film_id = FA.film_id
join actor AC on AC.actor_id = FA.actor_id
where AC.actor_id not in (select FA.actor_id
	from film FL join film_actor FA on FL.film_id = FA.film_id
    where rating = 'R')
order by FL.release_year;

select actor_id from film_actor;
select FA.actor_id from film FL join film_actor FA on FL.film_id = FA.film_id;
select FA.actor_id from film FL join film_actor FA on FL.film_id = FA.film_id where rating = 'R';


-- 10. 영화 'AGENT TRUMAN' 를 보유하고 있는 매장의 정보를 아해와 같이 출력함.

-- 영화제목, 매장ID, 매장staff first_name, 매장staff last_name,
-- 매장의 address, address2
-- , district, city, country, 해당 타이틀 "보유수량"

select F.title, ST.store_id, .address, AD.address2, AD.district, 
CT.city, CR.country, count(IV.film_id) as '해당 타이틀 "보유수량"'
from film as F
join inventory as IV
on F.film_id = IV.film_id
join store as ST
on IV.store_id = ST.store_id
join address as AD
on ST.address_id = AD.address_id
join city as CT
on SD.city_id = CT.city_id
join country as CR
on CT.country_id = CR.country_id
where F.title = 'AGENT TRUMAN'
group by AD.address, AD.address2, AD.district, CT.city, CR.country
;

select film_id from inventory;  # -> 1 여러개, 2 여러개 등. title로 구분한듯.



# 정답
# select의 FLtitle부터 ~ CU.country(count() 전까지) 복사해서 group by 에 붙여넣으면 됨
select FL.title, ST.store_id, SF.first_name, SF.last_name, 
AD.address, AD.address2, AD.district, CT.city, CU.country, 
count(FL.title) as "보유수량"
from film FL join inventory IV on FL.film_id = IV.film_id
join store ST on IV.store_id = ST.store_id
join staff SF on ST.store_id = SF.store_id
join address AD on ST.address_id = AD.address_id
join city CT on AD.city_id = CT.city_id
join country CU on CT.country_id = CU.country_id
where FL.title = 'AGENT TRUMAN'
group by FL.title, ST.store_id, SF.first_name, SF.last_name, 
AD.address, AD.address2, AD.district, CT.city, CU.country;


-- 11. 영화 'AGENT TRUMAN' 를 보유하고 있는 매장의 정보와 해당 타이틀의
-- 대여 정보를(대여 정보가 없을 경우에는 관련 컬럼은 null 처리) 아래와 같이 출력함.

-- 영화 제목, 매장ID, 인벤토리ID, 매장의 address, address2, district, city, country,
-- 대여 일지, 회수일지, 대여고객의 first_name, last_name

select FL.title as '영화 제목', ST.store_id as '매장ID', IV.inventory_id as '인벤토리ID', 
AD.address as '매장의 address', AD.address2, AD.district, CT.city, CR.country,
RT.rental_date as '대여 일지', RT.return_date as '회수일지', 
CU.first_name as '대여고객의 first_name', CU.last_name
from film as FL,
join inventory as IV
on FL.film_id = IV.film_id
join rental as RT
on IV.inventory_id = RT.inventory_id
join store as ST
on IV.store_id = ST.store_id
join address as AD
on IV.address_id = AD.address_id
join customer as CU
on AD.address_id = CU.address_id
join city as CT
on AD.city_id = CT.city_id
join country as CR
on CT.country_id = CR.country_id
where FL.title = 'AGENT TRUMAN'
group by FL.title as '영화 제목', ST.store_id as '매장ID', IV.inventory_id as '인벤토리ID', 
AD.address as '매장의 address', AD.address2, AD.district, CT.city, CR.country,
RT.rental_date as '대여 일지', RT.return_date as '회수일지', 
CU.first_name as '대여고객의 first_name', CU.last_name;


# 정답:  총 row 수가 958줄 나와야 함
select FL.title, ST.store_id, IV.inventory_id, AD.address, AD.address2
, AD.district, CT.city, CU.country, RT.rental_date, RT.return_date
, CS.first_name, CS.last_name
from film FL join inventory IV on FL.film_id = IV.film_id
join store ST on IV.store_id = ST.store_id
join address AD on ST.address_id = AD.address_id
join city CT on AD.city_id = CT.city_id
join country CU on CT.country_id = CU.country
left join rental RT on IV.inventory_id = RT.inventory_id
join customer CS on RT.customer_id = CS.customer_id
where FL.title = 'AGENT TRUMAN';


select FL.title, ST.store_id, IV.inventory_id, AD.address, AD.address2
, AD.district, CT.city, CU.country, RT.rental_date, RT.return_date
, CM.first_name, CM.last_name
from film FL join inventory IV on FL.film_id = IV.film_id
join store ST on IV.store_id = ST.store_id
join address AD on ST.address_id = AD.address_id
join city CT on AD.city_id = CT.city_id
join country CU on CT.country_id = CU.country_id
join rental RT on RT.inventory_id = IV.inventory_id
join customer CM on CM.customer_id = RT.customer_id
where FL.title = 'AGENT TRUMAN'
group by FL.title, ST.store_id, IV.inventory_id, AD.address, AD.address2, AD.district, CT.city, CU.country,
RT.rental_date, RT.return_date, CM.first_name, CM.last_name;



-- 마지막 문제

# 정답
select FL.title, sum(rental_info.rental_cnt)
from inventory IV join (select inventory_id, count(rental_id) as rental_cnt
	from rental
	group by inventory_id) as rental_info
on IV.inventory_id = rental_info.inventory_id
join film FL on IV.film_id = FL.film_id
group by FL.title
order by sum(rental_info.rental_cnt) desc;
