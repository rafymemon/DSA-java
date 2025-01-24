package InsertionSort;

public class insert2 {
    public static void main(String[] args) {
int arr[] = {32,4,23,5,6,233,1};
        for(int i=0; i<arr.length; i++)
            System.out.println(arr[i]);

    }
    public static int insert123(int[] arr){
        for (int i = 1; i <arr.length ; i++) {
            int current = arr[i];
            for(int j=i-1; j<=0; j--){
                if(current<arr[j])
                {
                    arr[i]=arr[j];
                    arr[j]=current;
                }
            }
        }
        return -1;
    }
}
