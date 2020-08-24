package singleton.type6;

import java.lang.reflect.InvocationTargetException;

public class SingletonTest06 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        System.out.println("静态内部类实现的线程安全的单例模式");
        for (int i = 0; i < 10; i++) {
            new Thread()
            {
                @Override
                public void run() {
                    Singleton instance = Singleton.getInstance();
                    System.out.println(Thread.currentThread().getName()+"创建的实例的hashCode="+instance.hashCode());
                }
            }.start();
        }
    }
}

class Singleton
{
    private Singleton(){}
    public static class SingletonInstance
    {
        private static final Singleton instance = new Singleton();
    }
    public static Singleton getInstance()
    {
        return SingletonInstance.instance;
    }
}