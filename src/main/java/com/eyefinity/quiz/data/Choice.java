package com.eyefinity.quiz.data;

public class Choice {

    private final String text;
    public String getText() {
        return text;
    }

    public boolean isCorrectAnswer() {
        return isCorrectAnswer;
    }

    private final boolean isCorrectAnswer;

    public static class Builder {
	private String text;
	private boolean isCorrectAnswer;

	public Builder text(String text) {
	    this.text = text;
	    return this;
	}

	public Builder isCorrectAnswer(boolean isCorrectAnswer) {
	    this.isCorrectAnswer = isCorrectAnswer;
	    return this;
	}

	public Choice build() {
	    return new Choice(this);
	}
    }

    private Choice(Builder builder) {
	this.text = builder.text;
	this.isCorrectAnswer = builder.isCorrectAnswer;
    }
}
