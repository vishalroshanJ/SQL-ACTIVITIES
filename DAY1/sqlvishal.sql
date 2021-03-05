SELECT * FROM demo.movie;
UPDATE `demo`.`movie` SET `Releasedate` = '2015-07-10' WHERE (`Movieid` = '201');
UPDATE `demo`.`movie` SET `Releasedate` = '2018-11-18' WHERE (`Movieid` = '501');
UPDATE `demo`.`movie` SET `Releasedate` = '2017-11-03' WHERE (`Movieid` = '577');
UPDATE `demo`.`movie` SET `Releasedate` = '2017-12-03' WHERE (`Movieid` = '101');
UPDATE `demo`.`movie` SET `Releasedate` = '2018-12-03' WHERE (`Movieid` = '151');
UPDATE `demo`.`movie` SET `Releasedate` = '2017-09-03' WHERE (`Movieid` = '131');
UPDATE `demo`.`movie` SET `Releasedate` = '2016-12-03' WHERE (`Movieid` = '146');
UPDATE `demo`.`movie` SET `Releasedate` = '2017-12-06' WHERE (`Movieid` = '231');
UPDATE `demo`.`movie` SET `Releasedate` = '2017-11-03' WHERE (`Movieid` = '244');
UPDATE `demo`.`movie` SET `Releasedate` = '2004-02-19' WHERE (`Movieid` = '189');
select  Moviename,Movietype from `demo`.`movie` where Movietype="Drama"; /*1*/
select  Moviename from `demo`.`movie` where Heroname="Ayushmann";/*2*/
select  Moviename from `demo`.`movie` where Heroname="Ayushmann";/*3*/
SELECT COUNT(Moviename) FROM movie WHERE length>18;/*4*/
SELECT Moviename FROM movie WHERE lengthh=(select min(lengthh) from movie);/*5*/
Select * from movie where lan like"T%";/*6*/
select Moviename ,Heroname,Heroine from movie where lengthh=(select max(lengthh) from movie);/*7*/
select Moviename,Heroname,Heroine from movie where Releasedate > '2018-03-15';/*8*/
select count(Moviename) from movie where Movietype like '%Thriller%';/*9*/
select count(Moviename) from movie where Releasedate < '2018-03-15';/*10*/
select Releasedate from movie where Moviename = "Zero";/*11*/
select count(Moviename)from movie where Releasedate like '%-10-%';/*12*//*Select Moviename from movie where/*13*/
SELECT productions.ProductionName, productions.Production_id,count(moviename)
as total FROM productions
INNER JOIN movie ON movie.Productionid=productions.Production_id group by Productionid;/*1*/
SELECT productions.ProductionName, productions.Production_id,count(moviename)
as total FROM productions
INNER JOIN movie ON movie.Productionid=productions.Production_id group by Productionid;/*1*/
 
SELECT productions.ProductionName, productions.Ownername
 FROM productions
inner JOIN movie ON movie.Productionid=productions.Production_id group by movie.Productionid having count(Moviename)>2;/*2*/
SELECT productions.ProductionName, productions.Ownername
 FROM productions
inner JOIN movie ON movie.Productionid=productions.Production_id  having (movie.Productionid);

 select p.Production_id ,p.Ownername, count(m.Productionid) from productions as p  join movie as m ON p.Production_id = m.Productionid group by m.Productionid ORDER BY count(m.Productionid) DESC LIMIT 1;/*3*/
 
SELECT movie.Moviename,movie.Heroname,productions.ProductionName from movie join productions ON movie.Productionid=productions.Production_id WHERE productions.Ownername="Ajit Andhare";/*4*/

SELECT movie.Moviename,movie.Heroname from movie join productions ON movie.Productionid=productions.Production_id WHERE movie.Productionid like"%82";/*4*/








