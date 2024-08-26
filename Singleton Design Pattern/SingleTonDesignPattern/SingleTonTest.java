package SingleTonDesignPattern;

public class SingleTonTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable {
            public void run() {
                SingleTonObject singleTonObject = SingleTonObject.getSingleTonObjectInstance();
            }
        });
        Thread t1 = new Thread(new Runnable {
            public void run() {
                SingleTonObject singleTonObject = SingleTonObject.getSingleTonObjectInstance();
            }
        });

        t1.start();
        t2.start();
    }
}
