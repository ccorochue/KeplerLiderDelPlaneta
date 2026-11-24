package com.kepler.keplerjuego.model;

public abstract class Carta {
    private String titulo;
    private String descripcion;
    private String rutaImagen;

    public Carta(String titulo, String descripcion, String rutaImagen) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.rutaImagen = rutaImagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public abstract String obtenerResumen();
}