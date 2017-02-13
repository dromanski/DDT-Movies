

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CustomerUI {
	
	private AnchorPane MainScrene;
    private Stage primaryStage;

@Override
	public void start(Stage primaryStage) { 
		// Create a scene and place a button in the scene 
		
	this.primaryStage=primaryStage;
		
		
		try{
			primaryStage.setTitle("CustomerInfo"); 
			FXMLLoader loader= new FXMLLoader(MainMenu.class.getResource("/CustomerInfo.fxml"));
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

	CustomerUI register = new CustomerUI();
	@FXML
	private TextField fName;
	@FXML
	private TextField lName;
	@FXML
	private TextField pinn;
	@FXML
	private TextField birthDay;
	@FXML
	private TextField birthMonth;
	@FXML
	private TextField birthYear;
	@FXML
	private TextField address;
	@FXML
	private TextField phone;
	@FXML
	private TextField credit;
	@FXML
	private TextField email;
	@FXML
	private Label txtpinn;
	@FXML
	private TextField add;

	public void storeINfo(ActionEvent event) {
		Customer temp = new Customer(fName.getText(), lName.getText(), pinn.getText(), birth.getText(),
				address.getText(), phone.getText(), credit.getText(), email.getText());

		System.out.println(temp.fn);
	}

	public void generatePin(ActionEvent event) {
		// incremently add in pinn numbers, System.out.print (zeros)
		int pinn = 0;
	if(pinn<10000){	
		
		if (pinn == 0) {
			pinn = 1;
			txtpinn.setText("000" + pinn);

		}
		else if (pinn < 1000) {
			pinn++;
			if (pinn < 100) {

				if (pinn < 10) {
					txtpinn.setText("000" + pinn);
				}
				else {
					txtpinn.setText("00" + pinn);
				}
			}else{
				txtpinn.setText("0"+pinn);
			}

		}
		}
		
	public void getFName (ActionEvent event){
		
		fName.getText();
		
		
	}
	}
}

