package com.kepler.keplerjuego.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CartaOpcionTest {

    @Test
    @DisplayName("Crea correctamente una CartaOpcion y expone todos sus atributos")
    void crearCartaOpcionCorrectamente() {
        CartaOpcion opcion = new CartaOpcion(
                "Domos térmicos",
                "Instalar domos protectores.",
                "/ruta/imagen.png",
                -150, 10, 15, "MEJOR"
        );

        assertAll(
                () -> assertEquals("Domos térmicos", opcion.getTitulo()),
                () -> assertEquals("Instalar domos protectores.", opcion.getDescripcion()),
                () -> assertEquals("/ruta/imagen.png", opcion.getRutaImagen()),
                () -> assertEquals(-150, opcion.getCambioDinero()),
                () -> assertEquals(10, opcion.getCambioSalud()),
                () -> assertEquals(15, opcion.getCambioDefensa()),
                () -> assertEquals("MEJOR", opcion.getCalidad())
        );
    }

    @Test
    @DisplayName("esMala devuelve true para 'MALA' sin importar mayúsculas y false para otras calidades")
    void verificarSiEsMala() {
        CartaOpcion malaMayus = new CartaOpcion("Ignorar", "Desc", "", 0, -20, 0, "MALA");
        CartaOpcion malaMinus = new CartaOpcion("Ignorar", "Desc", "", 0, -20, 0, "mala");
        CartaOpcion buena = new CartaOpcion("Lonas", "Desc", "", -50, 5, 0, "BUENA");
        CartaOpcion mejor = new CartaOpcion("Domos", "Desc", "", -150, 10, 10, "MEJOR");

        assertAll(
                () -> assertTrue(malaMayus.esMala()),
                () -> assertTrue(malaMinus.esMala()),
                () -> assertFalse(buena.esMala()),
                () -> assertFalse(mejor.esMala())
        );
    }

    @Test
    @DisplayName("obtenerResumen retorna el formato esperado con título, calidad e impactos")
    void obtenerResumenFormatoCorrecto() {
        CartaOpcion opcion = new CartaOpcion("Escudo magnético", "Desc", "", -150, 5, 15, "MEJOR");
        String esperado = "Escudo magnético [MEJOR] -> Dinero: -150, Salud: 5, Defensa: 15";

        assertEquals(esperado, opcion.obtenerResumen());
    }
}