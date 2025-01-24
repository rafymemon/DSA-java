package LinkedList;

import java.util.Random;

public class Node3 {
    int data;
    Node3 next;

    public Node3() {
    }

    public Node3(int data) {
        this.data = data;
    }

    public Node3(int data, Node3 next) {
        this.data = data;
        this.next = next;
    }

    public Node3 insert(Node3 start, int x) {
        if (start == null || start.data > x) {
            start = new Node3(x, start);
            return start;
        }
        Node3 p = start;
        while (p.next != null) {
            if (p.next.data > x)
                break;
            p = p.next;
        }
        p.next = new Node3(x, p.next);
        return start;
    }

    public void previousInsert(Node3 start, int x) {
        Node3 p = start;
        while (p.next != null) {
            if (p.next.data > x)
                break;

            p = p.next;
        }
        p.next = new Node3(x, p.next);
    }

    public Node3 delete(Node3 start, int x) {
        if (start == null || start.data > x)
            return start;
        if (start.data == x)
            return start.next;

        for (Node3 p = start; p.next != null; p = p.next) {
            if (p.next.data > x)
                break;
            if (p.next.data == x) {
                p.next = p.next.next;
                break;
            }
        }
        return start;
    }

    public int size() {
        
        int count = 0;
        for (Node3 q = this; q != null; q = q.next) {
            count++;
        }
        return count;
    }

    // 29-Nov-2023 Wednesday
    public void display(Node3 start) {
        for (Node3 q = start; q != null; q = q.next) {
            System.out.println(q.data);
        }
    }

    public int sumEven(Node3 start) {
        int sum = 0;
        for (Node3 q = start; q != null; q = q.next) {
            if (q.data % 2 == 0) {
                sum += q.data;
            }
        }
        return sum;
    }
    public int sumOdd(Node3 start){
        int odd = 0;
        for(Node3 q = start; q!= null; q = q.next){
            if (q.data %2 != 0) {
                odd+= q.data;
            }
        }
        return odd;
    }

    public Node3 concat(Node3 list1, Node3 list2) {
        Node3 p = list2;
        while (p != null) {
            list1 = insert(list1, p.data);
            p = p.next;
        }
        return list1;
    }

    public Node3 duplicate(Node3 start) {
        Node3 duplicate = new Node3();
        for (Node3 p = start; p != null; p = p.next) {
            duplicate = insert(start, p.data);
        }
        return duplicate.next;
    }

    public Node3 replace(int position, int number, Node3 target) {
        int count = 0;
        if (position == target.size())
            return target;

        for (Node3 q = target; q != null; q = q.next) {
            if (count == position) {
                q.data = number;
                break;
            }
            count++;
        }
        return target;
    }

    public int[] convertToArray(Node3 start) {
        int size = start.size();
        int[] array = new int[size];
        Node3 q = start;

        for (int i = 0; q != null; q = q.next, i++) {
            array[i] = q.data;
        }
        return array;
    }

    public Node3 convertToLinkedList(int[] array) {
        Node3 start = new Node3(0);
        Node3 q = start;
        for (int i = 0; i < array.length; i++) {
            q = insert(q, array[i]);

        }
        return start.next;
    }

    public Node3 revers(Node3 start) {
        Node3 temp = start;
        int[] array = start.convertToArray(start);
        for (int i = array.length - 1; i >= 0; i--) {
            temp.data = array[i];
            temp = temp.next;
        }
        return start;
    }

