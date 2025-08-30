package org.example;
import lombok.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString


public class Persona {
    private String nombre;
    private int edad;
    private Domicilio domicilio;
}
