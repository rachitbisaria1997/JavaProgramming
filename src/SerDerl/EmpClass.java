package SerDerl;

import Collections.SetDemo.Employee;

import java.io.*;

public class EmpClass {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public EmpClass(String name, String address) {
        this.name = name;
        this.address = address;
    }

    private String name;

    private String address;

    public static void main(String[] args) {

        EmpClass employee = new EmpClass("abc", "street 1");

        try{
            FileOutputStream fout = new FileOutputStream("D:\\Switch\\apply.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(employee);
            fout.close();
            System.out.println("data is stored in the file");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        // ser is process of converting an object into a sequence of bytes stored somewhere using streams

        // use of serls - save state of obejct in db, retrieve it later to restore exact state
        // transfer of data bw systems

        // disadv - data might get lost, not compatible java version

    }

}
