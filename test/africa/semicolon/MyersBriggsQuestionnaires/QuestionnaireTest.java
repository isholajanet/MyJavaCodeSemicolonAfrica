package africa.semicolon.MyersBriggsQuestionnaires;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class QuestionnaireTest {
    Questionnaire questionnaire;
    @BeforeEach
    void setUp(){
        questionnaire = new Questionnaire();
    }
    @Test
    void questionnaireHasListOfTenQuestions(){
        //when
        List<Question> questionList = questionnaire.getQuestions();
        //assertion
        assertNotNull(questionList);
        assertFalse(questionList.isEmpty());
        assertEquals(10, questionList.size()); 
    }
}
