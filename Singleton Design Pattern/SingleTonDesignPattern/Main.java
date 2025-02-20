
public class Main {
    public static void main(String[] args) {

        
        EnumSingleton instance1 = EnumSingleton.INSTANCE;
        EnumSingleton instance2 = EnumSingleton.INSTANCE;

        System.out.println(instance1 == instance2);

        Runnable task = () -> {
            long startTime = System.currentTimeMillis();
            Singleton singleton = Singleton.getInstance();
            long endTime = System.currentTimeMillis();
            System.out.println("Time taken for getInstance(): " + (endTime - startTime) + " Milli seconds");
            System.out.println(Thread.currentThread().getName() + " - " + singleton);
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

    }
}