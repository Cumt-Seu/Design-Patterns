package strategy.case2.improve2;

public class Client {
    public static void main(String[] args) {
        WildDuck wildDuck = new WildDuck();
        wildDuck.diaplay();
        wildDuck.fly();
        wildDuck.quack();
        PekingDuck pekingDuck = new PekingDuck();
        pekingDuck.diaplay();
        pekingDuck.fly();
        pekingDuck.quack();
        ToyDuck toyDuck = new ToyDuck();
        toyDuck.diaplay();
        toyDuck.fly();
        toyDuck.setFlyBehavior(new NoFlyBehavior());
        toyDuck.fly();
        toyDuck.quack();
    }
}
