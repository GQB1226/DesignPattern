package singleton;

/**
 * ����ʽ������˼�壬�ȵ���Ҫʱ��ʵ����
 * @author GQB1226
 *
 */
public class Singleton {
	private static Singleton s=null;
	private Singleton() {
		System.out.println("���ù��캯��������ʽ");
	}
	public static Singleton getInstance(){
		if(s==null){
			System.out.println("����ʵ����");
			s= new Singleton();
		}
		return s;
	}
}