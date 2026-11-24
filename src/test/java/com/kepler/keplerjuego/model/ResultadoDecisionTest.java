package com.kepler.keplerjuego.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResultadoDecisionTest {

    @Test
    @DisplayName("Almacena correctamente la opción elegida y el estado de la partida")
    void almacenarOpcionYEstado() {
        CartaOpcion opcion = new CartaOpcion(
                "Domos térmicos",
                "Instalar domos protectores.",
                "", -150, 10, 10, "MEJOR"
        );
        ResultadoDecision resultado = new ResultadoDecision(opcion, "CONTINUA");

        assertAll(
                () -> assertSame(opcion, resultado.getOpcionElegida()),
                () -> assertEquals("CONTINUA", resultado.getEstado())
        );
    }

    @Test
    @DisplayName("getTitulo devuelve '¡Genial!' cuando la opción es MEJOR o BUENA")
    void tituloParaOpcionesPositivas() {
        CartaOpcion opcionMejor = new CartaOpcion("Domos", "Desc", "", -150, 10, 10, "MEJOR");
        CartaOpcion opcionBuena = new CartaOpcion("Lonas", "Desc", "", -50, 5, 0, "BUENA");

        ResultadoDecision resMejor = new ResultadoDecision(opcionMejor, "CONTINUA");
        ResultadoDecision resBuena = new ResultadoDecision(opcionBuena, "NIVEL_COMPLETADO");

        assertAll(
                () -> assertEquals("¡Genial!", resMejor.getTitulo()),
                () -> assertEquals("¡Genial!", resBuena.getTitulo())
        );
    }

    @Test
    @DisplayName("getTitulo devuelve 'Las cosas empeoraron' cuando la opción es MALA")
    void tituloParaOpcionMala() {
        CartaOpcion opcionMala = new CartaOpcion("Ignorar tormenta", "Desc", "", 0, -20, 0, "MALA");
        ResultadoDecision resultado = new ResultadoDecision(opcionMala, "DESASTRE");

        assertEquals("Las cosas empeoraron", resultado.getTitulo());
    }

    @Test
    @DisplayName("getMensaje devuelve exactamente el resumen de la CartaOpcion elegida")
    void mensajeDevuelveResumenDeOpcion() {
        CartaOpcion opcion = new CartaOpcion("Escudo magnético", "Desc", "", -150, 5, 15, "MEJOR");
        ResultadoDecision resultado = new ResultadoDecision(opcion, "CONTINUA");

        assertEquals(opcion.obtenerResumen(), resultado.getMensaje());
    }
}