package com.kepler.keplerjuego.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlanetaTest {

    private Planeta planeta;

    @BeforeEach
    void setUp() {
        planeta = new Planeta();
    }

    @Test
    @DisplayName("El planeta inicia con dinero en 500, salud en 80, defensa en 0 y errores en 0")
    void estadoInicialCorrecto() {
        assertAll(
                () -> assertEquals(500, planeta.getDinero()),
                () -> assertEquals(80, planeta.getSalud()),
                () -> assertEquals(0, planeta.getDefensa()),
                () -> assertEquals(0, planeta.getErrores())
        );
    }

    @Test
    @DisplayName("Recibir ingreso de turno suma 200 al dinero actual")
    void recibirIngresoTurno() {
        planeta.recibirIngresoTurno();
        assertEquals(700, planeta.getDinero());
    }

    @Test
    @DisplayName("Modificar dinero suma, resta y nunca permite valores negativos")
    void modificarDineroYLimites() {
        planeta.modificarDinero(150);
        assertEquals(650, planeta.getDinero());

        planeta.modificarDinero(-200);
        assertEquals(450, planeta.getDinero());

        planeta.modificarDinero(-1000);
        assertEquals(0, planeta.getDinero());
    }

    @Test
    @DisplayName("Modificar salud mantiene el valor dentro del rango 0 a 100")
    void modificarSaludYLimites() {
        planeta.modificarSalud(50);
        assertEquals(100, planeta.getSalud());

        planeta.modificarSalud(-30);
        assertEquals(70, planeta.getSalud());

        planeta.modificarSalud(-200);
        assertEquals(0, planeta.getSalud());
    }

    @Test
    @DisplayName("Modificar defensa mantiene el valor dentro del rango 0 a 100")
    void modificarDefensaYLimites() {
        planeta.modificarDefensa(-25);
        assertEquals(0, planeta.getDefensa());

        planeta.modificarDefensa(45);
        assertEquals(45, planeta.getDefensa());

        planeta.modificarDefensa(90);
        assertEquals(100, planeta.getDefensa());
    }

    @Test
    @DisplayName("Registrar errores incrementa el contador y reiniciar lo vuelve a 0")
    void registrarYReiniciarErrores() {
        planeta.registrarError();
        planeta.registrarError();
        assertEquals(2, planeta.getErrores());

        planeta.registrarError();
        assertEquals(3, planeta.getErrores());

        planeta.reiniciarErrores();
        assertEquals(0, planeta.getErrores());
    }
}