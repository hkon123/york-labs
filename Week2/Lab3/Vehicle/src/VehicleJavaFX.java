
import java.awt.TextArea;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.geometry.*; 
import javafx.scene.layout.BackgroundFill;


public class VehicleJavaFX  extends Application{
	
	private ArrayList<Vehicle> vehicles = new ArrayList<>();
	
	@Override
	public void start(Stage stage) {
		
		//----------Add Vehicle Form-------------
		
		//new or used checkboxes
		Label typeIntro = new Label("Is the car used?");
		Label typeNew = new Label("New");
		Label typeUsed = new Label("Used");
		
		CheckBox isNew = new CheckBox();
		CheckBox isUsed = new CheckBox();
		
		HBox newOrUsedBox = new HBox(10);
		newOrUsedBox.setAlignment(Pos.CENTER);
		newOrUsedBox.getChildren().addAll(typeIntro, isUsed);
		
		
		//Reg number
		Label regNoText = new Label("Reg no.:");
		TextField regNoIn = new TextField();
		
		HBox regNoBox = new HBox(10);
		regNoBox.setAlignment(Pos.CENTER);
		regNoBox.getChildren().addAll(regNoText, regNoIn);
		
		//Make
		Label makeText = new Label("Make:");
		TextField makeIn = new TextField();
		
		HBox makeBox = new HBox(10);
		makeBox.setAlignment(Pos.CENTER);
		makeBox.getChildren().addAll(makeText, makeIn);
		
		//Year
		Label yearText = new Label("Year Of Manufacture:");
		TextField yearIn = new TextField();
		
		HBox yearBox = new HBox(10);
		yearBox.setAlignment(Pos.CENTER);
		yearBox.getChildren().addAll(yearText, yearIn);
		
		//Value
		Label valueText = new Label("Value:");
		TextField valueIn = new TextField();
		
		HBox valueBox = new HBox(10);
		valueBox.setAlignment(Pos.CENTER);
		valueBox.getChildren().addAll(valueText, valueIn);
		
		//Owners
		Label ownersText = new Label("Total owners:");
		TextField ownersIn = new TextField();
		
		HBox ownersBox = new HBox(10);
		ownersBox.setAlignment(Pos.CENTER);
		ownersBox.getChildren().addAll(ownersText, ownersIn);
		ownersBox.setVisible(false);
		
		//Add vehicle button
		Button testButton = new Button("test");
		Button addVehicleButton = new Button("Add");
		HBox addVehicleButtonBox = new HBox(10);
		addVehicleButtonBox.setAlignment(Pos.BOTTOM_RIGHT);
		addVehicleButtonBox.getChildren().addAll(addVehicleButton, testButton);
		
	
		testButton.setOnAction(e -> {
			System.out.println("-----------Printing details!-----------");
			for (int i=0; i<vehicles.size(); i++) {
				System.out.println("\n\nVehicle nr:" + i);
				System.out.println(vehicles.get(i));
			}
		});
		
		
		//Vehicle form
		VBox addVehicleForm = new VBox(10);
		addVehicleForm.setAlignment(Pos.CENTER);
		addVehicleForm.getChildren().addAll(newOrUsedBox, regNoBox, 
				makeBox, yearBox, valueBox, ownersBox, addVehicleButtonBox);
		addVehicleForm.setVisible(false);
		
		// Is the car new or used display logic
		isUsed.setOnAction(e -> {
			if (isUsed.isSelected() == false) {
				ownersBox.setVisible(false);
			}
			else {
				ownersBox.setVisible(true);
			}
		});
		
		//Display all vehicles Form
		ComboBox vehicleDisplay = new ComboBox();
		
		Button showSelectedVehicle = new Button("Show");
		Button removeSelectedVehicle = new Button("Remove");
		
		javafx.scene.control.TextArea vehicleDetails = new javafx.scene.control.TextArea();
		vehicleDetails.setEditable(false);
		vehicleDetails.setMinSize(190, 100);
		vehicleDetails.setMaxSize(190, 100);
		
		
		HBox choseVehicleBox = new HBox();
		choseVehicleBox.setAlignment(Pos.TOP_CENTER);
		choseVehicleBox.getChildren().addAll(vehicleDisplay, showSelectedVehicle, removeSelectedVehicle);
		
		VBox vehicleDisplayForm = new VBox();
		vehicleDisplayForm.setAlignment(Pos.TOP_CENTER);
		vehicleDisplayForm.getChildren().addAll(choseVehicleBox, vehicleDetails);
		vehicleDisplayForm.setVisible(false);
		
		
		//Main Menu Form
		Button displayAddVehicleForm = new Button("Add a new Vehicle");
		Button displayVehicleDisplay = new Button("Show vehicles");
		displayVehicleDisplay.setOnAction(e -> vehicleDisplayForm.setVisible(!vehicleDisplayForm.isVisible()));
		Button quit = new Button("Quit!");
		quit.setOnAction(e -> stage.close());
		
		
		HBox mainMenu = new HBox(10);
		mainMenu.setAlignment(Pos.BOTTOM_RIGHT);
		mainMenu.getChildren().addAll(displayAddVehicleForm, displayVehicleDisplay, quit);
		
		
		
		
		//screen
		HBox displayAndAdd = new HBox(10);
		displayAndAdd.setAlignment(Pos.CENTER);
		displayAndAdd.getChildren().addAll(addVehicleForm, vehicleDisplayForm);
		
		
		VBox screen = new VBox(10);
		screen.setAlignment(Pos.CENTER);
		screen.getChildren().addAll(displayAndAdd, mainMenu);
		
		
		
		
		//buttons
		addVehicleButton.setOnAction(e -> {
			if (isUsed.isSelected() == false) {
				vehicles.add(new Vehicle(regNoIn.getText(), makeIn.getText(), 
						Integer.parseInt(yearIn.getText()), Double.parseDouble(valueIn.getText())));
				vehicleDisplay.getItems().add(regNoIn.getText());
				addVehicleForm.setVisible(false);
				mainMenu.setVisible(true);
			}
			else {
				vehicles.add(new SecondHandVehicle(regNoIn.getText(), makeIn.getText(), 
						Integer.parseInt(yearIn.getText()), Double.parseDouble(valueIn.getText()), 
						Integer.parseInt(ownersIn.getText())));
				vehicleDisplay.getItems().add(regNoIn.getText());
				addVehicleForm.setVisible(false);
				//mainMenu.setVisible(true);
			}
		});
		
		displayAddVehicleForm.setOnAction(e -> {	
			addVehicleForm.setVisible(!addVehicleForm.isVisible());
		});
		
		
		showSelectedVehicle.setOnAction(e -> {
			int index = getIndexFromRegNo(vehicleDisplay.getValue().toString());
			if (index != -999) {
				vehicleDetails.setText(vehicles.get(index).toString());
			}
		});
		 
		removeSelectedVehicle.setOnAction(e -> {
			int index = getIndexFromRegNo(vehicleDisplay.getValue().toString());
			if (index != -999) {
				vehicleDetails.setText(vehicles.get(index).getRegNo() + " has been removed!");
				vehicles.remove(index);
				vehicleDisplay.getItems().remove(index);
				}
		});
		 
		
		
		
		
		
		//Scene
		
		
		Scene scene = new Scene(screen, 500, 500, Color.GREY);
		
		
		
		stage.setScene(scene);
		stage.setTitle("Vehicle Manager");
		stage.show();
		
		
		
	}
	
	
	public static void main(String[] args) {
		launch(args);
	} 
	
	public int getIndexFromRegNo(String regNoIn) {
		for (int i=0; i<vehicles.size(); i++) {
			if (vehicles.get(i).getRegNo().equals(regNoIn)) {
				return i;
			}
		}
		return -999;
		
	}
}
