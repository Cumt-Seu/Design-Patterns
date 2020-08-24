package strategy.case2.improve2;

public class NoFlyBehavior implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("不会飞翔");
    }
}
