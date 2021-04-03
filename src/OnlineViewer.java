package observer;

public class OnlineViewer implements Observer {

	private String name;
	private Observable trainingPerson;

	public OnlineViewer(String name) {
		this.setName(name);
	}

	@Override
	public void update() {
		if(this.trainingPerson == null) {
			System.out.println(this.getName() + " has no training person set");
			return;
		}
		String updatedInstructor = this.trainingPerson.getUpdate();
		System.out.println(this.getName() + " received an update from the training person: " + updatedInstructor);
	}

	@Override
	public void setTrainingPerson(Observable trainingPerson) {
		this.trainingPerson = trainingPerson;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
