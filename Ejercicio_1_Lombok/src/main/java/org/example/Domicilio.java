package org.example;
import lombok.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString(exclude = "residente")

public class Domicilio {
    private String calle;
    private int numero;
    private Persona residente;
}
