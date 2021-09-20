package africa.semicolon.ArrayPractice;

import africa.semicolon.ArrayPractice.exceptions.ArraySorterException;

public interface ArraySorter {
    public int[] sortAscending(int[] arrayToSort) throws ArraySorterException;
    public int[] sortDescending(int[] arrayToSort) throws ArraySorterException;
    default void validateArray(int[] arrayToSort) throws ArraySorterException{
        if(arrayToSort == null){
            throw new ArraySorterException("Array to sort cannot be null");
        }
    }
}
