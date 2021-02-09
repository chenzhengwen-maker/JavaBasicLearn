package threadLearn;

public class Ticket implements Runnable{
    private int ticket = 100;
    @Override
    public void run() {
        while(true){
            synchronized (this) {
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "售出车票,ticket号为：" + ticket--);
                } else {
                    break;
                }
            }
        }
    }
}
