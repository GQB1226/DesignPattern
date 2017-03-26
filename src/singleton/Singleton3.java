package singleton;

/**
 * 线程安全的懒汉式，使用同步锁
 * @author GQB1226
 *
 */
public class Singleton3 {
	private static Singleton3 singleton3;
	private Singleton3() {
		// TODO Auto-generated constructor stub
	}
	//方法一
	public static synchronized Singleton3 getInstance(){
		if(singleton3==null){
			singleton3=new Singleton3();
		}
		return singleton3;
	}
	//方法二，方法一中虽然保证了线程安全，但是每次都需要判断锁，效率比较低
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
