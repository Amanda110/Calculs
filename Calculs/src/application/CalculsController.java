package application;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculsController {

    @FXML
    private Button add;

    @FXML
    private Label res;

    @FXML
    private Button mult;

    @FXML
    private TextField txt2;

    @FXML
    private TextField txt1;

    @FXML
    private Button divi;

    @FXML
    private Button sous;
    
    // gestion des entrées numériques pour les textes
   
    public void checkNum(TextField a)
    {
    	try 
    	{	
			int nbr = Integer.parseInt(a.getText());
		} catch (NumberFormatException e) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setHeaderText("Attention - Erreur");
			alert.setTitle("Erreur");
			alert.setContentText("Tu dois écrire un nombre");
			alert.show();
			a.requestFocus();		
		}
    }

}
