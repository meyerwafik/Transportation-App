/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectooad;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.Glow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
/**
 *
 * @author meyer
 */
public class Mainscreen {
    private Scene mainscene;
    private BorderPane pane1;
    private HBox hb1;
    private HBox hb;
    private StackPane sp;
    private  final double buttonheight = 50;
    private  final String font="Verdana";
    private  final String url ="projectooad/logo1.png";
    private final double length =650;
    private  final double width =900;

    public void buttons()
    {
    Button login = new Button("login");
    Button signup = new Button("Sign Up");
    Button faq = new Button("FAQs");
    faq.setStyle("-fx-background-color:#31658d");
    login.setStyle("-fx-background-color:#31658d");
    signup.setStyle("-fx-background-color:#31658d");
    login.setFont(Font.font(font));
    login.setTextFill(Color.WHITE);
    faq.setTextFill(Color.WHITE);
    signup.setFont(Font.font(font));
    signup.setTextFill(Color.WHITE);
    faq.setFont(Font.font(font, 25));
     login.setPrefSize(250, buttonheight+20);
     signup.setPrefSize(250, buttonheight+20);
     faq.setOnMouseEntered((MouseEvent event) -> {
         faq.setEffect(new Glow());
    });
    faq.setOnMouseExited((MouseEvent event) -> {
            faq.setEffect(null);
        });
     login.setOnMouseClicked((MouseEvent event) -> {
  GUImanager.getPrimaryStage().setScene(new Login().loginScene());         
    }
     );
     
     faq.setOnMouseClicked((MouseEvent event) -> {
  GUImanager.getPrimaryStage().setScene(new FAQ().faq());         
    }
     );
     login.setOnMouseEntered((MouseEvent event) -> {
         login.setEffect(new Glow());
    });
    login.setOnMouseExited((MouseEvent event) -> {
            login.setEffect(null);
        });
    signup.setOnMouseEntered((MouseEvent event) -> {
         signup.setEffect(new Glow());
    });
    signup.setOnMouseExited((MouseEvent event) -> {
            signup.setEffect(null);
        });
    signup.setOnMouseClicked((MouseEvent event) -> {
      GUImanager.getPrimaryStage().setScene(new SignUp().signupScene());  
    }
     );
    login.setAlignment(Pos.BASELINE_CENTER);
    signup.setAlignment(Pos.BASELINE_CENTER);
    hb.getChildren().add(faq);
    faq.setAlignment(Pos.BASELINE_CENTER);
    hb1.setAlignment(Pos.CENTER);
    hb1.getChildren().addAll(login,signup);
    
    }
    public  Scene getHomeScene()
    {
    pane1=new BorderPane();
    hb=new HBox(20);
    hb1=new HBox(20);
    buttons();
    hb1.setStyle("-fx-background-color:#1D3C54");
     hb.setStyle("-fx-background-color:#1D3C54");
    sp= new StackPane();
    sp.setStyle("-fx-background-color:#1D3C54");
    sp.setLayoutY(buttonheight);
    sp.setPrefSize(width, length-(2*buttonheight + 60));
    sp.setAlignment(Pos.CENTER);
    hb1.setLayoutY(length-(buttonheight+60));
    createBackground();
    pane1.setCenter(sp);
    pane1.setBottom(hb1);
    mainscene=new Scene(pane1,width,length);
    hb1.setPrefSize(width, buttonheight+60);
    hb1.setAlignment(Pos.CENTER);
    hb.setAlignment(Pos.CENTER_RIGHT);
    pane1.setTop(hb);
    return mainscene;
     }
 private void createBackground()
    {
        Image img = new Image(url);
        ImageView background = new ImageView(img);
        background.setFitHeight(length-(2*buttonheight+20));
        background.setFitWidth(width);
        sp.getChildren().add(background);
     
}
    
}
