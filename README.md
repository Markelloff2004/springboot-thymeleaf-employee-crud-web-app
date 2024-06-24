# Spring Boot Thymeleaf Employee CRUD Web App

This project is a simple CRUD (Create, Read, Update, Delete) web application for managing employee records. It is built using Spring Boot and Thymeleaf. The application demonstrates basic CRUD operations with a web interface and is intended for educational purposes to help understand the integration of Spring Boot and Thymeleaf.

## Features

- Add new employees
- View a list of all employees
- Update existing employee information
- Delete employees

## Technologies Used

- Java
- Spring Boot
- Thymeleaf
- Spring Data JPA
- H2 Database
- Maven

## Getting Started

### Prerequisites

- JDK 11 or later
- Maven 3.6.0 or later

### Installation

1. Clone the repository:
    ```bash
    git clone https://github.com/Markelloff2004/springboot-thymeleaf-employee-crud-web-app.git
    cd springboot-thymeleaf-employee-crud-web-app
    ```

2. Build the project using Maven:
    ```bash
    mvn clean install
    ```

3. Run the application:
    ```bash
    mvn spring-boot:run
    ```

The application will start on `http://localhost:8080`.

### Configuration

The application uses the H2 in-memory database by default. You can access the H2 database console at `http://localhost:8080/h2-console` with the following settings:

- JDBC URL: `jdbc:h2:mem:testdb`
- Username: `sa`
- Password: `password`

## Usage

1. Open your web browser and go to `http://localhost:8080`.
2. You will see the home page with a list of employees.
3. Use the navigation links to add a new employee, edit existing employee details, or delete an employee.

## Project Structure

- `src/main/java`: Contains the Java source files
    - `com.example.demo`: Main package containing the Spring Boot application
    - `com.example.demo.controller`: Contains web controllers
    - `com.example.demo.model`: Contains the data model
    - `com.example.demo.repository`: Contains the repository interfaces
    - `com.example.demo.service`: Contains the service layer
- `src/main/resources`: Contains the application resources
    - `templates`: Contains Thymeleaf templates
    - `application.properties`: Spring Boot configuration file

## Contributing

Contributions are welcome! Please fork the repository and create a pull request with your changes. Ensure that your code adheres to the existing style and conventions and includes appropriate tests.

1. Fork the repository
2. Create a new feature branch:
    ```bash
    git checkout -b feature/your-feature-name
    ```
3. Commit your changes:
    ```bash
    git commit -m 'Add some feature'
    ```
4. Push to the branch:
    ```bash
    git push origin feature/your-feature-name
    ```
5. Open a pull request

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more details.

## Acknowledgements

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Thymeleaf](https://www.thymeleaf.org/)
- [H2 Database](http://www.h2database.com/html/main.html)

