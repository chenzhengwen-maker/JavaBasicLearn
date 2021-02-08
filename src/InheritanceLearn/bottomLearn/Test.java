package InheritanceLearn.bottomLearn;

public class Test {
    public static int totalNum = 5;
    public final int ID;
    public Test(){
        ID = ++ totalNum;
    }
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.ID);
        Test t1 = new Test();
        System.out.println(t1.ID);
        A a = new B();
        a.m1();
        a.m2();
        Template template = new SubTemplate();
        template.getTime();
        Runner r = new RunnerPerson();
        r.run();
        r.start();
        r.stop();
        NetWork w = new ProxyServer(new RealServer());
        w.browse();
    }

}
