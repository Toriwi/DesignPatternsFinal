package command;

public class CommandMain {

	public static void main(String[] args) {


		Instructor instructor = new Instructor();
		Exercises exercises = new Exercises();
		Command firstExerciseCommand = new FirstExerciseCommand(exercises);
		Command secondExerciseCommand = new SecondExerciseCommand(exercises);
		
		
		instructor.setCommand(firstExerciseCommand);
		instructor.newExercise();
		

		instructor.setCommand(secondExerciseCommand);
		instructor.newExercise();
		
	}

}