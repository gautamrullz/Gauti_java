package stock;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class StockPortfolio {
	
	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("No. of Stock");
	int noOfStock =scn.nextInt();
	Queue<Stock> q=new LinkedList<Stock>();

	for(int i=1;i<=noOfStock;i++){
		
		System.out.println(i+"."+"Enter StockName: ");
		String s=scn.next();
		System.out.println(i+"."+"No of Share: ");
		int no =scn.nextInt();
		System.out.println(i+"."+"Share price: ");
		double price=scn.nextDouble();
		Stock obj=new Stock(s,no,price);
		obj.calculateStock();
		q.add(obj);
	}
	System.out.println("StockName | NoOShare | Shareprice | Stock");
	for (int i = 0; i < noOfStock; i++) {
		System.out.println(q.poll());
	}
	Stock s=new Stock();
	System.out.println();
	System.out.println("........................TotalStock");
	System.out.println("........................["+s.totalStock+"]");
	
	}
}
