


	

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene; 
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class MainMenu extends Application { 

private AnchorPane MainScrene;
      private Stage primaryStage;

@Override
	public void start(Stage primaryStage) { 
		// Create a scene and place a button in the scene 
		
	this.primaryStage=primaryStage;
		
		
		try{
			primaryStage.setTitle("Main Menu"); 
			FXMLLoader loader= new FXMLLoader(MainMenu.class.getResource("view/MainScrene.fxml"));
			MainScrene = (AnchorPane) loader.load();
			System.out.println("here");
			Scene scene= new Scene(MainScrene);
			primaryStage.setScene(scene);
			primaryStage.show();
			
			
		}catch(Exception e){
			System.out.println("not working");
		}

	}
	public static void main(String[] args){
		launch(args);
	}
	public Stage getPrimaryStage(){
		return primaryStage;
	}
	}



