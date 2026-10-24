import java.util.*;

class Question {
    String question;
    String[] options;
    int correctOption;

    public Question(String question, String[] options, int correctOption) {
        this.question = question;
        this.options = options;
        this.correctOption = correctOption;
    }
}

public class OnlineQuizSystem {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("===== Online Quiz Examination System =====\n");

        // Sample questions
        List<Question> questions = new ArrayList<>();
        questions.add(new Question("What is the capital of France?", 
            new String[]{"1) Paris", "2) London", "3) Berlin", "4) Rome"}, 1));
        questions.add(new Question("Which language runs on the JVM?", 
            new String[]{"1) C++", "2) Java", "3) Python", "4) Ruby"}, 2));
        questions.add(new Question("Which data structure uses LIFO?", 
            new String[]{"1) Queue", "2) Stack", "3) Array", "4) LinkedList"}, 2));

        int score = 0;

        // Quiz loop
        for (int i = 0; i < questions.size(); i++) {
            Question q = questions.get(i);
            System.out.println("Q" + (i + 1) + ": " + q.question);
            for (String opt : q.options) {
                System.out.println(opt);
            }
            System.out.print("Enter your answer (1-4): ");
            int answer = scanner.nextInt();

            if (answer == q.correctOption) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect! Correct answer: " + q.correctOption + "\n");
            }
        }

        // Display results
        System.out.println("===== Quiz Completed =====");
        System.out.println("Your Score: " + score + " out of " + questions.size());
        double percentage = (score * 100.0) / questions.size();
        System.out.println("Percentage: " + percentage + "%");
        if (percentage >= 70) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }
    }
}