<<<<<<< HEAD
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
│   │     └── cat
│   │         └── itacademy
│   │            └── s04
│   │                  └── t02
│   │                     └── n03
│   │                          ├── S04T02N03Application.java
│   │                          ├── controller
│   │                          │   └── FruitController.java
│   │                          ├── exception
│   │                          │   ├── FruitDoesntExistException.java
│   │                          │   └── FruitNotFoundException.java
│   │                          ├── model
│   │                          │   └── Fruit.java
│   │                          ├── repository
│   │                          │   └── FruitRepository.java
│   │                          └── service
│   │                              └── FruitService.java
│   │   
│   │       

## 🚀 Endpoints disponibles
| Método HTTP | Endpoint                 | Descripción                         |
|------------|-------------------------|-------------------------------------|
| POST       | `/fruita/add`            | Agrega una nueva fruta             |
| PUT        | `/fruita/update/{id}`         | Actualiza una fruta existente      |
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
=======
# Spring Boot - Ejercicios Maven, Gradle y Postman

Este repositorio contiene los ejercicios de Spring Boot utilizando Maven y Gradle como gestores de dependencias, así como las pruebas realizadas con Postman.

## 📌 Contenido

El proyecto se divide en tres niveles:

### 🏆 Nivel 1 - Spring Boot con Maven

- Creación de un proyecto Spring Boot con Maven.
- Implementación de una API REST con un controlador `HelloWorldController`.
- Configuración del puerto en `application.properties` (9000).
- Práctica de comandos básicos de Maven.
- Enlace a recursos útiles utilizados durante el desarrollo.

**Endpoints:**
```
GET http://localhost:9000/HelloWorld (RequestParam "nom" por defecto "UNKNOWN")
GET http://localhost:9000/HelloWorld?nom=ElMeuNom
GET http://localhost:9000/HelloWorld2 (PathVariable opcional)
GET http://localhost:9000/HelloWorld2/ElMeuNom
```

**Comandos Maven:**
```
mvn compile      # Compilar el proyecto
mvn package      # Empaquetar el proyecto
mvn clean        # Limpiar el proyecto
mvn spring-boot:run # Ejecutar la aplicación
```

### 🏆 Nivel 2 - Spring Boot con Gradle

- Creación de un proyecto Spring Boot con Gradle.
- Implementación de la misma API REST con `HelloWorldController`.
- Configuración del puerto en `application.properties` (9001).
- Práctica de comandos básicos de Gradle.
- Enlace a recursos útiles utilizados durante el desarrollo.

**Endpoints:**
```
GET http://localhost:9001/HelloWorld (RequestParam "nom" por defecto "UNKNOWN")
GET http://localhost:9001/HelloWorld?nom=ElMeuNom
GET http://localhost:9001/HelloWorld2 (PathVariable opcional)
GET http://localhost:9001/HelloWorld2/ElMeuNom
```

**Comandos Gradle:**
```
gradle build      # Compilar el proyecto
gradle assemble   # Empaquetar el proyecto
gradle clean      # Limpiar el proyecto
gradle bootRun    # Ejecutar la aplicación
```

### 🏆 Nivel 3 - Postman

- Creación de dos entornos en Postman:
  - **Proyecto Maven** (servidor: `http://localhost`, puerto: `9000`).
  - **Proyecto Gradle** (servidor: `http://localhost`, puerto: `9001`).
- Ejecución de pruebas de las API REST mediante Postman.
- Exportación y entrega de los entornos en formato JSON.
- Capturas de pantalla demostrando las ejecuciones correctas.

## 📂 Estructura del repositorio

```
/
├── S04T01N01/                 # Proyecto Maven
│   ├── src/
│   ├── pom.xml
│   ├── application.properties
│   ├── README.md
│   └── ...
│
├── S04T01N02/                 # Proyecto Gradle
│   ├── src/
│   ├── build.gradle
│   ├── application.properties
│   ├── README.md
│   └── ...
│
├── postman/
│   ├── ProyectoMaven.postman_environment.json
│   ├── ProyectoGradle.postman_environment.json
│   ├── captura_postman_maven.png
│   ├── captura_postman_gradle.png
│   └── ...
│
└── README.md                  # Documentación general
```

## 📖 Recursos Utilizados

Además del código, se han utilizado varios recursos del campus para resolver la tarea. Algunos de ellos son:

1. [Documentación oficial de Spring Boot](https://spring.io/projects/spring-boot)
2. [Guía de uso de Maven](https://maven.apache.org/guides/)
3. [Guía de uso de Gradle](https://docs.gradle.org/current/userguide/userguide.html)

## 🚀 Instalación y Ejecución

### 1️⃣ Clonar el repositorio
```
git clone https://github.com/tu_usuario/tu_repositorio.git
cd tu_repositorio
```

### 2️⃣ Ejecutar el proyecto Maven
```
cd S04T01N01
mvn spring-boot:run
```

### 3️⃣ Ejecutar el proyecto Gradle
```
cd S04T01N02
gradle bootRun
```

### 4️⃣ Probar con Postman

- Importar los entornos JSON.
- Ejecutar las peticiones desde Postman.
- Revisar las respuestas esperadas.
>>>>>>> S4T1-branch

