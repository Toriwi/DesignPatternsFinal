package command;

public class Exercises {

	private Boolean firstExercise;
	
	public void getUp() {
		System.out.println("Get up!");
		this.firstExercise = true;
	}
	
	public void lieDown() {
		System.out.println("Lie down");
		this.firstExercise = false;
	}
}
