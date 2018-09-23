
public class Binary {
	public int binarySearch(int[] inputArr, int key) {
        
        int start = 0;
        int end = inputArr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == inputArr[mid]) {
                return mid;
            }
            if (key < inputArr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
  
    public static void main(String[] args) {
         
        Binary mbs = new Binary();
        int[] arr = {3,6,9,12,15,18,21,24};
        System.out.println("Key 14's position: "+mbs.binarySearch(arr, 15));
        int[] arr1 = {6,44,78,133,442,800};
        System.out.println("Key 432's position: "+mbs.binarySearch(arr1, 442));
    }
}

