package CommonToolsLearn;

import java.util.Arrays;
import java.util.Comparator;

public class ComparableTest {
    public static void main(String[] args) {
        Goods[] all = new Goods[4];
        all[0] = new Goods("《红楼梦》", 100);
        all[1] = new Goods("《西游记》", 80);
        all[2] = new Goods("《三国演义》", 140);
        all[3] = new Goods("《水浒传》", 120);
        Arrays.sort(all);
        System.out.println(Arrays.toString(all));

        Goods[] all2 = new Goods[4];
        all2[0] = new Goods("War and Peace", 100);
        all2[1] = new Goods("Childhood", 80);
        all2[2] = new Goods("Scarlet and Black", 140);
        all2[3] = new Goods("Notre Dame de Paris", 120);
        Arrays.sort(all2, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Goods g1 = (Goods) o1;
                Goods g2 = (Goods) o2;
                if(g1.getPrice() == g2.getPrice()){
                    return 0;
                }else if(g1.getPrice() > g2.getPrice()){
                    return 1;
                }else if(g1.getPrice() < g2.getPrice()){
                    return -1;
                }
                throw new RuntimeException("输入的数据类型不一致");
            }
        });
        System.out.println(Arrays.toString(all2));

    }
}
