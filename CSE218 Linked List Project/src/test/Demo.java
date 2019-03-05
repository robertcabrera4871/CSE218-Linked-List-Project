package test;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lists.MasterList;
import utils.CreateFileUtil;
import utils.GenerateLists;
import utils.GenerateParagraphUtil;
import views.View;

public class Demo extends Application {
	static String output;
	static String original;

	public static void main(String[] args) {
		MasterList list = GenerateLists.generate();
		output = GenerateParagraphUtil.generate(list, list.getRandom(), 200);
		CreateFileUtil.createFile(output);
		original = CreateFileUtil.getOriginalString();
		Application.launch(args);
	}

	public void start(Stage stage) throws Exception {
		View view = new View(output, original);
		Scene scene = new Scene(view.getPane(), 725, 250);
		stage.setTitle("Linked List Project");
		stage.setScene(scene);
		stage.show();
	}
}
