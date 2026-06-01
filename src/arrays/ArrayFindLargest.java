package arrays;

public class ArrayFindLargest {
    static int findLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        for (int ele : arr) {
            if (ele > largest) {
                largest = ele;
            }
        }
        return largest;

    }

    public static void main() {
        try {
            int[] arr = {};
            System.out.println("Largest ele is : " + findLargest(arr));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
