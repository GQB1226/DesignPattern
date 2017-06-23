package factoryPattern.abstractFactory;
public class ShapeFactoryB implements Factory{
	@Override
	public Shape drawShape(){
		return new Rectangle();
	}
	
	@Override
	public Color sparyColor(){
		return new Blank();
	}
}