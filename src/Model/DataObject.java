package Model;

import Interfaces.Observer;
import Interfaces.Subject;

import java.util.ArrayList;

public class DataObject implements Subject {

    ArrayList observers;
    private float temp;
    private float humidity;
    private float pressure;

    public DataObject(){
        observers=new ArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void deleteObserver(Observer o) {
        int indexOfObservator = observers.indexOf(o);
        if (indexOfObservator >=0){
            observers.remove(indexOfObservator);
        }
    }


    @Override
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            Observer Obs = (Observer) observers.get(i);
            Obs.update(temp,humidity,pressure);
        }
    }

    public void readoutChanges(){
        notifyObserver();
    }

    public void setReadout(float temp, float humidity, float pressure){
        this.temp= temp;
        this.humidity=humidity;
        this.pressure=pressure;
        readoutChanges();
    }
}
