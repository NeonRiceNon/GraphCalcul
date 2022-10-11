package com.example.graphcalcul;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

public class HelloController {

    @FXML
    private Text output;
    private long num1 = 0;
    private long num2 = 0;

    private boolean start = true;

    private String operator = "";
    private Model model = new Model();

    @FXML
    private  void processNum (ActionEvent event){
        if(start){
            output.setText("");
            start = false;
        }
        String value = ((Button)event.getSource()).getText();
        output.setText(output.getText()+value);

    }
    @FXML
    private  void processOperator (ActionEvent event){
        String value = ((Button)event.getSource()).getText();
        if (!"=".equals(value)){   //если не =
            if (!operator.isEmpty()) return;  //и если пустая
            operator = value;   //присваиваем value
            num1 = Long.parseLong(output.getText());
            output.setText("");
        }else {
            if(operator.isEmpty())  return;
            output.setText(String.valueOf(model.calculation( num1, Long.parseLong(output.getText()), operator )));
            operator = "";
            start = true;
        }

    }

}