package factoryPattern.factoryMethod;

public class Demo {
	public static void main(String[] args) {
		CircleFactory circleFactory=new CircleFactory();
		Circle circle=circleFactory.create();
		circle.draw();
		RectangleFactory rectangleFactory = new RectangleFactory();
		Rectangle rectangle=rectangleFactory.create();
		rectangle.draw();
	}
}
