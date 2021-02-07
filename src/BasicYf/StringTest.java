package BasicYf;

public class StringTest {
    public static void main(String[] args) {
        int no = 10;
        String str = "abcdef";
        String str1 = str + "xyz" + no;
        System.out.println("str1 = " + str1);
        String str2 = 2 + "";
        System.out .println(3+4+"Hello!"); //输出：7Hello!
        System.out.println("Hello!"+3+4); //输出：Hello!34
        System.out.println('a'+1+"Hello!"); //输出：98Hello!
        System.out.println("Hello"+'a'+1); //输出：Helloa1
    }
}
