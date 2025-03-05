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

