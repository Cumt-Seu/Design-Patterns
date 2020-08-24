package strategy.case2.improve2;

public class NoQuackBehavior implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("我不能叫");
    }
}
