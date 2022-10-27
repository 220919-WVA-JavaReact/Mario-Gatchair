package com.revature.oop.abstraction.interfaces;

public interface Vehicle {
    // Interfaces are like contracts
    // Everything that implements this interface must have the speedUp and slowDown methods
    // It can have more methods but never less

    /// Every method inside an interface is declared implicitly public and abstract
    void speedUp(int increment);
    // public abstract void speedUp(int increment); this is the same as above
    void slowDown(int decrement);

}
