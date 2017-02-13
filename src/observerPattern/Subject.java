package observerPattern;

import java.util.ArrayList;
import java.util.List;

/*抽象主题：所有观察者对象的引用
 * 增加、删除对象引用
 *
 */
public abstract class Subject {
	private List<Observer> observers=new ArrayList<Observer>();
	
	public void Add(Observer ob){
		observers.add(ob);
	}
	
	public void Del(Observer ob){
		observers.remove(ob);
	}
	
	//通知更新
	public void Notify(){
		for(Observer o : observers){
			o.update();
		}
	}
}
