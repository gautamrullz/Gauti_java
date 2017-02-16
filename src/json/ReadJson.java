package json;

import java.io.FileReader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ReadJson {
	
	public static void main(String[] args) throws Exception{
		
		FileReader file=new FileReader("/home/bridgeit/Desktop/Gauti_java/Start/src/json/jsonFile/test.json");
		JSONParser parser= new JSONParser();
		
		Object obj=parser.parse(file);
		JSONObject jo=(JSONObject)obj;
		JSONArray ja=(JSONArray)jo.get("rice");
		System.out.println("Rice");
		System.out.println();
		Iterator<String> iterator = ja.iterator();
		while (iterator.hasNext()) {
            System.out.println(iterator.next());
        } 
		System.out.println();
		ja=(JSONArray)jo.get("pulse");
		System.out.println("pulse");
		System.out.println();
		iterator = ja.iterator();
		while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
		System.out.println();
		ja=(JSONArray)jo.get("wheat");
		System.out.println("wheat");
		System.out.println();
		iterator = ja.iterator();
		while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

	}
}
