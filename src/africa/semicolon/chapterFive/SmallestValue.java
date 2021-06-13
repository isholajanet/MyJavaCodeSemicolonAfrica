package africa.semicolon.chapterFive;

public class SmallestValue {

    public int smallestValueIs(int... value) {
        int count = 0;
        int smallest = 999999999;
        
        while(count < value.length){
            if(value[count] < smallest){
                smallest = value[count];
            }
            count++;
        }
        return smallest;

    }
}
