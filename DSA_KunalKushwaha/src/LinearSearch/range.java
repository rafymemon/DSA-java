package LinearSearch;
//{1,2,5,6,3,7};
//Find the range of 3 from [1,4]
public class range {
    public static void main(String[] args) {
        int [] arr = {18,23,44,3,31,45,50};
        int target = 3;

        System.out.println("The required target is on the index : "+searchRange(arr, target, 1, 4));
        
    }
    static int searchRange(int [] arr, int target, int starts, int ends){
        if (arr.length == 0) {
            return -1;
        }
        for(int index = starts; index<=ends;index++){
         int element = arr[index];
         if (element == target) {
            return index;
         }
        }
        return -1;
    }
    
}
