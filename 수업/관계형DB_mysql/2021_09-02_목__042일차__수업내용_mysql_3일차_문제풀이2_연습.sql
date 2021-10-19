-- 13. 고객의 지불정보를 총지불금액 내림차순, 다음과 같이 출력하시오
-- 고객의 customer_id, first_name, last_name, 총지불금액, 고객의 주소 address, address2, district
-- , city, country			( 총 599 rows 나옴 )

select CU.customer_id, CU.first_name, CU.last_name, 
sum(amount) as 총지불금액, AD.address, AD.address2, AD.district
from address as AD
join customer as CU
on AD.address_id = CU.address_id
join payment as PM
on CU.customer_id = PM.customer_id
group by CU.customer_id, CU.first_name, CU.last_name
, AD.address, AD.address2, AD.district;
# order by sum(PM.amount) desc;  이거 안했내
# 들여쓰기도 해주고

# 정답
select CS.customer_id, CS.first_name, CS.last_name, 
	sum(PM.amount), AD.address, AD.address2, AD.district
	, CT.city, CU.country
from payment PM join customer CS 
	on PM.customer_id = CS.customer_id
	join address AD on CS.address_id = AD.address_id
	join city CT on AD.city_id = CT.city_id
	join country CU on CT.country_id = CU.country_id
group by CS.customer_id, CS.first_name, CS.last_name, 
	AD.address, AD.address2, AD.district, CT.city, CU.country
order by sum(PM.amount) desc;



-- 14. 총 지불 금액별 고객 등급을 출력하고자 한다. 등급 구분과 출력 컬럼은 다음과 같다.(case 문 사용)
-- 'A' : 총 지불금액이 200 이상
-- 'B' : 총 지불금액이 200 미만 100 이상
-- 'C' : 총 지불금액이 100 미만 고객
-- 고객의 customer_id, first_name, last_name, 총 지불금액, 등급
-- 출력 순서는 총 지불금액이 많은 고객부터 출력      (결과의 row 수는 전과 똑같을 것이다 = 599)

select CU.customer_id, CU.first_name, CU.last_name, 
sum(PM.amount) as '총 지불금액', 등급
from customer as CU
join payment as PM
on CU.costumer_id = PM.customer_id
where sum(PM.amount) > 200
;

# 정답
select CS.customer_id, CS.first_name, CS.last_name,
		sum(PM.amount),
		case when (sum(PM.amount) >= 200) then 'A'
			when (sum(PM.amount) >= 100) then 'B'
		else 'C'
        end as customer_grade
from payment PM join customer CS
on PM.customer_id = CS.customer_id
group by CS.customer_id, CS.first_name, CS.last_name
order by sum(PM.amount) desc;


-- 15. DVD 대여 후 아직 반납하지 않은 고객정보를 다음의 정보로 출력한다.
-- 영화타이틀, 인벤토리ID, 매장ID, 고객의 first_name, last_name, 대여일자, 고객등급
select FL.title as 영화타이틀, IV.inventory_id as '인벤토리ID', ST.store_id as '매장ID', 
		CU.first_name as '고객의 first_name', CU.last_name, 
        RT.rental_date as '대여일자', case when (sum(PM.amount) >= 200) then 'A'
										when  (sum(PM.amount) >= 100) then 'B'
										else 'C'
									end as 고객등급
from film as FL
	join inventory as IV
		on FL.film_id = IV.film_id
	join store as ST
		on IV.store_id = ST.store_id    #  join부분의 어딘가가 틀렸음 -> 1000줄 나옴
	join customer as CU
		on ST.store_id = CU.store_id    #  join부분 답에서 복붙하니까 됨. 시발
	join rental as RT
		on CU.customer_id = RT.customer_id
	join payment as PM
		on RT.rental_id = PM.rental_id
where RT.return_date is Null
group by FL.title, IV.inventory_id, ST.store_id, CU.first_name, CU.last_name
, RT.rental_date;

select rental_date, return_date from rental
group by rental_date, return_date;  # 이러면 null 값 안나옴 -> 존재하는 값만 출력하기때문

select * from rental order by return_date;  # 이래야 null값 나옴

