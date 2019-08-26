package java_patterns.single;

public class Singleton {
    private volatile static Singleton mSingleton;

    private Singleton() {}

    public static Singleton getInstance() {
        if (mSingleton == null) {
            synchronized (Singleton.class) {
                mSingleton = new Singleton();
            }
        }
        return mSingleton;
    }
}
