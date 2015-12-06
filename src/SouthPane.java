import javafx.geometry.Pos;
import javafx.scene.control.Slider;
import javafx.scene.layout.HBox;

public class SouthPane extends HBox{
	
	public SouthPane(BallControler controler){
		setAlignment(Pos.CENTER);//Set alignment to center
		
		Slider slSpeed = new Slider();
		
		slSpeed.setMin(5);//Set minimum value slider
		slSpeed.setMax(20);//Set maximum value slider
		slSpeed.setShowTickMarks(true);//Show values of slider
		slSpeed.setShowTickLabels(true);
		
		//Veranderd de snelheid van de animatie, waardoor de bal sneller/langzamer gaat
		controler.rateProperty().bind(slSpeed.valueProperty());
		
		getChildren().addAll(slSpeed);
	}
}
