package proxyPattern;

/**
 * 具体主题，主要业务的实现
 * @author GQB1226
 *
 */
public class RealSubject implements Subject{

	@Override
	public void operate() {
		System.out.println("realSubject was called.....");
		
	}

}
