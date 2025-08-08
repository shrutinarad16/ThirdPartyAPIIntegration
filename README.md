# Third Party API Integration with Local Database - Spring Boot

![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen)
![REST API](https://img.shields.io/badge/REST-API-blue)
![Status](https://img.shields.io/badge/Status-Active-success)
![License](https://img.shields.io/badge/License-MIT-lightgrey)

---

## 📌 Overview
This project demonstrates **Spring Boot REST API** integration with a **third-party public API** (`https://jsonplaceholder.typicode.com/posts`) while also combining it with **local database data** (via JPA / Hibernate).  
It serves as a **resume-worthy, production-ready** example for:
- API Consumption
- Data Merging
- Clean MVC + Service Layer Architecture
- JSON Handling

---

## ⚙️ Features
✅ Fetch all posts from a third-party API  
✅ Fetch a single post by ID  
✅ Merge remote data with local entity data  
✅ Layered architecture: **Controller → Service → Repository**  
✅ 100% RESTful endpoint design  
✅ Error handling for invalid inputs  
✅ Ready-to-deploy Spring Boot app

---

## 🏗 Tech Stack
- **Java 17**
- **Spring Boot 3.x**
- **Spring Web (REST API)**
- **Spring Data JPA**
- **Maven**
- **JSON Placeholder API** (mock public API)
- **MySQL** (or any relational DB)

---

## 📂 Project Structure
```
ThirdPartyAPIIntegration/
 ├── src/main/java/com/thirdpartyapiintegration/
 │   ├── controller/
 │   │   └── PostController.java      # REST API endpoints
 │   ├── postservice/
 │   │   └── PostService.java         # Business logic
 │   ├── ThirdPartyApiIntegrationApp.java  # Main Spring Boot application
 │
 ├── src/main/resources/
 │   └── application.properties       # App configuration (ignored in Git)
 │
 ├── pom.xml                          # Maven dependencies
 └── README.md                        # Project documentation
```
---
## 🚦 API Endpoints

### 1️⃣ Get All Posts
```http
GET /posts

[
  {
    "id": 1,
    "title": "Post from remote API",
    "body": "Sample post description",
    "localField": "Custom DB value"
  }
]
```

### 2️⃣ Get Post By ID
```GET /posts/{id}
{
  "id": 5,
  "title": "Post from remote API",
  "body": "Detailed post content",
  "localField": "Custom DB value"
}
```
---

## 🔧 Setup & Installation

#### 1. Clone the repository
```
git clone https://github.com/your-username/third-party-api-integration.git
cd third-party-api-integration
```

#### 2. Configure Database
Edit ```src/main/resources/application.properties```
```
spring.datasource.url=jdbc:mysql://localhost:3306/thirdpartyapi
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

#### 3. Run the Application
```
mvn spring-boot:run
```
---
## Contact
Author: **Shruti Narad**

LinkedIn: **linkedin.com/in/shrutinarad16**

Email: **shrutinarad06@gmail.com**

_"Clean code is not just writing less, it's about writing right." _

---
