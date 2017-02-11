package stock;

public class Stock {
	int noOfShare;
	int noOfStock;
	String stockName;
	double sharePrice;
	static double totalStock;
	double stockPrice;
	public Stock(String s,int no,Double share) {
		stockName=s;
		noOfShare=no;
		sharePrice=share;
	}
	public Stock() {
		
	}
	
	double calculateStock() {
		double dec=((10*sharePrice)/100);
		stockPrice=dec*noOfShare;
		totalStock+=stockPrice;
		return stockPrice;
	}

	@Override
	public String toString() {
		
		return (stockName+"  |  "+noOfShare+"  |  "+sharePrice+"   |   "+stockPrice);
	
	}
}
