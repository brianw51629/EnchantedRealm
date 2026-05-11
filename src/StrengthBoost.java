public class StrengthBoost extends HeroDecorator{
    public StrengthBoost(Hero hero) {
        super(hero);
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("    + Strength Boost applied!");
    }
}
