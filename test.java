// Base class
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }

    public void sleep() {
        System.out.println("Animal is sleeping");
    }
}

// Subclass inheriting from Animal
class Dog extends Animal {
    // Overriding makeSound
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }

    // Relation between methods: bark calls makeSound
    public void bark() {
        System.out.println("bark() method called:");
        makeSound(); // relation between functions
    }
}

// Main class to test inheritance
public class Test {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();

        System.out.println("Calling methods on Animal object:");
        a.makeSound();  // prints: Animal makes a sound
        a.sleep();      // prints: Animal is sleeping

        System.out.println("\nCalling methods on Dog object:");
        d.makeSound();  // prints: Dog barks (overridden)
        d.bark();       // prints: bark() method called: Dog barks
        d.sleep();      // inherited method
    }
}
