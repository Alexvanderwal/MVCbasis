import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.property.DoubleProperty;
import javafx.geometry.Bounds;
import javafx.util.Duration;

public class BallControler {
	private Ball ball;
	private BallView view;
	private Timeline animation;
	
	private int xAsPositie = 1, yAsPositie = 1;
	
	public BallControler(Ball ball, BallView ballView){
		this.ball = ball;
		this.view = ballView;
		
		animation = new Timeline();
		animation.setCycleCount(Timeline.INDEFINITE);
		animation.getKeyFrames().add(new KeyFrame(Duration.millis(100), e -> moveBall()));
		animation.play();
		
		view.setOnMousePressed(e -> {
			animation.pause();
		});
		
		view.setOnMouseReleased(e -> {
			animation.play();
		});
	}
	
	public DoubleProperty rateProperty(){
		return animation.rateProperty();
	}
	
	public void moveBall(){
		ball.setXAs(ball.getXAs() + xAsPositie);
		ball.setYAs(ball.getYAs() + yAsPositie);
		
		final Bounds bounds = view.getLayoutBounds();
		final boolean atRightBorder = ball.getXAs() >= (bounds.getMaxX() - ball.getRadius());
		final boolean atLeftBorder = ball.getXAs() <= (bounds.getMinX() + ball.getRadius());
		final boolean atBottomBorder = ball.getYAs() >= (bounds.getMaxY() - ball.getRadius());
		final boolean atTopBorder = ball.getYAs() <= (bounds.getMinY() + ball.getRadius());
		
		if(atRightBorder || atLeftBorder){
			xAsPositie *= -1;
		}
		
		if(atTopBorder || atBottomBorder){
			yAsPositie *= -1;
		}
		
		view.adjust();
	}
}