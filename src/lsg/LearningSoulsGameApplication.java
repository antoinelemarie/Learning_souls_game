/**
 * 
 */
package lsg;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * @author antoinelemarie
 *
 */
public class LearningSoulsGameApplication extends Application {

	private AnchorPane root;
	private Scene scene; 
	/**
	 * 
	 */
	public LearningSoulsGameApplication() {
		// TODO Auto-generated constructor stub
		
	}

	/* (non-Javadoc)
	 * @see javafx.application.Application#start(javafx.stage.Stage)
	 */
	@Override
	public void start(Stage LearningSoulsGame) throws Exception {
		// TODO Auto-generated method stub
		root = new AnchorPane();
		scene = new Scene(root, 1200, 1800);
		buildUI();
		LearningSoulsGame.setScene(scene);
		LearningSoulsGame.show();
		LearningSoulsGame.setTitle("Learning Souls Game");
		

	}
	
	private void buildUI() {
		root.setId("root");
		scene.getStylesheets();
	}
	
	public static void main(String[] args) {
		launch(args);
		
		
	}

}
