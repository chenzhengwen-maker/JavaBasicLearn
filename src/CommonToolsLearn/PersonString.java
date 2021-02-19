package CommonToolsLearn;

import java.io.UnsupportedEncodingException;

public class PersonString {
    public static void main(String[] args) throws UnsupportedEncodingException {
        Person p1 = new Person();
        p1.setName("atguigu");
        Person p2 = new Person();
        p2.setName("atguigu");
        System.out.println(p1.getName().equals(p2.getName()));//true
        System.out.println(p1.getName() == p2.getName()); //true
        System.out.println(p1.getName() == "atguigu"); //true
        //String s1 = new String("bcde");
        //String s2 = new String("bcde");
        //System.out.println(s1==s2); //false
        String s1 = "hello";
        String s2 = "world";
        String s3 = "hello"+"world";
        String s4 = s1 + "hello";
        String s5 = s1 + s2;
        String s6 = (s1 + s2).intern();
        System.out.println("-----------string 比较-----------");
        System.out.println(s3 == s4);
        System.out.println(s3 == s5);
        System.out.println(s3 == s6);
        System.out.println(s4 == s5);
        String str = "中";
        System.out.println(str.getBytes("ISO8859-1").length);// -128~127
        System.out.println(str.getBytes("GBK").length);
        System.out.println(str.getBytes("UTF-8").length);
        System.out.println(new String(str.getBytes("ISO8859-1"),
                "ISO8859-1"));// 乱码，表示不了中文
        System.out.println(new String(str.getBytes("GBK"), "GBK"));
        System.out.println(new String(str.getBytes("UTF-8"), "UTF-8"));
    }
}
