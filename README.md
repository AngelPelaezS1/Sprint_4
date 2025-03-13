🥭 CRUD de Frutas con Spring Boot

Este proyecto implementa una API REST para la gestión de frutas utilizando Spring Boot y diferentes bases de datos. Se divide en tres niveles:

📌 Niveles del Proyecto

🏆 Nivel 1 - Base de datos en memoria H2.
🏆 Nivel 2 - Base de datos relacional MySQL.
🏆 Nivel 3 - Base de datos NoSQL MongoDB.
📂 Estructura del Proyecto

src
│── main
│   ├── java
│   │   └── cat.itacademy.s04.t02.n01
│   │       ├── controller      # Controladores REST
│   │       ├── exception       # Manejadores de excepciones
│   │       ├── model           # Clases de modelo (entidades)
│   │       ├── repository      # Interfaces de repositorio
│   │       ├── services        # Lógica de negocio
│   │       └── S04T02N01Application.java  # Clase principal
│   ├── resources
│   │   ├── application.properties  # Configuración
│   │   ├── static                  # Archivos estáticos
│   │   └── templates               # Plantillas Thymeleaf (si aplica)
🚀 Instalación y Configuración

🏆 Nivel 1 - Base de datos H2 (En memoria)
Este nivel no requiere configuración adicional de base de datos. En application.properties solo es necesario definir el nombre de la aplicación:

spring.application.name=S04T02N01
🏆 Nivel 2 - Base de datos MySQL
Para usar MySQL, asegúrate de que la base de datos está creada y configurada correctamente. Luego, usa la siguiente configuración en application.properties:

spring.application.name=S04T02N02
spring.datasource.url=jdbc:mysql://localhost:3306/fruit?serverTimezone=Europe/Madrid
spring.datasource.username=root
spring.datasource.password=
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
Si necesitas crear la base de datos en MySQL, usa estos comandos:

CREATE DATABASE fruit;
USE fruit;
🏆 Nivel 3 - Base de datos MongoDB
Para utilizar MongoDB, asegúrate de que el servidor esté corriendo y configura application.properties de la siguiente manera:

spring.application.name=S04T02N03
spring.data.mongodb.uri=mongodb://localhost:27017/fruitdb
Si estás usando Docker, puedes levantar MongoDB con:

docker run -d -p 27017:27017 --name mongo_container mongo
📌 Endpoints Disponibles

Método HTTP	Endpoint	Descripción
POST	/fruita/add	Agregar una nueva fruta
PUT	/fruita/update/{id}	Actualizar una fruta existente
DELETE	/fruita/delete/{id}	Eliminar una fruta por ID
GET	/fruita/getOne/{id}	Obtener una fruta por ID
GET	/fruita/getAll	Obtener todas las frutas
🛠 Cómo Ejecutar el Proyecto

1️⃣ Clonar el repositorio
git clone https://github.com/tu-usuario/tu-repositorio.git
cd tu-repositorio
2️⃣ Construir el proyecto con Maven
mvn clean package
3️⃣ Ejecutar la aplicación
mvn spring-boot:run
4️⃣ Probar los endpoints con Postman o cURL
📚 Recursos de Apoyo

Spring Boot Reference Guide
Spring Data JPA
Spring Data MongoDB
📜 Licencia

Este proyecto está bajo la licencia MIT. ¡Siéntete libre de contribuir y mejorar!
