package csc201mod7;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.Scene;
import javafx.stage.*;
import java.util.ArrayList;
import java.util.Collections;

public class CardRefreshButton extends Application {
    // Set path to cards images
    static String filepath = "file:D:\\scripts\\csc201mod7\\bin\\resources\\card\\", fileExt = ".png";
    
    // Create arraylist to hold card images
	ArrayList<Image> cards = new ArrayList<Image>();   
    
    // Define HBox
    HBox hBox = new HBox();	

    @Override public void start(Stage primaryStage) {
        // Load images into arraylist
        for (int i = 0; i < 52; i++) {
            Image im = new Image(filepath + (i + 1) + fileExt, true);
            cards.add(im);
        }

        // Align content in HBox to center
        hBox.setAlignment(Pos.CENTER);

        // Define refresh button and assign shuffle/add method to button event
        Button refresh = new Button("Refresh");
        refresh.setOnAction(eve-> addAndShuffle());
        
        // Shuffle cards and add to pane
        addAndShuffle();

        // Create and set pane
        BorderPane pane = new BorderPane();
        pane.setCenter(hBox);
        pane.setBottom(refresh);

        // Create and set scene
        Scene scene = new Scene(pane, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Shuffling cards");
        primaryStage.show();

    }

    public void addAndShuffle() {
    	// Shuffle cards
    	Collections.shuffle(cards);
    	
        // Clear the current images
        hBox.getChildren().clear();
        
        // Create four new imageviews with random card images
        for (int i = 0; i < 4; i++) {
            ImageView im = new ImageView(cards.get(i));
            hBox.getChildren().add(im);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}