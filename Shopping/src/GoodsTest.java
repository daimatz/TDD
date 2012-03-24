import static org.junit.Assert.*;

import org.junit.Test;


public class GoodsTest {

	@Test
	public void GoodsPrice() {
		Goods ice = new Goods();
		assertEquals(100, ice.getPrice());
	}

}
