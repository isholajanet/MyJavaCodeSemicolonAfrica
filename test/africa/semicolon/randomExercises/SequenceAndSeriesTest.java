package africa.semicolon.randomExercises;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class SequenceAndSeriesTest {
    @Test
    public void systemCanGetTheNextNumberInASeries(){
        SequenceAndSeries sequenceAndSeries = new SequenceAndSeries();
        assertEquals(13, sequenceAndSeries.getTheSeriesOf(1,5,9));
    }


}
