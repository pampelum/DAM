import java.awt.TextField;

import javafx.event.EventType;
import javafx.scene.input.KeyEvent;

public class MyNom extends TextField{
	MyNom(){
		this.addEventFilter(KeyEvent.KEY_TYPED, e-> {
			if(!e.getCharacter().matches("[A-Z]*[a-z]*[ ]*"))
			{
				e.consume();
			}
		});
	}
}
