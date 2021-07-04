package africa.semicolon.MyDiary;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DiaryTest {
    @Test
    public void diaryCanBeCreatedTest(){
        Diary diary = new Diary("Hatred Stories");
        assertNotNull(diary);
        assertEquals("Hatred Stories", diary.getTitle());
    }

    @Test
    public void diaryCanAddEntryTest(){
        Diary diary = new Diary("Confidence Diary");
        Entry entry = new Entry();
        entry.setTitle("Ordinary Cake");
        entry.setBody("Because of ordinary cake....");

        diary.addEntry(entry);
        assertEquals(1, diary.getNumberOfEntries());

        diary.addEntry(entry);
        assertEquals(2, diary.getNumberOfEntries());
    }

    @Test
    public void diaryCanAddEntriesAsStringTest(){
        Diary diary = new Diary("Blessing's Diary");
        diary.addEntry("Heart Torn Apart","It was a sunny afternoon....");

        assertEquals(1, diary.getNumberOfEntries());
        diary.addEntry("And He came begging", "Turn to page 2");
        assertEquals(2, diary.getNumberOfEntries());

    }

    @Test
    public void entriesCanBeSearchedByTitle(){
        Diary diary = new Diary("Blessing's Diary");
        Entry entry = new Entry();
        entry.setTitle("Heart Torn Apart");
        entry.setBody("It was a sunny afternoon....");
        diary.addEntry(entry);
        diary.addEntry("And He came begging", "Turn to page 2");

        Entry foundEntry = diary.findTitleByEntry("Heart Torn Apart");
        assertEquals(foundEntry, entry);

    }

    @Test
    public void diaryCanBeDeletedByTitleTest(){
        Diary diary = new Diary("Blessing's Diary");
        Entry entry = new Entry();
        entry.setTitle("Heart Torn Apart");
        entry.setBody("It was a sunny afternoon....");
        diary.addEntry(entry);
        diary.addEntry("And He came begging", "Turn to page 2");
        assertEquals(2, diary.getNumberOfEntries());

        diary.deleteEntryByTitle("And He came begging");
        assertEquals(1, diary.getNumberOfEntries());

    }
}
