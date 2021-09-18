package abstraction;

public abstract class Pizza {
    String name;

    abstract void prepare();
    abstract void cook();
    abstract void cut();
    abstract void box();

    String getName(){
        return name;
    }

}
