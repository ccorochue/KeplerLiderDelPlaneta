package com.kepler.keplerjuego.model;

/**
 * Conserva la opción seleccionada y el estado narrativo asociado a una decisión.
 */
public class ResultadoDecision {
    /** Opción que eligió el jugador. */
    private CartaOpcion opcionElegida;
    /** Estado textual que describe el resultado de la decisión. */
    private String estado;

    /**
     * Crea el resultado de una decisión del jugador.
     *
     * @param opcionElegida opción que se seleccionó
     * @param estado estado narrativo asociado a la decisión
     */
    public ResultadoDecision(CartaOpcion opcionElegida, String estado) {
        this.opcionElegida = opcionElegida;
        this.estado = estado;
    }

    /**
     * Obtiene la opción elegida.
     *
     * @return opción de la decisión
     */
    public CartaOpcion getOpcionElegida() {
        return opcionElegida;
    }

    /**
     * Obtiene el estado narrativo asociado a la decisión.
     *
     * @return estado de la decisión
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Obtiene el título de resultado según la calidad de la opción.
     *
     * @return título que comunica si la decisión mejoró o empeoró la situación
     */
    public String getTitulo() {
        return opcionElegida.esMala() ? "Las cosas empeoraron" : "¡Genial!";
    }

    /**
     * Obtiene el resumen de la opción que se eligió.
     *
     * @return resumen de la opción seleccionada
     */
    public String getMensaje() {
        return opcionElegida.obtenerResumen();
    }
}
