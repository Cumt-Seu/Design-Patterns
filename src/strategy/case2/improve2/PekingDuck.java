package strategy.case2.improve2;

public class PekingDuck extends Duck {
    public PekingDuck()
    {
        flyBehavior =new NoFlyBehavior();
        quackBehavior = new NoQuackBehavior();
    }

    @Override
    public void diaplay() {
        System.out.println("我是北京烤鸭");
    }

}
