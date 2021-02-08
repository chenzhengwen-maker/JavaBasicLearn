package objectLearn;

public class Zoo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.legs = 4;
        System.out.println(animal.legs);
        animal.eat();
        animal.moving();
    }
}
