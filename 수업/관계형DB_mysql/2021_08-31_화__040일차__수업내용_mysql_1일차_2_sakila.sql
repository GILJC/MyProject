use sakila;

desc actor;

select count(*) from actor;
# 수가 많으면 느려지니까 일단 수를 보고 뽑아야 함.
# 함부로 select * 하면 (카카오같은 경우 수십만) 부하가 걸려서 서비스 다 먹통됨

select * from actor limit 10;  # 그러면 이렇게 10개만 뽑아볼 수 있음

select * from actor film_actor limit 10;
select * from film where film_id = 23;

select * from language;

# flim 2줄만 뽑아봅시다
select * from film limit 2;

select * from category;

select * from film_category limit 2;
# film_id 1 의 카테고리는 6 , 2는 11 이라는 것

select count(*) from store;
select * from store;  # 현재 2호점까지 오픈했다.
