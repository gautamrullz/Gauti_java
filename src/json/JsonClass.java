package json;
import java.io.FileWriter;
import org.json.simple.*;

public class JsonClass {
		static String name ="Basmati";
		static int weight=100;
		static double price=45.00;
	
	   public static void main(String[] args) throws Exception{
		   JSONObject obj = new JSONObject();
	        JSONArray list1 = new JSONArray();
	        list1.add(name);
	        list1.add(weight+"kg");
	        list1.add(price+"rs per_kg");
	        obj.put("Rice", list1);
 
	        JSONArray list2= new JSONArray();
	        list2.add("Bagrrys");
	        list2.add("70"+"kg");
	        list2.add("35"+"rs per_kg");

	        obj.put("Wheat", list2);
	        JSONArray list3= new JSONArray();
	        list3.add("Rajdhani");
	        list3.add("50"+"kg");
	        list3.add("75"+"rs per_kg");
	        obj.put("Pulse", list3);
	        
	        FileWriter file = new FileWriter("/home/bridgeit/Desktop/Gauti_java"
	        					+ "/Start/src/json/jsonFile/json.txt"); 
	        file.write(obj.toJSONString());
	        file.flush();
	        System.out.println(obj);
	   }
	
}
