package com.kepler.keplerjuego.model;

public class ResultadoDecision {
    private CartaOpcion opcionElegida;
    private String estado;

    public ResultadoDecision(CartaOpcion opcionElegida, String estado) {
        this.opcionElegida = opcionElegida;
        this.estado = estado;
    }

    public CartaOpcion getOpcionElegida() {
        return opcionElegida;
    }

    public String getEstado() {
        return estado;
    }

    public String getTitulo() {
        return opcionElegida.esMala() ? "Las cosas empeoraron" : "¡Genial!";
    }

    public String getMensaje() {
        return opcionElegida.obtenerResumen();
    }
}
