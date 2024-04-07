public class Main {
    public static void main(String[] args) throws Exception {
        
        Counter count = new Counter(0);

        Thread t1 = new Thread(count::countUp);
        t1.start();
        t1.join();

        Thread t2 = new Thread(count::countDown);
        t2.start();
        t2.join();

    }
}
