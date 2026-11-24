package com.kepler.keplerjuego.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Nivel {
    private int numeroNivel;
    private String nombre;
    private int metaDinero;
    private int metaSalud;
    private int metaDefensa;
    private int limiteErrores;
    protected List<CartaEvento> eventos;

    public Nivel(int numeroNivel, String nombre, int metaDinero, int metaSalud, int metaDefensa, int limiteErrores) {
        this.numeroNivel = numeroNivel;
        this.nombre = nombre;
        this.metaDinero = metaDinero;
        this.metaSalud = metaSalud;
        this.metaDefensa = metaDefensa;
        this.limiteErrores = limiteErrores;
        this.eventos = new ArrayList<>();
        cargarEventos();
    }

    protected abstract void cargarEventos();

    public boolean verificarVictoria(Planeta planeta) {
        return planeta.getDinero() >= metaDinero
                && planeta.getSalud() >= metaSalud
                && planeta.getDefensa() >= metaDefensa;
    }

    public boolean verificarDesastre(Planeta planeta) {
        return planeta.getSalud() <= 0
                || planeta.getErrores() >= limiteErrores;
    }

    public int getNumeroNivel() {
        return numeroNivel;
    }

    public String getNombre() {
        return nombre;
    }

    public int getMetaDinero() {
        return metaDinero;
    }

    public int getMetaSalud() {
        return metaSalud;
    }

    public int getMetaDefensa() {
        return metaDefensa;
    }

    public int getLimiteErrores() {
        return limiteErrores;
    }

    public List<CartaEvento> getEventos() {
        return eventos;
    }
}