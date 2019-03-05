package views;


import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;

public class View {
	BorderPane pane;

	public View(String outputString, String originalString) {
		pane = new BorderPane();

		TextArea text = new TextArea();
		text.setEditable(false);
		text.setText(outputString);

		MenuBar menuBar = new MenuBar();
		
		Menu menu = new Menu("File");
		menuBar.getMenus().add(menu);
		
		MenuItem outputItem = new MenuItem("Output");
		menu.getItems().add(outputItem);
		outputItem.setOnAction(e ->{
			text.setText(outputString);
		});
		
		MenuItem originalItem = new MenuItem("Original");
		menu.getItems().add(originalItem);
		originalItem.setOnAction(e ->{
			text.setText(originalString);
		});

		pane.setTop(menuBar);
		pane.setCenter(text);
	}

	public BorderPane getPane() {
		return pane;
	}

}
