package command;

public class FirstExerciseCommand implements Command {

	private Exercises exercises;
	
	public FirstExerciseCommand(Exercises exercises) {
		this.exercises = exercises;
	}

	@Override
	public void execute() {
		exercises.getUp();
	}
}
