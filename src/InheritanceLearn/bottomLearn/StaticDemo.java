package InheritanceLearn.bottomLearn;

public class StaticDemo {
    public static void main(String args[]) {
        Person.total = 100; // 不用创建对象就可以访问静态成员
//访问方式：类名.类属性，类名.类方法
        System.out.println(Person.total);
        Person c = new Person();
        System.out.println(c.total); //输出101
    }
}
