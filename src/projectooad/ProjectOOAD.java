/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectooad;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author meyer
 */

public class ProjectOOAD extends Application {
     
     static final String driver="com.mysql.jdbc.driver";
       static final String url= "jdbc:mysql://127.0.0.1:3306/ooad";
     
       private static Connection con=null;
    @Override
    public void start(Stage primaryStage)
    {
//        c1=Factory.CustomerFactory1.customerfactory();
       GUImanager x = new GUImanager();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    public static Connection getconnection()throws Exception{
    if(con==null)
    {
    try{
        con=DriverManager.getConnection(url, username, pass); 
        System.out.println("Connected: ");
        }
        catch(SQLException e){
        System.out.println("TOUT");
        }
    }
        
    return con;
    }
}