    public Node3 reverseOtherMethod(Node3 start) {
        Node3 q = start;
        int[] array = start.convertToArray(start);
        int size = array.length;

        int[] reversedArray = new int[size];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArray[j] = array[i];
        }
        start = convertToLinkedList(reversedArray);
        return start;
    }

    public Node3 subList(Node3 start, int startPosition, int endPosition) {
        int count = 1;
        if (startPosition > start.size() || startPosition < 0 || endPosition > start.size() || endPosition < 0)
            return start;
        Node3 newSublist = null;
        Node3 q = start;
        for (; q != null && count < startPosition; q = q.next, count++) {
        }

        newSublist = new Node3(q.data);

        while (count < endPosition) {
            newSublist = insert(newSublist, q.next.data);
            q = q.next;
            count++;
        }
        return newSublist;
    }

    /* Sir Mohsin's Sublist Method
     * public Node3 sublist_Mohsin(Node3 list, int q, int p){
     * int count = 0;
     * Node3 newList2 = new Node3(0);
     * while (list.next !=null) {
     * if (count == p) {
     * newList2 = new Node3(list.data);
     * }
     * else if (count > p && count <= q) {
     * newList2 = insert(newList2,list.data);
     * 
     * }
     * list = list.next;
     * ++count;
     * }
     * return newList2;
     * 
     * }
     */
    public int getNodeByIndex(Node3 start, int index) {
        Node3 q = start;
        int count = 1;
        while (q != null) {
            if (count == index)
                return q.data;
            q = q.next;
            count++;
        }
        return 0;
    }

    public void insert2(Node3 start, int a) {
        Node3 q = start;
        while (q != null)
            q = q.next;
        q.data = a;
    }

    public Node3 shuffle(Node3 start) {
        int size = start.size();
        Random random = new Random();
        boolean check = false;

        Node3 shuffledList = new Node3(0);
        Node3 temp = shuffledList;
        Node3 q = start;

        int[] addedIndex = new int[size];
        int j = 0;
        while (q != null) {
            int index = random.nextInt(size);

            for (int i = 0; i < addedIndex.length; i++) {
                if (index == addedIndex[i]) {
                    check = true;
                    break;
                }
            }
            if (!check) {
                addedIndex[j] = index;
                j++;
                temp = temp.replace(index, q.data, temp);
                temp = temp.next;
                q = q.next;
            }
        }
        return shuffledList;
    }
    //Caclulating average of the linkedlist .....!~
    public double average(Node3 start){
        if (start == null) {
            return 0;
        }
        Node3 temp = start;
        int sum = 0;
        int count = 0;
        while (temp !=null) {
        sum+=temp.data;
        count++;
        temp = temp.next;    
        }

       return (double) (sum /count) ;
     }

    // public Node3 concat(Node3 l1, Node3 l2){
    // Node3 curr=l1;
    // while (curr.next!=null){
    // curr=curr.next;
    // }
    // curr.next=l2;
    //
    // return l1;
    // }

    // public Node3 concat(Node3 list1, Node3 list2){
    // for(Node3 p = list1; p.next!=null; p=p.next){
    // if(list1.next==null){
    // for(Node3 q=list2; q!=null; q=q.next){
    // p.next=new Node3(q.data);
    // p=p.next;
    // }
    // }
    // }
    // return list1;
    // }


    public static void main(String[] args) {
        Node3 list1 = new Node3(13);
        Node3 p = list1;
        for (int i = 2; i < 5; i++) {
            p.next = new Node3(i * 13);
            p = p.next;
        }

        Node3 list2 = new Node3(25);
        p = list2;
        for (int i = 2; i < 9; i++) {
            p.next = new Node3(i * 25);
            p = p.next;
        }

        // System.out.println("List 1 size : "+list1.size());
        // System.out.println("List 2 size : "+list2.size());
        //
        // System.out.println("List 1 before insert 25 ");
        // list1.display(list1);
        // list1=list1.insert(list1,25);
        //
        // System.out.println("List 1 after insert 25 ");
        // list1.display(list1);
        //
        // System.out.println("After deletion 33 ");
        // list1=list1.delete(list1,33);
        // list1.display(list1);
        //
        //
        // System.out.println("List 2 before insert 5 ");
        // list2.display(list2);
        // list2=list2.insert(list2,5);
        //
        // System.out.println("List 2 after insert 5 ");
        // list2.display(list2);
        //
        // System.out.println("After deletion 75 ");
        // list2=list2.delete(list2,75);
        // list2.display(list2);
        System.out.println("Sum of all Even Elements of list 1 : " + list1.sumEven(list1));
        // System.out.println("Sum of all elements of list 2 : "+list2.sum(list2));
        System.out.println("Sum of all Odd Elements of  list 1 :"+list1.sumOdd(list1));
        // list1.display(list1);
        // list1 = list1.concat(list1,list2);

        // 5 dec 2023
        // System.out.println("Before replace");
        // list1.display(list1);
        // list1=list1.replace(2,5,list1);
        // System.out.println("After replace");
        // list1.display(list1);
        //
        // System.out.println("Converted Linkedlist to array");
        // int[] array=list1.convertToArray(list1);
        // for (int i : array)
        // System.out.println(i);
        //
        // System.out.println("Converted array to linked list");
        // list1 = list1.convertToLinkedList(array);

        list1.display(list1);
        // list1= list1.revers(list1);
        // System.out.println("after reverse");
        // list1.display(list1);

        list1.insert(list1, 91);
        list1.insert(list1, 65);
        list1.insert(list1, 78);

        System.out.println("After insert");
        list1.display(list1);

        // 5 dec 2023 Home Work
        // Node3 newSublist = new Node3(0);
        // newSublist = list1.subList(list1,2,5);
        // System.out.println("After sublist ");
        // newSublist.display(newSublist);

        // Node3 shuffle = new Node3(0);
        // shuffle = list1.shuffle(list1);

        // shuffle.display(shuffle);

        System.out.println("The Index of the required number is :" + list1.getNodeByIndex(list1, 5));

       System.out.println("The average of the list is : "+list1.average(list1));
    }
}