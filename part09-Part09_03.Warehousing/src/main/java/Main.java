

public class Main {

    public static void main(String[] args) {
        // here you can write code to test your classes
        System.out.print("hello");
        ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 10, 5);
        
        juice.addToWarehouse(5);
        juice.takeFromWarehouse(7);
        System.out.println(juice.getName()); // Juice
        System.out.println(juice);           // Juice: balance = 989.7, space left 10.3

        // etc

        // and now we have the history:
        System.out.println(juice.history()); // [1000.0, 988.7, 989.7]
        
    }

}
