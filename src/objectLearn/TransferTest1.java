package objectLearn;

public class TransferTest1 {
    public void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("swap方法里，a的值是" + a + "；b的值是" + b);
    }
    public static void main(String[] args) {
        TransferTest1 transferTest1 = new TransferTest1();
        int a = 5;
        int b = 10;
        transferTest1.swap(a,b);
        System.out.println("交换结束后，变量a的值是" + a + "；变量b的值是" + b);
    }
}
