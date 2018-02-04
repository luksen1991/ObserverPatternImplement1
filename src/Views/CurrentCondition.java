package Views;

import Interfaces.Observer;
import Interfaces.ShowElement;
import Interfaces.Subject;

public class CurrentCondition implements Observer, ShowElement {

    private float temp;
    private float humidity;
    private Subject DataObject;

    public CurrentCondition(Subject DataObject){
        this.DataObject=DataObject;
        DataObject.registerObserver(this);
    }
    @Override
    public void update(float temp, float humidity, float pressureas) {

        this.temp=temp;
        this.humidity=humidity;
        Show();
    }

    @Override
    public void Show() {
        System.out.println("TEMP: "+temp+" HUMIDITY: "+humidity);
    }
}
