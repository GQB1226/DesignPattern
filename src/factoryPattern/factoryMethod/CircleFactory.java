package factoryPattern.factoryMethod;

public class CircleFactory implements Factory{

	@Override
	public Circle create() {
		return new Circle();
	}

}
