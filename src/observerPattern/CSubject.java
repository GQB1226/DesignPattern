package observerPattern;

//具体主题
public class CSubject extends Subject{
	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
