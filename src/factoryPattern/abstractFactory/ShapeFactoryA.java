package factoryPattern.abstractFactory;

public class ShapeFactoryA implements Factory{
	@Override
	public Shape drawShape(){
		return new Circle();
	}
	
	@Override
	public Color sparyColor(){
		return new Red();
	}
}
