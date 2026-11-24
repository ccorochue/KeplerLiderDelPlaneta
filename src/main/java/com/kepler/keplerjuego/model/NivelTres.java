package com.kepler.keplerjuego.model;

/**
 * Nivel final, dedicado a proteger la colonia de la amenaza de un asteroide.
 */
public class NivelTres extends Nivel {

    /** Crea el nivel El asteroide con sus metas y límite de errores. */
    public NivelTres() {
        super(3, "El asteroide", 1100, 90, 80, 3);
    }

    /** Carga los cuatro eventos y sus alternativas para el tercer nivel. */
    @Override
    protected void cargarEventos() {
        // Evento 1: Lluvia de micrometeoritos
        CartaEvento micrometeoritos = new CartaEvento(
                "Lluvia de Micrometeoritos",
                "Fragmentos previos al asteroide principal golpean la atmósfera superior.",
                "/com/kepler/keplerjuego/view/images/evento_meteoritos.png"
        );
        micrometeoritos.agregarOpcion(new CartaOpcion(
                "Red láser orbital",
                "Desplegar satélites interceptores que pulverizan los fragmentos.",
                "", -250, 10, 20, "MEJOR"
        ));
        micrometeoritos.agregarOpcion(new CartaOpcion(
                "Refugios subterráneos",
                "Evacuar a la población hacia búnkeres reforzados.",
                "", -100, 5, 10, "BUENA"
        ));
        micrometeoritos.agregarOpcion(new CartaOpcion(
                "Reforzar techos",
                "Colocar planchas metálicas improvisadas sobre las viviendas.",
                "", -50, -20, -10, "MALA"
        ));
        this.eventos.add(micrometeoritos);

        // Evento 2: Fallo en el radar de largo alcance
        CartaEvento falloRadar = new CartaEvento(
                "Fallo en Radar Orbital",
                "La interferencia magnética ciega los sensores que rastrean el asteroide.",
                "/com/kepler/keplerjuego/view/images/evento_radar.png"
        );
        falloRadar.agregarOpcion(new CartaOpcion(
                "Matriz cuántica",
                "Instalar telescopios de rastreo profundo redundantes.",
                "", -200, 5, 20, "MEJOR"
        ));
        falloRadar.agregarOpcion(new CartaOpcion(
                "Sondas de reconocimiento",
                "Lanzar drones atmosféricos para triangular la trayectoria.",
                "", -100, 0, 10, "BUENA"
        ));
        falloRadar.agregarOpcion(new CartaOpcion(
                "Reiniciar sistema",
                "Apagar el radar por completo esperando que se recalibre solo.",
                "", 0, -15, -20, "MALA"
        ));
        this.eventos.add(falloRadar);

        // Evento 3: Pánico y sabotaje en la colonia
        CartaEvento panicoColonia = new CartaEvento(
                "Pánico en la Colonia",
                "Un grupo intenta robar las reservas de combustible para huir del planeta.",
                "/com/kepler/keplerjuego/view/images/evento_panico.png"
        );
        panicoColonia.agregarOpcion(new CartaOpcion(
                "Plan de defensa transparente",
                "Mostrar el escudo planetario y asegurar cupos en refugios para todos.",
                "", -150, 10, 15, "MEJOR"
        ));
        panicoColonia.agregarOpcion(new CartaOpcion(
                "Custodia de seguridad",
                "Proteger los silos de energía con patrullas especializadas.",
                "", -100, 0, 10, "BUENA"
        ));
        panicoColonia.agregarOpcion(new CartaOpcion(
                "Represión total",
                "Cortar comunicaciones y confiscar recursos civiles.",
                "", 100, -25, -15, "MALA"
        ));
        this.eventos.add(panicoColonia);

        // Evento 4: Impacto inminente del asteroide
        CartaEvento impactoAsteroide = new CartaEvento(
                "Impacto Inminente",
                "El núcleo del asteroide entra en trayectoria directa hacia Kepler.",
                "/com/kepler/keplerjuego/view/images/evento_asteroide.png"
        );
        impactoAsteroide.agregarOpcion(new CartaOpcion(
                "Cañón de plasma y escudo",
                "Desviar el asteroide combinando disparo orbital y escudo máximo.",
                "", -300, 10, 25, "MEJOR"
        ));
        impactoAsteroide.agregarOpcion(new CartaOpcion(
                "Detonación controlada",
                "Fragmentar el asteroide antes de que toque la atmósfera.",
                "", -200, 0, 15, "BUENA"
        ));
        impactoAsteroide.agregarOpcion(new CartaOpcion(
                "Esperar el impacto",
                "Confiar en que se desintegre por fricción atmosférica.",
                "", 0, -40, -30, "MALA"
        ));
        this.eventos.add(impactoAsteroide);
    }
}
