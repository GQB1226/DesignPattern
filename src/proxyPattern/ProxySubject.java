package proxyPattern;

/**
 * ��̬����
 * @author GQB1226
 *
 */
public class ProxySubject implements Subject{
	
	Subject subject;
	public ProxySubject() {
		subject=new RealSubject();
	}

	@Override
	public void operate() {
		System.out.println("will call realSubject.....");
		subject.operate();
		System.out.println("call finished......");
		
	}

}
