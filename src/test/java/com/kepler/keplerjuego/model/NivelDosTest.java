package com.kepler.keplerjuego.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NivelDosTest {

    private NivelDos nivelDos;
    private Planeta planeta;

    @BeforeEach
    void setUp() {
        nivelDos = new NivelDos();
        planeta = new Planeta();
    }

    @Test
    @DisplayName("NivelDos se inicializa con sus metas correctas y 4 eventos de 3 opciones cada uno")
    void configuracionYEventosNivelDos() {
        assertAll(
                () -> assertEquals(2, nivelDos.getNumeroNivel()),
                () -> assertEquals("La epidemia", nivelDos.getNombre()),
                () -> assertEquals(900, nivelDos.getMetaDinero()),
                () -> assertEquals(90, nivelDos.getMetaSalud()),
                () -> assertEquals(45, nivelDos.getMetaDefensa()),
                () -> assertEquals(3, nivelDos.getLimiteErrores()),
                () -> assertEquals(4, nivelDos.getEventos().size())
        );

        for (CartaEvento evento : nivelDos.getEventos()) {
            assertEquals(3, evento.getOpciones().size(),
                    "Cada evento del Nivel 2 debe tener exactamente 3 opciones");
        }
    }

    @Test
    @DisplayName("verificarVictoria valida las metas del Nivel 2")
    void verificarVictoria() {
        planeta.setDinero(900);
        planeta.setSalud(89);
        planeta.setDefensa(45);
        assertFalse(nivelDos.verificarVictoria(planeta));

        planeta.setSalud(90);
        assertTrue(nivelDos.verificarVictoria(planeta));
    }

    @Test
    @DisplayName("verificarDesastre se activa por salud en 0 o 3 errores")
    void verificarDesastre() {
        assertFalse(nivelDos.verificarDesastre(planeta));

        planeta.registrarError();
        planeta.registrarError();
        planeta.registrarError();
        assertTrue(nivelDos.verificarDesastre(planeta));

        planeta.setSalud(0);
        assertTrue(nivelDos.verificarDesastre(planeta));
    }
}