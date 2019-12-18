
--1、设计一张商品表，包含以下字段：
--商品名称、商品价格、商品库存、商品描述
CREATE DATABASE test12_18;
USE test12_18;
CREATE TABLE commodity(
	name VARCHAR(20),
	price DECIMAL,
	storage INT,
	discribe VARCHAR	
);

INSERT INTO commodity VALUE('饼干',8.6,250,'食品');

INSERT INTO commodity (name,price,storage,discribe)VALUE
('拖把',9.9,100,'日常用品'),
('衣服',208.9,200,'生活用品');

--2、设计一张老师表，
--包含以下字段：姓名、年龄、身高、体重、性别、学历、生日、身份证号
CREATE TABLE teacher(
	name VARCHAR(20),
	age INT,
	height INT,
	weight DECIMAL,
	sex VARCHAR(10),
	education VARCHAR(20),
	birthday DATETIME,
	id BIGINT
);

INSERT INTO teacher VALUE('吴老师',25,183,60,'男','大学',1994-04-12,6101010101010);
INSERT INTO teacher VALUE('边老师',23,178,58,'男','大学',1992-05-06,6101010105411);

--3、设计一张图书表，
--包含以下字段：图书名称，图书作者、图书价格、图书分类

CREATE TABLE book(
	name VARCHAR(50),
	author VARCHAR(80),
	price INT,
	type VARCHAR(50)
);

INSERT INTO book VALUE('Java','gb',50,'工具书');
INSERT INTO book VALUE('C++','zpw',60,'工具书');
INSERT INTO book VALUE('数据库','cpx',80,'工具书');