package com.kepler.keplerjuego.model;

/**
 * Carta que representa una decisión y los cambios que produce en los recursos del planeta.
 */
public class CartaOpcion extends Carta {
    /** Variación de dinero causada por la opción. */
    private int cambioDinero;
    /** Variación de salud causada por la opción. */
    private int cambioSalud;
    /** Variación de defensa causada por la opción. */
    private int cambioDefensa;
    /** Clasificación narrativa de la opción, por ejemplo, MEJOR, BUENA o MALA. */
    private String calidad;

    /**
     * Crea una opción con sus efectos sobre los indicadores del planeta.
     *
     * @param titulo título de la opción
     * @param descripcion explicación de la decisión
     * @param rutaImagen ruta de la imagen asociada
     * @param cambioDinero variación de dinero
     * @param cambioSalud variación de salud
     * @param cambioDefensa variación de defensa
     * @param calidad clasificación narrativa de la opción
     */
    public CartaOpcion(String titulo, String descripcion, String rutaImagen,
                       int cambioDinero, int cambioSalud, int cambioDefensa, String calidad) {
        super(titulo, descripcion, rutaImagen);
        this.cambioDinero = cambioDinero;
        this.cambioSalud = cambioSalud;
        this.cambioDefensa = cambioDefensa;
        this.calidad = calidad;
    }

    /**
     * Obtiene la variación de dinero de la opción.
     *
     * @return cambio en dinero
     */
    public int getCambioDinero() {
        return cambioDinero;
    }

    /**
     * Obtiene la variación de salud de la opción.
     *
     * @return cambio en salud
     */
    public int getCambioSalud() {
        return cambioSalud;
    }

    /**
     * Obtiene la variación de defensa de la opción.
     *
     * @return cambio en defensa
     */
    public int getCambioDefensa() {
        return cambioDefensa;
    }

    /**
     * Obtiene la clasificación narrativa de la opción.
     *
     * @return calidad asignada a la opción
     */
    public String getCalidad() {
        return calidad;
    }

    /**
     * Indica si la opción está clasificada como mala, sin distinguir mayúsculas.
     *
     * @return {@code true} si la calidad es MALA; {@code false} en caso contrario
     */
    public boolean esMala() {
        return "MALA".equalsIgnoreCase(this.calidad);
    }

    /**
     * Resume el nombre, la calidad y los efectos de la opción.
     *
     * @return resumen textual de la opción
     */
    @Override
    public String obtenerResumen() {
        return getTitulo() + " [" + calidad + "] -> Dinero: " + cambioDinero
                + ", Salud: " + cambioSalud + ", Defensa: " + cambioDefensa;
    }
}
