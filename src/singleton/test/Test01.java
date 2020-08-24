package singleton.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test01 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        Class<? extends Singleton> c = instance1.getClass();
        Constructor<? extends Singleton> constructor = c.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton instance3 = constructor.newInstance();
        System.out.println("instance1.hashCode()="+instance1.hashCode());
        System.out.println("instance2.hashCode()="+instance2.hashCode());
        System.out.println("instance3.hashCode()="+instance3.hashCode());
    }
}

class Singleton
{
    private Singleton(){}

    public void setStr() {
    }

    public static class SingletonInstance
    {
        private static final Singleton instance = new Singleton();
    }
    public static Singleton getInstance()
    {
        return SingletonInstance.instance;
    }
}
