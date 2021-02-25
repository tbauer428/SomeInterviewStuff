package com.journeytodev.interview;

import com.journeytodev.interview.questions.InterviewQuestions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class InterviewQuestionsTest {

    @Autowired
    private InterviewQuestions interviewQuestions;

    @Test
    void testPangramAndReversalHappyPath() {
        assertEquals("dog. lazy the over jumps fox brown quick The ",
                interviewQuestions.pangramAndReversal("The quick brown fox jumps over the lazy dog."));
    }

    @Test
    void testPangramAndReversalNotAPangram() {
        assertEquals("This is not a pangram!",
                interviewQuestions.pangramAndReversal("I'm not a pangram."));
    }
}