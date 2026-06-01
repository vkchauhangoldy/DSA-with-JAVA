package arrays;

public class ArrayLinearSearch {
    
    static int findTarget(int [] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    
    static void main() {
        int[] arr = {3,7,5,9,2,1,6};
        int target = 5;
        
       int an =  findTarget(arr,target);
        System.out.println("target fount at index : " + an);
    }
}
