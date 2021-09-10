package africa.semicolon.chapterFourteen;

import java.util.Random;

public class randomSentences {
    public static void main(String[] args) {
        Random random = new Random();
        String[] articles = {"The", "A", "One", "Some", "Any"};
        String[] nouns = {"boy", "girl", "dog", "town", "car"};
        String[] verbs = {"drove", "jumped", "ran", "walked", "skipped"};
        String[] prepositions = {"to", "from", "over", "under", "on"};

       for(int i= 0; i < 20; i++){
           int count = random.nextInt(5);
           System.out.println(articles[count] + " " + nouns[count] + " " + verbs[count] + " " + prepositions[count]);
       }
    }
}
