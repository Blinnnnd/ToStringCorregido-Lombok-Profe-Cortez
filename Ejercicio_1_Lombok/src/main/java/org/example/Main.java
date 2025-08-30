package org.example;
import lombok.*;
@Data
@Builder


public class Main {
    public static void main(String[] args) {

        Domicilio CasaN1= Domicilio.builder()
                .calle("Las Peñas")
                .numero(181)
                .build();

        Persona Joaco= Persona.builder()
                .nombre("Joaco")
                .edad(21)
                .domicilio(CasaN1)
                .build();

        CasaN1.setResidente(Joaco);
        System.out.println(Joaco);
    }
}