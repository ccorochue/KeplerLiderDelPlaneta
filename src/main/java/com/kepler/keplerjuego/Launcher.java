package com.kepler.keplerjuego;

import javafx.application.Application;

/** Punto de entrada que delega el inicio de la aplicación a JavaFX. */
public class Launcher {
    /** Crea el lanzador de la aplicación. */
    public Launcher() {
    }

    /**
     * Inicia la aplicación JavaFX del juego.
     *
     * @param args argumentos recibidos desde la línea de comandos
     */
    public static void main(String[] args) {
        Application.launch(HelloApplication.class, args);
    }
}
