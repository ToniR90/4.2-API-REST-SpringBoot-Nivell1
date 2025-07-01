# 🍍 4.2.1 – Fruit API REST with Spring Boot and H2 persistance

This project is a Spring Boot REST API that manages fruits. It allows you to create, read, update, and delete fruit entries (CRUD) using HTTP requests. It includes validation logic using `@Valid` to ensure data integrity.

---

## 📦 Project Structure

- `model` → Defines the `Fruit` entity
- `dto` → Contains the `FruitRequest` class for incoming data
- `controller` → Handles HTTP requests (REST controller)
- `service` → Business logic layer (mocked in tests)
- `repository` → JPA repository interface for data persistence
- `exception` → Custom exceptions and validation error handler

---

## 🧪 Testing Overview

The controller layer is fully tested using `MockMvc`:

- ✅ `GET /fruits` — List all fruits
- ✅ `GET /fruits/{id}` — Retrieve a single fruit
- ✅ `POST /fruits` — Add a new fruit (with validation)
- ✅ `PUT /fruits/{id}` — Update existing fruit
- ✅ `DELETE /fruits/{id}` — Delete a fruit
- ❗ Validation test for invalid input (`400 Bad Request`)

---

## 🚀 How to Run

1. Clone the repository: https://github.com/ToniR90/4.2-API-REST-SpringBoot-Nivell1.git
2. Run with:
   ```bash
   ./mvnw spring-boot:run
   ```
   ---

## 📬 Sample JSON Request
```bash
{
  "name": "Strawberry",
  "quantity": 12
}
```
---

## 🎯 Learning Goals

- Use of `@RestController`, `@RequestBody`, `@PathVariable`
- Validation with `@Valid`, `@NotBlank`, and `@Min`
- Unit testing using Mockito + MockMvc
- Test-driven development and validation of edge cases

---

## ⚙️ Technologies Used
- Java 21
- Spring Boot 3.x
- Spring Web + Spring Data JPA
- H2 In-memory Database
- JUnit 5 + Mockito
- Maven

---

## 🌐 Usefull resources

- https://www.baeldung.com/spring-component-repository-service

`Spring annotations`


- https://www.baeldung.com/spring-boot-h2-database

- `Spring with H2 persistance`


   
