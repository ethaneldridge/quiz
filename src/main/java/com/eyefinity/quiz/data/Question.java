package com.eyefinity.quiz.data;

public class Question {
    private final String text;
    private final Choice[] choices;
    private int answer = -1;

    public String getText() {
        return text;
    }

    public Choice[] getChoices() {
        return choices;
    }
    
    public void setAnswer(int answer) {
	if (answer < 0 || answer >= choices.length) {
	    throw new RuntimeException(String.format("answer %d is out of bounds", answer));
	}
	    
	this.answer = answer;
    }
    
    public boolean isCorrectAnswer() {
	return this.answer != -1 && choices[answer].isCorrectAnswer();
    }

    public static class Builder {
	private String text;
	private Choice[] choices;

	public Builder text(String text) {
	    this.text = text;
	    return this;
	}

	public Builder choices(Choice[] choices) {
	    this.choices = choices;
	    return this;
	}

	public Question build() {
	    return new Question(this);
	}
    }

    private Question(Builder builder) {
	this.text = builder.text;
	this.choices = builder.choices;
    }
}
