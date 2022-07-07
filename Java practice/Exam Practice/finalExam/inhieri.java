/**
 * this program illustrate the concept of the overiding
 * Runtime polymorphisam
 * Interface
 * Class and Object
 * String and it's method
 * Super keywords and it's work
 * written by the @nisarg patel
 */

/*
 * interface sounds
 * every animal have their unique sound
 */
interface sounds {

    public String sound();

}

/*
 * class Animal
 * Animal have the name and different color so we have create the date member as
 * the name and color
 * every animal have their own description like...i.e. cat have their own
 * desctription
 */
class Animal implements sounds {
    public String name;
    public String color;

    public String sound() {
        return "";
    }

}

/*
 * Our first animal is the Dog and it extend the class animal
 * Override the sound method which implemeneted in the Animal class
 */
class Dog extends Animal {

    Dog(String name, String color) {
        super.name = name;
        super.color = color;
    }

    public String sound() {
        return "Bhau Bhau";
    }

}

/*
 * Our second animal is the cat and it extend the class animal
 * Override the sound method which implemeneted in the Animal class
 */
class Cat extends Animal {

    Cat(String name, String color) {
        super.name = name;
        super.color = color;

    }

    public String sound() {
        return "Myau Myau";
    }

}

public class inhieri {
    public static void main(String[] args) {
        /*
         * object from animal class and instance of the Dog
         * illustrate the concept of the runtime Polymoriphisam
         */
        Animal d1 = new Dog("jonny", "White");
        /*
         * object from animal class and instance of the Cat
         * illustrate the concept of the runtime Polymoriphisam
         */
        Animal d2 = new Cat("mini", "Yellowish");

        /*
         * one instance of the StringBuffer class for the store a temporory name of the
         * object
         * it will store the class name of the object means whether object from the Dog
         * class or Cat
         */
        StringBuffer name = new StringBuffer(20);

        /*
         * print the details of the first object
         * Here d1.getClass() give us the "class Dog"
         * from "class Dog" we shold remove the "class" word
         * output----:> White color Dog and his name is the jonny and says Bhau Bhau
         */
        System.out.println(d1.color + " color" + name.append(d1.getClass()).delete(0, 5) + " and his name is the "
                + d1.name + " and says " + d1.sound());
        /*
         * delete the content of the name string
         */
        name.delete(0, name.length());

        /*
         * print the details of the second object
         * Here d2.getClass() give us the "class Cat"
         * from "class Cat" we shold remove the class word
         * output----:> Yellowish color Cat and his name is the mini and says Myau Myau
         */
        System.out.println(d2.color + " color" + name.append(d2.getClass()).delete(0, 5) + " and his name is the "
                + d2.name + " and says " + d2.sound());

    }
}
