package json;
import java.io.FileWriter;
import java.util.Scanner;

import org.json.simple.*;

public class JsonClass {
		static String name;
		static String brand;
		static int weight;
		static double price;
	
	   public static void main(String[] args) throws Exception{
		   	FileWriter file = new FileWriter("/home/bridgeit/Desktop/Gauti_java"
					+ "/Start/src/json/jsonFile/test.json"); 
		   	Scanner scn=new Scanner(System.in);
		   	JSONArray list=null;
		   	JSONObject obj= new JSONObject();
	        System.out.println("enter no for product you have");
	        int n=scn.nextInt();
	        for(int i=1;i<=n;i++){
	        	
	        	System.out.println(i+".name of the product");
	        	name=scn.next();
	        	System.out.println(i+".brand....");
	        	brand=scn.next();
	        	System.out.println(i+".Quantity in kg");
	        	weight=scn.nextInt();
	        	System.out.println(i+".price per kg");
	        	price=scn.nextDouble();
	        	list= new JSONArray();
	       
	        	list.add("brand  :"+brand);
		        list.add("weight :"+weight+"kg");
		        list.add("price  :"+price+"rs per_kg");
		        obj.put(name, list);
	        }
	        file.write(obj.toJSONString());
	        file.flush();
	      
	   }
}
