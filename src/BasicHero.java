public class BasicHero implements Hero {

    private String identity;

    public BasicHero(String identity) {
        this.identity = identity;
    }

    @Override
    public void showInfo() {
        System.out.println("Hero: " + this.identity);
    }
}
