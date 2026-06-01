package arrays;

public class ArrayBasics {


    static void traverse(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Arr ele :" + arr[i]);
        }


        for(int num :arr){
            System.out.println("Arr num are; "+ num);
        }
    }

    static void main() {
        int[] arr = {3, 44, 22, 33, 5, 63, 7, 2, 80};
        traverse(arr);
    }
}
