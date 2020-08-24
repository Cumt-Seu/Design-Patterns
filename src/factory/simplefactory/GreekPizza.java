package factory.simplefactory;

public class GreekPizza extends Pizza{
    public GreekPizza(String name) {
        super(name);
    }

    @Override
    public void prepare() {
        System.out.println("为希腊披萨准备原材料...");
    }
}
