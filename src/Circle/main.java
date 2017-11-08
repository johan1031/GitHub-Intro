package Circle;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class main extends Application{

	double WorldWidth = 500;
	double WorldHigth = 500;
	
	
	
	@Override
	public void start(Stage stage) throws Exception {
		
		    Circle circ = new Circle(40);
	        
	        Group root = new Group(circ);
	        Scene scene = new Scene(root, WorldWidth, WorldHigth);
	        
	        circ.setTranslateX(WorldWidth/2);
	        circ.setTranslateY(WorldHigth/2);
	        
	        scene.setOnKeyPressed(event->{
	        	
	        	if(event.getCode() == KeyCode.W){
	        		circ.setTranslateY(circ.getTranslateY()-10);
	        	}
	        	if(event.getCode() == KeyCode.S){
	        		circ.setTranslateY(circ.getTranslateY()+10);
	        	}
	        	if(event.getCode() == KeyCode.A){
	        		circ.setTranslateX(circ.getTranslateX()-10);
	        	}
	        	if(event.getCode() == KeyCode.D){
	        		circ.setTranslateX(circ.getTranslateX()+10);
	        	}
	        	
	        	
	        });
	        
	    
	       

	        stage.setTitle("My JavaFX Application");
	        stage.setScene(scene);
	        stage.show();
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
		
	}

	
	
	
	
}
