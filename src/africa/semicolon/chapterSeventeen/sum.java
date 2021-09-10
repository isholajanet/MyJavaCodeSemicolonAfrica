package africa.semicolon.chapterSeventeen;

import java.util.stream.IntStream;

public class sum {
    public static void main(String[] args) {
        System.out.println("The sum of 1 to 10 is: " + IntStream.rangeClosed(1,10)
                                                                .sum());
        System.out.println("Sum of 1 to 10 excluding 10: " + IntStream.range(1,10)
                                                                     .sum());
        int sum = 0;
        for(int i = 2; i <= 20; i+=2){
            sum += i;
        }
        System.out.println("The sum is: " +sum);

        //using external iteration
        System.out.printf("Sum of the even integers from 2 through 20 is: %d%n", IntStream.rangeClosed(1,10)
                                                                                            .map((int x) -> {return x * 2;})
                                                                                            .sum());
    }
}
