package application;
	
import java.util.function.UnaryOperator;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.control.TextFormatter.Change;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;


public class Main extends Application {
	
	Label lb_titol = new Label("NOU LLIBRE");
	Label lb_nom = new Label("Nom");
	Label lb_autor = new Label("Autor");
	Label lb_isbn = new Label("ISBN");
	Label lb_data = new Label("Data de Sortida");
	Label lb_editorial = new Label("Editorial");
	Label lb_edicio = new Label("N Edicio");
	
	TextFieldText tf_nom = new TextFieldText();
	TextFieldText tf_autor = new TextFieldText();
	TextFieldISBN tf_isbn = new TextFieldISBN();
	TextField tf_data = new TextField();
	TextFieldText tf_editorial = new TextFieldText();
	TextField tf_edico = new TextField();
	
	Font f_atributs = new Font("Arial", 15);
	
	Insets lb_pading = new Insets(0, 0, 10, 0);
	Insets title_pading = new Insets(0, 0, 20, 0);
	Insets atribut_pading = new Insets(0, 50, 25, 0);
	
	Button bt_add = new Button("Afegir");
	
	Llibre llibre;
	
	String nom, autor, data, editorial;
	String isbn, edicio;
	
	
	
	@Override
	public void start(Stage primaryStage) {
		try {
			VBox root = new VBox();
			
			Scene scene = new Scene(root,600,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			interficie(root);
			
			
			bt_add.setOnMouseClicked(e -> {
				nom = tf_nom.getText();
				autor = tf_nom.getText();
				data = tf_data.getText();
				editorial = tf_editorial.getText();
				
				isbn = tf_isbn.getText();
				edicio = tf_edico.getText();
				
				llibre = new Llibre(nom,autor,data,editorial,isbn,edicio);
				
				llibre.mostrar();
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
	
	public void interficie(VBox root)
	{
		HBox hb_titol = new HBox();
		HBox hb_linia1 = new HBox();
		HBox hb_linia2 = new HBox();
		HBox hb_linia3 = new HBox();
		
		VBox vb_atributs = new VBox();
		VBox vb_nom = new VBox();
		VBox vb_autor = new VBox();
		VBox vb_isbn = new VBox();
		VBox vb_data = new VBox();
		VBox vb_editorial = new VBox();
		VBox vb_edicio = new VBox();
		
		root.getChildren().addAll(hb_titol, vb_atributs);
		hb_titol.getChildren().addAll(lb_titol);
		vb_atributs.getChildren().addAll(hb_linia1, hb_linia2, hb_linia3, bt_add);
		
		hb_linia1.getChildren().addAll(vb_nom, vb_autor);
		vb_nom.getChildren().addAll(lb_nom,tf_nom);
		vb_autor.getChildren().addAll(lb_autor,tf_autor);
		
		hb_linia2.getChildren().addAll(vb_isbn, vb_data);
		vb_isbn.getChildren().addAll(lb_isbn, tf_isbn);
		vb_data.getChildren().addAll(lb_data, tf_data);
		
		hb_linia3.getChildren().addAll(vb_editorial,vb_edicio);
		vb_editorial.getChildren().addAll(lb_editorial,tf_editorial);
		vb_edicio.getChildren().addAll(lb_edicio, tf_edico);
		
		
		
		lb_titol.setFont(new Font("Arial", 30));
		lb_titol.setPadding(title_pading);
		
		bt_add.setFont(f_atributs);
		
		lb_nom.setFont(f_atributs);
		lb_autor.setFont(f_atributs);
		lb_isbn.setFont(f_atributs);
		lb_data.setFont(f_atributs);
		lb_editorial.setFont(f_atributs);
		lb_edicio.setFont(f_atributs);
		
		tf_nom.setFont(f_atributs);
		tf_autor.setFont(f_atributs);
		tf_isbn.setFont(f_atributs);
		tf_data.setFont(f_atributs);
		tf_editorial.setFont(f_atributs);
		tf_edico.setFont(f_atributs);
		
		root.setPadding(new Insets(20));
		
		vb_nom.setMargin(lb_nom, lb_pading);
		vb_autor.setMargin(lb_autor, lb_pading);
		vb_isbn.setMargin(lb_isbn, lb_pading);
		vb_data.setMargin(lb_data, lb_pading);
		vb_editorial.setMargin(lb_editorial, lb_pading);
		vb_edicio.setMargin(lb_edicio, lb_pading);
		
		hb_linia1.setMargin(vb_nom, atribut_pading);
		hb_linia2.setMargin(vb_isbn, atribut_pading);
		hb_linia3.setMargin(vb_editorial, atribut_pading);
		
		
		
		
	}
	
	class TextFieldISBN extends TextField
	{
	    private TextFormatter<String> formatter;

	    TextFieldISBN()
	    {
	        formatter =  new TextFormatter<>(filter);
	        this.setTextFormatter(formatter);
	    }

	    private UnaryOperator<TextFormatter.Change> filter = change ->
	    {
	        System.out.println(change.getControlNewText());
	        if (change.getControlNewText().matches("[0-9]{0,13}"))
	        {
	            return change;

	        } else
	        {
	            return null;
	        }
	    };
	}
	
	class TextFieldText extends TextField
	{
	    private TextFormatter<String> formatter;
	    
	    TextFieldText()
	    {
	        formatter =  new TextFormatter<>(filter);
	        this.setTextFormatter(formatter);
	    }

	    private UnaryOperator<TextFormatter.Change> filter = change ->
	    {
	        System.out.println(change.getControlNewText());
	        
	        if(!change.getControlNewText().matches("[0-9]*"))
	        {
	            return change;

	        } else
	        {
	            return null;
	        }
	    };
	}
	
	class TextFieldDate extends TextField
	{
	    private TextFormatter<String> formatter;
	    
	    TextFieldDate()
	    {
	        formatter =  new TextFormatter<>(filter);
	        this.setTextFormatter(formatter);
	    }

	    private UnaryOperator<TextFormatter.Change> filter = change ->
	    {
	        System.out.println(change.getControlNewText());
	        
	        if(change.getControlNewText().matches("[A-Z]*[a-z]*[ ]*"))
	        {
	            return change;

	        } else
	        {
	            return null;
	        }
	    };
	}
}
