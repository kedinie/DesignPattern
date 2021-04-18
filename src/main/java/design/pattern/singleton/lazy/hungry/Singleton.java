package design.pattern.singleton.lazy.hungry;

// 容易产生垃圾对象
public class Singleton {
    private static Singleton instance = new Singleton();
    private Singleton() {}

    public static Singleton getInstance() {
        return instance;
    }
}
