package singleton;

import java.io.Serializable;

/**
 * ����ģʽ�����³Բ����������ȳ�(ʵ����)
 * @author GQB1226
 *
 */
public class Singleton2 implements Serializable{	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6407011722323364647L;
	private static Singleton2 s=new Singleton2();
	private Singleton2(){
		System.out.println("���ó�ʼ������");
	}
	public static Singleton2 getInstance(){
		System.out.println("����ʽ");
		return s;
	}
//	public Object readResolve(){
//		return s;
//	}

}
