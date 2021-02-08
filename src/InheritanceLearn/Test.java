package InheritanceLearn;

public class Test {
    public String method(Person e) {
    // ……
        if(e instanceof Student) {
            return e.getInfo()+"\n"+((Student) e).getSuperInfo();
        }
        return null;
    }

    public static void main(String[] args) {
        Test test = new Test();
        Student m = new Student();
        m.name = "xxx";
        m.age = 20;
        m.school = "qinghua";
        System.out.println(test.method(m));
        char[] arr = new char[] { 'a', 'b', 'c' };
        System.out.println(arr);//
        int[] arr1 = new int[] { 1, 2, 3 };
        System.out.println(arr1);//
        double[] arr2 = new double[] { 1.1, 2.2, 3.3 };
        System.out.println(arr2);//
        Float f = Float.parseFloat("12.1");
        System.out.println(f.toString());
        Object o1 = true ? new Integer(1) : new Double(2.0);
        System.out.println(o1);//
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j);
        Integer l = 1;
        Integer s = 1;
        System.out.println(l == s);//
        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y);//
    }

}
