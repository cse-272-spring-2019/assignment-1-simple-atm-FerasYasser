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
public class depositgui {
    Scene scene;
    second s;
    withdraw w;
    Stage stage;
    Atmm atm;
    int balance;
    int countw;
   
    public depositgui(Stage stage){
        this.stage=stage;
    }
    public void depositdraw()
    { final TextField number=new TextField();
    Button ok=new Button("Ok");
    Label l=new Label("Deposit by: ");
    Button back=new Button("Back");
    GridPane grid=new GridPane();
    grid.add(number,0,1);
    grid.add(l,0,0);
    grid.add(ok,0,2);
    grid.add(back, 0, 3);
    Label enter=new Label("please press enter when done");
      grid.add(enter,0,4);
    ok.setDefaultButton(true);
    back.setStyle("-fx-background-color: #060000;-fx-border-color: #116a07;-fx-text-fill:#fbfbfb;");
    //ok.setVisible(false);
    ok.setOnAction(new EventHandler<ActionEvent>() {

        @Override
        public void handle(ActionEvent t) {
         
              String num=number.getText();
        int dep=Integer.parseInt(num);
       s.depositcalc(dep);
            
        stage.setScene(s.getScene());
       
        }
    });
    back.setOnAction(new EventHandler<ActionEvent>() {

        @Override
        public void handle(ActionEvent t) {
     stage.setScene(s.getScene());
        }
    });
    scene=new Scene(grid,200,100);
     
         
    } 
    public Scene getScene(){
    return this .scene;
}public void setSecond(second s){
        this.s=s;
} public void setAtm(Atmm atm){
        this.atm=atm;
}public void history(int x){
    String[]deposi= new String[countw];
    for(int i=0;i<countw;i++){
        System.out.println("deposit is"+x);
    }
}
}
    

