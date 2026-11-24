package com.kepler.keplerjuego.model;

/**
 * Representa la información común a las cartas de eventos y de opciones del juego.
 *
 * <p>Las subclases definen el resumen específico que se muestra para cada tipo de carta.</p>
 */
public abstract class Carta {
    /** Título que identifica la carta. */
    private String titulo;
    /** Texto que explica el evento o la opción representada por la carta. */
    private String descripcion;
    /** Ruta del recurso gráfico asociado a la carta. */
    private String rutaImagen;

    /**
     * Crea una carta con sus datos descriptivos y su recurso gráfico.
     *
     * @param titulo título que identifica la carta
     * @param descripcion texto descriptivo de la carta
     * @param rutaImagen ruta del recurso gráfico asociado
     */
    public Carta(String titulo, String descripcion, String rutaImagen) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.rutaImagen = rutaImagen;
    }

    /**
     * Obtiene el título de la carta.
     *
     * @return título de la carta
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Obtiene la descripción de la carta.
     *
     * @return descripción de la carta
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Obtiene la ruta de la imagen asociada a la carta.
     *
     * @return ruta del recurso gráfico
     */
    public String getRutaImagen() {
        return rutaImagen;
    }

    /**
     * Construye el resumen textual propio del tipo de carta.
     *
     * @return resumen de la carta
     */
    public abstract String obtenerResumen();
}
