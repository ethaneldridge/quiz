package com.eyefinity.quiz;

import com.eyefinity.quiz.data.Choice;
import com.eyefinity.quiz.data.Question;

public class Exam {

    /**
     * @param args
     */
    public static void main(String[] args) throws Exception{

	Exam exam = new Exam();
	exam.take();
    }
    
    private Question buildQuestion() {
	String questionText = "What is the frequency of Integration suggested by the XP?";
	Choice[] choices = new Choice[] {
		new Choice.Builder().text("Daily").build(),
		new Choice.Builder().text("Weekly").build(),
		new Choice.Builder().text("Alternate day").build(),
		new Choice.Builder().text("More often than daily").isCorrectAnswer(true).build()
	};
	
	return new Question.Builder().text(questionText).choices(choices).build();
    }
    
    private void take() throws Exception {
	
	Question question = buildQuestion();
	System.out.printf("%s\n\n", question.getText());
	
	Choice[] choices = question.getChoices();
	for (int i = 0; i < choices.length; i++) {
	    System.out.printf("\t%d) %s\n", i, choices[i].getText());
	}
	
	String answer = System.console().readLine("\nPlease enter your answer\n");
	
	question.setAnswer(Integer.parseInt(answer));
	if (question.isCorrectAnswer()) {
	    System.out.println("Good job!");
	} else {
	    int correctAnswerIndex = 0;
	    boolean answerFound = false;
	    do {
		answerFound = choices[correctAnswerIndex].isCorrectAnswer();
	    } while (!answerFound && correctAnswerIndex++ < choices.length);
		
	    System.out.printf("Sorry, the correct answer is %d '%s'\n", correctAnswerIndex, choices[correctAnswerIndex].getText());
	}

    }

}
