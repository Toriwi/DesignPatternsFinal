package command;

public class SecondExerciseCommand implements Command {

	private Exercises exercises;
	
	public SecondExerciseCommand(Exercises exercises) {
		this.exercises = exercises;
	}

	@Override
	public void execute() {
		exercises.lieDown();
	}
}
