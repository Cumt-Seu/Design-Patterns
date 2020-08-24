package strategy.case2.improve2;

public class WildDuck extends Duck {
    //构造器 传入FlyBehavior的对象
    public WildDuck()
    {
        flyBehavior = new GoodFlyBehavior();
        quackBehavior = new GaGaQuackBehavior();
    }

    @Override
    public void diaplay() {
        System.out.println("我是野鸭");
    }
}
