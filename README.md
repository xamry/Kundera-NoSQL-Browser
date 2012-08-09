Deployment Steps:
==================================

* Copy below war files to tomcat webapps directory:

Kundera-Web-Examples.war  -> Sample Kundera Powered web application
Kundera-NoSQL-Browser.war -> TOAD like Kundera NoSQL browser tool web application

* Start Cassandra and run below commands on cassandra-cli:

> "
impadmin@impetus-ubuntu:/usr/local/apache-cassandra-1.0.6/bin$ ./cassandra-cli -h localhost -p 9160

create keyspace KunderaExamples;
use KunderaExamples;
drop column family BOOK;
create column family BOOK with comparator=UTF8Type and default_validation_class=UTF8Type and key_validation_class=UTF8Type;
create column family SONG with comparator=UTF8Type and default_validation_class=UTF8Type and key_validation_class=UTF8Type;
describe KunderaExamples;

SET BOOK['1111111111111']['AUTHOR']='Amresh';
SET BOOK['1111111111111']['PUBLICATION']='Willey';
SET BOOK['2222222222222']['AUTHOR']='Vivek';
SET BOOK['2222222222222']['PUBLICATION']='McGraw';
SET BOOK['3333333333333']['AUTHOR']='Kuldeep';
SET BOOK['3333333333333']['PUBLICATION']='Oreilly';

SET SONG['1']['TITLE']='Turn the page';
SET SONG['1']['ARTIST']='METALLICA';
SET SONG['1']['ALBUM']='Garage Inc.';
SET SONG['2']['TITLE']='Hells Bells';
SET SONG['2']['ARTIST']='AC/DC';
SET SONG['2']['ALBUM']='Back in Black';
SET SONG['3']['TITLE']='Coming back to life';
SET SONG['3']['ARTIST']='Pink Floyd';
SET SONG['3']['ALBUM']='The devision bell';
SET SONG['4']['TITLE']='Angel';
SET SONG['4']['ARTIST']='Judas Priest';
SET SONG['4']['ALBUM']='Angel of Retribution';
"

* Hit below URL:
http://localhost:8080/KunderaNoSQLBrowser/xhtml/login/login.jsf

* Provide URL of Kundera Powered web application:
URL: http://localhost:8080/Kundera-Web-Examples
Persistence Unit: twissandra
Media Type: XML