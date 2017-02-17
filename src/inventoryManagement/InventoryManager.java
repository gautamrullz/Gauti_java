package inventoryManagement;

import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class InventoryManager {
	
	public static void main(String[] args) throws Exception {
		
		InventoryFactory ifr=new InventoryFactory();
		JSONObject jsonProduct=(JSONObject) ifr.getIventoryObject();
		JSONObject getProduct=(JSONObject)jsonProduct.get("product");
		System.out.println("Product : ");
		String[] ProductNames=new String[getProduct.size()];
		
		int i=0;
		for(Object key:getProduct.keySet()){
			String name=key.toString();
			ProductNames[i]=name;
			i++;
		}
			for(int i1=0;i1<getProduct.size();i1++){
				System.out.println();
				System.out.println((String)ProductNames[i1]+":");
				JSONObject jo2=(JSONObject)getProduct.get(ProductNames[i1]);
				String[] brands=new String[jo2.size()];
				System.out.println();
				i=0;
				for(Object key:jo2.keySet()){
					String brand=key.toString();
					brands[i]=brand;
					i++;
				}
				for(int j=0;j<jo2.size();j++){
					JSONArray productBrand=(JSONArray)jo2.get(brands[j]);
					Iterator<String> iterator = productBrand.listIterator();
					System.out.println(brands[j]);
					while (iterator.hasNext()) {
			            System.out.println(iterator.next());
			        }
					System.out.println();
				}
			}
		System.out.println(jsonProduct);
	}
}
