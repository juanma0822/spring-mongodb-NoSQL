package com.juanma.library.controllers.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookResponse {
    @JsonProperty
    private String id;
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
