# CRUD con Spring Boot, H2, MySQL y MongoDB

## Descripción
Este repositorio contiene un proyecto de Spring Boot que implementa una API RESTful para la gestión de una entidad `Fruit`. La aplicación está dividida en tres niveles, cada uno utilizando una base de datos diferente:

- **Nivel 1**: Persistencia en H2 (base de datos en memoria).
- **Nivel 2**: Persistencia en MySQL.
- **Nivel 3**: Persistencia en MongoDB.

El proyecto sigue el patrón MVC (Modelo-Vista-Controlador) y está estructurado en diferentes paquetes según su funcionalidad.

## 📌 Contenido
### 🏆 Nivel 1 - Spring Boot con H2
- Creación de un proyecto Spring Boot con Maven.
- Implementación de una API REST para la entidad `Fruit`.
- Persistencia de datos en una base de datos en memoria H2.
- Configuración de la conexión en `application.properties`.
- Implementación de un `GlobalExceptionHandler` para la gestión de errores.

### 🏆 Nivel 2 - Spring Boot con MySQL
- Adaptación del proyecto del Nivel 1 para persistencia en MySQL.
- Configuración del acceso a la base de datos en `application.properties`.
- Mismas funcionalidades que en el Nivel 1, pero con una base de datos MySQL.

### 🏆 Nivel 3 - Spring Boot con MongoDB
- Adaptación del proyecto para utilizar MongoDB en lugar de una base de datos relacional.
- Uso de Spring Data MongoDB para gestionar la persistencia.
- Configuración de la conexión en `application.properties`.

## 📂 Estructura del proyecto
```
├── src
│   ├── main
│   │   ├── java
│   │   │   └── cat
│   │   │       └── itacademy
│   │   │           └── s04
│   │   │               └── t02
│   │   │                   └── n03
│   │   │                       ├── S04T02N03Application.java
│   │   │                       ├── controller
│   │   │                       │   └── FruitController.java
│   │   │                       ├── exception
│   │   │                       │   ├── FruitDoesntExistException.java
│   │   │                       │   └── FruitNotFoundException.java
│   │   │                       ├── model
│   │   │                       │   └── Fruit.java
│   │   │                       ├── repository
│   │   │                       │   └── FruitRepository.java
│   │   │                       └── service
│   │   │                           └── FruitService.java
│   │   └── resources
│   │       ├── application.properties
```

## 🚀 Endpoints disponibles
| Método HTTP | Endpoint                 | Descripción                         |
|------------|-------------------------|-------------------------------------|
| POST       | `/fruita/add`            | Agrega una nueva fruta             |
| PUT        | `/fruita/update`         | Actualiza una fruta existente      |
| DELETE     | `/fruita/delete/{id}`    | Elimina una fruta por su ID        |
| GET        | `/fruita/getOne/{id}`    | Obtiene una fruta por su ID        |
| GET        | `/fruita/getAll`         | Obtiene todas las frutas           |

## ⚠️ Manejo de excepciones
Se ha implementado un `GlobalExceptionHandler` para gestionar errores de manera centralizada y garantizar respuestas adecuadas ante fallos.

## 🔧 Configuración de bases de datos
- **H2**: Configuración en `application.properties` sin instalación adicional.
- **MySQL**: Requiere configuración de credenciales en `application.properties`.
- **MongoDB**: Necesita un servidor en ejecución y configuración en `application.properties`.

## 📖 Instalación y ejecución
1️⃣ Clonar el repositorio:
   ```bash
   git clone <URL_DEL_REPOSITORIO>
   ```
2️⃣ Entrar en la carpeta del proyecto:
   ```bash
   cd S04T02N03
   ```
3️⃣ Ejecutar la aplicación con Maven:
   ```bash
   mvn spring-boot:run
   ```
4️⃣ Acceder a los endpoints en `http://localhost:8080/fruita/`

## 📚 Recursos utilizados
1. [Spring Boot Documentation](https://spring.io/projects/spring-boot)
2. [Guía de Spring Data JPA](https://spring.io/guides/gs/accessing-data-jpa)
3. [Guía de Spring Data MongoDB](https://spring.io/guides/gs/accessing-data-mongodb)

