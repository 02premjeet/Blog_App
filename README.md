# MedTech Matters Blogging Application
## About 
- This is a Blogging WebSite.Where any user can create , Update , Delete and Get the post as well as they can comment on the any posts.
## Team
- Premjeet Kumar
## Technology & Tool/Frameworks 
- Core Java
- Spring Boot
- MySQL
- Spring Security-
- JWT
- Hibernate/JPA 
- Rest API

### Build Restful CRUD API for a blog using Spring Boot, Mysql, JPA and Hibernate.

Link http://blogapp-env-1.eba-se5hnprk.ap-south-1.elasticbeanstalk.com/swagger-ui/index.html#/auth-controller/registerUserUsingPOST
Steps to Setup
1. Clone the application

git clone https://github.com/02premjeet/Blog_App/tree/master/myblog_appAPIs

2. Create Mysql database

create database blogapi

run src/main/resources/premblog.sql

3. Change mysql username and password as per your installation

open src/main/resources/application.properties
change spring.datasource.username and spring.datasource.password as per your mysql installation

4. Run the app using maven

mvn spring-boot:run
The app will start running at http://localhost:8080
