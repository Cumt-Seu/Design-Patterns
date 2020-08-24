package singleton.type3;

public class SingletonTest03 {
    public static void main(String[] args) {
        System.out.println("线程不安全的懒汉式单例模式");
       /* Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1==instance2);
        System.out.println("instance1.hashCode="+instance1.hashCode());
        System.out.println("instance2.hashCode="+instance2.hashCode());*/
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

    public static Singleton getInstance()
    {
        if(instance == null)
        {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance = new Singleton();
        }
        return instance;
    }
}