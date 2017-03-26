package singleton;

/**
 * 饿汉模式：害怕吃不到，上来先吃(实例化)
 * @author GQB1226
 *
 */
public class Singleton2 {	
	private static Singleton2 s=new Singleton2();
	private Singleton2(){
		System.out.println("调用初始化函数");
	}
	public static Singleton2 getInstance(){
		System.out.println("饿汉式");
		return s;
	}

}
