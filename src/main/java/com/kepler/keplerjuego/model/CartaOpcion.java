package com.kepler.keplerjuego.model;

public class CartaOpcion extends Carta {
    private int cambioDinero;
    private int cambioSalud;
    private int cambioDefensa;
    private String calidad;

    public CartaOpcion(String titulo, String descripcion, String rutaImagen,
                       int cambioDinero, int cambioSalud, int cambioDefensa, String calidad) {
        super(titulo, descripcion, rutaImagen);
        this.cambioDinero = cambioDinero;
        this.cambioSalud = cambioSalud;
        this.cambioDefensa = cambioDefensa;
        this.calidad = calidad;
    }

    public int getCambioDinero() {
        return cambioDinero;
    }

    public int getCambioSalud() {
        return cambioSalud;
    }

    public int getCambioDefensa() {
        return cambioDefensa;
    }

    public String getCalidad() {
        return calidad;
    }

    public boolean esMala() {
        return "MALA".equalsIgnoreCase(this.calidad);
    }

    @Override
    public String obtenerResumen() {
        return getTitulo() + " [" + calidad + "] -> Dinero: " + cambioDinero
                + ", Salud: " + cambioSalud + ", Defensa: " + cambioDefensa;
    }
}