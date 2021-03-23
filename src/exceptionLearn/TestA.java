package exceptionLearn;

public class TestA {
    public void x(){
        System.out.println("xxx");
        try {
            y();
        }catch (Exception e){

        }
        System.out.println("zzz");
    }
    public void y(){
        int i = 1/0;
        System.out.println("yyy");
    }

    public static void main(String[] args) {
        TestA testA = new TestA();
        testA.x();
    }
}
