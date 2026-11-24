package com.kepler.keplerjuego;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Inicia la interfaz JavaFX y muestra la pantalla de bienvenida del juego.
 */
public class HelloApplication extends Application {
    /** Crea la aplicación JavaFX del juego. */
    public HelloApplication() {
    }

    /**
     * Carga la pantalla inicial y configura la ventana principal.
     *
     * @param stage ventana principal de JavaFX
     * @throws IOException si no se puede cargar el archivo FXML de bienvenida
     */
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/kepler/keplerjuego/view/pantalla_bienvenida.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1000, 600);
        stage.setTitle("Kepler: líder del planeta!");
        stage.setScene(scene);
        stage.show();
    }
}
