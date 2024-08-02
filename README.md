# Products REST API

This is a Spring Boot-based REST API for managing products. It provides CRUD operations for handling product data. 

## Table of Contents
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Installation](#installation)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)
- [Contributing](#contributing)
- [License](#license)

## Features
- Create, Read, Update, and Delete products
- Use of Spring Data JPA for database interactions
- RESTful endpoints for product management

## Technologies Used
- Java
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Maven

## Installation

1. **Clone the repository:**
   ```bash
   git clone https://github.com/yourusername/products-rest-api.git
   cd products-rest-api
   ```

2. **Configure the database:**
   Update the `application.properties` file with your PostgreSQL database configuration.
   ```properties
   spring.application.name=Products-REST-API
   spring.datasource.url=jdbc:postgresql://localhost:5432/productsdb
   spring.datasource.username=postgres
   spring.datasource.password=admin
   ```

3. **Build the project:**
   ```bash
   mvn clean install
   ```

4. **Run the application:**
   ```bash
   mvn spring-boot:run
   ```

## Usage
Once the application is running, you can access the API at `http://localhost:8080`. Use tools like Postman or cURL to interact with the API.

## API Endpoints

- **Get all products:**
  ```http
  GET /products
  ```

- **Get product by ID:**
  ```http
  GET /products/{id}
  ```

- **Create a new product:**
  ```http
  POST /products
  ```
  **Request body:**
  ```json
  {
    "name": "Product Name",
    "description": "Product Description",
    "price": 99.99
  }
  ```

- **Update an existing product:**
  ```http
  PUT /products
  ```
  **Request body:**
  ```json
  {
    "id": 1,
    "name": "Updated Name",
    "description": "Updated Description",
    "price": 89.99
  }
  ```

- **Delete a product:**
  ```http
  DELETE /products/{id}
  ```

## Contributing
Contributions are welcome! Please fork the repository and create a pull request.

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Authors
- Ahmed Sayed

## Acknowledgements
- Spring Boot Documentation
- PostgreSQL Documentation