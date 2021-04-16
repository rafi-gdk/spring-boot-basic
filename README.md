This application provides all users information

Used topics:
   1.Http all Requests
   2.Form Validations (spring-boot-validation)
   3.PathVariable Validations (spring-boot-validation)
   4.Using Oracle & H2 db by setting up all required info in application.properties by passing values from environment variables
   5.Used Global Exception handler

If you wanna use Oracle Database follow below steps
   step 1: Uncomment oracle database url in application.properties & comment other urls
   step 2: the below dependency should be there in pom.xml & comment other db drivers
            <dependency>
                <groupId>com.oracle.database.jdbc</groupId>
                <artifactId>ojdbc8</artifactId>
                <scope>runtime</scope>
            </dependency>
   step 3: Run the SpringBootMainClass.java class with below environment variables (replace ur db credentials in below variables ).
   Environment Variables:
            host.name=localhost;
            datasource.port=1521;
            datasource.database=sonu;
            datasource.username=sonu;
            datasource.password=manager123;
            datasource.driver=oracle.jdbc.OracleDriver;
            datasource.dialect=org.hibernate.dialect.Oracle12cDialect;

If you wanna use H2 Database follow below steps
   step 1: Uncomment H2 database url in application.properties & comment other urls
   step 2: the below dependency should be there in pom.xml & comment other db drivers
            <dependency>
               <groupId>com.h2database</groupId>
               <artifactId>h2</artifactId>
               <scope>runtime</scope>
            </dependency>
   step 3: Run the SpringBootMainClass.java class with below environment variables (replace ur db credentials in below variables ).
   Environment Variables:
            datasource.database=testdb;
            datasource.username=sa;
            datasource.password=;
            datasource.driver=org.h2.Driver;
            datasource.dialect=org.hibernate.dialect.H2Dialect;


All Services Request URLS & Body

Post:
  URL:- http://localhost:8080/user/addUser
  Body:-
      {
      "userName": "Sonu Rafi",
      "userDOB": "1990-01-11",
      "userPhoneNumber": 9999999999
      }

Get:
  URL:- http://localhost:8080/user/getAllUsers

Put: take user id from above get service and update in the below userId
  URL:- http://localhost:8080/user/updateUser
  Body:-
      {
      "userId": "2dbbb234-23b6-4f33-99f1-6aab5c5cc441",
      "userName": "Sonu Nigam",
      "userDOB": "1990-01-1",
      "userPhoneNumber": 9908997996
      }

Get:
  URL:- http://localhost:8080/user/getUser/2dbbb234-23b6-4f33-99f1-6aab5c5cc441

Delete:
  URL:- http://localhost:8080/user/deleteUser/2dbbb234-23b6-4f33-99f1-6aab5c5cc441

