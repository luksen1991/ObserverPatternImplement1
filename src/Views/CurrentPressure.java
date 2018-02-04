package Views;

import Interfaces.Observer;
import Interfaces.ShowElement;
import Interfaces.Subject;
import Model.DataObject;

import javax.xml.crypto.Data;

public class CurrentPressure implements Observer, ShowElement {

    private float pressure;
    private Subject DataObject;

    public CurrentPressure(Subject dataObject){
        this.DataObject=dataObject;
        dataObject.registerObserver(this);
    }
    @Override
    public void update(float temp, float humidity, float pressure) {
        this.pressure=pressure;
        Show();
    }

    @Override
    public void Show() {
        System.out.println("Pressure: "+pressure);
    }
}
