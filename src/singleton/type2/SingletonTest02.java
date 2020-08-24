package singleton.type2;

public class SingletonTest02 {
    public static void main(String[] args) {
        System.out.println("静态代码块实现饿汉式单例模式");
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1==instance2);
    }
}

class Singleton
{
    //构造器私有化，外部不能new一个实例
    private Singleton(){}

    private static  Singleton instance = null;//这里不能加final，因为加final必须初始化，就不能在静态代码块中继续重新初始化了

    //在静态代码块中完成创建单例对象
    static
    {
        instance = new Singleton();
    }
    //提供一个公有的静态方法，返回对象实例
    public static Singleton getInstance()
    {
        return instance;
    }
}