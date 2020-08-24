package strategy.case2;

public abstract class Duck {
    public Duck(){}
    public abstract void diaplay();
    public void quack()
    {
        System.out.println("鸭子会嘎嘎叫");
    }
    public void swim()
    {
        System.out.println("鸭子会游泳");
    }
    public void fly()
    {
        System.out.println("鸭子会飞翔");
    }
}
