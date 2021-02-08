package InheritanceLearn.bottomLearn;

public class Person {
    private int id;
    public static int total = 0;
    public Person(){
        total++;
        id = total;
    }

    public static void main(String[] args) {
        Person tom = new Person();
        tom.id = 10;
        total = 100;
    }
}
