package singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//Singlteon,Singleton2,Singleton3创建的单例，可以通过发射机制或者序列化反序列化创建多个实例
public class Test {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		//反射机制,测试饿汉模式
		Singleton2 s=Singleton2.getInstance();
		Class<Singleton2> cls=Singleton2.class;
		Constructor<Singleton2> constructor=cls.getDeclaredConstructor(new Class[]{});
		constructor.setAccessible(true);
		Singleton2 s2=constructor.newInstance(new Object[]{});
		System.out.println(s==s2);//false

		//序列化反序列化产生多个实例
		File file=new File("test");
		ObjectOutputStream out=null;
		ObjectInputStream input=null;
		try {
			out=new ObjectOutputStream(new FileOutputStream(file));
			Singleton2 s3=Singleton2.getInstance();
			
			out.writeObject(s3);
			out.close();
			input=new ObjectInputStream(new FileInputStream(file));
			Singleton2 s4=(Singleton2)input.readObject();
			System.out.println(s3==s4);//false,序列化反序列化可以使用readReslove()来解决
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		//effective java 第二版第三条，单元素枚举类型:Singleton4
		
	}
}
