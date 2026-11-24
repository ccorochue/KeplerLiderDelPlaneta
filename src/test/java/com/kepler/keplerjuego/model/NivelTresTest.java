package com.kepler.keplerjuego.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NivelTresTest {

    private NivelTres nivelTres;
    private Planeta planeta;

    @BeforeEach
    void setUp() {
        nivelTres = new NivelTres();
        planeta = new Planeta();
    }

    @Test
    @DisplayName("NivelTres se inicializa con sus metas correctas y 4 eventos de 3 opciones cada uno")
    void configuracionYEventosNivelTres() {
        assertAll(
                () -> assertEquals(3, nivelTres.getNumeroNivel()),
                () -> assertEquals("El asteroide", nivelTres.getNombre()),
                () -> assertEquals(1100, nivelTres.getMetaDinero()),
                () -> assertEquals(90, nivelTres.getMetaSalud()),
                () -> assertEquals(80, nivelTres.getMetaDefensa()),
                () -> assertEquals(3, nivelTres.getLimiteErrores()),
                () -> assertEquals(4, nivelTres.getEventos().size())
        );

        for (CartaEvento evento : nivelTres.getEventos()) {
            assertEquals(3, evento.getOpciones().size(),
                    "Cada evento del Nivel 3 debe tener exactamente 3 opciones");
        }
    }

    @Test
    @DisplayName("verificarVictoria valida las metas exigentes del Nivel 3")
    void verificarVictoria() {
        planeta.setDinero(1099);
        planeta.setSalud(90);
        planeta.setDefensa(80);
        assertFalse(nivelTres.verificarVictoria(planeta));

        planeta.setDinero(1100);
        assertTrue(nivelTres.verificarVictoria(planeta));
    }

    @Test
    @DisplayName("verificarDesastre se activa cuando la salud llega a 0")
    void verificarDesastre() {
        assertFalse(nivelTres.verificarDesastre(planeta));

        planeta.modificarSalud(-80);
        assertTrue(nivelTres.verificarDesastre(planeta));
    }
}