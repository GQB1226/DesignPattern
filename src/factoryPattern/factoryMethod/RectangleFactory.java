package factoryPattern.factoryMethod;

public class RectangleFactory implements Factory{

	@Override
	public Rectangle create() {
		return new Rectangle();
	}
	
}
