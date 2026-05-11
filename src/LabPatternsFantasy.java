public class LabPatternsFantasy {

    public static void main(String[] args) {

        //
        WeatherStone stoneA = WeatherStone.getInstance();
        WeatherStone stoneB = WeatherStone.getInstance();
        System.out.println("Same WeatherStone instance? " + (stoneA == stoneB));

        //
        WeatherObserver aria = new HeroObserver("Aria");
        WeatherObserver dragon = new MonsterObserver("Dragon");
        stoneA.addObserver(aria);
        stoneA.addObserver(dragon);
        stoneA.setWeather("stormy");

        //
        Hero hero = new BasicHero("Warrior");
        hero = new StrengthBoost(hero);
        hero = new SpeedBoost(hero);
        hero = new ShieldBlessing(hero);
        hero.showInfo();

    }

}