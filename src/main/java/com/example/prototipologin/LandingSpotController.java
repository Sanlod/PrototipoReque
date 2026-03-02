package com.example.prototipologin;

import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class LandingSpotController {

    public void switchHelloController(MouseEvent event) throws IOException {
        Scene escena = SceneCache.getScene("/com/example/prototipologin/hello-view.fxml");
        Stage stage = (Stage) ((Node) event.getSource())
                .getScene().getWindow();
        stage.setScene(escena);
        stage.show();
    }
}
