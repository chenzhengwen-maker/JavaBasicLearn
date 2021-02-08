package InheritanceLearn.bottomLearn;

public class NoNameInnerClass {
    public void callInner(C a) {
        a.fun1();
    }

    public static void main(String[] args) {
        new NoNameInnerClass().callInner(new C(){

            @Override
            public void fun1() {
                System.out.println("匿名内部类");

            }
        });
    }

}
