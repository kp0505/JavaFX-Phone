package keypad;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.application.Application;
import javafx.scene.image.*;


public class PAssign07 extends Application {
	@Override

	public void start(Stage primaryStage) {
		
		//image loading
		Image oneImage = new Image("file:E:/Java workspace/assignments/phone.png");
		ImageView view = new ImageView(oneImage);
		Image twoImage = new Image("file:E:/Java workspace/assignments/deleter.png");
		ImageView viewSecond = new ImageView(twoImage);
		view.setFitHeight(40);
		view.setFitWidth(40);
		viewSecond.setFitHeight(40);
		viewSecond.setFitWidth(40);
		view.setPreserveRatio(true);
		viewSecond.setPreserveRatio(true);
		
		
		//textfields
		TextField seeAll = new TextField();
		seeAll.setEditable(false);
		
		//buttons
		Button numOne = new Button("1");
		Button numTwo = new Button("2");
		Button numThree = new Button("3");
		Button numFour = new Button("4");
		Button numFive = new Button("5");
		Button numSix = new Button("6");
		Button numSeven = new Button("7");
		Button numEight = new Button("8");
		Button numNine = new Button("9");
		Button numZero = new Button("0");
		Button keyStar = new Button("*");
		Button keyPound = new Button("#");
		Button callNow = new Button();
		Button delete = new Button();
		callNow.setGraphic(view);
		delete.setGraphic(viewSecond);
		
		//Button resizer
		// Numpad button sizer
				Button[] buttonResizer = { numOne, numTwo, numThree, numFour, numFive, numSix, numSeven, numEight, numNine,
						numZero, keyStar, keyPound };
				for (int i = 0; i < buttonResizer.length; i++) {
					buttonResizer[i].setPrefSize(100, 100);
				}
		
		//gridPane and scene configuration
		GridPane mainGridPane = new GridPane();
		mainGridPane.setStyle("-fx-background-color: gray");
		Scene mainScene = new Scene(mainGridPane, 300, 100);
		
		//Gridpane button and textfield orginization
		
		mainGridPane.add(numOne, 0, 0);
		mainGridPane.add(numTwo, 1, 0);
		mainGridPane.add(numThree, 2, 0);
		mainGridPane.add(numFour, 0, 1);
		mainGridPane.add(numFive, 1, 1);
		mainGridPane.add(numSix, 2, 1);
		mainGridPane.add(numSeven, 0, 2);
		mainGridPane.add(numEight, 1, 2);
		mainGridPane.add(numNine, 2, 2);
		mainGridPane.add(numZero, 1, 3); // Bottom row
		mainGridPane.add(keyStar, 0, 3); // Bottom row
		mainGridPane.add(keyPound, 2, 3); // Bottom row
		mainGridPane.add(delete, 3, 1);
		mainGridPane.add(callNow, 1, 4);
		mainGridPane.add(seeAll, 3, 0);
		
		
		
		
		
		
		
		
		
		
		
		//Scene
		primaryStage.setScene(mainScene);
		primaryStage.setTitle("Phone");
		primaryStage.show();
	}
	

	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	

}
