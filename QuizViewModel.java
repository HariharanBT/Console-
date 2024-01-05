package demo;

public class QuizViewModel {
	private Quiz quiz;
	private int currentQuestionIndex;

	public QuizViewModel(Quiz quiz) {
		this.quiz = quiz;
		this.currentQuestionIndex = 0;
	}

	public Question getCurrentQuestion() {
		return quiz.getQuestions().get(currentQuestionIndex);
	}

	public boolean isLastQuestion() {
		return currentQuestionIndex == quiz.getQuestions().size() - 1;
	}

	public void moveToNextQuestion() {
		if (!isLastQuestion()) {
			currentQuestionIndex++;
		}
	}

	public boolean isAnswerCorrect(int userAnswerIndex) {
		return userAnswerIndex == getCurrentQuestion().getCorrectOptionIndex();
	}
}
