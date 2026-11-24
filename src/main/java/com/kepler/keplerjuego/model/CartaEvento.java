package com.kepler.keplerjuego.model;

import java.util.ArrayList;
import java.util.List;

public class CartaEvento extends Carta {
    private List<CartaOpcion> opciones;

    public CartaEvento(String titulo, String descripcion, String rutaImagen) {
        super(titulo, descripcion, rutaImagen);
        this.opciones = new ArrayList<>();
    }

    public void agregarOpcion(CartaOpcion opcion) {
        this.opciones.add(opcion);
    }

    public List<CartaOpcion> getOpciones() {
        return opciones;
    }

    @Override
    public String obtenerResumen() {
        return "Evento: " + getTitulo() + " (" + opciones.size() + " opciones disponibles)";
    }
}