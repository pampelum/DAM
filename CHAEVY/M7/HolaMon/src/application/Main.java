package application;
	
import javafx.event.*;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;


public class Main extends Application {
	
	Button btn = new Button("Saluda al Sol");
	Label labelSalutacio = new Label();
	Label labelNom = new Label();
	Label labelCognom = new Label();
	TextField textNom = new TextField();
	TextField textCognom = new TextField();
	
	@Override
	public void start(Stage primaryStage) {
		try {
			VBox root = new VBox();
			
			root.getChildren().addAll(labelNom,textNom,labelCognom,textCognom,labelSalutacio,btn);
			
			btn.setText("_Saluda"); // apretar alt i ensenya la paraula Saludar
			btn.setOnAction(e -> saludar());
			
			//TODO Que un enter al textNom mostri el nom  enter = 13
			textNom.setOnKeyTyped(e ->{
				
				if(e.getCharacter().codePointAt(0) == 13) {
					saludar();
				}
				
				
				//System.out.println("Key: " + e.getCode());
			});
			
			
			
			labelNom.setText("Nom");
			labelCognom.setText("Cognom");
			textNom.setPromptText("Introdueix el teu nom");
			textCognom.setPromptText("Introdueix el teu Cognom");
			textNom.setFocusTraversable(true);
			labelSalutacio.setText("");
			
			

			//Crear una Scene
			Scene scene = new Scene(root,400,400); 
			
			 //CSS
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			//Afegir escena 
			primaryStage.setScene(scene); 
			
			//Mostrar la finestra
			primaryStage.show();	
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
/*	private Object soltar(MouseEvent e) {
		System.out.println("Soltar" + e.getEventType());
		return null;
	}*/

/*	private Object apretar(MouseEvent e) {
		System.out.println("Apretar" + e.getEventType());
		return null;
	}*/

	private Object saludar() {
		
		labelSalutacio.setText("Hola " + textNom.getText() + " " + textCognom.getText());
		return null;
	}

	public static void main(String[] args) {
		launch(args);
	}
}

//		btn.setOnMousePressed(e -> apretar(e));
//	    btn.setOnMouseReleased(e -> soltar(e));
