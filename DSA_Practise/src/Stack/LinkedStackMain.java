package Stack;

public class LinkedStackMain {
    public static void main(String[] args) {
        LinkedStack fruitCrate = new LinkedStack();
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


        LinkedStack coldDrinkCrate = new LinkedStack();
        coldDrinkCrate.push("Coca cola");
        coldDrinkCrate.push("Sting");
        coldDrinkCrate.push("Sprite");
        coldDrinkCrate.push("Dew");

}
}
