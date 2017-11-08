package Circle;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class main extends Application{

	double WorldWidth = 500;
	double WorldHigth = 500;
	
	
	
	@Override
	public void start(Stage stage) throws Exception {
		
	        Circle circ = new Circle(40, 40, 30);
	        Group root = new Group(circ);
	        Scene scene = new Scene(root, WorldWidth, WorldHigth);

	        stage.setTitle("My JavaFX Application");
	        stage.setScene(scene);
	        stage.show();
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
		
	}

	
	
	
	
}
