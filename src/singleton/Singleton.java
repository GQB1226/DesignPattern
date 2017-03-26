package singleton;

/**
 * 懒汉式：顾名思义，等到需要时再实例化
 * @author GQB1226
 *
 */
public class Singleton {
	private static Singleton s=null;
	private Singleton() {
		System.out.println("调用构造函数：懒汉式");
	}
	public static Singleton getInstance(){
		if(s==null){
			System.out.println("初次实例化");
			s= new Singleton();
		}
		return s;
	}
}