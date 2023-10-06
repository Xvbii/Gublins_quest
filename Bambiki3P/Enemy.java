package org.example;

// Java program to demonstrate Decorator
// pattern

// Abstract Pizza class (All classes extend
// from this)
abstract class Enemy
{
    // it is an abstract pizza
    String description = "Unknown Pizza";

    public String getDescription()
    {
        return description;
    }

    public abstract int getHealth();
}

// The decorator class : It extends Pizza to be
// interchangeable with it toppings decorator can
// also be implemented as an interface


// Other toppings can be coded in a similar way

