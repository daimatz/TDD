public class Goods {
	private int unitPrice = 0;

	public Goods(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getPrice() {
		return this.unitPrice;
	}
	
	public int getTaxIncludedPrice() {
		return this.unitPrice + 5;
	}
}
