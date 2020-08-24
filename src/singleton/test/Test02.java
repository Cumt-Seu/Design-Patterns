package singleton.test;

import java.io.*;

public class Test02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerSingleton instance1 = SerSingleton.getInstance();
        instance1.setStr("单例序列化");
        System.out.println("序列化之前读取其中的内容："+instance1.getStr());
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("src\\singleton\\test\\instance.obj"));
        objectOutputStream.writeObject(instance1);
        objectOutputStream.flush();
        objectOutputStream.close();
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src\\singleton\\test\\instance.obj"));
        SerSingleton instance2 = (SerSingleton) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println("序列化之后读取其中的内容："+instance2.getStr());
        System.out.println("instance1.hashCode()="+instance1.hashCode());
        System.out.println("instance2.hashCode()="+instance2.hashCode());
    }
}

class SerSingleton implements Serializable
{
    private String str;

    private static volatile SerSingleton instance = null;

    private SerSingleton(){}

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
    public static SerSingleton getInstance()
    {
        if(instance==null)
        {
            synchronized(SerSingleton.class)
            {
                instance = new SerSingleton();
            }
        }
        return instance;
    }
}