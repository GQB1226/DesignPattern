package factoryPattern;

public class demo {
	public static void main(String args[]) {
		ShapeFactory shapeFactory=new ShapeFactory();
		Shape s1=shapeFactory.getShape("Circle");
		s1.draw();
		Shape s2=shapeFactory.getShape("Rectangle");
		s2.draw();
		Rectangle rectangle=new Rectangle();
		rectangle.draw();
	}
}
