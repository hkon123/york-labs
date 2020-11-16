import javafx.application.Application;
//import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
//import javafx.scene.shape.Arc;
//import javafx.scene.shape.ArcType;
//import javafx.scene.shape.Circle;
//import javafx.scene.text.Font;
//import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.geometry.*; 
//import javafx.scene.layout.BackgroundFill;

public class ColourChanger extends Application{

	@Override
	public void start(Stage stage) {
		Button button1 = new Button("Make background Blue");
		Button button2 = new Button("Make backgroun red");
		
		HBox buttonBox = new HBox(10);
		buttonBox.setAlignment(Pos.CENTER);
		buttonBox.getChildren().addAll(button1, button2);
		buttonBox.setBackground(Background.EMPTY);//new Background(new BackgroundFill(Color.BLUE, new CornerRadii(0), new Insets(0))));
		
		Scene scene = new Scene(buttonBox, 250, 150, Color.BLUE);
		
		button1.setOnAction(e -> scene.setFill(Color.BLUE));
		button2.setOnAction(e -> scene.setFill(Color.RED));
		
		stage.setScene(scene);
		stage.setTitle("Colour Change");
		//COMM
		stage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	} 
	
	
}
