package singleton;

/**
 * ����ģʽ�����³Բ����������ȳ�(ʵ����)
 * @author GQB1226
 *
 */
public class Singleton2 {	
	private static Singleton2 s=new Singleton2();
	private Singleton2(){
		System.out.println("���ó�ʼ������");
	}
	public static Singleton2 getInstance(){
		System.out.println("����ʽ");
		return s;
	}

}
