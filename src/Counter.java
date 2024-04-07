class Counter {
    private int n;

    public Counter(int num) {
        n = num;
    }

    public synchronized void countUp() {
        while (n < 20) {
            n++;
            System.out.println(n);
        }
    }

    public synchronized void countDown() {
        while (n > 0) {
            n--;
            System.out.println(n);
        }
    }
}