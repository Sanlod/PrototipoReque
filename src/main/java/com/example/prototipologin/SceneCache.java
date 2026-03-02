package com.example.prototipologin;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class SceneCache {
    public static Map<String, Scene> cache = new HashMap<>();

    public static Scene getScene(String fxmlPath) {
        if (cache.containsKey(fxmlPath)) {
            System.out.println("Cargando desde caché: " + fxmlPath);
            return cache.get(fxmlPath);
        }
        try {
            System.out.println("Cargando por primera vez: " + fxmlPath);
            FXMLLoader loader = new FXMLLoader(SceneCache.class.getResource(fxmlPath));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            cache.put(fxmlPath, scene);
            return scene;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
