import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class BallView extends Pane{
	private Circle circle;
	private Ball ball;
	
	public BallView(Ball ball){
		this.ball = ball;
		createCircle();
		getChildren().add(circle);
	}
	
	public void createCircle(){
		circle = new Circle();
		circle.setRadius(ball.getRadius());
		circle.setCenterX(ball.getXAs());
		circle.setCenterY(ball.getYAs());
		circle.setFill(Color.BLUE);
	}
	
	public void adjust(){
		circle.relocate(ball.getXAs(), ball.getYAs());
	}
}
