package InheritanceLearn.bottomLearn;

public class RunnerPerson implements Runner{
    @Override
    public void start() {
        System.out.println("start");
    }

    @Override
    public void run() {
        System.out.println("run");
    }

    @Override
    public void stop() {
        System.out.println("stop");
    }
}
