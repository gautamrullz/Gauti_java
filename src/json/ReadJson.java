package json;

import java.io.FileReader;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class ReadJson {
	public static void main(String[] args) throws Exception{
		FileReader file=new FileReader("/home/bridgeit/Desktop/Gauti_java/Start/src/json/jsonFile/json.txt");
		JSONParser par= new JSONParser();
		Object obj= par.parse(file);
		JSONObject jo=(JSONObject)obj;
		System.out.println(jo.get("Rice"));

		System.out.println(jo.get("Wheat"));

		System.out.println(jo.get("Pulse"));
	
	}
}
