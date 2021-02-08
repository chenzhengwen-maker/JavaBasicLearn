package objectLearn;

public class ObjectTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(30);
        System.out.println("年龄="+person.getAge());
        PersonName per1 = new PersonName("张三") ;
        PersonName per2 = new PersonName("李四") ;
        per1.getInfo() ; // 当前调用getInfo()方法的对象是per1
        per2.getInfo() ; // 当前调用getInfo()方法的对象是per2
        boolean b = per1.compare(per2);
        System.out.println(b);

    }
}
