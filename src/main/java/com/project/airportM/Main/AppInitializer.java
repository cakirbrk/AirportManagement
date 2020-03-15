package com.project.airportM.Main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer extends Application {
    public static AnnotationConfigApplicationContext ctx;

    @Override
    public void start(Stage primaryStage) throws Exception {
        ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        Parent root = FXMLLoader.load(getClass().getResource("/view/Home.fxml"));
        Scene mainScene = new Scene(root);
        primaryStage.setScene(mainScene);
        primaryStage.setTitle("Home");
        primaryStage.centerOnScreen();
        primaryStage.show();
    }
}
