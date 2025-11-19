package Collections.ListsDemo;

import java.util.ArrayList;
import java.util.List;

class ArrayListDemo {

   public static void main(String[] args){

       List<String> arrayList = new ArrayList<>();
       arrayList.add("Java");
       arrayList.add("Spring");
       arrayList.add("Hibernate");

       System.out.println("ArrayList: " + arrayList); // Java Spring Hibernate. it maintains insertion order, not thread safe
       // accessing element is fast if index is known

       List<Integer> list = new ArrayList<>(List.of(1, 2, 3));
       for(Integer i : list) {
           list.add(4); // will throw ConcurrentModificationException
       }
       // it is Fail-Fast Iterator

   }

}
