1. world数据库查询练习
city 城市表
country 国家表
countrylanguage 语言表
USE world;
* 查询所有城市的数量
SELECT COUNT(*) FROM city;
* 查询所有国家的数量
SELECT COUNT(*) FROM country;
* 查询所有语言的数量
SELECT COUNT(*) FROM countrylanguage;
* 查询各大洲的国家数量
SELECT country.Continent,COUNT(*) FROM country GROUP BY country.Continent;
* 查询所有欧洲国家(CODE 名字 首都 领导人)
SELECT country.Code CODE,country.Name 名字,city.Name 首都,country.HeadOfState 领导人
FROM city,country
WHERE city.ID = country.Capital;


* 查询China的国家详细信息(country表)
SELECT * FROM country WHERE country.Code = 'CHN';
* 查询China的所有城市信息 (城市名、人口数量)
SELECT city.Name 城市名,city.Population 人口数量 FROM city WHERE city.ID= 'CHN';
* 查询所有使用Spanish语言的国家及在此国家使用的比率