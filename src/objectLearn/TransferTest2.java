package objectLearn;

class DataSwap {
    public int a;
    public int b;
}

public class TransferTest2 {
    public static void swap(DataSwap ds){
        int temp = ds.a;
        ds.a = ds.b;
        ds.b = temp;
        System.out.println("swap方法里，a Field的值是" + ds.a + ";b Field的值是" + ds.b);

    }
    public static void main(String[] args) {
        DataSwap dataSwap = new DataSwap();
        dataSwap.a = 5;
        dataSwap.b = 10;
        swap(dataSwap);
        System.out.println("交换结束后，a Field的值是" + dataSwap.a + ";b Field的值是" + dataSwap.b);
    }
}
