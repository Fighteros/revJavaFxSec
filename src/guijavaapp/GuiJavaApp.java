/*
 * 
 * Created By Ahmed M. Abd El-Ghany
 * 
 */
package guijavaapp;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author Ahmed Abd ElGhany
 */
public class GuiJavaApp extends Application {

    Scene SignUpScene, SignInScene;

    @Override
    public void start(Stage primaryStage) {
        GridPane mainPane = createRegForm();
        addRegUi(mainPane);
        SignUpScene = new Scene(mainPane, 670, 320);
        primaryStage.setTitle("Register now");
        primaryStage.setScene(SignUpScene);
        primaryStage.show();
    }

    // create GridPane
    public GridPane createRegForm() {
        GridPane signUpPane = new GridPane();
        signUpPane.setAlignment(Pos.CENTER);
        signUpPane.setHgap(10);
        signUpPane.setVgap(10);
        signUpPane.setPadding(new Insets(10, 10, 10, 10));
        return signUpPane;
    }
    
    // add UI to sign up form
    // this adds rows not very handy
        /*
        signUpPanee.add(lbFullName, 0, 1);
        signUpPanee.add(tfFullName, 1, 1);
        signUpPanee.add(lbEmail, 0, 2);
        signUpPanee.add(tfEmail, 1, 2);
        signUpPanee.add(lbPass, 0, 3);
        signUpPanee.add(tfPassword, 1, 3);
        =========================
        signUpPanee.addRow(0, lbformName);
        signUpPanee.addRow(1, lbFullName, tfFullName);
        signUpPanee.addRow(2, lbEmail, tfEmail);
        signUpPanee.addRow(3, lbPass, tfPassword);
        signUpPanee.addRow(4, btSubmit);
        
        */
   
    public void addRegUi(GridPane signUpPanee) {
        Label lbformName = new Label("Registeraion Form");
        lbformName.setFont(Font.font("Calibri", FontWeight.BOLD, FontPosture.REGULAR, 34));
        Label lbFullName = new Label("FullName: ");
        Label lbEmail = new Label("Email: ");
        Label lbPass = new Label("Password: ");

        TextField tfFullName = new TextField();
        TextField tfEmail = new TextField();
        PasswordField tfPassword = new PasswordField();

        Button btSubmit = new Button("Submit");
        // get from apputils the function that returns the primaryStage
        btSubmit.setOnAction(event -> appUtils.getStage(event).setScene(SignInScene));
        btSubmit.setMaxSize(100, 20);

        signUpPanee.add(lbformName, 0, 0, 2, 1);
        signUpPanee.addRow(1, lbFullName, tfFullName);
        signUpPanee.addRow(2, lbEmail, tfEmail);
        signUpPanee.addRow(3, lbPass, tfPassword);
        signUpPanee.add(btSubmit, 0, 4, 2, 1);
    }
    
    // add signIn UI
    public void addSignInUi(GridPane signInPanee){
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
