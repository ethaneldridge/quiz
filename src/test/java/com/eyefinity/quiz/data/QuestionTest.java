package com.eyefinity.quiz.data;

import static org.junit.Assert.*;

import org.junit.Test;

public class QuestionTest {

    @Test
    public void testIsCorrectAnswer() {
	String questionText = "What is the frequency of Integration suggested by the XP?";
	Choice[] choices = new Choice[] {
		new Choice.Builder().text("Daily").build(),
		new Choice.Builder().text("Weekly").build(),
		new Choice.Builder().text("Alternate day").build(),
		new Choice.Builder().text("More often than daily").isCorrectAnswer(true).build()
	};
	
	Question question = new Question.Builder().text(questionText).choices(choices).build();
	
	question.setAnswer(3);
	assertTrue(question.isCorrectAnswer());
    }

}

//What is the frequency of Integration suggested by the XP? 
//Daily
//Weekly
//Alternate day
//More often than daily <==
//


// ---------------

//The new version of XP is based on certain values - These values provide the guidance for the development and inspiration of the whole methodology. Identify one Value which is added in new version. 
//Communication
//Simplicity
//Respect <==
//Feedback
//
//
//
//
//Which statement is true about story in XP? 
// It is a short description of customer visible functionalities <==
//Each story need to represent a complete feature
//Story is XP terminology for the Use Case
//A Story should not be described in more than one page
//
//
//
//Which planning cycle is part of XP 'Practices' 
// Monthly
//Quarterly <==
//Half Yearly
//Yearly
//
//
//According to one of the 'Practice' in XP - System should be built and all of the tests should be finished within
//
//5 minute
//10 minute <==
//15 minute
//30 minute
//
//
//
//Which of the following is the right activity sequence for XP? 
// write code,write test, refactor
//write code, refactor, write test
//Write test, write code, refactor <==
//Design, write code,Write test
//
//
//
//One of the Corollary Practice suggest to keep this one factor open for negotiation during the project execution 
// Cost
//Quality
//Time
//Scope <==
//
// 
//
//
//Which Practice prescribe "the code is always written by two programmers at one machine" 
// Twin Programming
//Peer Programming
//Pair Programming <==
//Buddy Programming
//
//
//
//
//The new version of XP define _ values , _ principle and _ practices 
//4,15,12
//5,15,12
//4,14,24
//5,14,24 <==
//
//
//Diversity, Improvement, Accepted Responsibility are some of the ______ defined in the XP. 
// Values
//Practices
//Principles <==
//Team Attributes
//
//

