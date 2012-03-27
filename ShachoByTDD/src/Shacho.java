
public class Shacho {
	public static void main(String[] args) {
		Shain shain = null;
		if (args[0].equals("Tanto")) {
			shain = new Tanto();
		}
		if (args[0].equals("Shunin")) {
			shain = new Shunin();
		}
		if (args[0].equals("Bucho")) {
			shain = new Bucho();
		}
		System.out.println(shain.standup());
	}
}
