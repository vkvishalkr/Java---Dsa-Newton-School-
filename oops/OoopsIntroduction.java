package oops;

public class OoopsIntroduction {
    public static void main(String[] args) {
       
        Person p1 = new Person();
        p1.age = 24;
        p1.name = "Vishal";

        Person p2 = new Person();
        p2.age = 31;
        p2.name = "Vishant";

        System.out.println(p1.age+ " " + p1.name);
        System.out.println(p2.age+ " " + p2.name); 

        p1.eat();
        p2.walk();
        p2.walk(4);

        System.out.println(Person.count);


    }
}

class Person {
    String name;
    int age;

    static int count;

    public Person() {
        count++;
        System.out.println("Creating an objet");    // it is printing  2 times
    }

    public Person (int newAge, int newName) {
        
    }

    void walk() {
        System.out.println(name + " is walking.");
    }
    void eat() {
        System.out.println(name + " is eating.");
    }
    void walk(int steps) {
        System.out.println(name+ " walked " + steps + " steps.");
    }
}