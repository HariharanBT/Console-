package demo;

import java.util.List;

class QuizView {
	private QuizViewModel viewModel;

	public QuizView(QuizViewModel viewModel) {
		this.viewModel = viewModel;
	}

	public void displayQuestion() {
		Question currentQuestion = viewModel.getCurrentQuestion();
		System.out.println(currentQuestion.getText());

		List<String> options = currentQuestion.getOptions();
		for (int i = 0; i < options.size(); i++) {
			System.out.println((i + 1) + ". " + options.get(i));
		}
	}

	public void displayResult(boolean isCorrect) {
		if (isCorrect) {
			System.out.println("Correct!\n");
		} else {
			System.out.println("Incorrect. The correct answer is: "
					+ (viewModel.getCurrentQuestion().getCorrectOptionIndex() + 1) + "\n");
		}
	}

	public void displayFinalResult() {
		System.out.println("Quiz completed. Thank you!\n");
	}
}
