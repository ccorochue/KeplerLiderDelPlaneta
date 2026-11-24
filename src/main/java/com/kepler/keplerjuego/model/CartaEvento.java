package com.kepler.keplerjuego.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Carta que presenta una situación del juego y las opciones disponibles para responder.
 */
public class CartaEvento extends Carta {
    /** Opciones que el jugador puede elegir ante este evento. */
    private List<CartaOpcion> opciones;

    /**
     * Crea un evento sin opciones asociadas.
     *
     * @param titulo título del evento
     * @param descripcion explicación del evento
     * @param rutaImagen ruta de la imagen del evento
     */
    public CartaEvento(String titulo, String descripcion, String rutaImagen) {
        super(titulo, descripcion, rutaImagen);
        this.opciones = new ArrayList<>();
    }

    /**
     * Añade una opción a las alternativas de este evento.
     *
     * @param opcion opción que se agrega
     */
    public void agregarOpcion(CartaOpcion opcion) {
        this.opciones.add(opcion);
    }

    /**
     * Obtiene la lista de opciones asociadas al evento.
     *
     * @return lista modificable de opciones del evento
     */
    public List<CartaOpcion> getOpciones() {
        return opciones;
    }

    /**
     * Resume el evento e indica cuántas opciones están disponibles.
     *
     * @return resumen del evento y el número de opciones
     */
    @Override
    public String obtenerResumen() {
        return "Evento: " + getTitulo() + " (" + opciones.size() + " opciones disponibles)";
    }
}
