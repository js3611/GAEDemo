package ocado.client;

public class StockPrice {
	private String symbol;
	private double price;
	private double change;

	public StockPrice() {
	}

	public StockPrice(final String symbol, final double price, final double change) {
		this.symbol = symbol;
		this.price = price;
		this.change = change;
	}

	public String getSymbol() {
		return this.symbol;
	}

	public double getPrice() {
		return this.price;
	}

	public double getChange() {
		return this.change;
	}

	public double getChangePercent() {
		return 10.0 * this.change / this.price;
	}

	public void setSymbol(final String symbol) {
		this.symbol = symbol;
	}

	public void setPrice(final double price) {
		this.price = price;
	}

	public void setChange(final double change) {
		this.change = change;
	}
}
