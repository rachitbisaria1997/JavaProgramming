package Modifiers;

public class DefaultAccMod {
    int value = 100;

    void print(){
        System.out.println("default access");
    }
}

// accessible from
        //Same class ✅

        //Same package ✅

        //Subclass in another package ❌

        //Different package ❌