/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmm;

import static java.awt.SystemColor.text;
import java.util.Scanner;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.effect.BlendMode;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import static javax.swing.Spring.width;
import static sun.swing.SwingUtilities2.submit;

/**
 *
 * @author feras
 */
public class second {
    Scene scene;
    Atmm atm;
    Stage stage;
    depositgui d;
    withdraw w;
    balancegui b;
    int with;
    int count=4;
    int balance;
    int c=-1;
    int f=0;
 int q;
    int a;
    String[] his=new String[100];
    public second(Stage stage){
      this.stage=stage; 
  }public int depositcalc(int x){
      balance+=x;
      his[f]="Deposit by "+x;
       c=f;
      f++;
      a=c;
      return balance;
  }public int withdrawcalc(int y)
  {
      if(balance>y){
      balance-=y;
      his[f]="Withdraw by "+y;
      c=f;
      f++;
      a=c;
      
      return balance;
      }
      else return 0;
  }public String balanc(){
            String bal = Integer.toString(balance);
            his[f]="Balance is "+balance;
              c=f-1;
      f++;
      a=c;
     return bal;
  }
    public void seconddraw(){
Button depositb=new Button("Deposit");
Button withdrawb=new Button("Withdraw");
Button balanceb=new Button("Balance");
final Button next=new Button("Next");
final Button perv=new Button("Pervious");
final GridPane grid=new GridPane();
grid.add(depositb,0,0);
grid.add(withdrawb,0,1);
grid.add(balanceb,0,2);
grid.add(next,0,3);
grid.add(perv,1,3);
withdrawb.setStyle("-fx-background-color: #060000;;-fx-text-fill:#fbfbfb;");
depositb.setStyle("-fx-background-color: #07326a;-fx-text-fill:#fbfbfb;");
balanceb.setStyle("-fx-background-color: #9d1a8f;-fx-text-fill:#fbfbfb;");

perv.setStyle("-fx-background-color: #0d1773;-fx-text-fill:#fbfbfb;");


final Label number=new Label();
   grid.add(number,0,4);
                 next.setDisable(true);

depositb.setOnAction(new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent t) {
        stage.setScene(d.getScene());     
        perv.setDisable(false);
    }
});
withdrawb.setOnAction(new EventHandler<ActionEvent>() {

    @Override
    public void handle(ActionEvent t) {
               stage.setScene(w.getScene());
               perv.setDisable(false);

    }
});
balanceb.setOnAction(new EventHandler<ActionEvent>() {

    @Override
    public void handle(ActionEvent t) {
        String y = balanc();
        perv.setDisable(false);
        
   number.setText("your balance: "+y);
    }
});
perv.setDisable(true);
perv.setOnAction(new EventHandler<ActionEvent>() {

    @Override
    public void handle(ActionEvent t) {
        
        if(c<0){
            number.setText("no pervious");
            perv.setDisable(true);
            c--;
        }else
            
            System.out.println(his[c]);
          if(c>a-5)
          {number.setText(his[c]);
            c--;
          q=1;
          
              }
          else{
              perv.setDisable(true);
              number.setText("5 transactions only");
              c--;

         }if (q==1){
              next.setDisable(false);
              
          }
        
    }
});

next.setOnAction(new EventHandler<ActionEvent>() {

    @Override
    public void handle(ActionEvent t) {
    
        System.out.println(his[c+2]);
                    number.setText(his[c+2]);
                    c++;
                    perv.setDisable(false);
                    if (c>=a)
                        next.setDisable(true);

    }
});

scene=new Scene(grid,200,200);
}
    public Scene getScene(){
        return this.scene;
    }
    public void setatm(Atmm atm){
        this.atm=atm;
    }
public void setdepositgui(depositgui d){
    this.d=d;
}public void setwithdraw(withdraw w){
    this.w=w;
}public void setbalancegui(balancegui b){
    this.b=b;
}
}

