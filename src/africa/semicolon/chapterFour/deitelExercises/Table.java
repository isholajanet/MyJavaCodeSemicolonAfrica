package africa.semicolon.chapterFour.deitelExercises;

public class Table {
    public static void main(String[] args) {
        int number = 1;
        System.out.println("N\t\t10*N\t\t100*N\t1000*N");
        while(number <= 5){
            System.out.println(number + "\t\t" + 10 * number + "\t\t" + 100 * number + "\t\t" + 1000 * number);
            number++;
        }
    }
}
