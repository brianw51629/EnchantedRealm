public class HeroObserver implements WeatherObserver {
    private String name;

    public HeroObserver(String name) {
        this.name = name;
    }

    @Override
    public void updateWeather(String newWeather) {
        switch (newWeather.toLowerCase()) {
            case "stormy":
                System.out.println(name + " the Hero braces for the storm and raises their shield!");
                break;
            case "sunny":
                System.out.println(name + " the Hero feels energized by the sunlight!");
                break;
            case "foggy":
                System.out.println(name + " the Hero moves cautiously through the mist...");
                break;
            default:
                System.out.println(name + " the Hero notices the weather has changed to: " + newWeather);
        }
    }
}