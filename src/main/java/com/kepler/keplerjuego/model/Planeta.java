package com.kepler.keplerjuego.model;

public class Planeta {
    private int dinero;
    private int salud;
    private int defensa;
    private int errores;

    public Planeta() {
        this.dinero = 500;
        this.salud = 80;
        this.defensa = 0;
        this.errores = 0;
    }

    // Getters
    public int getDinero() {
        return dinero;
    }

    public int getSalud() {
        return salud;
    }

    public int getDefensa() {
        return defensa;
    }

    public int getErrores() {
        return errores;
    }

    // Setters con validación de límites
    public void setDinero(int dinero) {
        if (dinero < 0) {
            this.dinero = 0;
        } else {
            this.dinero = dinero;
        }
    }

    public void setSalud(int salud) {
        if (salud < 0) {
            this.salud = 0;
        } else if (salud > 100) {
            this.salud = 100;
        } else {
            this.salud = salud;
        }
    }

    public void setDefensa(int defensa) {
        if (defensa < 0) {
            this.defensa = 0;
        } else if (defensa > 100) {
            this.defensa = 100;
        } else {
            this.defensa = defensa;
        }
    }

    // Métodos de comportamiento del juego
    public void recibirIngresoTurno() {
        setDinero(this.dinero + 200);
    }

    public void modificarDinero(int cantidad) {
        setDinero(this.dinero + cantidad);
    }

    public void modificarSalud(int cantidad) {
        setSalud(this.salud + cantidad);
    }

    public void modificarDefensa(int cantidad) {
        setDefensa(this.defensa + cantidad);
    }

    public void registrarError() {
        this.errores++;
    }

    public void reiniciarErrores() {
        this.errores = 0;
    }
}