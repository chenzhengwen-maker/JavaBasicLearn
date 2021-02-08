package objectLearn;

import java.util.Arrays;

public class PrintStream {
    public static void print(int i){
        System.out.println(i);
    }
    public static void print(String s){
        System.out.println(s);
    }
    public static void print(int a,String...books){
        for (int i = 0; i < a; i++) {
            System.out.println(Arrays.toString(books));
        }
        System.out.println(books);

    }
    public static void change(int x){
        System.out.println("change:修改之前x = " + x);
        x = 3;
        System.out.println("change:修改之后x = " + x);
    }

    public static void change(Person obj) {
        System.out.println("change:修改之前age = " + obj.getAge());
        obj.setAge(3);
        System.out.println("change:修改之后age = " + obj.getAge());
    }

    public static void main(String[] args) {
        print(4);
        print("sss");
        print(4,new String[]{"aaa","bbbb"});
        int x = 5;
        System.out.println("修改之前x = " + x);// 5
        // x是实参
        change(x);
        System.out.println("修改之后x = " + x);// 5
        Person obj = new Person();
        obj.setAge(5);
        System.out.println("修改之前age = " + obj.getAge());// 5
        // x是实参
        change(obj);
        System.out.println("修改之后age = " + obj.getAge());// 3
    }
}
