package singleton;

/**
 * �̰߳�ȫ������ʽ��ʹ��ͬ����
 * @author GQB1226
 *
 */
public class Singleton3 {
	private static Singleton3 singleton3;
	private Singleton3() {
		// TODO Auto-generated constructor stub
	}
	//����һ
	public static synchronized Singleton3 getInstance(){
		if(singleton3==null){
			singleton3=new Singleton3();
		}
		return singleton3;
	}
	//������������һ����Ȼ��֤���̰߳�ȫ������ÿ�ζ���Ҫ�ж�����Ч�ʱȽϵ�
	public static Singleton3 getInstance1(){
		if(singleton3==null){
			synchronized (Singleton3.class) {
				if(singleton3==null){
					singleton3=new Singleton3();
				}
				
			}
		}
		return singleton3;
	}
	
}
