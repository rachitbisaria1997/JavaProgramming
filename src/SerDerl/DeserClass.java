package SerDerl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserClass {
    public static void main(String[] args) {

        EmpClass empClass = null;

        try{
            FileInputStream fin = new FileInputStream("D:\\Switch\\apply.txt");
            ObjectInputStream in = new ObjectInputStream(fin);

            empClass = (EmpClass) in.readObject();
            in.close();
            fin.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            System.out.println(empClass.getName() + "  "+ empClass.getAddress());
        }

    }
}
