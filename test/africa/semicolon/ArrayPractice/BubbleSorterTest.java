package africa.semicolon.ArrayPractice;

import africa.semicolon.ArrayPractice.exceptions.ArraySorterException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSorterTest {
    private ArraySorter sorter;

    @BeforeEach
    void setUp() {
        sorter = new BubbleSorter();
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void sortWithoutAnArray(){
        assertThrows(ArraySorterException.class, ()-> sorter.sortAscending(null));
    }
    @Test
    void sortArray(){
        int[] scores = {10, 5, 3, 7, 9, 2, 1, 6, 4, 8};
        int[] expectedScores = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        try{
            int[] sortedScores = sorter.sortAscending(scores);
            assertArrayEquals(expectedScores, sortedScores);

        }catch(ArraySorterException ex){
            ex.printStackTrace();
        }
    }
    @Test
    void sortArrayDescending(){
        int[] scores = {10, 5, 3, 7, 9, 2, 1, 6, 4, 8};
        int[] expectedScores = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        try{
            int[] sortedScores = sorter.sortDescending(scores);
            assertArrayEquals(expectedScores, sortedScores);

        }catch(ArraySorterException ex){
            ex.printStackTrace();
        }
    }
}