# Employee Management System

Full-stack Employee Management application built for Graduate Trainee Assessment (February 2026).

**Backend**: Spring Boot 3.3+ (Java 17)  
**Frontend**: Vanilla HTML + CSS + JavaScript (Fetch API)  
**Database**: H2 in-memory (with console enabled)

Supports complete **CRUD** operations on employee records with proper validation, layered architecture, custom exceptions, and global error handling.

## Features Implemented

- RESTful API endpoints: `/api/employees` (POST, GET, GET/{id}, PUT/{id}, DELETE/{id})
- Correct HTTP status codes (201, 200, 404, 204, 400)
- Bean Validation: `@NotBlank`, `@Email`, `@Positive`
- Unique email constraint
- Custom `ResourceNotFoundException` + `@ControllerAdvice` global handler
- Consistent JSON error responses
- Service layer with business logic & dependency injection
- JPA Repository with custom query (`findByDepartment`)
- Layered architecture (Controller → Service → Repository)
- Dynamic frontend: Add/Edit form + table with Edit/Delete buttons
- No page refresh on CRUD operations
- H2 console for database inspection

## Project Structure
employeemanagement/
├── src/
│   ├── main/
│   │   ├── java/com/company/employeemanagement/
│   │   │   ├── controller/
│   │   │   ├── service/
│   │   │   ├── repository/
│   │   │   ├── model/
│   │   │   ├── exception/
│   │   │   └── EmployeemanagementApplication.java
│   │   └── resources/
│   │       ├── application.properties
│   │       └── static/
│   │           └── index.html          ← Frontend
│   └── test/
├── pom.xml
└── README.md

## Prerequisites

- Java 17 (JDK 17)
- Maven 3.6+
- IntelliJ IDEA (or any IDE with Maven support)
- Modern web browser

## How to Run

### 1. Open the project

In IntelliJ IDEA:
- File → Open → select the project folder

### 2. Sync Maven dependencies

- Wait for auto-import prompt → click **Import Changes**
- Or: Right-click `pom.xml` → Maven → Reload project

### 3. Set JDK 17 (if needed)

- File → Project Structure → Project
- SDK → 17 (Eclipse Temurin / Microsoft / Zulu recommended)

### 4. Run the application

**Easiest way (IntelliJ)**:
- Open `EmployeemanagementApplication.java`
- Click green play button next to `main` method  
  or right-click → Run 'EmployeemanagementApplication'

**Terminal way**:
```bash
mvn spring-boot:run
```
Server starts at: http://localhost:8080
