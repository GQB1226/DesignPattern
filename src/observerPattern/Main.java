package observerPattern;

public class Main {
	public static void main(String[] args) {
		CSubject subject=new CSubject();

		subject.Add(new CObserver(subject, "A"));
		subject.Add(new CObserver(subject, "B"));
		subject.Add(new CObserver(subject, "C"));
		CObserver d=new CObserver(subject, "D");
		subject.Add(d);
		
		subject.setMsg("a");
		subject.Notify();
		subject.Del(d);
		subject.Notify();
	}
}
