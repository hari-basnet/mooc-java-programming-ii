
public class Program {

    public static void main(String[] args) {
        // Test your method here
        
        int[][] matrix = {
                            {0, 5, 0},
                            {3, 0, 7}
                        };

        System.out.println(arrayAsString(matrix));
    }

    public static String arrayAsString(int[][] array) {

        StringBuilder builder = new StringBuilder();

        for(int row = 0; row < array.length; row++) {
            for(int column = 0; column < array[row].length; column++) {  
                builder.append(array[row][column]);
            }
            builder.append("\n");
        }
        
        return builder.toString();
    }
}
