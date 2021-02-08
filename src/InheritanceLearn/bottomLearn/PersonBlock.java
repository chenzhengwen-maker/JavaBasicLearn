package InheritanceLearn.bottomLearn;

public class PersonBlock {
    public static int total;
    static{
        total = 100;
        System.out.println("in static block");
    }

    public static void main(String[] args) {
        System.out.println("total="+PersonBlock.total);
        System.out.println("total="+PersonBlock.total);
    }
}
