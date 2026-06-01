package arrays;

public class Arrays {
    static void traverse(int[] arr) {
        for (int j : arr) {
            System.out.println("ele is : " + j);
        }
    }

    static void main() {
        int[] arr = {2, 4, 5, 3, 4, 6, 7};
        traverse(arr);
    }
}
