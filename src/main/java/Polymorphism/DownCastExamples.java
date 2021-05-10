package Polymorphism;


class Animal {
    public void printAnimal() {
        System.out.println("I am an animal");
    }
}

class Dog extends Animal {
    public void printDog() {
        System.out.println("I am A Dog");
    }

    public String getDogString() {
        return "dog";
    }
}

class Cat extends Animal {
    public void printCat() {
        System.out.println("I am a Cat");
    }
}

public class DownCastExamples {
    public static void main(String[] args) {
        DownCastExamples dex = new DownCastExamples();
        //We create an instance of dog and cat but assign them to variables
        // of type Animal
        Animal genericDog = new Dog();
        Animal genericCat = new Cat();

        //We cast them now
        dex.testDog((Dog) genericDog);
        dex.testCat((Cat) genericCat);

        //Try overloaded methods with specifically typed variables.
        dex.testAnimal((Dog) genericDog);
        dex.testAnimal((Cat) genericCat);

        //Try overloaded methods with generically typed variables.
        dex.testAnimal(genericDog);
        dex.testAnimal(genericCat);

        if(((Dog)genericDog).getDogString().equals("dog")) {
            System.out.println("Matched");
        }

        Cat c = (Cat) dex.passThrough(genericCat);
        c.printCat();
    }

    //Three overloaded methods.
    public void testAnimal(Animal animal) {
        System.out.println("Executing testAnimal with animal type");
        animal.printAnimal();
    }

    public void testAnimal(Cat cat) {
        System.out.println("Executing testAnimal with cat type");
        cat.printAnimal();
    }

    public void testAnimal(Dog dog) {
        System.out.println("Executing testAnimal with dog type");
        dog.printAnimal();
    }

    //Specifically Typed Method calls
    public void testDog(Dog dog) {
        dog.printDog();
    }

    public void testCat(Cat cat) {
        cat.printCat();
    }

    public Object passThrough(Object o) {
        return o;
    }

}
