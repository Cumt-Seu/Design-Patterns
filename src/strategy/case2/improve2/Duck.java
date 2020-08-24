package strategy.case2.improve2;

public abstract class Duck {
    //属性,策略接口
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(){}

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    //供子类复写
    public abstract void diaplay();

    public void quack()
    {
        if(quackBehavior!=null)
        {
            quackBehavior.quack();
        }
    }

    public void fly()
    {
        if(flyBehavior!=null)
        {
            flyBehavior.fly();
        }
    }
}
