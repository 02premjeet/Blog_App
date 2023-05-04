# MedTech Matters Blogging Application
## About 
- MedTech Matters is a web application that serves as a platform for sharing and discussing medical devices, such as X-rays, C-Arms, CT scans, and more. The website allows users to create, update, and delete posts related to medical devices, as well as comment on posts created by others.

Users can sign up for an account on MedTech Matters, which will give them access to the full range of features offered by the website. Once logged in, users can create new posts, providing details about the medical device they are discussing. They can include text, images, and other media in their posts, making them more informative and engaging.

Users can also update and delete their own posts as needed, allowing them to keep their content up-to-date and relevant. Additionally, users can browse through posts created by others, either by searching for specific topics or browsing through categories.

One of the key features of MedTech Matters is the ability for users to comment on posts created by others. This allows for a lively discussion about medical devices and their applications, providing a valuable resource for anyone interested in this field.

Overall, MedTech Matters is a valuable web application for anyone interested in medical devices. It provides a platform for sharing information and discussing the latest developments in this important field, and offers a range of features that make it easy and convenient to use.
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
