package threadLearn;

public class MyThread2 implements Runnable {
    @Override
    public void run() {
        System.out.println("我是线程B");
    }
}
