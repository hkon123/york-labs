
import java.awt.TextArea;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.geometry.*; 
import javafx.scene.layout.BackgroundFill;

public class Triangle extends Application {

	
	@Override
	public void start(Stage stage) {
		
		Line line1 = new Line (100,70,100,250);
		Line line2 = new Line (100,250,400,250);
		Line line3 = new Line (400,250,100,70);
		
		Group root = new Group();
		
		root.getChildren().addAll(line1,line2,line3);
		
		Scene scene = new Scene(root, 500, 500, Color.LIGHTGRAY);
		
		
		
		stage.setScene(scene);
		stage.setTitle("Vehicle Manager");
		stage.show();
		
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
