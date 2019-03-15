/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmm;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author feras
 */
public class loginf extends Application {
    int balance;
    @Override
    public void start(Stage primaryStage) {
    primaryStage.setTitle("login");
    Atmm atm=new Atmm(primaryStage);
    second s=new second(primaryStage);
    depositgui d=new depositgui(primaryStage);
    withdraw w=new withdraw(primaryStage);
    balancegui b=new balancegui(primaryStage);
    atm.firstdraw();
    s.seconddraw();
    d.depositdraw();
    w.withdrawdraw();
    b.balancedraw();
    atm.setsecond(s);
    s.setdepositgui(d);
    d.setSecond(s);
    s.setwithdraw(w);
    w.setSecond(s);
    s.setbalancegui(b);
    b.setSecond(s);
    
    
    
    
    
    
    primaryStage.setScene(atm.getScene());
    
       primaryStage.show();
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        
    }}
    


 