import java.util.List;

public interface Subscribers {
    public void registerObserver();
    public void deleteObserver();
    public void notifyObserver();
}
