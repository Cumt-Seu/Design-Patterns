package singleton.type5;

public class SingletonTest05 {
    public static void main(String[] args) {
        System.out.println("DCL实现的线程安全的单例模式");
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
    /*
        volatile关键字的作用：
        https://blog.csdn.net/lin_coffee/article/details/79890361
    */
    private static volatile Singleton instance = null;
    public static Singleton getInstance()
    {
        if(instance==null)
        {
            synchronized (Singleton.class)
            {
                if(instance==null)
                {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
