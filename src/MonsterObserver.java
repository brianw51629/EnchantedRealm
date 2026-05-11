public class MonsterObserver implements WeatherObserver {
    private String name;

    public MonsterObserver(String name) {
        this.name = name;
    }

    @Override
    public void updateWeather(String newWeather) {
        switch (newWeather.toLowerCase()) {
            case "stormy":
                System.out.println(name + " the Monster lets out a roar — storm weather fuels its rage!");
                break;
            case "sunny":
                System.out.println(name + " the Monster retreats into the shadows from the harsh light.");
                break;
            case "foggy":
                System.out.println(name + " the Monster stalks silently through the fog...");
                break;
            default:
                System.out.println(name + " the Monster senses the weather shift to: " + newWeather);
        }
    }
}