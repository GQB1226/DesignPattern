package observerPattern;

//具体观察者
public class CObserver extends Observer {
	
	private String msg;
	private CSubject subject;
	private String observer;
	
	public CObserver(CSubject subject,String observer) {
		this.subject=subject;
		this.observer=observer;
	}

	@Override
	public void update() {
		msg=subject.getMsg();
		System.out.println(observer+" recv msg:"+msg);
	}
	
}
