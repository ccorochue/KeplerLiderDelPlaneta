package com.kepler.keplerjuego.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CartaEventoTest {

    private CartaEvento evento;

    @BeforeEach
    void setUp() {
        evento = new CartaEvento(
                "Granizada Inesperada",
                "Tormenta de granizo sobre los cultivos.",
                "/com/kepler/keplerjuego/view/images/evento_granizada.png"
        );
    }

    @Test
    @DisplayName("Un evento recién creado inicia con su información básica y sin opciones")
    void estadoInicialEvento() {
        assertAll(
                () -> assertEquals("Granizada Inesperada", evento.getTitulo()),
                () -> assertEquals("Tormenta de granizo sobre los cultivos.", evento.getDescripcion()),
                () -> assertEquals("/com/kepler/keplerjuego/view/images/evento_granizada.png", evento.getRutaImagen()),
                () -> assertTrue(evento.getOpciones().isEmpty())
        );
    }

    @Test
    @DisplayName("agregarOpcion añade opciones correctamente y actualiza obtenerResumen")
    void agregarOpcionesYResumen() {
        assertEquals("Evento: Granizada Inesperada (0 opciones disponibles)", evento.obtenerResumen());

        CartaOpcion op1 = new CartaOpcion("Domos", "Desc", "", -150, 10, 10, "MEJOR");
        CartaOpcion op2 = new CartaOpcion("Ignorar", "Desc", "", 0, -20, 0, "MALA");

        evento.agregarOpcion(op1);
        evento.agregarOpcion(op2);

        assertAll(
                () -> assertEquals(2, evento.getOpciones().size()),
                () -> assertSame(op1, evento.getOpciones().getFirst()),
                () -> assertEquals("Evento: Granizada Inesperada (2 opciones disponibles)", evento.obtenerResumen())
        );
    }
}