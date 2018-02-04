import Model.DataObject;
import Views.CurrentCondition;
import Views.CurrentPressure;

public class Main {

    public static void main(String[] args) {
        DataObject dataObject = new DataObject();

        CurrentCondition currentCondition = new CurrentCondition(dataObject);
        CurrentPressure currentPressure = new CurrentPressure(dataObject);

        dataObject.setReadout(10.0f,12.0f,1100.0f);


    }
}
