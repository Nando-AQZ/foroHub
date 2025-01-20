# API REST de Foro con Spring Boot

Este proyecto consiste en la creación de una API REST para un sistema de foros, desarrollado utilizando Spring Boot y MySQL.

## Funcionalidades
- **CRUD de usuarios**: Crear, leer, actualizar y eliminar usuarios.
- **CRUD de publicaciones**: Crear, leer, actualizar y eliminar publicaciones.
- **Autenticación y autorización**: Implementación de seguridad con Spring Security.
- **Gestión de comentarios**: Permitir comentarios en las publicaciones.

## Tecnologías utilizadas
- **Backend**: Spring Boot
- **Base de datos**: MySQL
- **Seguridad**: Spring Security
- **Pruebas de la API**: Insomnia

## Estructura del proyecto
El proyecto sigue la arquitectura MVC (Modelo-Vista-Controlador) con las siguientes capas:
- **Controladores**: Gestión de las solicitudes HTTP.
- **Servicios**: Contienen la lógica de negocio.
- **Repositorios**: Manejan las operaciones con la base de datos.

## Requisitos previos
- Tener instalado Java 17 o superior.
- Tener configurada una base de datos MySQL.
- Insomnia o Postman para probar la API.

## Cómo ejecutar el proyecto
1. Clona este repositorio:
   ```bash
   git clone https://github.com/Nando-AQZ/foroHub.git
   ```
2. Accede al directorio del proyecto:
   ```bash
   cd repo-foro
   ```
3. Configura las credenciales de la base de datos en el archivo `application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/nombre_base_datos
   spring.datasource.username=usuario
   spring.datasource.password=contraseña
   ```
4. Ejecuta el proyecto:
   ```bash
   ./mvnw spring-boot:run
   ```
5. Accede a la API en `http://localhost:8080`.

## Endpoints principales
- **/usuarios**: CRUD de usuarios.
- **/publicaciones**: CRUD de publicaciones.
- **/login**: Autenticación de usuarios.

## Captura de pantalla
_._![post a foros](https://github.com/user-attachments/assets/d4fd6152-d4f9-4fb0-a5b0-6460361627ef)


## Contribuciones
Las contribuciones son bienvenidas. Si tienes ideas para mejorar este proyecto, no dudes en abrir un issue o enviar un pull request.

---

Cualquier duda o consulta, contáctame a través de mi correo electrónico o crea un issue en este repositorio.
