package com.kepler.keplerjuego.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Define las metas, los límites y los eventos compartidos por los niveles del juego.
 *
 * <p>Cada subclase establece sus propios valores y carga sus eventos concretos.</p>
 */
public abstract class Nivel {
    /** Número que identifica el nivel dentro de la partida. */
    private int numeroNivel;
    /** Nombre descriptivo del nivel. */
    private String nombre;
    /** Cantidad mínima de dinero necesaria para ganar el nivel. */
    private int metaDinero;
    /** Nivel mínimo de salud necesario para ganar el nivel. */
    private int metaSalud;
    /** Nivel mínimo de defensa necesario para ganar el nivel. */
    private int metaDefensa;
    /** Número máximo de errores permitido antes de que ocurra un desastre. */
    private int limiteErrores;
    /** Eventos que se presentan durante el nivel. */
    protected List<CartaEvento> eventos;

    /**
     * Inicializa las metas del nivel y carga sus eventos.
     *
     * @param numeroNivel número identificador del nivel
     * @param nombre nombre descriptivo del nivel
     * @param metaDinero dinero mínimo requerido
     * @param metaSalud salud mínima requerida
     * @param metaDefensa defensa mínima requerida
     * @param limiteErrores máximo de errores permitido
     */
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

    /** Carga los eventos específicos definidos por cada subclase. */
    protected abstract void cargarEventos();

    /**
     * Comprueba si el planeta alcanza todas las metas del nivel.
     *
     * @param planeta planeta cuyos indicadores se evalúan
     * @return {@code true} si cumple las metas de dinero, salud y defensa
     */
    public boolean verificarVictoria(Planeta planeta) {
        return planeta.getDinero() >= metaDinero
                && planeta.getSalud() >= metaSalud
                && planeta.getDefensa() >= metaDefensa;
    }

    /**
     * Comprueba si el planeta ha llegado a una condición de desastre.
     *
     * @param planeta planeta cuyos indicadores se evalúan
     * @return {@code true} si su salud llegó a cero o alcanzó el límite de errores
     */
    public boolean verificarDesastre(Planeta planeta) {
        return planeta.getSalud() <= 0
                || planeta.getErrores() >= limiteErrores;
    }

    /**
     * Obtiene el número identificador del nivel.
     *
     * @return número del nivel
     */
    public int getNumeroNivel() {
        return numeroNivel;
    }

    /**
     * Obtiene el nombre descriptivo del nivel.
     *
     * @return nombre del nivel
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la meta mínima de dinero.
     *
     * @return dinero requerido para ganar
     */
    public int getMetaDinero() {
        return metaDinero;
    }

    /**
     * Obtiene la meta mínima de salud.
     *
     * @return salud requerida para ganar
     */
    public int getMetaSalud() {
        return metaSalud;
    }

    /**
     * Obtiene la meta mínima de defensa.
     *
     * @return defensa requerida para ganar
     */
    public int getMetaDefensa() {
        return metaDefensa;
    }

    /**
     * Obtiene el máximo de errores permitido.
     *
     * @return límite de errores
     */
    public int getLimiteErrores() {
        return limiteErrores;
    }

    /**
     * Obtiene los eventos cargados para el nivel.
     *
     * @return lista modificable de eventos del nivel
     */
    public List<CartaEvento> getEventos() {
        return eventos;
    }
}
