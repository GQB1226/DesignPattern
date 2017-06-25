package iteratorPattern;

public class Demo {
	public static void main(String[] args) {
		Aggregate aggregate=new ConcreteAggregate("this is a test");
		Iterator iterator=aggregate.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
}
