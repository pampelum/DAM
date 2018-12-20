package application;
	
import java.util.function.UnaryOperator;
import javafx.application.Application;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;



public class Main extends Application {
	
	TextField tf_nom = new TextField();
	TextField tf_telefon = new TextField();

	Label lb_nom = new Label("Nom:");
	Label lb_telefon = new Label("Telefon:");
	
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			VBox centre = new VBox();
			HBox hb_nom = new HBox();
			HBox hb_tel = new HBox();
			
			root.setCenter(centre);
			
			centre.getChildren().addAll(hb_nom,hb_tel);
			
			hb_nom.getChildren().addAll(lb_nom, tf_nom);
			hb_tel.getChildren().addAll(lb_telefon, tf_telefon);
			
			hb_nom.setSpacing(33);
			hb_tel.setSpacing(9);
			
			tf_nom.addEventFilter(KeyEvent.KEY_TYPED, e-> {
				if(!e.getCharacter().matches("[A-Z]*[a-z]*[ ]*"))
				{
					e.consume();
				}
			});
			
			tf_telefon.addEventFilter(KeyEvent.KEY_TYPED, e -> {
				UnaryOperator<TextFormatter.Change> filter = change -> {
					if(change.getControlNewText().matches("[0-9]{0,9}"))
					{
						return change;
					} 
					else 
					{
						return null;
					}
				};
				
				TextFormatter<String> formater = new TextFormatter<>(filter);
				tf_telefon.setTextFormatter(formater);

			});
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
