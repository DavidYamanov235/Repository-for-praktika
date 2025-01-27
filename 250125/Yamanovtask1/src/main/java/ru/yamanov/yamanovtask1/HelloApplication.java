package ru.yamanov.yamanovtask1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.geom.Arc2D;
import java.io.IOException;

import static java.lang.Math.*;
import static java.lang.Math.pow;

public class HelloApplication extends Application {
    private Stage primaryStage;
    private Scene scene1;
    private Scene scene2;
    private Scene scene3;
    private Scene scene4;

    @Override
    public void start(Stage stage) throws IOException {
    primaryStage=stage;
    scene1=createScene1();
    scene2=createScene2();
    scene3=createScene3();
    scene4=createScene4();
    primaryStage.setTitle("Практическая работа 6");
    primaryStage.setScene(scene1);
    primaryStage.show();
    }


    private Scene createScene1(){
        Label titleLabel=new Label("Задание 1");
        titleLabel.setStyle("-fx-font-size:20px;-fx-font-weight:bold;");
        TextField sideAField=new TextField();
        Button calcButton=new Button("Найти периметр");
        Label resultLabel=new Label();

        calcButton.setOnAction(www->{
            try {
                int a=Integer.parseInt(sideAField.getText());
                int s=4*a;
                resultLabel.setText("Периметр квадрата "+s);
            }
            catch (ArithmeticException e){
                resultLabel.setText("Деление на ноль");
            }
            finally {
                JOptionPane.showMessageDialog(null,"Значение вычислено");
            }
        });
        Button btn1Button=new Button("1");
        Button btn2Button=new Button("2");
        Button btn3Button=new Button("3");
        Button btn4Button=new Button("4");
        btn1Button.setOnAction(event->primaryStage.setScene(scene1));
        btn2Button.setOnAction(event->primaryStage.setScene(scene2));
        btn3Button.setOnAction(event->primaryStage.setScene(scene3));
        btn4Button.setOnAction(event->primaryStage.setScene(scene4));
        HBox root2=new HBox(10, btn1Button, btn2Button,btn3Button, btn4Button );
        root2.setAlignment(Pos.CENTER);
        HBox root1=new HBox(10, new Label("а="),sideAField );
        root1.setAlignment(Pos.CENTER);
        VBox root=new VBox(20,titleLabel, root1, calcButton, resultLabel, root2);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));
        return new Scene(root,300,300);
    }
    private  Scene createScene2(){
        Label titleLabel=new Label("Задание 2");
        titleLabel.setStyle("-fx-font-size:20px;-fx-font-weight:bold;");
        TextField sideLField=new TextField();
        Button calcButton=new Button("Вычислить радиус и площадь");
        Label radLabel=new Label();
        Label plLabel=new Label();

        calcButton.setOnAction(event->{
            try{
                double L=Double.parseDouble(sideLField.getText());
               double rad=L/(2*Math.PI);
                double pl=Math.PI* pow(rad,2);
                radLabel.setText("Радиус:"+rad);
                plLabel.setText("Площадь:"+pl);
            }
            catch (NumberFormatException e){
                plLabel.setText("Error !!!");
                radLabel.setText("Error !!!");
            }
            finally {
                JOptionPane.showMessageDialog(null,"Значение вычислено");
            }
        });
        Button btn1Button=new Button("1");
        Button btn2Button=new Button("2");
        Button btn3Button=new Button("3");
        Button btn4Button=new Button("4");
        btn1Button.setOnAction(event->primaryStage.setScene(scene1));
        btn2Button.setOnAction(event->primaryStage.setScene(scene2));
        btn3Button.setOnAction(event->primaryStage.setScene(scene3));
        btn4Button.setOnAction(event->primaryStage.setScene(scene4));
        HBox root2=new HBox(10, btn1Button, btn2Button,btn3Button,btn4Button );
        root2.setAlignment(Pos.CENTER);
        HBox root1=new HBox(10, new Label("x1="),sideLField);
        root1.setAlignment(Pos.CENTER);
        VBox root=new VBox(20,titleLabel, root1, calcButton, radLabel, plLabel, root2);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));
        return new Scene(root,500,500);


    }

    private Scene createScene3 (){
        Label titleLabel=new Label("Задание 3");
        titleLabel.setStyle("-fx-font-size:20px;-fx-font-weight:bold;");
        TextField sideAField=new TextField();
        TextField sideBField=new TextField();
        TextField sideCField=new TextField();
        Button calcButton=new Button("Найти корни уравнения");
        Label x1Label=new Label();
        Label x2Label=new Label();

        calcButton.setOnAction(event->{
            try{
                double A=Double.parseDouble(sideAField.getText());
                double B=Double.parseDouble(sideBField.getText());
                double C=Double.parseDouble(sideCField.getText());
                double D= pow(B,2)-4*A*C;
                if(A!=0) {
                    double x1 = (-B - Math.sqrt(D)) / 2 * A;
                    double x2 = (-B + Math.sqrt(D)) / 2 * A;
                    x1Label.setText("" + x1);
                    x2Label.setText("" + x2);
                }else {
                    x1Label.setText("Ошибка");
                }
            }
            catch (NumberFormatException e)
            {
             x1Label.setText("Error !!!");
            }
            finally {
                JOptionPane.showMessageDialog(null,"Значение вычислено");
            }
        });
        Button btn1Button=new Button("1");
        Button btn2Button=new Button("2");
        Button btn3Button=new Button("3");
        Button btn4Button=new Button("4");
        btn1Button.setOnAction(event -> primaryStage.setScene(scene1));
        btn2Button.setOnAction(event -> primaryStage.setScene(scene2));
        btn3Button.setOnAction(event -> primaryStage.setScene(scene3));
        btn4Button.setOnAction(event -> primaryStage.setScene(scene4));
        HBox root2=new HBox(10, btn1Button, btn2Button,btn3Button,btn4Button );
        root2.setAlignment(Pos.CENTER);
        HBox root1=new HBox(10, new Label("A="),sideAField, new Label("B=", sideBField), new Label("С=", sideCField));
        root1.setAlignment(Pos.CENTER);
        VBox root=new VBox(20,titleLabel, root1, calcButton, x1Label, x2Label, root2);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));
        return new Scene(root,500,500);
    }
    public static void main(String[] args) {launch();}
    private  Scene createScene4(){
        Label titleLabel=new Label("Задание 4");
        titleLabel.setStyle("-fx-font-size:20px;-fx-font-weight:bold;");
        TextField sideAField=new TextField();
        TextField sideBField=new TextField();
        TextField sideXField=new TextField();
        Button calcButton=new Button("Вычислить");
        Label rezultLabel=new Label();

        calcButton.setOnAction(event -> {
            try{
                double A= Double.parseDouble(sideAField.getText());
                double B= Double.parseDouble(sideBField.getText());
                double x= Double.parseDouble(sideXField.getText());
                double y=-pow(A,5)*x+B* pow(Math.cos(x), pow(x,2))+B*x;
                if (log(abs(x+pow(y,2)))!=0){
                    double g=sqrt(abs(-A*x+y))/(log(abs(x+pow(y,2))));
                    rezultLabel.setText("Ответ: "+g);
                }else{
                    rezultLabel.setText("Ошибка");
                }
            }
            catch (NumberFormatException e){
                rezultLabel.setText("Error !!!");
            }
            finally {
                JOptionPane.showMessageDialog(null,"Значение вычислено");
            }
        });
        Button btn1Button=new Button("1");
        Button btn2Button=new Button("2");
        Button btn3Button=new Button("3");
        Button btn4Button=new Button("4");
        btn1Button.setOnAction(event -> primaryStage.setScene(scene1));
        btn2Button.setOnAction(event -> primaryStage.setScene(scene2));
        btn3Button.setOnAction(event -> primaryStage.setScene(scene3));
        btn4Button.setOnAction(event -> primaryStage.setScene(scene4));
        HBox root2=new HBox(10, btn1Button, btn2Button,btn3Button, btn4Button );
        root2.setAlignment(Pos.CENTER);
        HBox root1=new HBox(10, new Label("A="),sideAField, new Label("B=", sideBField), new Label("X=", sideXField));
        root1.setAlignment(Pos.CENTER);
        VBox root=new VBox(20,titleLabel, root1, calcButton, rezultLabel, root2);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));
        return new Scene(root,500,500);
    }


}