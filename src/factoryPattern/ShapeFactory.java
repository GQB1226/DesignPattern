package factoryPattern;

public class ShapeFactory {
	public Shape getShape(String type) {
		if(type==null){
			return null;
		}
		if (type.equals("Rectangle")) {
			return new Rectangle();
		}
		else if (type.equals("Circle")) {
			return new Circle();
		}
		else {
			return null;
		}
		
	}
}
