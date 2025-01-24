package InsertionSort;

public class insertion3 {
    public static void main(String[] args) {
int [] arr = {43,53,23,1,54,7,44};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
            insert3(arr);
        }

    }
    public static void insert3(int [] arr){
        for (int i = 1; i <arr.length ; i++) {
            int temp = arr[i];
            for(int j = i-1;j>=0;j--){
                while (j>=0 && arr[j]>temp){
                    if(arr[j] > arr[j+1]){
                    arr[j+1] = arr[j];
                    j--;
                    }
                }
                arr[j+1] = temp;
            }

        }
    }
}
