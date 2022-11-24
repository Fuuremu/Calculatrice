package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class VueController {
	private float part1;
	private String resultat = "";
	private float fin;
	String buttonOp;
	
	@FXML
	private Button btnClick0;
	
	@FXML
	private Button btnClick1;
	
	@FXML
	private Button btnClick2;
	
	@FXML
	private Button btnClick3;
	
	@FXML
	private Button btnClick4;
	
	@FXML
	private Button btnClick5;
	
	@FXML
	private Button btnClick6;
	
	@FXML
	private Button btnClick7;
	
	@FXML
	private Button btnClick8;
	
	@FXML
	private Button btnClick9;
	
	@FXML
	private Button btnClickPlus;
	
	@FXML
	private Button btnClickMoins;
	
	@FXML
	private Button btnClickMultiplier;
	
	@FXML
	private Button btnClickDiviser;
	
	@FXML
	private Button btnClickEgal;
	
	@FXML
	private Button btnClickVirgule;
	
	@FXML
	private Label lblResultat;
	
	@FXML
	private TextField txtSaisieUser;

	public void clickMe(ActionEvent e) {
		lblResultat.setText(lblResultat.getText() + txtSaisieUser.getText());
	}
	
	public void clickChiffre(ActionEvent e) {
		/*Button button = (Button)e.getSource();
        final int buttonNbr = Integer.parseInt(button.getText(),10);
		resultat = (resultat * 10) + buttonNbr;
		txtSaisieUser.setText(Integer.toString(resultat));*/
		
		Button button = (Button)e.getSource();
		resultat = resultat + button.getText();
		txtSaisieUser.setText(resultat);
	}
	
	public void clickOperateur(ActionEvent e) {
		Button button = (Button)e.getSource();
        buttonOp = button.getText();
        
        part1 = Float.parseFloat(resultat);
        resultat = "";
        
		txtSaisieUser.setText(buttonOp);
	}
	
	public void clickVirgule(ActionEvent e) {
		resultat = resultat + ".";
		txtSaisieUser.setText(resultat);
	}
	
	public void clicEgal(ActionEvent e) {
		switch (buttonOp) {
		case "+":
			fin=part1 + Float.parseFloat(resultat);
			break;
		case "-":
			fin=part1 - Float.parseFloat(resultat);
			break;
		case "x":
			fin=part1 * Float.parseFloat(resultat);
			break;
		case "/":
			fin=part1 / Float.parseFloat(resultat);
			break;
		default:
			break;
		}
		txtSaisieUser.setText(Float.toString(fin));
	}
}
