

public class Main {

    public static void main(String[] args) {
        // You can test your program here
        Box box = new BoxWithMaxWeight(5);
        box.add(new Item("a", 1));

        System.out.println(box.toString());
        
        System.out.println(box.isInBox(new Item("a")));
    }
}
