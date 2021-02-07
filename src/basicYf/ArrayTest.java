package basicYf;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = new int[]{8, 2, 1, 0, 3};
        int[] index = new int[]{2, 0, 3, 2, 4, 0, 1, 3, 2, 3, 3};
        String tel = "";
        for (int i = 0; i < index.length; i++) {
            tel += arr[index[i]];
        }
        System.out.println("联系方式：" + tel);
        //数组赋值
        int[] array1, array2;
        array1 = new int[]{2, 3, 5, 7, 11, 13, 17, 19};
        //复制array1数组给array2
        array2 = new int[array1.length];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = array1[i];
        }
        //二分法查找：要求此数组必须是有序的。
        int[] arr3 = new int[]{-99,-54,-2,0,2,33,43,256,999};
        boolean isFlag = true;
        int number = 256;
        //int number = 25;
        int head = 0;//首索引位置
        int end = arr3.length - 1;//尾索引位置
        while(head <= end){
            int middle = (head + end) / 2;
            if(arr3[middle] == number){
                System.out.println("找到指定的元素，索引为：" + middle);
                isFlag = false;
                break;
            }else if(arr3[middle] > number){
                end = middle - 1;
            }else{//arr3[middle] < number
                head = middle + 1;
            }
        }
        if(isFlag){
            System.out.println("未找打指定的元素");
        }

    }
}
