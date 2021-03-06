import static org.junit.Assert.*;

import org.junit.Test;

public class ShainTest {

	@Test
	public void standup() {
		Shain shain = new Tanto();
		assertEquals("担当が普通に起立しました", shain.standup());
	}

	public void standupForShunin() {
		Shain shain = new Shunin();
		assertEquals("主任がすばやく立ちました", shain.standup());
	}
	
	public void standupForBucho() {
		Shain shain = new Bucho();
		assertEquals("部長がだるそうに立ちました", shain.standup());
	}
}
