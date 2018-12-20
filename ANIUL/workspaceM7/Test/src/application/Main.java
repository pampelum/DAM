package application;
	
import java.util.function.UnaryOperator;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

class TelefonField extends TextField
{
	
}

public class Main extends Application {
	
	private final TextField tf_input = new TextField();
	
	@Override
	public void start(Stage primaryStage) {
		try {
			AnchorPane root = new AnchorPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			root.getChildren().add(tf_input);
			
			//limitar la entrada a numeros i
//			tf_input.addEventFilter(KeyEvent.KEY_TYPED, e -> {
//				System.out.println("Filtre : " + e.getCharacter());
//				if(!e.getCharacter().matches("[0-9]*") || tf_input.getText().length() >= 9)
//				{
//					e.consume();
//				}
//			});
			
//			tf_input.addEventHandler(KeyEvent.KEY_TYPED, e -> {
//				System.out.println("Handler");
//			});
			
			UnaryOperator<TextFormatter.Change> filter = change -> {
				System.out.println(">" + change.getControlNewText());
				
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
			tf_input.setTextFormatter(formater);
			
 			
			
			
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
