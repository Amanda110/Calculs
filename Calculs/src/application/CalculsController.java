package application;

import java.text.DecimalFormat;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

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
			Double.parseDouble(a.getText());
		} 
    	catch (NumberFormatException e) 
    	{
			Alert alert = new Alert(AlertType.ERROR);
			alert.setHeaderText("Attention - Erreur");
			alert.setTitle("Erreur");
			alert.setContentText("Tu dois écrire un nombre");
			alert.show();
			a.requestFocus();		
		}
    }

   @FXML
   void verifText(KeyEvent e)
   {
	   TextField txt = (TextField)e.getSource();
	   checkNum(txt);
   }
    
   @FXML
   void calculs(ActionEvent e)
   {
	 double num1 = Double.parseDouble(txt1.getText());
	 double num2 = Double.parseDouble(txt2.getText()); 
	 double resultat = 0;		  
	 Button btn = (Button)e.getSource();
	 
	 if(btn.getId().equals("add"))
	 	resultat = num1 + num2;
	 else
		 if(btn.getId().equals("sous"))
			 resultat = num1 - num2;
		 else
			 if(btn.getId().equals("mult"))
				 resultat = num1 * num2;
			 else
				 if(btn.getId().equals("divi"))
					 resultat = num1 / num2;
	
	 DecimalFormat nformat = new DecimalFormat("#0.00");
	 res.setText(nformat.format(resultat));
	 
   }   
   
}
