public class SpeedBoost extends HeroDecorator {
    public SpeedBoost(Hero hero) {
        super(hero);
    }

    @Override public void showInfo() {
        super.showInfo();
        System.out.println("    + Speed Boost applied!");
    }
}
