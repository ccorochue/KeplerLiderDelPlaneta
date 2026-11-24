package com.kepler.keplerjuego.model;

/**
 * Mantiene los indicadores y el conteo de errores de la colonia durante la partida.
 */
public class Planeta {
    /** Dinero disponible para tomar decisiones. */
    private int dinero;
    /** Salud de la población, limitada al intervalo de cero a cien. */
    private int salud;
    /** Capacidad de defensa de la colonia, limitada al intervalo de cero a cien. */
    private int defensa;
    /** Cantidad de decisiones que se han registrado como errores. */
    private int errores;

    /** Crea un planeta con los indicadores iniciales de la partida. */
    public Planeta() {
        this.dinero = 500;
        this.salud = 80;
        this.defensa = 0;
        this.errores = 0;
    }

    // Getters
    /**
     * Obtiene el dinero disponible.
     *
     * @return dinero actual
     */
    public int getDinero() {
        return dinero;
    }

    /**
     * Obtiene el nivel actual de salud.
     *
     * @return salud entre cero y cien
     */
    public int getSalud() {
        return salud;
    }

    /**
     * Obtiene el nivel actual de defensa.
     *
     * @return defensa entre cero y cien
     */
    public int getDefensa() {
        return defensa;
    }

    /**
     * Obtiene el número de errores registrados.
     *
     * @return cantidad de errores
     */
    public int getErrores() {
        return errores;
    }

    // Setters con validación de límites
    /**
     * Actualiza el dinero disponible; los valores negativos se limitan a cero.
     *
     * @param dinero nuevo valor de dinero
     */
    public void setDinero(int dinero) {
        if (dinero < 0) {
            this.dinero = 0;
        } else {
            this.dinero = dinero;
        }
    }

    /**
     * Actualiza la salud y la limita al intervalo de cero a cien.
     *
     * @param salud nuevo valor de salud
     */
    public void setSalud(int salud) {
        if (salud < 0) {
            this.salud = 0;
        } else if (salud > 100) {
            this.salud = 100;
        } else {
            this.salud = salud;
        }
    }

    /**
     * Actualiza la defensa y la limita al intervalo de cero a cien.
     *
     * @param defensa nuevo valor de defensa
     */
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
    /** Añade doscientas unidades de dinero al inicio del turno. */
    public void recibirIngresoTurno() {
        setDinero(this.dinero + 200);
    }

    /**
     * Suma o resta dinero y mantiene el saldo en un mínimo de cero.
     *
     * @param cantidad variación que se aplica al dinero
     */
    public void modificarDinero(int cantidad) {
        setDinero(this.dinero + cantidad);
    }

    /**
     * Modifica la salud y conserva su límite entre cero y cien.
     *
     * @param cantidad variación que se aplica a la salud
     */
    public void modificarSalud(int cantidad) {
        setSalud(this.salud + cantidad);
    }

    /**
     * Modifica la defensa y conserva su límite entre cero y cien.
     *
     * @param cantidad variación que se aplica a la defensa
     */
    public void modificarDefensa(int cantidad) {
        setDefensa(this.defensa + cantidad);
    }

    /** Incrementa en uno el conteo de errores del planeta. */
    public void registrarError() {
        this.errores++;
    }

    /** Restablece a cero el conteo de errores del planeta. */
    public void reiniciarErrores() {
        this.errores = 0;
    }
}
