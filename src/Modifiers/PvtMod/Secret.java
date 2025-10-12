package Modifiers.PvtMod;

public class Secret {

    private int code = 1234;

    private void showCode(){
        System.out.println("sec code is "+ code);

    }

    // access within same class only
    //applies to Methods, variables, constructors
}
