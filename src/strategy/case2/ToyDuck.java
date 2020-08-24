package strategy.case2;

public class ToyDuck extends Duck{

    @Override
    public void diaplay() {
        System.out.println("我是玩具鸭");
    }

    @Override
    public void fly() {
        System.out.println("玩具鸭是不能飞翔的");
    }
}
