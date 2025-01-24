package LinkedList;

public class Counting {
    int data;
    Counting next;
    int count = 0;

    Counting(int data){
        this.data = data;
    }

    public int count(Counting head){
        for(Counting temporary = head; temporary != null ; temporary = temporary.next){
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Counting start = new Counting(11);
        Counting p = start;
        for (int i = 0; i <3; i++) {
            p.next = new Counting(11 * i);
            p = p.next;
        }
        System.out.println("Number of elements that are linked are  : "+start.count(start));
        Counting start2 = new Counting(22);
        Counting q = start2;
        for (int i = 0; i <5; i++) {
            q.next = new Counting(11 * i);
            q = q.next;
        }
        System.out.println("Numebr of elements in the second list are :" +start2.count(start2));
        
    }
    
}
