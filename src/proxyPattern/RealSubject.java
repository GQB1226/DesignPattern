package proxyPattern;

/**
 * �������⣬��Ҫҵ���ʵ��
 * @author GQB1226
 *
 */
public class RealSubject implements Subject{

	@Override
	public void operate() {
		System.out.println("realSubject was called.....");
		
	}

}
