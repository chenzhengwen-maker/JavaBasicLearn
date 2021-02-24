package lambdalearn;

import java.util.function.Consumer;

public class MyFuncTest {
    public static String toUpperString(MyFunc<String> mf,String str){
        return mf.getValue(str);
    }

    public static void main(String[] args) {
        String newStr = toUpperString((str)->str.toUpperCase(),"abcdef");
        System.out.println(newStr);
        Consumer<String> con = (x)-> System.out.println(x);

    }
}
