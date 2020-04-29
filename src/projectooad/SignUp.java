/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectooad;

import Factory.CustomerFactory1;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import ooadclasses.pkg1.Customer;

/**
 *
 * @author meyer
 */
public class SignUp {
        HBox hb ;
    BorderPane p;
     private static final double width = 900;
    private static final double length = 650;
    private static final double buttonheight= 50;
    private static final String font="Verdana";
    public  Scene signupScene(){
        //GridPane with 10px padding around edge
        p=new BorderPane();
        hb=new HBox();
        hb.setPrefSize(width, buttonheight);
      
       p.setTop(hb);
       

        GridPane grid = new GridPane();
 p.setCenter(grid);
        grid.setPadding(new Insets(10, 10, 10, 10));

        grid.setVgap(8);

        grid.setHgap(10);



        //Name Label - constrains use (child, column, row)

        Label nameLabel = new Label("Full Name:");

        GridPane.setConstraints(nameLabel, 0, 0);



        //Name Input

        TextField nameInput = new TextField();

        GridPane.setConstraints(nameInput, 1, 0);
        
        
        //Age Label 

        Label AgeLabel = new Label("Age:");

        GridPane.setConstraints(AgeLabel, 0, 6);

        //Age Input

        TextField Ageinput = new TextField();

        GridPane.setConstraints(Ageinput, 1, 6);
        
        //credit card Label 

        Label creditcard = new Label("credit card number:");

        GridPane.setConstraints(creditcard, 0, 2);

        //credit card Input

        TextField creditcardInput = new TextField();

        GridPane.setConstraints(creditcardInput, 1, 2);
        
        //email Label 

        Label emailLabel = new Label("Email:");

        GridPane.setConstraints(emailLabel, 0, 3);



        //email Input

        TextField emailInput = new TextField();

        GridPane.setConstraints(emailInput, 1, 3);
        
        
        //Password Label

        Label passLabel = new Label("Password:");

        GridPane.setConstraints(passLabel, 0, 4);



        //Password Input

        PasswordField passInput = new PasswordField();

        passInput.setPromptText("password");

        GridPane.setConstraints(passInput, 1, 4);

        //Retype Password Label

        Label passLabel2 = new Label("Retype Password:");

        GridPane.setConstraints(passLabel2, 0, 5);



        //Password ReInput

        PasswordField passreInput = new PasswordField();

        passreInput.setPromptText("Retype password");

        GridPane.setConstraints(passreInput, 1, 5);
        
        //mobile number Label 

        Label MobLabel = new Label("Mobile number:");

        GridPane.setConstraints(MobLabel, 0, 1);



        //mobile Input

        TextField MobInput = new TextField();

        GridPane.setConstraints(MobInput, 1, 1);

        //Register

        Button RegisterButton = new Button("sign up");
         RegisterButton.setOnMouseClicked((MouseEvent event) -> {
             Customer c2=CustomerFactory1.customerfactory();
             c2.signup(nameInput.getText(), MobInput.getText(), emailInput.getText(), passInput.getText(),
                     passreInput.getText(), creditcardInput.getText());
  GUImanager.getPrimaryStage().setScene(new Login().loginScene());         
    }
     );

        GridPane.setConstraints(RegisterButton, 1, 7);
//         RegisterButton.setOnMouseClicked((MouseEvent event) -> {
//             
//                 Stage s= NewFXMain.getPrimaryStage();
//         s.setScene(new ViewManager().getHomeScene());
//         });


        //Add everything to grid
        

        grid.getChildren().addAll(nameLabel, nameInput,MobLabel,MobInput,creditcard,creditcardInput,emailLabel,emailInput, passLabel,passreInput,passLabel2, passInput, RegisterButton);
        grid.setPrefSize(900 ,650);
        grid.setAlignment(Pos.CENTER); 


        Scene scene = new Scene(p, 900, 650);
        return scene;

        
    }
 
    
}
