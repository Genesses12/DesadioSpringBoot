package Singleton;

public class SingletonEager {
    private static SingletonEager istancia;

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return istancia;
    }
}
