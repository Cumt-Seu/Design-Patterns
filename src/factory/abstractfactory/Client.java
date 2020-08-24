package factory.abstractfactory;

public class Client {
    public static void main(String[] args) {
        AbstractFactory modern = new ModernFactory();
        System.out.println("现代工厂：");
        modern.createWeapon().attack();
        modern.createFood().printName();
        modern.createVehicle().run();
        AbstractFactory magic = new MagicFactory();
        System.out.println("魔法工厂：");
        magic.createWeapon().attack();
        magic.createFood().printName();
        magic.createVehicle().run();
    }
}
