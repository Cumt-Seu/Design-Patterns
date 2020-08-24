package factory.simplefactory;

public class CheesePizza extends Pizza{
    public CheesePizza(String name) {
        super(name);
    }

    @Override
    public void prepare() {
        System.out.println("为奶酪披萨准备原材料...");
    }
}
