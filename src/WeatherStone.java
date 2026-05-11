public class WeatherStone extends WeatherObservable {
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

    public void setWeather(String newWeather) {
        currentWeather = newWeather;
        setChanged();
        notifyObservers(newWeather);
    }

    public String getWeather() {
        return currentWeather;
    }
}