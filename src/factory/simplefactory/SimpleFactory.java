package factory.simplefactory;

public class SimpleFactory {

    //根据orderType返回对应的Pizza对象
    public Pizza createPizza(String orderType)
    {
        Pizza pizza = null;
        System.out.println("使用简单工厂模式");
        if(orderType.equals("greek"))
        {
            pizza = new GreekPizza("希腊披萨");
        }
        else if(orderType.equals("cheese"))
        {
            pizza = new CheesePizza("奶酪披萨");
        }
        return  pizza;
    }
    //简单工厂模式，也叫静态工厂模式
    public static Pizza createPizza2(String orderType)
    {
        Pizza pizza = null;
        System.out.println("使用简单工厂模式");
        if(orderType.equals("greek"))
        {
            pizza = new GreekPizza("希腊披萨");
        }
        else if(orderType.equals("cheese"))
        {
            pizza = new CheesePizza("奶酪披萨");
        }
        return  pizza;
    }
}
