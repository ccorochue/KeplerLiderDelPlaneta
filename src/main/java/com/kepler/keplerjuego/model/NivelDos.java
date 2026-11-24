package com.kepler.keplerjuego.model;

/**
 * Segundo nivel, en el que la colonia debe afrontar una epidemia.
 */
public class NivelDos extends Nivel {

    /** Crea el nivel La epidemia con sus metas y límite de errores. */
    public NivelDos() {
        super(2, "La epidemia", 900, 90, 45, 3);
    }

    /** Carga los cuatro eventos y sus alternativas para el segundo nivel. */
    @Override
    protected void cargarEventos() {
        // Evento 1: Brote viral desconocido
        CartaEvento broteViral = new CartaEvento(
                "Brote Viral Desconocido",
                "Un patógeno transportado por el viento empieza a afectar a los colonos.",
                "/com/kepler/keplerjuego/view/images/evento_brote.png"
        );
        broteViral.agregarOpcion(new CartaOpcion(
                "Laboratorio de vacunas",
                "Financiar investigación urgente y aislar zonas afectadas.",
                "", -250, 15, 10, "MEJOR"
        ));
        broteViral.agregarOpcion(new CartaOpcion(
                "Cuarentena sectorial",
                "Restringir desplazamientos y repartir suministros médicos.",
                "", -100, 5, 5, "BUENA"
        ));
        broteViral.agregarOpcion(new CartaOpcion(
                "Ocultar el brote",
                "Evitar el pánico manteniendo las actividades normales.",
                "", 50, -30, -5, "MALA"
        ));
        this.eventos.add(broteViral);

        // Evento 2: Contaminación del agua potable
        CartaEvento aguaContaminada = new CartaEvento(
                "Agua Contaminada",
                "Esporas tóxicas se han filtrado en los depósitos principales.",
                "/com/kepler/keplerjuego/view/images/evento_contaminacion.png"
        );
        aguaContaminada.agregarOpcion(new CartaOpcion(
                "Filtros ultravioleta",
                "Instalar esterilización UV de grado industrial en toda la red.",
                "", -200, 15, 10, "MEJOR"
        ));
        aguaContaminada.agregarOpcion(new CartaOpcion(
                "Hervido y distribución",
                "Usar reservas embotelladas mientras se limpian los tanques.",
                "", -100, 5, 0, "BUENA"
        ));
        aguaContaminada.agregarOpcion(new CartaOpcion(
                "Cloración excesiva",
                "Verter químicos sin medir dosis en las tuberías.",
                "", -20, -25, 0, "MALA"
        ));
        this.eventos.add(aguaContaminada);

        // Evento 3: Escasez de suministros médicos
        CartaEvento escasezMedica = new CartaEvento(
                "Escasez Médica",
                "Los hospitales de campaña se quedan sin antibióticos ni oxígeno.",
                "/com/kepler/keplerjuego/view/images/evento_hospital.png"
        );
        escasezMedica.agregarOpcion(new CartaOpcion(
                "Biofábrica modular",
                "Construir una planta local de síntesis farmacéutica.",
                "", -250, 15, 10, "MEJOR"
        ));
        escasezMedica.agregarOpcion(new CartaOpcion(
                "Cargamento orbital",
                "Comprar suministros de emergencia a naves comerciales.",
                "", -150, 10, 0, "BUENA"
        ));
        escasezMedica.agregarOpcion(new CartaOpcion(
                "Recortar atención",
                "Atender únicamente casos críticos para ahorrar presupuesto.",
                "", 0, -25, -10, "MALA"
        ));
        this.eventos.add(escasezMedica);

        // Evento 4: Mutación en invernaderos
        CartaEvento mutacion = new CartaEvento(
                "Mutación en Invernaderos",
                "Las esporas del patógeno infectan también los cultivos medicinales.",
                "/com/kepler/keplerjuego/view/images/evento_mutacion.png"
        );
        mutacion.agregarOpcion(new CartaOpcion(
                "Cúpulas esterilizadas",
                "Reconstruir invernaderos con sellado hermético y cepas puras.",
                "", -200, 10, 15, "MEJOR"
        ));
        mutacion.agregarOpcion(new CartaOpcion(
                "Poda controlada",
                "Eliminar las plantas infectadas y replantar las sanas.",
                "", -100, 5, 5, "BUENA"
        ));
        mutacion.agregarOpcion(new CartaOpcion(
                "Mezclar cosechas",
                "Procesar las plantas infectadas para no perder producción.",
                "", 50, -30, 0, "MALA"
        ));
        this.eventos.add(mutacion);
    }
}
