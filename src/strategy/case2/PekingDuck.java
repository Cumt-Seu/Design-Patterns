package strategy.case2;

public class PekingDuck extends Duck{

    @Override
    public void diaplay() {
        System.out.println("我是北京烤鸭");
    }

    @Override
    public void quack() {
        System.out.println("北京烤鸭是不能叫的");
    }

    @Override
    public void fly() {
        System.out.println("北京烤鸭是不能飞翔的");
    }

    @Override
    public void swim() {
        System.out.println("北京烤鸭是不能游泳的");
    }
}
