package singleton.type1;

public class SingletonTest01 {
    public static void main(String[] args) {
        System.out.println("静态属性实现饿汉式单例模式");
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1==instance2);
    }
}

class Singleton
{
    //构造器私有化，外部不能new一个实例
    private Singleton(){}
    //本类内部创建对象实例
    private static final Singleton instance = new Singleton();
    //提供一个公有的静态方法，返回对象实例
    public static Singleton getInstance()
    {
        return instance;
    }
}