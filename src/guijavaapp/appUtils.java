/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guijavaapp;

import javafx.event.Event;
import javafx.scene.Node;
import javafx.stage.Stage;

/**
 *
 * @author Ahmed Abd ElGhany
 */
public class appUtils {
    
    public static Stage getStage(Event e){
    Stage anonStage = (Stage) ((Node) e.getSource()).getScene().getWindow();
    return anonStage;
    
    }
    
}
