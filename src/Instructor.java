package command;

public class Instructor {

	private Command command;

	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void newExercise() {
		System.out.println("New Exercise");
		this.command.execute();
	}
	
}