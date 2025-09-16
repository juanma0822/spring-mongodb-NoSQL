package com.juanma.library.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Libros")
public class Book {
    @Id
    private String id;
    private String title;
    private String author;
    private String genero;
    private String editorial;
    private String anio_publicacion;
    private String sinopsis;
    private String disponible;


}