# 정답
select FL.title, IV.inventory_id, IV.store_id, CS.first_name, CS.last_name
, RT.rental_date, case when (sum(PM.amount) >= 200) then 'A'
	when (sum(PM.amount) >= 100) then 'B'
                    else 'C' end as customer_grade
from rental RT join customer CS on RT.customer_id = CS.customer_id
join inventory IV on RT.inventory_id = IV.inventory_id
join film FL on IV.film_id = FL.film_id
join store ST on IV.store_id = ST.store_id
join payment PM on CS.customer_id = PM.customer_id
where RT.return_date is null
group by FL.title, IV.inventory_id, IV.store_id, CS.first_name, CS.last_name
, RT.rental_date;



-- 16. '2005-08-01' 부터 '2005-08-15' 사이,
-- Canada, Alberta 주에서 대여한 영화의 타이틀 정보를 아래와 같이 출력하시오
-- 대여일, 영화 타이틀, 인벤토리ID, 매장ID, 매장 전체 주소

# 정답
select RT.rental_date, FL.title, IV.inventory_id, IV.store_id, AD.address, AD.address2, AD.district, CT.city, CU.country
from rental RT join inventory IV on RT.inventory_id = IV.inventory_id
join store ST on IV.store_id = ST.store_id
join address AD on ST.address_id = AD.address_id
join city CT on AD.city_id = CT.city_id
join country CU on CT.country_id = CU.country_id
join film FL on IV.film_id = FL.film_id
where rental_date between '2005-08-01' and '2005-08-15'
and AD.district = 'Alberta'
and CU.country = 'Canada';


-- 17. 도시별 'Horror' 영화 대여정보를 알고자 한다.
-- 도시와 대여수를 출력하라.
-- 대여수 내림차순, 도시명 오름차순으로 정렬하시오

select count(RT.rental_date) as '대여수', CT.city as '도시명'
from rental as RT
join customer as CS on RT.customer_id = CS.customer_id
join address as AD on CS.address_id = AD.address_id
join city as CT on AD.city_id = CT.city_id
join inventory as IV on RT.inventory_id = IV.inventory_id
join film as FL on IV.film_id = FL.film_id
join film_category as FC on FL.film_id = FC.film_id
join category as CA on FC.category_id = CA.category_id
where CA.name = 'Horror'
group by CT.city
order by count(RT.rental_date) desc, CT.city
;

select rental_date from rental;
select * from rental;

# 정답
select CT.city, count(FL.title)
from film FL join film_category FC on FL.film_id = FC.film_id
join category CG on FC.category_id = CG.category_id
join inventory IV on FL.film_id = IV.film_id
join rental RT on IV.inventory_id = RT.inventory_id
join customer CS on RT.customer_id = CS.customer_id
join address AD on CS.address_id = AD.address_id
join city CT on AD.city_id = CT.city_id
join country CU on CT.country_id = CU.country_id
where CG.name = 'Horror'
group by CT.city
order by count(FL.title) desc, CT.city;



-- 18. 대여된 영화 중 대여기간이 연체된 건을 다음의 정보로 조회하시오.
-- 영화타이틀. inventory_id, 대여일, 반납일, 기준대여기간, 실제대여기간
-- ** 아직 반납이 되지 않은 경우, 실제대여기간 컬럼에 'Unknown' 출력

select rental_duration, rental_rate from film;
select return_date, rental_date from rental;
# select date_sub(rental_date, return_date) from rental;
# 날짜 계산(반납일 - 빌린 날)
select rental_date, timestampdiff(day, rental_date, return_date) as diff_day from rental;  # 정답
select rental_date, timestampdiff(day, return_date, rental_date) as diff_day from rental;  # 마이너스값 나옴(-)


select FL.title as '영화타이틀', IV.inventory_id, 
RT.rental_date as '대여일', RT.return_date as '반납일', 
FL.rental_duration as '기준대여기간', 
#case when (timestampdiff(day, RT.rental_date, RT.return_date) > FL.rental_duration) then 'Unkown'
case when (RT.return_date is null) then 'Unkown'
	else timestampdiff(day, RT.rental_date, RT.return_date)
    end as '실제대여기간'
