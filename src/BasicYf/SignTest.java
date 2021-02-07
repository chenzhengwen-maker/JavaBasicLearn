package BasicYf;

public class SignTest {
    public static void main(String[] args) {
        int i1 = 10;
        int i2 = 20;
        int i = i1++;
        System.out.println("i= "+i);
        System.out.println("i1= "+i1);
        i = ++i1;
        System.out.println("i="+i);
        System.out.println("i1="+i1);
        i = i2--;
        System.out.println("i="+i);
        System.out.println("i2="+i2);
        i = --i2;
        System.out.println("i="+i);
        System.out.println("i2="+i2);
        int a = 153;
        int bai = a/100;
        int shi = a%100/10;
        int ge = a%10;
        System.out.println(bai+"|"+shi+"|"+ge);
        short s = 3;
        s = (short)(s+2);
        int t1 = 1;
        t1 *= 0.1;
        System.out.println(t1);//
        t1++;
        System.out.println(t1);//
        int m = 2;
        int n = 3;
        n *= ++m;
        System.out.println("m=" + m);
        System.out.println("n=" + n);
        int t2 = 10;
        t2 += (t2++) + (++t2);
        System.out.println(t2);

        boolean x=true;
        boolean y=false;
        short z=42;
        //if(y == true)
        if((z++==42)&&(y=true)){
            System.out.println(11);
            z++;
        }
        if((x=false) || (++z==45)) {
            System.out.println(22);
            z++;
        }
        System. out.println("z="+z);
    }
}
