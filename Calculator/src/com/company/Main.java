package com.company;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    private Stage window;


    public static void main(String[] args) {
        launch(args);
	// write your code here
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        window = primaryStage;
        primaryStage.setTitle("Calculator");

        MenuBar menuBar = new MenuBar();
        // --- Menu File
        Menu menuFile = new Menu("File");
        // --- Menu Edit
        Menu menuEdit = new Menu("Edit");
        // --- Menu View
        Menu menuView = new Menu("View");

        menuBar.getMenus().addAll(menuFile, menuEdit, menuView);


        TextField numberdisplay = new TextField();
        numberdisplay.setPromptText("NumberDisplay");
        VBox vbox = new VBox();
        GridPane grid = new GridPane();

        Button button1 = new Button("         7         ");
        Button button2 = new Button("         8         ");
        Button button3 = new Button("         9         ");
        Button button4 = new Button("         4         ");
        Button button5 = new Button("         5         ");
        Button button6 = new Button("         6         ");
        Button button7 = new Button("         3         ");
        Button button8 = new Button("         2         ");
        Button button9 = new Button("         1         ");
        Button button10 = new Button("        0         ");
        Button button11= new Button("         .         ");
        Button button12= new Button("         =         ");
        Button button13 = new Button("/");
        Button button14= new Button("*");
        Button button15= new Button("-");
        Button button16= new Button("+");



        GridPane gridPane = new GridPane();

        gridPane.add(button1, 0, 0, 1, 1);
        gridPane.add(button2, 1, 0, 1, 1);
        gridPane.add(button3, 2, 0, 1, 1);
        gridPane.add(button13, 3, 0, 1, 1);


        gridPane.add(button4, 0, 1, 1, 1);
        gridPane.add(button5, 1, 1, 1, 1);
        gridPane.add(button6, 2, 1, 1, 1);
        gridPane.add(button14, 3, 1, 1, 1);

        gridPane.add(button7, 0, 2, 1, 1);
        gridPane.add(button8, 1, 2, 1, 1);
        gridPane.add(button9, 2, 2, 1, 1);
        gridPane.add(button15, 3,2, 1, 1);

        gridPane.add(button10, 0, 3, 1, 1);
        gridPane.add(button11, 1, 3, 1, 1);
        gridPane.add(button12, 2, 3, 1, 1);
        gridPane.add(button16, 3, 3, 1, 1);





        vbox.getChildren().addAll(menuBar,numberdisplay,gridPane);
        Scene firstscene = new Scene(vbox, 320, 350);
        window.setScene(firstscene);
        primaryStage.show();


    }
}
