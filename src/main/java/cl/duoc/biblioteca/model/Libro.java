package cl.duoc.biblioteca.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //genera los getters y setters, toString, equals y hashcode y un constructor con todos los atributos
@AllArgsConstructor //genera un constructor con todos los atributos
@NoArgsConstructor // genera un constructor con todos los atributos 

public class Libro {
    
    private int id;
    private String isbn;
    private String titulo;
    private String editorial;
    private int fechaPublicacion;
    private String autor;

}
