package ru.yamanov.marathon.util;

import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;
import ru.yamanov.marathon.HelloApplication;
import java.io.IOException;

public class Manager {
    public static Stage mainStage;
    public  static Rectangle2D screenSize= Screen.getPrimary().getVisualBounds();

    public static void showMainStage(Stage stage, String fxmlFileName,String title) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxmlFileName));
        try {
            Scene scene = new Scene(fxmlLoader.load(),  600, 400);
            stage.setScene((scene));
            stage.setTitle((title));
            stage.setMinWidth(300);
            stage.setMinHeight(200);
            stage.setMaximized(false);
            stage.setMaxHeight(450);
            stage.setMinWidth(650);
            mainStage = stage;
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void showSecondStage(String fxmlFileName, String title){
        FXMLLoader fxmlLoader=new FXMLLoader(HelloApplication.class.getResource(fxmlFileName));
        try{
            Scene scene=new Scene(fxmlLoader.load(),600, 400);
            mainStage.setScene((scene));
            mainStage.setTitle((title));
            mainStage.setMinWidth(300);
            mainStage.setMinHeight(200);
            mainStage.setMaximized(false);
            mainStage.setMaxHeight(450);
            mainStage.setMinWidth(650);
            mainStage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void showThirStage(String fxmlFileName, String title){
        FXMLLoader fxmlLoader=new FXMLLoader(HelloApplication.class.getResource(fxmlFileName));
        try{
            Scene scene=new Scene(fxmlLoader.load(),screenSize.getWidth(), screenSize.getHeight());
            mainStage.setScene((scene));
            mainStage.setTitle((title));
            mainStage.setMinWidth(300);
            mainStage.setMinHeight(200);
            mainStage.setMaximized(false);
            mainStage.setMaxHeight(450);
            mainStage.setMinWidth(650);
            mainStage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void showFourStage(String fxmlFileName, String title){
        FXMLLoader fxmlLoader=new FXMLLoader(HelloApplication.class.getResource(fxmlFileName));
        try{
            Scene scene= new Scene(fxmlLoader.load(),screenSize.getWidth(), screenSize.getHeight());
            mainStage.setScene((scene));
            mainStage.setTitle((title));
            mainStage.setMinWidth(300);
            mainStage.setMinHeight(200);
            mainStage.setMaximized(false);
            mainStage.setMaxHeight(450);
            mainStage.setMinWidth(650);
            mainStage.show();
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
    public static void showFiveStage(String fxmlFileName, String title){
        FXMLLoader fxmlLoader=new FXMLLoader(HelloApplication.class.getResource(fxmlFileName));
        try{
            Scene scene= new Scene(fxmlLoader.load(),screenSize.getWidth(), screenSize.getHeight());
            mainStage.setScene((scene));
            mainStage.setTitle((title));
            mainStage.setMinWidth(300);
            mainStage.setMinHeight(200);
            mainStage.setMaximized(false);
            mainStage.setMaxHeight(450);
            mainStage.setMinWidth(650);
            mainStage.show();
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
    public static void showSixStage(String fxmlFileName, String title){
        FXMLLoader fxmlLoader=new FXMLLoader(HelloApplication.class.getResource(fxmlFileName));
        try{
            Scene scene= new Scene(fxmlLoader.load(),screenSize.getWidth(), screenSize.getHeight());
            mainStage.setScene((scene));
            mainStage.setTitle((title));
            mainStage.setMinWidth(300);
            mainStage.setMinHeight(200);
            mainStage.setMaximized(false);
            mainStage.setMaxHeight(450);
            mainStage.setMinWidth(650);
            mainStage.show();
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
    public static void showSevenStage(String fxmlFileName, String title){
        FXMLLoader fxmlLoader=new FXMLLoader(HelloApplication.class.getResource(fxmlFileName));
        try{
            Scene scene= new Scene(fxmlLoader.load(),screenSize.getWidth(), screenSize.getHeight());
            mainStage.setScene((scene));
            mainStage.setTitle((title));
            mainStage.setMinWidth(300);
            mainStage.setMinHeight(200);
            mainStage.setMaximized(false);
            mainStage.setMaxHeight(450);
            mainStage.setMinWidth(650);
            mainStage.show();
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }

}
