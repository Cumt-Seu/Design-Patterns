package factory.simplefactory;

public abstract class Pizza {
    private String name;

    public Pizza(String name) {
        this.name = name;
    }

    public abstract void prepare();

    public void bake()
    {
        System.out.println("baking...");
    }
    public void cut()
    {
        System.out.println("cutting...");
    }
    public void box()
    {
        System.out.println("Boxing...");
    }
}
