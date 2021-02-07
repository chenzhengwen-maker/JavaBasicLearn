package basicYf;

public class WhileLoop {
    public static void main(String[] args) {
        int result = 0;
        int i = 1;
        while (i <= 100) {
            result += i;
            i++;
        }
        System.out.println("result=" + result);
    }
}
