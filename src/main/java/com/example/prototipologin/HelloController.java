package com.example.prototipologin;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void swtichRegister(MouseEvent mouseEvent) throws IOException {
        Scene escena = SceneCache.getScene("/com/example/prototipologin/register.fxml");

        Stage stage = (Stage) ((Node) mouseEvent.getSource())
                .getScene().getWindow();

        stage.setScene(escena);
        stage.show();
    }

    public void switchVerification(MouseEvent event) throws IOException {
        Scene escena = SceneCache.getScene("/com/example/prototipologin/verification.fxml");
        Stage stage = (Stage) ((Node) event.getSource())
                .getScene().getWindow();
        stage.setScene(escena);
        stage.show();
    }

}
