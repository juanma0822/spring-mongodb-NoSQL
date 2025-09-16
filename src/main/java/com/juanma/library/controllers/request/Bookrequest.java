package com.juanma.library.controllers.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Bookrequest {
    @JsonProperty
    private String title;
    @JsonProperty
    private String sinopsis;
    @JsonProperty
    private String genero;
    @JsonProperty
    private String author;
    @JsonProperty
    private String editorial;
    @JsonProperty
    private String anio_publicacion;
}
