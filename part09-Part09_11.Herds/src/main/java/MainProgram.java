

public class MainProgram {

    public static void main(String[] args) {
        //you can test the program here
        Herd h = new Herd();
        h.addToHerd(new Organism(1,9));
        h.addToHerd(new Organism(4,2));
        System.out.println(h.toString());
    }
}
