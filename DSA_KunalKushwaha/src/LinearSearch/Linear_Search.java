
package LinearSearch;
public class Linear_Search{
public static void main(String[] args) {
    
  int [] arr = {1,2,3,4,5,6,7,8,9,10};
  int requireNum = 12;
  int index = 0;

  boolean found = false;
  for(int num : arr){
    if (num == requireNum) {
        found = true;
        break;
    }
    index++;
    }
    if(found){
        System.out.println("Number is present in the array at the index :" +index);
    } else{
        System.out.println("Number is not found ...!");
    }
}
}
    
  