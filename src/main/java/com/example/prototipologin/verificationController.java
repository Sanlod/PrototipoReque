package com.example.prototipologin;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class verificationController {
    public void switchHelloAplication(MouseEvent event) throws IOException {
        Scene escena = SceneCache.getScene("/com/example/prototipologin/hello-view.fxml");
        Stage stage = (Stage) ((Node) event.getSource())
                .getScene().getWindow();
        stage.setScene(escena);
        stage.show();
    }
    public void switchUpdatePassword(MouseEvent event) throws IOException {
        Scene escena = SceneCache.getScene("/com/example/prototipologin/updatePassword.fxml");
        Stage stage = (Stage) ((Node) event.getSource())
                .getScene().getWindow();
        stage.setScene(escena);
        stage.show();
    }
}
