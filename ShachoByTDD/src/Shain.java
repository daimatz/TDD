
public class Shain {
	public static final int TANTO = 0;
	public static final int SHUNIN = 1;
	
	public final int type;
	
	public Shain(int type) {
		this.type = type;
	}
	
	public String standup() {
		if (type == TANTO) {
			return "担当が普通に起立しました";
		} else if (type == SHUNIN) {
			return "主任がすばやく立ちました";
		}
		throw new IllegalStateException();
	}
}
