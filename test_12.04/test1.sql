-- 建库
CREATE TABLE exam_students(
	id INT,
	name VARCHAR(20),
	chinese DECIMAL,
	math DECIMAL,
	english DECIMAL
);

-- 插入数据（单行插入）
INSERT INTO exam_students VALUES(1,'sehun',99,98,100);

-- 插入数据（全列插入）
INSERT INTO exam_students VALUES(2,'chanyol',88,66,99);
INSERT INTO exam_students VALUES(3,'lay',81,62,93);

-- 插入数据（多行插入 指定列插入）
INSERT INTO exam_students(id,name,chinese)VALUE
(4,'xiumin',77),
(5,'kris',72),
(6,'kai',75),
(7,'chen',67);

INSERT INTO exam_students(id,name,chinese)VALUE
(8,'zxy',77),
(9,'wqq',72),
(10,'lzq',75),
(11,'gs',67);

-- 查询所有数据
SELECT * FROM exam_students;

-- 指定列查询
SELECT id,name,english FROM exam_students;

-- 查询字段为表达式
SELECT 10 FROM exam_students;
SELECT id,name,english+10 FROM exam_students;

-- 别名
SELECT id,name,chinese+math+english 总分 FROM exam_students;
SELECT chinese FROM exam_students;

-- 去重
SELECT DISTINCT chinese FROM exam_students;

-- 排序  => 默认为ASC
SELECT *FROM exam_students ORDER BY chinese;

-- 排序 ==》ASC(升序)
SELECT *FROM exam_students ORDER BY chinese ASC;
SELECT *FROM exam_students ORDER BY math ASC;    -- NULL 视为比任何值都小

-- 排序 ==》DESC(降序)
SELECT *FROM exam_students ORDER BY chinese DESC;

SELECT name, chinese+math+english 总分 FROM exam_students ORDER BY chinese+math+english DESC; 
SELECT name, chinese+math+english 总分 FROM exam_students ORDER BY 总分 DESC;



  







