package com.example.rockpaperscissorsbynikolaygerginov;
// To work properly first :
// Add javafx library from Files -> Project structure
// Second : Add VM options from Run ->Edit Configurations ->Modify Options -> Add VM Options
// Then paste this in the window :
// --module-path
//"E:\JDKS\JavaFX\javafx-sdk-19.0.2.1\lib"
//--add-modules
//javafx.controls,javafx.fxml
// Should work properly now.
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root,1200,800, Color.DARKGRAY);
        Stage stage = new Stage();

        Image icon = new Image("E:\\IntelliJ\\Projects\\RockPaperScissorsByNikolayGerginov\\src\\icon.jpeg");
        stage.getIcons().add(icon);
        stage.setTitle("The Rock Paper Scissors Game by Nikolay Gerginov");

        Text text = new Text();
        text.setText("WAZAAAAP");
        text.setX(400);
        text.setY(80);
        text.setFont(Font.font("Impact",80));

        Image image = new Image("E:\\IntelliJ\\Projects\\RockPaperScissorsByNikolayGerginov\\src\\icon.jpeg");
        ImageView imageView = new ImageView(image);
        imageView.setX(200);
        imageView.setY(100);

        root.getChildren().add(text);
        root.getChildren().add(imageView);
        stage.setScene(scene);
        stage.show();
    }
}