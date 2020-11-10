
public class StockItem {
	
	private String stockNumber, name;
	private double price;
	private int totalStock;
	private static double salesTax;
	
	public StockItem(String stockNumberIn, String nameIn, double priceIn) {
		stockNumber = stockNumberIn;
		name = nameIn;
		price = priceIn;
		totalStock = 0;
	}
	
	public void setPrice(double priceIn) {
		price = priceIn;
	}
	
	public void increaseTotalStock(int stockIn) {
		totalStock += stockIn;
	}
	
	public String getStockNumber() {
		return stockNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public int getTotalStock() {
		return totalStock;
	}
	
	public double getPrice() {
		return price;
	}
	
	public double calculateTotalPrice() {
		return price * totalStock;
	}
	
	public static void setSalesTax(double taxIn) {
		salesTax = taxIn;
	}

}
