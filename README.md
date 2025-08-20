# ForoHub - API REST para Sistema de Foros

## 🚀 Acerca del Proyecto

**ForoHub** es una API REST desarrollada por **María Laureano** que permite gestionar un sistema de foros con autenticación segura. Este proyecto ha sido desarrollado como parte del Challenge de Back-End de Alura Latam, implementando las mejores prácticas de desarrollo de software con Spring Boot.

### Características Principales

- 🔐 Autenticación segura con JWT (JSON Web Tokens)
- 📝 Gestión completa de tópicos del foro (CRUD)
- 🛡️ Protección de endpoints con Spring Security
- 🗃️ Base de datos MySQL con migraciones controladas por Flyway
- 🛠️ Validación de datos de entrada
- 📊 Documentación de la API

## 🛠️ Tecnologías Utilizadas

- **Java 21** - Lenguaje de programación
- **Spring Boot 3** - Framework para aplicaciones Java
- **Spring Security** - Autenticación y autorización
- **Spring Data JPA** - Acceso a datos
- **MySQL** - Base de datos relacional
- **Flyway** - Control de versiones de base de datos
- **Lombok** - Reducción de código boilerplate
- **Maven** - Gestión de dependencias
- **JWT** - Autenticación stateless

## 📋 Requisitos Previos

- Java 17 o superior
- Maven 3.8.6 o superior
- MySQL 8.0 o superior
- Git (opcional, para clonar el repositorio)

## 🚀 Instalación

### 1. Clonar el Repositorio

```bash
git clone https://github.com/tu-usuario/forohub.git
cd forohub
```

### 2. Configurar la Base de Datos

1. Crea una base de datos MySQL llamada `forohub_db`:
   ```sql
   CREATE DATABASE forohub_db;
   ```

2. Configura las credenciales en el archivo `src/main/resources/application.properties` o mediante variables de entorno:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/forohub_db
   spring.datasource.username=tu_usuario
   spring.datasource.password=${DB_PASSWORD}
   ```

### 3. Configurar Variables de Entorno

Establece la contraseña de la base de datos como variable de entorno:

- **Windows (PowerShell):**
  ```powershell
  $env:DB_PASSWORD="tu_contraseña"
  ```

- **Linux/MacOS:**
  ```bash
  export DB_PASSWORD="tu_contraseña"
  ```

### 4. Compilar y Ejecutar la Aplicación

```bash
# Compilar el proyecto
mvn clean install

# Ejecutar la aplicación
mvn spring-boot:run
```

La aplicación estará disponible en: [http://localhost:8090](http://localhost:8090)

## 📚 Documentación de la API

### Autenticación

#### Registrar un nuevo usuario
```http
POST /login
Content-Type: application/json

{
    "login": "usuario@ejemplo.com",
    "password": "contraseña123"
}
```

#### Iniciar sesión (obtener token JWT)
```http
POST /login
Content-Type: application/json

{
    "login": "usuario@ejemplo.com",
    "password": "contraseña123"
}
```

### Tópicos

#### Crear un nuevo tópico
```http
POST /topicos
Authorization: Bearer tu_token_jwt
Content-Type: application/json

{
    "titulo": "Título del tópico",
    "mensaje": "Contenido del mensaje",
    "autor": "Nombre del autor",
    "curso": "Nombre del curso"
}
```

#### Obtener todos los tópicos
```http
GET /topicos
Authorization: Bearer tu_token_jwt
```

#### Obtener un tópico específico
```http
GET /topicos/{id}
Authorization: Bearer tu_token_jwt
```

#### Actualizar un tópico
```http
PUT /topicos/{id}
Authorization: Bearer tu_token_jwt
Content-Type: application/json

{
    "titulo": "Título actualizado",
    "mensaje": "Mensaje actualizado"
}
```

#### Eliminar un tópico
```http
DELETE /topicos/{id}
Authorization: Bearer tu_token_jwt
```

## 🧪 Probando la API

Puedes probar la API usando herramientas como:
- Postman
- cURL
- Thunder Client (extensión de VS Code)

## 📝 Licencia

Este proyecto está bajo la Licencia MIT. Ver el archivo [LICENSE](LICENSE) para más detalles.
