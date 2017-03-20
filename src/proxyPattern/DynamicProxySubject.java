package proxyPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxySubject implements InvocationHandler{
	
	Subject subject;
	public DynamicProxySubject() {
	}
	
	public DynamicProxySubject(Subject subject){
		this.subject=subject;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("before calling");
		method.invoke(subject, args);
		System.out.println("after calling");
		
		
		return null;
	}

}
