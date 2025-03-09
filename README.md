🥭 CRUD de Frutas con Spring Boot

Este proyecto implementa una API REST para la gestión de frutas utilizando Spring Boot y diferentes bases de datos. Se divide en tres niveles:

Nivel 1: Base de datos en memoria H2.
Nivel 2: Base de datos relacional MySQL.
Nivel 3: Base de datos NoSQL MongoDB.
📂 Estructura del Proyecto
src
│── main
│   ├── java
│   │   └── cat.itacademy.s04.t02.n01
│   │       ├── controller       # Controladores REST
│   │       ├── exception         # Manejadores de excepciones
│   │       ├── model             # Clases de modelo (entidades)
│   │       ├── repository        # Interfaces de repositorio
│   │       ├── services          # Lógica de negocio
│   │       └── S04T02N01Application.java  # Clase principal
│   ├── resources
│   │   ├── application.properties  # Configuración
│   │   ├── static                  # Archivos estáticos
│   │   └── templates               # Plantillas Thymeleaf (si aplica)
