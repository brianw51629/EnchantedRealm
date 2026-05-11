public class ShieldBlessing extends HeroDecorator {
    public ShieldBlessing(Hero hero) {
        super(hero);
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("    + Shield Blessing applied!");
    }
}
