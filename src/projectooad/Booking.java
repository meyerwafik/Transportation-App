package projectooad;


import javafx.scene.*;
import javafx.geometry.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

/**
 *
 * @author Qimo
 */

public class Booking
{
    HBox hb ;
    BorderPane p;
    
    private static final double width = 900;
    private static final double length = 650;
    private static final double buttonheight = 50;
    private static final String font = "Verdana";
    
    public  Scene laterScene()
    {
    
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

        //Month Label - constrains use (child, column, row)

        Label MonthLabel = new Label("Month:");

        GridPane.setConstraints(MonthLabel, 0, 0);


        //Month Input

        TextField MonthInput = new TextField();

        GridPane.setConstraints(MonthInput, 1, 0);
        
        
        //Day Label 
        Label DayLabel = new Label("Day:");
        GridPane.setConstraints(DayLabel, 0, 1);

        //Day Input
        TextField DayInput = new TextField();
        GridPane.setConstraints(DayInput, 1, 1);
        
        //Time Label 
        Label TimeLabel = new Label("Time:");
        GridPane.setConstraints(TimeLabel, 0, 2);

        //Time Input
        TextField TimeInput = new TextField();
        GridPane.setConstraints(TimeInput, 1, 2);
        

        //Book button
        Button BookButton = new Button("Book trip");
        GridPane.setConstraints(BookButton, 1, 4);
         

        //Add everything to grid
        grid.getChildren().addAll(MonthLabel, MonthInput, DayLabel,DayInput,
                TimeLabel, TimeInput, BookButton);
        grid.setPrefSize(900 ,650);
        grid.setAlignment(Pos.CENTER); 


        Scene scene = new Scene(p, 900, 650);
        return scene;

        
    }
}
