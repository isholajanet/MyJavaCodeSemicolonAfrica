package africa.semicolon.chapterSeven;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[][] array = {{2, 3, 5}, {0,5,9}, {1,2,1}};

        for (int[] row : array) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();

        }
    }
}
