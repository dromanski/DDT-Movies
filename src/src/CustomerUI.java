

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CustomerUI {

	CustomerUI register = new CustomerUI();
	@FXML
	private TextField fName;
	@FXML
	private TextField lName;
	@FXML
	private TextField pinn;
	@FXML
	private TextField birth;
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
		}
	}


