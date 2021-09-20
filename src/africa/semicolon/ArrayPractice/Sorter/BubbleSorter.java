package africa.semicolon.ArrayPractice;

import africa.semicolon.ArrayPractice.exceptions.ArraySorterException;

public class BubbleSorter implements ArraySorter {
    @Override
    public int[] sortAscending(int[] arrayToSort) throws ArraySorterException {
        validateArray(arrayToSort);
        int temp = 0;

        for (int i = 0; i < arrayToSort.length - 1; i++) {
            for (int j = i+1; j < arrayToSort.length; j++) {
                if(arrayToSort[i] > arrayToSort[j]){
                    temp = arrayToSort[i];
                    arrayToSort[i] = arrayToSort[j];
                    arrayToSort[j] = temp;
                }

            }

        }
        return arrayToSort;
    }

    @Override
    public int[] sortDescending(int[] arrayToSort) throws ArraySorterException {
        validateArray(arrayToSort);
        int temp = 0;

        for (int i = 0; i < arrayToSort.length - 1; i++) {
            for (int j = i+1; j < arrayToSort.length; j++) {
                if(arrayToSort[i] < arrayToSort[j]){
                    temp = arrayToSort[i];
                    arrayToSort[i] = arrayToSort[j];
                    arrayToSort[j] = temp;
                }

            }

        }
        return arrayToSort;
    }


}

