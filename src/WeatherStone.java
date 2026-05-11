import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class WeatherStone {
    private static WeatherStone instance;
    private String currentWeather;

    private WeatherStone() {
        currentWeather = "sunny";
    }

    public static WeatherStone getInstance() {
        if (instance == null) {
            instance = new WeatherStone();
        }
        return instance;
    }

    private PropertyChangeSupport support = new PropertyChangeSupport(this);

    public void addObserver(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public void removeObserver(PropertyChangeListener listener) {
        support.removePropertyChangeListener(listener);
    }

    public void setWeather(String weather) {
        this.currentWeather = weather;
        support.firePropertyChange("weather", null, weather);

    }

    public String getWeather() {
        return this.currentWeather;
    }
}
