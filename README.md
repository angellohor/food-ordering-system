# Food Ordering System - Microservices Architecture

This project is a comprehensive **Food Ordering System** built with a microservices architecture. It applies advanced software design principles such as Domain-Driven Design (DDD), Clean Architecture, and Hexagonal Architecture, heavily relying on Event-Driven communication using Apache Kafka.

This repository is developed following a comprehensive guide on modern distributed systems.

## 🚀 Key Patterns & Concepts
- **Microservices Architecture:** Independently deployable services using Spring Boot.
- **Clean Architecture & Hexagonal Architecture:** Isolation of domain logic from external frameworks, using Ports and Adapters.
- **Domain Driven Design (DDD):** Domain-centric approach with bounded contexts, aggregates, entities, and value objects.
- **Event-Driven Architecture:** Services communicate asynchronously using events.
- **SAGA Architecture Pattern:** Managing distributed transactions for data consistency.
- **Outbox Architecture Pattern:** Reliable event publishing.
- **CQRS Architecture Pattern:** Separation of read and write operations.
- **Change Data Capture (CDC):** Database changes captured using Debezium and streamed to Kafka.

## 🛠️ Technology Stack
- **Java & Spring Boot** - Core application framework.
- **Apache Kafka (Confluent)** - Event store and message broker.
- **PostgreSQL** - Relational database for microservices.
- **Docker & Docker Compose** - Local containerization.
- **Kubernetes (K8s)** - Container orchestration (Local & GKE).
- **Debezium** - Change Data Capture (CDC).
- **Google Cloud Platform (GCP) & GKE** - Cloud deployment environment.

## 📂 Project Structure

```
food-ordering-system
├── common/                # Shared domain and application code
├── customer-service/      # Manages customer data and interactions
├── infrastructure/        # Docker compose files for Kafka, Zookeeper, & local setup
├── order-service/         # Core ordering logic, SAGA orchestration
├── payment-service/       # Payment processing logic
└── ...
```

## 🏗️ Course Roadmap & Milestones
- [x] Apply Domain Driven Design (DDD)
- [x] Apply Clean Architecture & Hexagonal Architecture
- [x] Develop Microservices Architecture using Spring Boot and Kafka
- [ ] Implement SAGA Architecture Pattern
- [ ] Implement Outbox Architecture Pattern
- [ ] Implement CQRS Architecture Pattern
- [ ] Run a local Kubernetes cluster using Docker desktop
- [ ] Deploy microservices to local Kubernetes Cluster
- [ ] Run Confluent Kafka on Kubernetes using cp-helm-charts
- [ ] Run Postgres on Kubernetes
- [ ] Deploy microservices to Google Kubernetes Engine (GKE)
- [ ] Implement Change Data Capture (CDC) with Debezium and Kafka

## ⚙️ How to run locally

1. **Start infrastructure (Kafka, Zookeeper, Postgres):**
   Navigate to `infrastructure/docker-compose/` and run:
   ```bash
   docker-compose -f common.yml -f kafka_cluster.yml -f zookeeper.yml up -d
   ```

2. **Build and Run the Microservices:**
   Using Maven, you can compile and start the services (Order Service, Payment Service, Customer Service).
   ```bash
   mvn clean install
   ```

---
*Developed as part of "Develop Microservices Architecture using Spring Boot and Kafka" journey.*

