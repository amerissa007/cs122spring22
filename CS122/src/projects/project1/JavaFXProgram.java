package projects.project1;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.Scene;
import javafx.stage.Stage;   

public class JavaFXProgram extends GridPane {


	public final TextField input = new TextField();
	public Label result = new Label();
	public final LinkedList list = new LinkedList();


	public JavaFXProgram() 
	{
		Label directionLabel = new Label("Directions: Type in only integers into the box.");
		Label inputLabel = new Label("Input:");
		Label outputLabel = new Label("Output:");


		Button AddButton = new Button("Add");
		AddButton.setOnAction(this::addToLinkedList);

		Button RemoveButton= new Button("Remove");
		RemoveButton.setOnAction(this::removeFromLinkedList);

		Button ClearButton= new Button("Clear");
		ClearButton.setOnAction(this::clearFromLinkedList);


		setAlignment(Pos.CENTER);
		setHgap(20);
		setVgap(10);
		setStyle("-fx-background-color: lightblue");

		add(directionLabel, 0, 0);
		add(inputLabel, 0, 2);
		add(input, 1, 2);
		add(outputLabel, 0, 3);
		add(result, 1, 3);
		add(AddButton, 2, 4);
		add(RemoveButton, 2, 5);
		add(ClearButton, 2, 6);
	}

	public void addToLinkedList(ActionEvent event) 
	{
		try {
			list.addToEnd(Integer.parseInt(input.getText()));
			result.setText(list.toString());
		}
		catch(NumberFormatException exception) {
			result.setText("Wrong Data Type. Enter Integers Only.");
		}

	}

	public void removeFromLinkedList(ActionEvent event) {
		list.removeLast();
		result.setText(list.toString());

	}

	public void clearFromLinkedList(ActionEvent event) {
		list.clear(); 
		result.setText(list.toString());

	}
}

