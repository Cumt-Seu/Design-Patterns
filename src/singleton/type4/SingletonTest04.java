package singleton.type4;

public class SingletonTest04 {
    public static void main(String[] args) {
        System.out.println("同步方法/同步代码块实现的线程安全的懒汉式单例模式");
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

    private static Singleton instance = null;

    public /*synchronized*/static Singleton getInstance()
    {
        synchronized (Singleton.class)
        {
            if(instance == null)
            {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                instance = new Singleton();
            }
            return instance;
        }
    }
}
