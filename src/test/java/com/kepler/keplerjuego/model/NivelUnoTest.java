package com.kepler.keplerjuego.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NivelUnoTest {

    private NivelUno nivelUno;
    private Planeta planeta;

    @BeforeEach
    void setUp() {
        nivelUno = new NivelUno();
        planeta = new Planeta();
    }

    @Test
    @DisplayName("NivelUno se inicializa con sus metas correctas y 4 eventos de 3 opciones cada uno")
    void configuracionYEventosNivelUno() {
        assertAll(
                () -> assertEquals(1, nivelUno.getNumeroNivel()),
                () -> assertEquals("Crecer", nivelUno.getNombre()),
                () -> assertEquals(700, nivelUno.getMetaDinero()),
                () -> assertEquals(85, nivelUno.getMetaSalud()),
                () -> assertEquals(20, nivelUno.getMetaDefensa()),
                () -> assertEquals(3, nivelUno.getLimiteErrores()),
                () -> assertEquals(4, nivelUno.getEventos().size())
        );

        for (CartaEvento evento : nivelUno.getEventos()) {
            assertEquals(3, evento.getOpciones().size(),
                    "Cada evento del Nivel 1 debe tener exactamente 3 opciones");
        }
    }

    @Test
    @DisplayName("verificarVictoria es true solo cuando dinero, salud y defensa alcanzan las metas")
    void verificarVictoria() {
        assertFalse(nivelUno.verificarVictoria(planeta));

        // Falta defensa
        planeta.setDinero(700);
        planeta.setSalud(85);
        planeta.setDefensa(19);
        assertFalse(nivelUno.verificarVictoria(planeta));

        // Cumple exactamente las tres metas
        planeta.setDefensa(20);
        assertTrue(nivelUno.verificarVictoria(planeta));
    }

    @Test
    @DisplayName("verificarDesastre es true si la salud llega a 0 o se alcanza el límite de 3 errores")
    void verificarDesastre() {
        assertFalse(nivelUno.verificarDesastre(planeta));

        // Desastre por salud en 0
        planeta.setSalud(0);
        assertTrue(nivelUno.verificarDesastre(planeta));

        // Desastre por límite de errores
        Planeta planetaConErrores = new Planeta();
        planetaConErrores.registrarError();
        planetaConErrores.registrarError();
        assertFalse(nivelUno.verificarDesastre(planetaConErrores));

        planetaConErrores.registrarError();
        assertTrue(nivelUno.verificarDesastre(planetaConErrores));
    }
}