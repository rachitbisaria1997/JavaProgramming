package Modifiers;

abstract class AbstractGame {

    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    public final void play(){
        initialize();
        startPlay();
        endPlay();
    }
}

// Defines an algorithm structure, letting subclasses implement specific steps.
//  Ensures a controlled workflow while allowing flexibility.

//volatile ensures chan