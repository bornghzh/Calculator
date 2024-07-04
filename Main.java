package com.example.calc;

import com.example.calc.Constants.GlobalConstants;
import com.example.calc.gui.CalculatorGui;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        CalculatorGui calculator = new CalculatorGui();
        GridPane gridPane = new GridPane();
        Scene scene = new Scene(gridPane, GlobalConstants.sceneWidth, GlobalConstants.sceneHeight, Color.WHEAT);
        primaryStage.setTitle("Calculator!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
