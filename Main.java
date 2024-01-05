package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		List<Question> questions = new ArrayList<>();
		questions.add
		       (new Question("What is the capital of India?", List.of("Delhi", "Mumbai", "Chennai"),0));
		questions.add
		       (new Question("Which planet is known as the Red Planet?", List.of("Venus", "Mars", "Jupiter"), 1));
		questions.add
				(new Question("What is the largest mammal on Earth?", List.of("Elephant", "Blue Whale", "Giraffe"), 1));
		questions.add
		        (new Question("Who wrote 'Romeo and Juliet'?",List.of("William Shakespeare", "Jane Austen", "Charles Dickens"), 0));
		questions.add
		        (new Question("Which gas do plants absorb during photosynthesis?",List.of("Oxygen", "Carbon Dioxide", "Nitrogen"), 1));
		questions.add
		        (new Question("Who was the  11th President in India?",List.of("Rajendra Prasad ", "Ram Nath Kovind.", "Dr. A.P.J. Abdul Kalam."), 2));
		questions.add
		        (new Question("What is the largest ocean on Earth?",List.of("Atlantic Ocean", "Indian Ocean", "Pacific Ocean"), 2));
		questions.add
		        (new Question("In which year did the Titanic sink?", List.of("1905", "1912", "1920"), 1));
		questions.add
		        (new Question("Which is the largest forest in earth ?",List.of("Amazon", " New Guinea", "Valdivian"), 1));
		questions.add
		        (new Question("Which keyword is used to declare a constant variable in Java?", List.of("final", "const", "static"), 0));
		questions.add
		        (new Question("What is the purpose of the 'break' statement in Java?", List.of("To terminate a loop", "To skip the current iteration", "To exit the program"), 0));
		questions.add
		        (new Question("Which collection class is synchronized in Java?", List.of("ArrayList", "HashMap", "Vector"), 2));
		questions.add
		        (new Question("What does the 'super' keyword refer to in Java?", List.of("Base class instance", "Current class instance", "Derived class instance"), 0));

		Quiz quiz = new Quiz(questions);
		QuizViewModel viewModel = new QuizViewModel(quiz);
		QuizView view = new QuizView(viewModel);

		Scanner scanner = new Scanner(System.in);

		while (!viewModel.isLastQuestion()) {
			view.displayQuestion();
			int userAnswer = scanner.nextInt() - 1;
			boolean isCorrect = viewModel.isAnswerCorrect(userAnswer);
			view.displayResult(isCorrect);
			viewModel.moveToNextQuestion();
		}

		view.displayFinalResult();
		scanner.close();
	}
}
