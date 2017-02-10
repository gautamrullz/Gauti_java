package utility_19;

public class Utility {
	
	public String[] bubbleSortString(String[] str) {
		for (int i = 0; i < str.length-1; i++) {
			for (int j = 0; j < str.length-1-i; j++) {
				if(str[j].compareTo(str[j+1])>0){
					String temp= str[j];
					str[j]=str[j+1];
					str[j+1]=temp;
				}
			}
		}
		
		return str;
	}
	
	public int[] bubbleSortinteger(int [] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}

	public String[] insertionSortString(String [] str) {
		
		for (int i = 1; i < str.length; i++) {
			String key=str[i];
			int j=i-1;
			while(j>-1 && key.compareTo(str[j])<=0){
				str[j+1]=str[j];
				j--;
			}
			str[j+1]=key;
		}
		return str;
	}

	public int[] insertionSortinteger(int [] arr) {
		
		for (int i = 1; i < arr.length; i++) {
			int key=arr[i];
			int j=i-1;
			while(j>-1 && arr[j]>key){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		return arr;
	}

	public boolean binarySearchString(String [] str,String ele) {
		int first=0;
		int last=str.length-1;
		int mid;
		while(first<=last){
			mid=(first+last)/2;
			if(ele.compareTo(str[mid])>0){
				first=mid+1;
			}
			else if(ele.compareTo(str[mid])<0){
				last=mid-1;
			}
			else{
				
				return true;
			}
		}
		return false;
	}

	public boolean binarySearchinteger(int[] arr,int ele) {

		int f=0;
		int l=arr.length-1;
		int m;
		while(f<=l){
			m=(f+l)/2;
			if(ele>arr[m]){
				f=m+1;
			}
			else if(ele<arr[m]){
				l=m-1;
			}
			else {
				return true;
			}
		}
		return false;
	}
	public long[] bubbleSortLong(long [] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if(arr[j]<arr[j+1]){
					long temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}
}
