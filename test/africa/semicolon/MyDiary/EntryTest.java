package africa.semicolon.MyDiary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class EntryTest {
    @Test
    public void entryCanBeCreatedTest(){
        Entry entry = new Entry();
        assertNotNull(entry);
    }
    @Test
    public void entry_Has_Date_After_Creation(){
        Entry entry = new Entry();
        System.out.println(entry.getDateTime());
        assertNotNull(entry.getDateTime());
    }
    @Test
    public void entryHasATitleTest(){
        Entry entry = new Entry();
        entry.setTitle("My Break up Experience with Delly");
        assertEquals("My Break up Experience with Delly", entry.getTitle());
    }
    @Test
    public void entryHasABodyTest(){
        Entry entry = new Entry();
        String entryBody = """
                I did not do anything, He just came and said that he wanted to work on himself
                He said it wasn't me but him.
                """;
        entry.setBody(entryBody);
        assertEquals(entryBody, entry.getBody());
    }

}
