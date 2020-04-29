/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectooad;

import javafx.stage.Stage;

/**
 *
 * @author meyer
 */
public class GUImanager {
     private static Stage pStage;
     GUImanager()
    {
        pStage=new Stage();
        pStage.setScene(new Mainscreen().getHomeScene());
        pStage.show();
    }
    public static Stage getPrimaryStage()
    {
        return pStage;
    }
    public static void setPrimaryStage(Stage x)
    {
       pStage=x;
    }
     
}
