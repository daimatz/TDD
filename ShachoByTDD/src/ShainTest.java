import static org.junit.Assert.*;

import org.junit.Test;

public class ShainTest {

	@Test
	public void standup() {
		Shain shain = new Shain();
		assertEquals("担当が普通に起立しました", shain.standup());
	}

}
