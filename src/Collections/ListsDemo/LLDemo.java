package Collections.ListsDemo;

import java.util.LinkedList;
import java.util.List;

public class LLDemo {

    public static void main(String[] args){
        
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("DevOps");
        linkedList.add("AWS");
        linkedList.add("data");
        linkedList.addFirst("linux");
        System.out.println("LinkedList: " + linkedList);


        //LinkedList – fast insertion/deletion, not thread-safe
        // access is slow,must traverse entire list
        // it is Fail-Fast Iterator
    }
    

}
