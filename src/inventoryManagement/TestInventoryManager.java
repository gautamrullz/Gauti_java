package inventoryManagement;

import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
public class TestInventoryManager {
	
	public static void main(String[] args) throws Exception {
		
		TestInventoryFactory f=new TestInventoryFactory();
		JSONObject jsonProduct=(JSONObject) f.getIventoryObject();
		JSONObject getProduct=(JSONObject)jsonProduct.get("product");
		System.out.println("Product : ");
			
			for(Object obj:getProduct.keySet()){
				String product=(String)obj;
				System.out.println();
				System.out.println(product);
				JSONObject productBrand=(JSONObject)getProduct.get(product);
				System.out.println();
				
				for(Object obj1:productBrand.keySet()){
					
					String brand=(String)obj1;
					System.out.println();
					System.out.println(brand);
					JSONArray Branditr=(JSONArray)productBrand.get(brand);
					Iterator<String> iterator = Branditr.listIterator();
					while (iterator.hasNext()) {
			            System.out.println(iterator.next());
			        }
					System.out.println();
				}
			}		
		System.out.println(jsonProduct);
	}
}
