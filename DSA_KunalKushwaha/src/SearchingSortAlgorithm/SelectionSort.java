package SearchingSortAlgorithm;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
int [] arr = {12,4,54,6,97,9,57,-9,0,-65};
SelectionSor(arr);


    }

    public static void SelectionSor(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            int min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = arr[i];

                }
            }
                // SWAP NOW
                temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            
        }
    }
    public void display(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i ]+" ");
        }
    }
}