package InheritanceLearn;

public class Student extends Person{
    public String school;
    public String name = "student";
    int age = 15;
    public String getInfo() { //重写方法
        return "Name: "+ name + "\nage: "+ age
                + "\nschool: "+ school;
    }
    public String getSuperInfo(){
        return super.getInfo();
    }

    public static void main(String[] args) {
        //Person p1=new Person();
        //调用Person类的getInfo()方法
        //System.out.println(p1.getInfo());
        Student student = new Student();
        student.name="Bob";
        student.age = 20;
        student.school="xxx";
        System.out.println(student.getInfo());
        System.out.println(student.getSuperInfo());

    }

}
