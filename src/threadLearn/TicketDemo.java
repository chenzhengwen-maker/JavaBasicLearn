package threadLearn;

public class TicketDemo {
    public static void main(String[] args) {
        Ticket t = new Ticket();
        new Thread(t,"t1窗口").start();
        new Thread(t,"t2窗口").start();
        new Thread(t,"t3窗口").start();
    }
}
