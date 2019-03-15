/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmm;

import static java.awt.SystemColor.text;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import static javax.swing.Spring.width;
import static sun.swing.SwingUtilities2.submit;

/**
 *
 * @author feras
 */
    public class Atmm {
    Scene scene;
second s;
Stage stage;
  data a;
  depositgui d;
  public Atmm(Stage stage){
      this.stage=stage;
  }
    
        public void firstdraw(){
            a=new data();
      
    
     Label passwordlabel=new Label("         Password ");
   
    final Label vali=new Label();
     final PasswordField passwordf=new PasswordField();
     Button submit=new Button("Submit");
    GridPane xxx=new GridPane();
   xxx.add(vali,1,3);
    xxx.add(passwordlabel, 0, 1);
    
    xxx.add(passwordf, 1, 1);
    xxx.add(submit, 1, 2);
    submit.setDefaultButton(true);
    submit.setOnAction(new EventHandler<ActionEvent>() {

          @Override
          public void handle(ActionEvent t) {
              
              String password=passwordf.getText();
             boolean valid=a.validate(password);
                      if (valid)
                          stage.setScene(s.getScene());
                      else
              vali.setText("Incorrect password");
          }
          
      });
        scene=new Scene(xxx,250,100);
   
    }
public Scene getScene(){
    return this .scene;
}public void setsecond (second s){
    this.s=s;
}     public void setDepositgui(depositgui d){
    this.d=d;
}
    }
    

