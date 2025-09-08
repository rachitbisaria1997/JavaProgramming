package GenericsPgm;

import java.util.ArrayList;
import java.util.List;

public class MyCustomList<T>{

    List<T> al = new ArrayList<T>();

    public void addElement(T element){
        al.add(element);
    }

    public void removeElement(T element){
        al.remove(element);
    }

    public T getElement(int i){
        return al.get(i);
    }

    public String toString(){
        return al.toString();
    }

}
