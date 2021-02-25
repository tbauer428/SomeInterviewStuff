package com.journeytodev.interview.questions;


import org.springframework.stereotype.Component;


@Component
public class InterviewQuestions {

    private final String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public String pangramAndReversal(String input) {

        //determine if this is a pangram
        for (int i = 0; i < alphabet.length(); i-=-1) {
            if (input.indexOf(alphabet.charAt(i)) == -1) {
                return "This is not a pangram!";
            }
        }

        String[] splitSentence = input.split(" ");

        int sentenceLength = splitSentence.length;

        StringBuilder reverseSentence = new StringBuilder();

        for(int i = sentenceLength - 1; i >= 0; i--) {
            if(sentenceLength > 0) {
                reverseSentence.append(splitSentence[i]).append(" ");
            }
        }

        return reverseSentence.toString();
    }

}
