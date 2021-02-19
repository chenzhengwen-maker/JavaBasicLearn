package genericlearn;

import java.util.Collection;
import java.util.Iterator;

class Creature{

}
class Person extends Creature{

}
class Man extends Person{

}
public class ClassGeneric {
    public static <T extends Person> void test(T t){
        System.out.println(t);
    }
    public static void printCollection3(Collection<? extends Person> coll) {
        //Iterator只能用Iterator<?>或Iterator<? extends Person>.why?
        Iterator<?> iterator = coll.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    public static void printCollection4(Collection<? super Person> coll) {
        //Iterator只能用Iterator<?>或Iterator<? super Person>.why?
        Iterator<?> iterator = coll.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    public static void main(String[] args) {
        test(new Man());
        test(new Person());
        //test(new Creature());

    }
}
