package genericlearn;

import java.util.*;

public class ArrayGeneric {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(78);
        list.add(88);
        list.add(77);
        list.add(66);
        //遍历方式一：
        //for(Integer i : list){
        //不需要强转
        //System.out.println(i);
        //}
        //遍历方式二：
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        Map<String,Integer> map = new HashMap<>();
        map.put("Tom1",34);
        map.put("Tom2",44);
        map.put("Tom3",33);
        map.put("Tom4",32);
        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String,Integer>> iterator1 = entrySet.iterator();
        while(iterator1.hasNext()){
            Map.Entry<String,Integer> entry = iterator1.next();
            System.out.println(entry.getKey() + "--->" + entry.getValue());
        }


    }
}
