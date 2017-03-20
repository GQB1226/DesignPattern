package proxyPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
	public static void main(String[] args) {
		
		Subject subject= new ProxySubject();
		//静态代理
		subject.operate();
		//动态代理
		Subject s=new RealSubject();
		InvocationHandler ih=new DynamicProxySubject(s);
		Subject proxy=(Subject)Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Subject.class}, ih);
		proxy.operate();
	}

}
