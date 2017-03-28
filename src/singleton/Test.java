package singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//Singlteon,Singleton2,Singleton3�����ĵ���������ͨ��������ƻ������л������л��������ʵ��
public class Test {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		//�������,���Զ���ģʽ
		Singleton2 s=Singleton2.getInstance();
		Class<Singleton2> cls=Singleton2.class;
		Constructor<Singleton2> constructor=cls.getDeclaredConstructor(new Class[]{});
		constructor.setAccessible(true);
		Singleton2 s2=constructor.newInstance(new Object[]{});
		System.out.println(s==s2);//false

		//���л������л��������ʵ��
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
			System.out.println(s3==s4);//false,���л������л�����ʹ��readReslove()�����
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		//effective java �ڶ������������Ԫ��ö������:Singleton4
		
	}
}
