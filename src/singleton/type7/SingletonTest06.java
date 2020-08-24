package singleton.type7;

public class SingletonTest06 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread()
            {
                @Override
                public void run() {
                    Singleton i = Singleton.insatnce;
                    System.out.println(Thread.currentThread().getName()+"创建的实例的hashCode="+i.hashCode());
                }
            }.start();
        }
    }
}

enum Singleton
{
    insatnce;
    public void sayHello()
    {
        System.out.println("hello world!");
    }
}