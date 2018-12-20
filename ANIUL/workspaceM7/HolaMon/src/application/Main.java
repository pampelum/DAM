package application;
	


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.event.*;
import javafx.geometry.Insets;


public class Main extends Application {
	
	Button btn = new Button();
	Label lb_nom = new Label("Nom:");
	Label lb_cognom = new Label("Cognom:");
	Label lb_resposta = new Label();
	TextField tf_nom = new TextField ();
	TextField tf_cognom = new TextField ();
	
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			VBox centre = new VBox();
			HBox hb_nom = new HBox();
			HBox hb_cognom = new HBox();
			root.setCenter(centre);
			centre.getChildren().addAll(hb_nom,hb_cognom, btn, lb_resposta);
			hb_nom.getChildren().addAll(lb_nom, tf_nom);
			hb_cognom.getChildren().addAll(lb_cognom, tf_cognom);
			hb_nom.setPadding(new Insets(0, 0, 0, 0));
			hb_nom.setSpacing(30);
			hb_cognom.setPadding(new Insets(20, 0, 20, 0));
			hb_cognom.setSpacing(10);
			lb_resposta.setPadding(new Insets(20,0,0,0));
//			lb_nom.setPadding(new Insets(0, 30, 0, 0));
//			lb_cognom.setPadding(new Insets(0,10,0,0));
			centre.setPadding(new Insets(20,20,20,20));
			
			btn.setText("Saludar");
			btn.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;"); 
			btn.setOnAction(e -> saludar());
			
			tf_nom.setPromptText("Entra el nom");
			tf_cognom.setPromptText("entra el Cognom");
			
			//TODO Que un enter al tb_nom mostri el nom
			tf_nom.setOnKeyTyped(e -> {
				int code;
				code = e.getCharacter().codePointAt(0);
				if(code == 13)
				{
					saludar();
				}
			});
			
			tf_cognom.setOnKeyTyped(e -> {
				int code;
				code = e.getCharacter().codePointAt(0);
				if(code == 13)
				{
					saludar();
				}
			});
			
			
			
			Scene scene = new Scene(root,400,400);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			//assignar la scena a la finestra 
			primaryStage.setScene(scene);
			
			//mostrar finestra
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private Object saludar() {

		lb_resposta.setText("Hola " + tf_nom.getText() + " " + tf_cognom.getText());
		
		return null;
	}





	public static void main(String[] args) {
		launch(args);
	}
}
