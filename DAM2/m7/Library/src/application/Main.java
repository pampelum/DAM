package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;


public class Main extends Application {
	Label lblTitle;
	Label lblIsbn;
	Label lblAuthor;
	Label lblYear;
	Label lblGenere;
	Label lblLanguage;
	Label lblPublisher;
	
	TextField txtTitle;
	TextField txtIsbn;
	TextField txtAuthor;
	TextField txtYear;
	TextField txtGenere;
	TextField txtLanguage;
	TextField txtPublisher;
	
	Button btnBack;
	Button btnAccept;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			GridPane root = new GridPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			root.addRow(1, lblTitle);
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
