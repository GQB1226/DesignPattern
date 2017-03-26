package singleton;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
//		System.out.println("懒汉式1");
//		Singleton s=Singleton.getInstance();
//		Singleton s2=Singleton.getInstance();
//		if(s==s2){
//			System.out.println("同一个实例");
//		}
//		else {
//			System.out.println("^^_^^~~");
//		}
//		System.out.println("**************");
//		System.out.println("饿汉式");
//		Singleton2 s3=Singleton2.getInstance();
//		Singleton2 s4=Singleton2.getInstance();
//		if(s3==s4){
//			System.out.println("同一个实例");
//		}
//		else{
//			System.out.println("~_~");
//		}
//		System.out.println("***************");
//		System.out.println("验证懒汉式1方法不是线程安全的");
//		test();
		//注意，在进行效率对比时，需要将之前的代码注释，否则对象已经被实例化了，，
//		System.out.println("验证改进后的懒汉式：方法一");
//		test();
		System.out.println("对比线程安全的懒汉式方法一二的效率");
		long startTime = System.nanoTime(); // 获取开始时间
		test();//getInstance()11828109
		//test();//getInstance1()8215434
		long endTime=System.nanoTime();
		System.out.println(endTime-startTime);
		
	}
	public static void test(){
		TestSingleton t=new TestSingleton();
		for(int i=0;i<100;i++)
			new Thread(t).start();
		
		System.out.println(t.set);
		System.out.println("************");
	}


}
class TestSingleton implements Runnable{
	public  Set<Singleton3> set =new HashSet<Singleton3>();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<1000;i++)
			set.add(Singleton3.getInstance());

	}
}
