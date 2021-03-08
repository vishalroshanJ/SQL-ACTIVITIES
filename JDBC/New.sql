use sample;
show tables;
select * from productions;
select * from movie;




INSERT into productions VALUES(9091,'Arkamediaworks','Hyderabad',2001,'Shobu Yarlagadda');
INSERT into productions VALUES(1111,'STP','Chennai',2018,'Sree');
update productions set productionname='STP' where Productionid = 1111;



INSERT INTO movie VALUES ('201','Bahubali-The_Beginning','Prabhas','Tamannah','2015/07/10','Telugu',21,'Drama_Fantasy',9091);
INSERT INTO movie VALUES ('501','2.0','Rajnikanth','Amy','2018/11/29','Tamil','20','Scientific',8892);
INSERT INTO movie VALUES ('577','Aval','Siddharth','Andrea','2017/11/3','Tamil','14','Horror',1899);
INSERT INTO movie VALUES ('101','Holiday','Akshay Kumar','Sonakshi','2014/6/6','Hindi','15','Crime Thriller',1010);

INSERT INTO movie VALUES ('151','Zero','Shah ruck','Katrina Kaif','2018/12/21','Hindi','16','Scientific',1988);
INSERT INTO movie VALUES ('131','Padmavaat','Shahid Kapoor','Deepika Padukone','2018/1/25','Hindi','21','Drama Epic',1899);
INSERT INTO movie VALUES ('146','Andhadhun','Ayushmann','Radika Apte','2018/10/5','Hindi','16','Crime Thriller',1899);
INSERT INTO movie VALUES (231,'Bharath Ane nenu','Mahesh Babu',	'Kiara'	,'2018/4/20','Telugu',15,'Thriller',7882);
INSERT INTO movie VALUES (244,'Gruham ',' Siddharth','Andrea','2018/11/17','Telugu',14,'Horror',1899);
INSERT INTO movie VALUES (337,'K G F chapter 1','Yash','Srinithi Shetty','2018/12/21','Kannada',21,'Action Thriller',6773);

INSERT INTO movie VALUES (136,'	Badhaai Ho','Ayushmann','Neena','2018/10/18','Hindi',14,'Drama Comedy',1854);
INSERT INTO movie VALUES (441,'The Villain'	,'Sudeep','Amy','2018/10/18','Kannada',16,'Drama',2341);
INSERT INTO movie VALUES (206,'	Maryada Ramanna','Sunil','Saloni','2010/7/23','Telugu',19,'Drama',	9091);
INSERT INTO movie VALUES (211,'	Khaidi No. 150','chiranjeevi','Kajal','2017/1/1','Telugu',20,'Drama Thriller',8892);
INSERT INTO movie VALUES (188,'Rangoon','Saif Ali Khan','Kangana','2017/2/2','Hindi',	15,'Drama',1899);
INSERT INTO movie VALUES (189,'The House Next Door','Siddharth','Andrea','2017/11/10','Hindi',14,'Horror',1899);


select  p.productionname,m.Productionid,count(*)  from movie m join  productions p on m.Productionid=p.Productionid group by Productionid ;
select  p.productionname,p.OwnerName  from movie m join  productions p on m.Productionid=p.Productionid group by m.Productionid having count(*)>2 ;


select  p.productionname,p.OwnerName,count(m.Productionid) from movie m join  productions p on m.Productionid=p.Productionid group by m.Productionid order by count(m.Productionid) desc limit 1 ;

select  m.Moviename,m.Heroname,p.productionname  from movie m join  productions p on m.Productionid=p.Productionid where p.OwnerName ="Subaskaran"  ;

select  m.Moviename,m.Heroname,p.Productionid  from movie m join  productions p on m.Productionid=p.Productionid where p.Productionid like "%82" ;

select  p.productionname,p.OwnerName  from productions p join movie m  on m.Productionid=p.Productionid where  ;










