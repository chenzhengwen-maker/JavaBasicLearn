package threadLearn;

public class ThreadTest {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        new Thread(new MyThread2()).start();
        new Thread(()->{
            System.out.println("我是线程C");
        }).start();
    }
}
