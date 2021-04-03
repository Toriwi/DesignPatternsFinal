package observer;

import java.util.ArrayList;
import java.util.List;

public class TrainingPerson implements Observable {

	private List<Observer> observers;
	private String trainingPerson;

	public TrainingPerson() {
		this.observers = new ArrayList<>();
	}
	
	public void setTrainingPerson(String newTrainingPerson) {
		this.trainingPerson = newTrainingPerson;
		this.notifyObservers();
	}
	
	@Override
	public void subscribe(Observer onlineViewer) {
		this.observers.add(onlineViewer);
		onlineViewer.setTrainigPerson(this);
	}

	@Override
	public void unsubscribe(Observer onlineViewer) {
		this.observers.remove(onlineViewer);
	}

	@Override
	public void notifyObservers() {
		for(Observer observer: this.observers) {
			observer.update();
		}
	}

	@Override
	public String getUpdate() {
		return this.trainingPerson;
	}

}



