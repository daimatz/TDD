import static org.junit.Assert.*;

import org.junit.Test;


public class GoodsTest {

	@Test
	public void GoodsPrice() {
		Goods ice = new Goods(100);
		assertEquals(100, ice.getPrice());
	}

	@Test
	public void getTaxIncludePrice() {
		Goods ice = new Goods(100);
		assertEquals(105, ice.getTaxIncludedPrice());
	}
}
