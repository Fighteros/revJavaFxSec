/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revjavafxseca;


import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author Ahemd M. Abd El-Ghany
 */
public class RevJavaFxsecA extends Application {
    Scene scene;
    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox root = getVbox();
        addUi(root);
        scene = new Scene(root, 570, 320);
        primaryStage.setTitle("Register Form");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    // getvbox with spacing 10
    public VBox getVbox(){
        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(10, 10, 10, 10));
        return vbox;
    }
    
    // add UI and Control
    public void addUi(VBox root){
        ToggleGroup  tgGender = new ToggleGroup();
        RadioButton radBtnMale  = new RadioButton("Male");
        RadioButton radBtnFemale  = new RadioButton("female");
        radBtnMale.setSelected(true);
        
        radBtnMale.setToggleGroup(tgGender);
        radBtnFemale.setToggleGroup(tgGender);
        
        Button btSignUp = new Button("Sign Up");
        appUtils.changeStroke(btSignUp);
        
        Label lbFormName = new Label("Sign Up");
        lbFormName.setFont(Font.font("Courier New Bold", FontWeight.BOLD, FontPosture.REGULAR ,34));
        
        ComboBox<String> cbRole = new ComboBox<>();
        ObservableList<String> olRoles = cbRole.getItems();
        olRoles.addAll("Professor", "Student", "Assistant Teacher");
        cbRole.setPromptText("Choose Role");
        
        CheckBox cbterms = new CheckBox("Agree on Terms");
        btSignUp.setVisible(false);
        handleCheckBox(cbterms, btSignUp);
        
        ListView<String> lvUsers = new ListView<>();
        ObservableList<String> olUsers = lvUsers.getItems();
        olUsers.addAll("Ahmed M.Abd El-Ghany", "Fighter Os", "The Who codes");
        
        root.getChildren().addAll(lbFormName, radBtnMale, radBtnFemale, cbRole, cbterms, btSignUp, lvUsers);
    }
    
    // handle checkbox
    public void handleCheckBox(CheckBox ckbox, Button btn){
        ckbox.selectedProperty().addListener((observable, oldValue, newValue) -> btn.setVisible(newValue));
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
