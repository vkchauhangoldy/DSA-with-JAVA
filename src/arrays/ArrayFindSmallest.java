package arrays;

public class ArrayFindSmallest {

    static int findSmallest(int [] arr){
        if(arr==null || arr.length==0){
            throw new IllegalArgumentException("Array cant be null or empty");
        }

        int smallest = Integer.MAX_VALUE;

        for (int ele:arr){
            if(ele<smallest){
                smallest=ele;
            }
        }
        return smallest;
    }

    static void main() {
        try {
            int[] arr = {5, 6, 3, -8, 4, 2, 7};
            System.out.println("Smallest ele is : " + findSmallest(arr));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
