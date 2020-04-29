/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectooad;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.effect.Glow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import ooadclasses.pkg1.Customer;

/**
 *
 * @author meyer
 */
public class Login {
    private  final String url ="projectooad/logo1.png"; 
    HBox hb;
     
    BorderPane p;
    private static final double width = 900;
    private static final double length = 650;
    private static final double buttonheight= 50;
    private static final String font="Verdana";
    
    public  Scene loginScene(){
        
        p = new BorderPane();
       hb=new HBox();
       hb.setPrefSize(width, buttonheight);
     
       p.setTop(hb);

        //GridPane with 10px padding around edge

        GridPane grid = new GridPane();

        grid.setPadding(new Insets(10, 10, 10, 10));

        grid.setVgap(8);

        grid.setHgap(10);
        



        //Name Label - constrains use (child, column, row)

        Label nameLabel = new Label("Username:");

        GridPane.setConstraints(nameLabel, 0, 0);



        //Name Input

        TextField nameInput = new TextField();

        GridPane.setConstraints(nameInput, 1, 0);



        //Password Label

        Label passLabel = new Label("Password:");

        GridPane.setConstraints(passLabel, 0, 1);



        //Password Input

        PasswordField passInput = new PasswordField();

        passInput.setPromptText("password");

        GridPane.setConstraints(passInput, 1, 1);



        //Login

        Button loginButton = new Button("Log In");

        GridPane.setConstraints(loginButton, 1, 2);
        Label check = new Label("Wrong username or password");

        GridPane.setConstraints(check, 1, 3);
//        loginButton.setOnMouseClicked(e->{
//            Stage s= NewFXMain.getPrimaryStage();
//         s.setScene(new HomeScene().getScene());
//        }
//        );

  loginButton.setOnMouseClicked((MouseEvent event) -> {
      Customer c1=new Customer();
      if(c1.login(nameInput.getText(), passInput.getText())){
         GUImanager.getPrimaryStage().setScene(new RequestRide().RequestRide(c1)); 
      }
      else{
         grid.getChildren().add(check);
      }
       
    }
     );
      Button ReturnBack = new Button("Retrurn to home");
      ReturnBack.setStyle("-fx-background-color:#31658d");
      ReturnBack.setFont(Font.font(font));
      ReturnBack.setTextFill(Color.WHITE);
      ReturnBack.setOnMouseEntered((MouseEvent event) -> {
         ReturnBack.setEffect(new Glow());
    });
    ReturnBack.setOnMouseExited((MouseEvent event) -> {
            ReturnBack.setEffect(null);
        });
      ReturnBack.setOnMouseClicked((MouseEvent event) -> {
  GUImanager.getPrimaryStage().setScene(new Mainscreen().getHomeScene());         
    }
     );
        //Add everything to grid
        HBox hb = new HBox();
        hb.getChildren().add(ReturnBack);
        grid.getChildren().addAll(nameLabel, nameInput, passLabel, passInput, loginButton);
        grid.setAlignment(Pos.CENTER); 
        hb.setAlignment(Pos.BOTTOM_CENTER);
        p.setCenter(grid);
        p.setBottom(hb);
        
       


        Scene scene = new Scene(p, 900, 650);
        return scene;

       

    }
    
    
}