# datediff(R.return_date, R.rental_date)  <-  datediff 로도 가능하다는 듯.
from rental as RT
join inventory as IV on RT.inventory_id = IV.inventory_id
join film as FL on IV.film_id = FL.film_id
group by FL.title, IV.inventory_id, 
RT.rental_date, RT.return_date, FL.rental_duration
;


# 정답
select FL.title, IV.inventory_id, RT.rental_date, RT.return_date, FL.rental_duration, IFNULL(DATEDIFF(RT.return_date, RT.rental_date), 'Unknown') as '실 대여기간'
from rental RT join inventory IV on RT.inventory_id = IV.inventory_id
join film FL on IV.film_id = FL.film_id
where DATEDIFF(IFNULL(RT.return_date, curdate()), RT.rental_date) > FL.rental_duration;


-- 19. 고객별 연체 건수가 많은 수부터 출력하시오(고객 first_name, last_name, 연체건수)

# 정답
select CS.first_name, CS.last_name, count(RT.rental_id)
from rental RT join inventory IV on RT.inventory_id = IV.inventory_id
join film FL on IV.film_id = FL.film_id
join customer CS on RT.customer_id = CS.customer_id
where datediff(IFNULL(RT.return_date, curdate()), RT.rental_date) > FL.rental_duration
group by CS.first_name, CS.last_name
order by count(RT.rental_id) desc;


-- 20. 대여횟수 상위 5위 고객이 대여한 영화의 title을 알파벳순으로 출력
-- 출력 컬럼 : 고객이름(first, last), 영화제목, 총 대여수

select CS.first_name, CS.last_name, FL.title as '영화제목', count(FL.title) as '총 대여수'
from film as FL
join inventory as IV on FL.film_id = IV.film_id
join rental as RT on IV.inventory_id = RT.inventory_id
join customer as CS on RT.customer_id = CS.customer_id
group by first_name, last_name
order by count(FL.title) desc
limit 5
;

select CS.first_name, CS.last_name, FL.title as '영화제목', 
RANK() OVER (ORDER BY count(FL.title)) as '총 대여수'
from film as FL
join inventory as IV on FL.film_id = IV.film_id
join rental as RT on IV.inventory_id = RT.inventory_id
join customer as CS on RT.customer_id = CS.customer_id
group by first_name, last_name
limit 5
;


# 정답
select CS.first_name, CS.last_name, FL.title, top5.tot_cnt
from (select customer_id, count(rental_id) as tot_cnt
	from rental
	group by customer_id
	order by count(rental_id) desc
	limit 5) as top5 join rental RT on top5.customer_id = RT.customer_id
join inventory IV on RT.inventory_id = IV.inventory_id
join film FL on IV.film_id = FL.film_id
join customer CS on top5.customer_id = CS.customer_id
order by top5.tot_cnt desc, FL.title;



-- 21. 배우 'WALTER TORN' 보다 출연작이 많은 배우의 정보를,
-- 배우ID, 배우 이름(first_name, last_name), 출연작 타이틀, 작품 출시일을
-- 출력하시오(정렬순서: 배우ID, 타이틀, 출시일)

select A.actor_id, count(F.film_id) 출연작품수 
from film F join film_actor FA on F.film_id = FA.film_id
join actor A on A.actor_id = FA.actor_id
where A.first_name = 'walter' and A.last_name = 'torn'
order by count(film_id);


# 정답
select id, famous_actor.f_name, famous_actor.l_name, FL.title, FL.release_year
from (select AC.actor_id as id, AC.first_name as f_name, AC.last_name as l_name, count(film_id) as cnt
	from actor AC join film_actor FA on AC.actor_id = FA.actor_id
	group by id, f_name, l_name
	having cnt > (select count(film_id)
		from actor AC join film_actor FA on AC.actor_id = FA.actor_id
		where AC.first_name = 'WALTER'
		and AC.last_name = 'TORN')) as famous_actor
join film_actor FA on famous_actor.id = FA.actor_id
join film FL on FA.film_id = FL.film_id
order by id, FL.title, FL.release_year;


