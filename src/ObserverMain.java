package observer;

public class ObserverMain {

	public static void main(String[] args) {

		TrainingPerson trainingPerson = new TrainingPerson();
		Observer obs1 = new OnlineViewer("Viewer 1");
		Observer obs2 = new OnlineViewer("Viewer 2");
		Observer obs3 = new OnlineViewer("Viewer 3");

		trainingPerson.subscribe(obs1);
		trainingPerson.subscribe(obs2);
		trainingPerson.subscribe(obs3);

		trainingPerson.setTrainingPerson("New Exercise - Get Up");
		trainingPerson.setTrainingPerson("New Exercise - Lie Down");

	}
}
