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
        GridPane landingPane = createRegForm(); 
        
        addRegUi(mainPane);
        addSignInUi(landingPane);
        
        SignUpScene = new Scene(mainPane, 670, 320);
        SignInScene = new Scene(landingPane ,670, 320);
        
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
    
    // Font name Courier New Bold
   
    public void addRegUi(GridPane signUpPanee) {
        Label lbformName = new Label("Registeraion Form");
        lbformName.setFont(Font.font("Courier New Bold", FontWeight.BOLD, FontPosture.REGULAR, 34));
        Label lbFullName = new Label("FullName: ");
        Label lbEmail = new Label("Email: ");
        Label lbPass = new Label("Password: ");

        TextField tfFullName = new TextField();
        TextField tfEmail = new TextField();
        PasswordField tfPassword = new PasswordField();

        Button btSubmit = new Button("Submit");
        // get from apputils the function that returns the primaryStage
        btSubmit.setOnAction(event -> {
            appUtils.getStage(event).setScene(SignInScene);
        });
        btSubmit.setMaxSize(220, 30);
        btSubmit.setPrefHeight(320);
        

        signUpPanee.add(lbformName, 0, 0, 2, 1);
        signUpPanee.addRow(1, lbFullName, tfFullName);
        signUpPanee.addRow(2, lbEmail, tfEmail);
        signUpPanee.addRow(3, lbPass, tfPassword);
        signUpPanee.add(btSubmit, 1, 4, 2, 1);
    }
    
    // add signIn UI
    public void addSignInUi(GridPane signInPanee){
       Label lbFormName = new Label("Sign in");
       lbFormName.setFont(Font.font("Courier New Bold", FontWeight.BOLD, FontPosture.REGULAR, 34));
       
       TextField tfEmail = new TextField();
       PasswordField pfPassword  = new PasswordField();
       
       tfEmail.setPromptText("Email");
       pfPassword.setPromptText("Password");
       
       Button btSignIn = new Button("Sign In");
       Button btSignUp = new Button("Sign Up");
       
       btSignIn.setMaxSize(150,  35);
       btSignIn.setPrefSize(320, 50);
       btSignUp.setPrefSize(320, 50);
       btSignUp.setMaxSize(150, 30);
       
       
       btSignUp.setOnAction(e -> appUtils.getStage(e).setScene(SignUpScene));
       
       signInPanee.add(lbFormName, 0, 0, 2, 1);
       signInPanee.addRow(1, tfEmail);
       signInPanee.addRow(2, pfPassword);
       signInPanee.add(btSignIn, 0, 3, 2, 1);
       signInPanee.add(btSignUp, 0, 4, 2, 1);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
