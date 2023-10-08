package Singleton;

public class SingletonLazy {
	
    private static SingletonLazy istancia;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstancia() {
        if (istancia == null) {
            istancia = new SingletonLazy();
        }
        return istancia;
    }
}
