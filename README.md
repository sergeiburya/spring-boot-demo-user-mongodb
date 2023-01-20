
<h2 align="center">DEMO API USER WITH Mongo DB</h2>

### Description:
This is a simple demo application that implements user management. 
The application has the ability to create, modify, delete, or display a list of all users stored in the Mongo database.
To manage users, use Postman with the following addresses:
* GET -  http://localhost:8080/users  - get list all users
* POST - http://localhost:8080/users/add-user - save new user to database
* PUT -  http://localhost:8080/users/id - update data user by id  saved in DB
* DELETE - http://localhost:8080/users/id - delete user by id
  
Use JSON query format to create and update a user.




### Project structure.
* Repository - Data Access Layer
* DTO - Data Transfer Object
* Service - Application logic layer
* Controllers - Presentation layer

### Languages and Tools:
![Java](https://img.shields.io/badge/Java-%23ED8B00.svg?style=java&logo=java&logoColor=white)
![MongoDB](https://img.shields.io/badge/MongoDB-%234ea94b.svg?style=MondoDb&logo=mongodb&logoColor=white)
![Spring](https://img.shields.io/badge/Spring-9ACD32?style=flat&logo=Spring&logoColor=F8F8FF)
![Maven](https://img.shields.io/badge/Maven-F8F8FF?style=flat&logo=apachemaven&logoColor=F4A460)
![Git](https://img.shields.io/badge/Git-F8F8FF?style=flat&logo=Git&logoColor=FF0000)
![Hibernate](https://img.shields.io/badge/Hibernate-FFD700?style=flat&logo=Hibernate&logoColor=808080)
![Apache Tomcat](https://img.shields.io/badge/apache%20tomcat-%23F8DC75.svg?style=apache&logo=apache-tomcat&logoColor=black)
![Docker](https://img.shields.io/badge/docker-%230db7ed.svg?style=Docker&logo=docker&logoColor=white)


### Quick Start:
1. Clone the [repository](https://github.com/sergeiburya/spring-boot-demo-user-mongodb)
2. Install MongoDB
3. Install Postman
4. Set the necessary database connection settings in the file [src/main/resources/application.properties](src/main/resources/application.properties)   
5. Run application
6. Start Postman and create a request using the link (see above).

### About me
I am a beginner java developer, you can learn more about me on my page - [Serhii Buria](https://github.com/sergeiburya).
