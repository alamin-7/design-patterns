public class Singleton {

    private static volatile Singleton instance;

    private Singleton(){}

    // using double locking for better performance. as synchronize method is costly in terms of performance.

    public static Singleton getInstance(){

        if (instance == null) {  // First check (no lock)
            synchronized (Singleton.class) { // Locking
                if (instance == null) {  // Second check (after acquiring lock)
                    instance = new Singleton();
                }
            }
        }
        return instance;

    }

    //  inner static class for singleton pattern because it is thread 
    // safe and lazy initialization is also achieved
    // but it is not recommended to use this approach in production code. using enum is best

    private static class SingletonHelper {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
