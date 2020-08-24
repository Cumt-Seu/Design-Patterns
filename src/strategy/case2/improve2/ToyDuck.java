package strategy.case2.improve2;

public class ToyDuck extends Duck {
    public ToyDuck() {
        flyBehavior = new BadFlyBehavior();
        quackBehavior = new GeGeQuackBehavior();
    }

    @Override
    public void diaplay() {
        System.out.println("我是玩具鸭");
    }

}
