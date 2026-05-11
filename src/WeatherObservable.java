import java.util.ArrayList;

public abstract class WeatherObservable {

    private ArrayList<WeatherObserver> observers = new ArrayList<>();
    private boolean changed = false;

    public void addObserver(WeatherObserver o) {
        observers.add(o);
    }

    public void notifyObservers(String newWeather) {
        if (changed) {
            for (WeatherObserver o : observers) {
                o.updateWeather(newWeather);
            }
            changed = false;
        }
    }

    protected void setChanged() {
        changed = true;
    }

}