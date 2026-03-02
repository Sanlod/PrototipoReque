module com.example.prototipologin {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.prototipologin to javafx.fxml;
    exports com.example.prototipologin;
}