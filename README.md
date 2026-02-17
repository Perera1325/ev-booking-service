Smart EV Charging Management Platform — Booking Microservice

This project is part of a microservices-based Smart EV Charging Management System developed using Spring Boot and MySQL. The Booking Service manages user charging reservations by linking users with charging stations.

Project Overview

The Booking Service is responsible for:

* Creating charging bookings
* Storing booking details
* Retrieving booking information
* Connecting users and charging stations logically

This microservice will integrate with User Service, Station Service, and WSO2 API Manager in future stages.

Technology Stack

* Java
* Spring Boot
* Spring Data JPA (Hibernate)
* MySQL
* Maven
* REST API

Project Structure

src/main/java/com/ev/booking_service

* controller — REST controllers
* service — Business logic
* repository — Database layer
* entity — JPA entities
* BookingServiceApplication.java — Main application

API Endpoints

Create Booking

POST /bookings

Example Request

{
"userId": 1,
"stationId": 1,
"bookingTime": "2026-02-17 10:00"
}

Get All Bookings

GET /bookings

Database Configuration

Database name: ev_bookings

spring.datasource.url=jdbc:mysql://localhost:3306/ev_bookings
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD

How to Run

Using Maven Wrapper:

./mvnw spring-boot:run

Application runs on:

http://localhost:8083

Future Improvements

* Service-to-service communication
* Integration with WSO2 API Manager
* Authentication using WSO2 Identity Server
* Docker containerization

Author

Vinod Perera
GitHub: https://github.com/Perera1325
