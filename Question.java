package demo;

import java.util.List;

public class Question {
	private String text;
	private List<String> options;
	private int correctOptionIndex;

	public Question(String text, List<String> options, int correctOptionIndex) {
		this.text = text;
		this.options = options;
		this.correctOptionIndex = correctOptionIndex;
	}

	public String getText() {
		return text;
	}

	public List<String> getOptions() {
		return options;
	}

	public int getCorrectOptionIndex() {
		return correctOptionIndex;
	}
}

class Quiz {
	private List<Question> questions;

	public Quiz(List<Question> questions) {
		this.questions = questions;
	}

	public List<Question> getQuestions() {
		return questions;
	}
}
