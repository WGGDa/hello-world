
public class Searching_Algorithms {
		 
	    public static int linerSearch(int[] arr, int key){
	         
	        int size = arr.length;
	        for(int i=0;i<size;i++){
	            if(arr[i] == key){
	                return i;
	            }
	        }
	        return -1;
	    }
	     
	    public static void main(String a[]){
	         
	        int[] arr1= {25,49,21,53,224,1,34,90};
	        int searchKey = 34;
	        System.out.println("Key "+searchKey+" found at index: "+linerSearch(arr1, searchKey));
	        int[] arr2= {123,410,427,595,2134,41,304,190};
	        searchKey = 410;
	        System.out.println("Key "+searchKey+" found at index: "+linerSearch(arr2, searchKey));
	    }
	}