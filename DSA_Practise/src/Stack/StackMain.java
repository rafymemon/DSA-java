package Stack;

public class StackMain {
    public static void main(String[] args) {
        ArrayStack fruitCrate = new ArrayStack(10);
        fruitCrate.push("Apples");
        fruitCrate.push("Kiwi");
        fruitCrate.push("Chiku");
        fruitCrate.push("Oranges");
        System.out.println(fruitCrate.peek());
        fruitCrate.pop();
        System.out.println(fruitCrate.peek());
        System.out.println("Current size : "+fruitCrate.size());
        fruitCrate.push("Pomegranate");
        fruitCrate.push("Corn");
        System.out.println("Now size after add 2 : "+fruitCrate.size());


        ArrayStack coldDrinkCrate = new ArrayStack(5);
        coldDrinkCrate.push("Coca cola");
        coldDrinkCrate.push("Sting");
        coldDrinkCrate.push("Sprite");
        coldDrinkCrate.push("Dew");


//        System.out.print("Fruit crate : ");
//        while (!fruitCrate.isEmpty())
//            System.out.print(fruitCrate.pop()+ " , ");

        // merge two stacks : 1st method that ass data from the 2nd stack to 1st and 2nd stack becomes empty
//        fruitCrate.mergeTwoStack(fruitCrate, coldDrinkCrate);
//        System.out.print("Fruit crate : ");
//        while (!fruitCrate.isEmpty())
//            System.out.print(fruitCrate.pop()+ " , ");



        // merge two stacks : 2nd method it copy the data from 2nd stack to 1st and 2nd dont becomes empty
//        fruitCrate.mergeTwoStack2(fruitCrate, coldDrinkCrate);
//        System.out.print("Fruit crate : ");
//        while (!fruitCrate.isEmpty())
//            System.out.print(fruitCrate.pop()+ " , ");


        // duplicate method
//        ArrayStack duplicateStack = fruitCrate.duplicate(fruitCrate);
//        while (!duplicateStack.isEmpty())
//            System.out.println(duplicateStack.pop());


        // get Bottom element : 1st method it return bottom element but keep that in the stack
//        System.out.println("Bottom element : "+fruitCrate.getBottom());
//        while (!fruitCrate.isEmpty())
//            System.out.println(fruitCrate.pop());

//        // get Bottom Element : 2nd method it return bottom element and remove from the stack
//        System.out.println("Bottom element : "+fruitCrate.getBottom2());
//        while (!fruitCrate.isEmpty())
//            System.out.println(fruitCrate.pop());

        // get 2nd Last element : 1st method it return the 2nd last element but keep that in the stack
//        System.out.println("Bottom element : "+fruitCrate.getSecondLast());
//        while (!fruitCrate.isEmpty())
//            System.out.println(fruitCrate.pop());

        // get 2nd Last element : 2nd method it return the 2nd last element and remove it from the stack
//        System.out.println("Bottom element : "+fruitCrate.getSecondLast2());
//        while (!fruitCrate.isEmpty())
//            System.out.println(fruitCrate.pop());



    }
}
