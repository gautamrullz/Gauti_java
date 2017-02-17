package inventoryManagement;

import java.io.FileWriter;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class InventoryFactory {
		static String name;
		static String brand;
		static int weight;
		static double price;
		
		Object getIventoryObject() throws Exception{
			
			FileWriter file = new FileWriter("/home/bridgeit/Desktop/Gauti_java"
				+ "/Start/src/inventoryManagement/inventory.json"); 
			Scanner scn=new Scanner(System.in);
			JSONArray list=null;
			JSONObject obj1= new JSONObject();
			JSONObject obj2=new JSONObject();
			JSONObject obj3=null;
			System.out.println("enter no for product you have");
			int n=scn.nextInt();
			for(int i=1;i<=n;i++){
				System.out.println(i+".name of the product");
				name=scn.next();
		    	System.out.println("Enter no. of varity you have of "+name);
		    	int p1=scn.nextInt();
		    	obj3=new JSONObject();
		    	for(int j=1;j<=p1;j++){
		    		list=new JSONArray();
		    		System.out.println(j+".brand....");
		    		brand=scn.next();
		    		System.out.println(j+".Quantity in kg");
		    		weight=scn.nextInt();
		    		System.out.println(j+".price per kg");
			    	price=scn.nextDouble();
			        list.add(weight+" kg");
			        list.add(price+" /kg");
			        obj3.put(brand, list);
		    	}
		    	
		        obj2.put(name,obj3);
			}
			
	    obj1.put("product",obj2);
	    file.write(obj1.toJSONString());
	    file.close();
	    return obj1;
		}
}
