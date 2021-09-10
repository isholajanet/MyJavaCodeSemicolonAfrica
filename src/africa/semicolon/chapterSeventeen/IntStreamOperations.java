package africa.semicolon.chapterSeventeen;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamOperations {
    public static void main(String[] args) {
        int[] values = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};

        System.out.print("Original values: ");
        System.out.println(IntStream.of(values)
                                    .mapToObj(String::valueOf)
                                    .collect(Collectors.joining(" ")));
        System.out.printf("%nCount: %d%n", IntStream.of(values).count());
        System.out.println(IntStream.of(values).summaryStatistics());

    }
}
