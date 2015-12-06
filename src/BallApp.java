import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BallApp extends Application{
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Ball ball = new Ball(20, 20, 10);
		BallView view = new BallView(ball);
		BallControler controler = new BallControler(ball, view);
		
		BorderPane pane = new BorderPane(); //Create BorderPane
		SouthPane southPane = new SouthPane(controler);
		pane.setCenter(view);
		pane.setBottom(southPane);
		
		Scene scene = new Scene(pane, 400, 200);
		primaryStage.setTitle("Bal dans simulatie");//Set title
		primaryStage.setScene(scene);//Set scene to stage
		primaryStage.show();//Show stage
	}
	
	public static void main(String args[]){
		launch(args);
	}
}