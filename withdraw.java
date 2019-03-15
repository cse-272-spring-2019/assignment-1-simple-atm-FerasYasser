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
public class withdraw { Scene scene;
    second s;
    Stage stage;
    Atmm atm;
    int balance;
    int countw;
    public withdraw(Stage stage){
        this.stage=stage;
    }
    public void withdrawdraw()
    { final TextField number=new TextField();
     Button ok=new Button("Ok");
      final GridPane grid=new GridPane();
    grid.add(number,0,1);
    Button back=new Button("Back");
      Label l=new Label("Withdraw by: ");
      Label enter=new Label("please press enter when done");
      grid.add(enter,0,4);
    grid.add(ok,0,2);
     grid.add(l,0,0);
       grid.add(back, 0, 3);
        ok.setDefaultButton(true);
        back.setStyle("-fx-background-color: #060000;-fx-border-color: #116a07;-fx-text-fill:#fbfbfb;");
        //ok.setVisible(false);
    ok.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent t) {
     String num=number.getText();
         int with=Integer.parseInt(num);

         if(s.withdrawcalc(with)==0){
                Label error=new Label("no enough balance");
        grid.add(error,0,4);
         }else
                              stage.setScene(s.getScene());


        }}
    );
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
}}

