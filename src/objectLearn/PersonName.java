package objectLearn;

public class PersonName {
    String name;

    public PersonName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void getInfo(){
        System.out.println("Person类 --> " + this.name) ; }
    public boolean compare(PersonName p){
        return this.name==p.name;
    }
}
