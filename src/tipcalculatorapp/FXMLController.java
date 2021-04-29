/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipcalculatorapp;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author User
 */
public class FXMLController implements Initializable {
    
    @FXML
    private TextField tagihanMakanTextField;
    @FXML
    private TextField prosentaseTipTextField;
    @FXML
    private TextField jumlahTipTextField;
    @FXML
    private TextField totalTagihanTextField;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    private void hitungButtonPressed (ActionEvent event) {
        double tagihanMakan = Double.parseDouble(tagihanMakanTextField.getText());
        double prosentaseTip = Double.parseDouble(prosentaseTipTextField.getText());
        
        double jumlahTip = tagihanMakan * prosentaseTip/100.0;
        double totalTagihan = tagihanMakan + jumlahTip;
        
        jumlahTipTextField.setText(Double.toString(jumlahTip));
        totalTagihanTextField.setText(Double.toString(jumlahTip));
    }
    
}
