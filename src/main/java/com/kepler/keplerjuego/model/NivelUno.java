package com.kepler.keplerjuego.model;

/**
 * Nivel inicial, centrado en el crecimiento y la preparación de la colonia.
 */
public class NivelUno extends Nivel {

    /** Crea el nivel Crecer con sus metas y límite de errores. */
    public NivelUno() {
        super(1, "Crecer", 700, 85, 20, 3);
    }

    /** Carga los cuatro eventos y sus alternativas para el primer nivel. */
    @Override
    protected void cargarEventos() {
        // Evento 1: Granizada inesperada
        CartaEvento granizada = new CartaEvento(
                "Granizada Inesperada",
                "Una tormenta de granizo amenaza los primeros cultivos de la colonia.",
                "/com/kepler/keplerjuego/view/images/evento_granizada.png"
        );
        granizada.agregarOpcion(new CartaOpcion(
                "Domos térmicos",
                "Instalar domos protectores reutilizables en los invernaderos.",
                "", -150, 10, 10, "MEJOR"
        ));
        granizada.agregarOpcion(new CartaOpcion(
                "Lonas de emergencia",
                "Cubrir los cultivos manualmente con lonas reforzadas.",
                "", -50, 5, 0, "BUENA"
        ));
        granizada.agregarOpcion(new CartaOpcion(
                "Ignorar tormenta",
                "Confiar en que las plantas resistirán el clima.",
                "", 0, -20, 0, "MALA"
        ));
        this.eventos.add(granizada);

        // Evento 2: Sequía estacional
        CartaEvento sequia = new CartaEvento(
                "Sequía Estacional",
                "Las reservas superficiales de agua han bajado drásticamente.",
                "/com/kepler/keplerjuego/view/images/evento_sequia.png"
        );
        sequia.agregarOpcion(new CartaOpcion(
                "Planta recicladora",
                "Construir un sistema cerrado de purificación hídrica.",
                "", -200, 15, 5, "MEJOR"
        ));
        sequia.agregarOpcion(new CartaOpcion(
                "Racionamiento estricto",
                "Limitar el consumo diario de agua en todos los sectores.",
                "", 0, 5, 0, "BUENA"
        ));
        sequia.agregarOpcion(new CartaOpcion(
                "Sobreexplotar acuíferos",
                "Extraer agua profunda sin filtrar contaminantes.",
                "", 50, -25, 0, "MALA"
        ));
        this.eventos.add(sequia);

        // Evento 3: Plaga agrícola
        CartaEvento plaga = new CartaEvento(
                "Plaga en Cultivos",
                "Insectos nativos de Kepler están devorando las cosechas.",
                "/com/kepler/keplerjuego/view/images/evento_plaga.png"
        );
        plaga.agregarOpcion(new CartaOpcion(
                "Control biológico",
                "Introducir depredadores naturales inofensivos para el ecosistema.",
                "", -150, 10, 5, "MEJOR"
        ));
        plaga.agregarOpcion(new CartaOpcion(
                "Cosecha temprana",
                "Recolectar lo que queda antes de que avance la plaga.",
                "", -50, 0, 0, "BUENA"
        ));
        plaga.agregarOpcion(new CartaOpcion(
                "Pesticida químico",
                "Fumigar masivamente con compuestos tóxicos.",
                "", -50, -20, 0, "MALA"
        ));
        this.eventos.add(plaga);

        // Evento 4: Tormenta solar menor
        CartaEvento tormentaSolar = new CartaEvento(
                "Tormenta Solar Menor",
                "La radiación estelar interfiere con las comunicaciones y paneles.",
                "/com/kepler/keplerjuego/view/images/evento_tormenta.png"
        );
        tormentaSolar.agregarOpcion(new CartaOpcion(
                "Escudo magnético",
                "Activar bobinas protectoras alrededor de la base.",
                "", -150, 5, 15, "MEJOR"
        ));
        tormentaSolar.agregarOpcion(new CartaOpcion(
                "Apagón preventivo",
                "Desconectar equipos sensibles durante el pico solar.",
                "", -50, 0, 5, "BUENA"
        ));
        tormentaSolar.agregarOpcion(new CartaOpcion(
                "Mantener potencia",
                "Forzar los generadores al máximo sin protección.",
                "", 100, -15, -10, "MALA"
        ));
        this.eventos.add(tormentaSolar);
    }
}
