/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmm;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author feras
 */
public class balancegui {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    Scene scene;
    second s;
    withdraw w;
    Stage stage;
    Atmm atm;
    int balance;
    int y;
    public balancegui(Stage stage){
        this.stage=stage;
    }
    
  public void balancedraw()
    {  
        Label number=new Label("your balance is:");
    Button back=new Button("back");
    GridPane grid=new GridPane();
    grid.add(number,0,0);
    grid.add(back, 0, 2);
    back.setOnAction(new EventHandler<ActionEvent>() {

        @Override
        public void handle(ActionEvent t) {
        stage.setScene(s.getScene());
        }
    });
    scene=new Scene(grid,400,200);
    } 
    public Scene getScene(){
    return this .scene;
}public void setSecond(second s){
        this.s=s;
} public void setAtm(Atmm atm){
        this.atm=atm;
}
}




