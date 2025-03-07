public class Test54_MultiThreading {
    public static void main(String[] args) throws InterruptedException {

        MyThread2 thread1 = new MyThread2();//A way to create thread

        MyRunnable runnable1 = new MyRunnable();//Another way to create threads
        Thread thread2 = new Thread(runnable1);

        thread1.setDaemon(true);
        thread2 .setDaemon(true);

        thread1.start();
        //thread1.join(); //Run first thread1 
        //thread1.join(2000)// and waits 2 seconds
        thread2.start();


    }
}
