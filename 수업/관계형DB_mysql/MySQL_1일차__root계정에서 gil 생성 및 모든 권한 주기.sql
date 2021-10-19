create database scottdb default character set utf8;

# local, network용 각각 1번씩, 총 2번 줘야 함.
# gil 유저 생성, 비번 = 1
create user 'gil'@'localhost' identified by '1';

create user 'gil'@'%' identified by '1';

# gil에게 모든 권한 주기
grant all privileges on scottdb.* to 'gil'@'localhost';

grant all privileges on scottdb.* to 'gil'@'%';

flush privileges;   # 권한 즉시 부여
