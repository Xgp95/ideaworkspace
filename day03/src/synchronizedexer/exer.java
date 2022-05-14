package synchronizedexer;

class Windows implements Runnable {
    private static int i = 100;

    @Override
    public void run() {

        while (true) {
            synchronized (this) {
                notify();
                if (i % 3 == 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + i);

                } else if (i <= 0) {
                    break;
                }
                i--;


                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class exer {
    public static void main(String[] args) {
        Windows w = new Windows();

        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);

        t1.setName("线程一：");
        t2.setName("线程二：");

        t1.start();
        t2.start();
    }
}
