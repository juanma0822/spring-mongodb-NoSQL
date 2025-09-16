# 📖 Library API

API RESTful desarrollada en **Spring Boot** con **MongoDB**, que permite la gestión de libros (crear, listar, buscar, actualizar y eliminar).

---

## 🚀 Tecnologías usadas
- **Java 21**
- **Spring Boot 3.5.5**
- **MongoDB**
- **Gradle**
- **Lombok**
- **Springdoc OpenAPI (Swagger UI)**

---

## ⚙️ Instalación y ejecución

1. **Clonar el repositorio:**
   ```bash
   git clone https://github.com/TU-USUARIO/library.git
   cd library
Compilar y ejecutar con Gradle:

bash
Copiar código
./gradlew bootRun
En Windows: gradlew.bat bootRun

La aplicación corre en:

arduino
Copiar código
http://localhost:8080
Documentación de la API (Swagger UI):

bash
Copiar código
http://localhost:8080/swagger-ui/index.html
📚 Endpoints principales
Libros
POST /create → Crear un libro

GET /books → Listar todos los libros

GET /books/{id} → Buscar libro por ID

PUT /books/{id} → Actualizar libro por ID

DELETE /books/{id} → Eliminar libro por ID

🛠️ Ejemplo de JSON para crear un libro
json
Copiar código
{
  "title": "Clean Code",
  "sinopsis": "A Handbook of Agile Software Craftsmanship",
  "genero": "Programming",
  "author": "Robert C. Martin",
  "editorial": "Prentice Hall",
  "anio_publicacion": "2008"
}
👨‍💻 Autor
Proyecto desarrollado por Juan Manuel Valencia
📌 Ingeniería de Sistemas
