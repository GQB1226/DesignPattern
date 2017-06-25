package iteratorPattern;

import java.util.List;

public class ConcreteAggregate implements Aggregate{
	private char[] string ;
	private int length;
	
	public ConcreteAggregate(String string) {
		this.string=string.toCharArray();
		length=this.string.length;
	}
	

	/**
	 * 内部类实现
	 * @author GQB1226
	 *
	 */
	class ConcreteInterator implements Iterator{

		int cur=0;
		@Override
		public Object next() {
			
			return string[cur++];
		}

		@Override
		public boolean hasNext() {
			return cur<length;
		}
		
	}
	
	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new ConcreteInterator();
	}

}
