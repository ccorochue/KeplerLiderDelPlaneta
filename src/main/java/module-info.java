module com.kepler.keplerjuego {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.kepler.keplerjuego to javafx.fxml;
    exports com.kepler.keplerjuego;
}