package observerPattern;

import java.util.ArrayList;
import java.util.List;

/*�������⣺���й۲��߶��������
 * ���ӡ�ɾ����������
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
	
	//֪ͨ����
	public void Notify(){
		for(Observer o : observers){
			o.update();
		}
	}
}
