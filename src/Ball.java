public class Ball {
	private int radius;
	private int xAs;
	private int yAs;
	
	public Ball(int xAs, int yAs, int radius){
		this.xAs = xAs;
		this.yAs = yAs;
		this.radius = radius;
	}
	
	public int getRadius(){
		return radius;
	}
	
	public void setRadius(int radius){
		this.radius = radius;
	}
	
	public int getXAs(){
		return xAs;
	}
	
	public void setXAs(int xAs){
		this.xAs = xAs;
	}
	
	public int getYAs(){
		return yAs;
	}
	
	public void setYAs(int yAs){
		this.yAs = yAs;
	}
}
