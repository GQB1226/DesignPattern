package singleton;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
//		System.out.println("����ʽ1");
//		Singleton s=Singleton.getInstance();
//		Singleton s2=Singleton.getInstance();
//		if(s==s2){
//			System.out.println("ͬһ��ʵ��");
//		}
//		else {
//			System.out.println("^^_^^~~");
//		}
//		System.out.println("**************");
//		System.out.println("����ʽ");
//		Singleton2 s3=Singleton2.getInstance();
//		Singleton2 s4=Singleton2.getInstance();
//		if(s3==s4){
//			System.out.println("ͬһ��ʵ��");
//		}
//		else{
//			System.out.println("~_~");
//		}
//		System.out.println("***************");
//		System.out.println("��֤����ʽ1���������̰߳�ȫ��");
//		test();
		//ע�⣬�ڽ���Ч�ʶԱ�ʱ����Ҫ��֮ǰ�Ĵ���ע�ͣ���������Ѿ���ʵ�����ˣ���
//		System.out.println("��֤�Ľ��������ʽ������һ");
//		test();
		System.out.println("�Ա��̰߳�ȫ������ʽ����һ����Ч��");
		long startTime = System.nanoTime(); // ��ȡ��ʼʱ��
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
