-- 권한 부여
grant all privileges on sakila.* to 'gil'@'localhost';
grant all privileges on sakila.* to 'gil'@'%';
-- 권한 적용
flush privileges;
