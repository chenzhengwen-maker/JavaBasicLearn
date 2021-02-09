package threadLearn;

public class PoolSout implements Runnable{
    private String s;
    public PoolSout(String s){
        this.s = s;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
