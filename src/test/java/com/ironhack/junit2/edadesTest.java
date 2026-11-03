package com.ironhack.junit2;

import static org.junit.jupiter.api.Assertions.*; //importar todas las assertions

import org.junit.jupiter.api.Test;

public class edadesTest {

    @Test
    public void probandoMediaEdades() {

        int edadPadre = 70;
        int edadMadre = 65;

        double edadMedia = (float) (70 + 65) / 2;

        assertAll(
                () -> assertEquals(67.5, edadMedia, "la media debe ser 67.5 años"),
                () -> assertTrue(edadMedia < edadPadre, "la edad media debe ser menor que el mayor de los dos"),
                () -> assertNotNull(edadMedia, "la media no debe ser null"),
                () -> assertFalse(edadMedia<0, "la media no puede ser negativa")
         );

    }

}
