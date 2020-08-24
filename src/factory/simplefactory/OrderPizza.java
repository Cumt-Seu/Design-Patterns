package factory.simplefactory;

import java.util.Scanner;

public class OrderPizza {
    //定义一个简单工厂对象
//    SimpleFactory simpleFactory = new SimpleFactory();
    public void order(String pizzaName)
    {
        // Pizza pizza = simpleFactory.createPizza(pizzaName);
        Pizza pizza = SimpleFactory.createPizza2(pizzaName);
        if (pizza!=null)
        {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }
        else
        {
            System.out.println("Sorry,本店没有这种披萨！");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pizzaName;
        do {
            pizzaName = scanner.next();
            new OrderPizza().order(pizzaName);
        }while(pizzaName.equals("cheese")||pizzaName.equals("greek"));
    }
}
