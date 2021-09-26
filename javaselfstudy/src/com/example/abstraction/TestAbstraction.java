package com.example.abstraction;

public class TestAbstraction {
    public static void main(String[] args){
        Circle aCircle = new Circle("Pink", 2.2);
        Triangle aTri = new Triangle("Blue", 6, 12);
        Rectangle aRec = new Rectangle("Black", 4, 3);

        System.out.println(aCircle.toString());
        System.out.println(aTri.toString());
        System.out.println(aRec.toString());
    }
}

/*
1. An abstract class is a class that is declared with abstract keyword.
2. An abstract method is a method that is declared without implementation.
3. An abstract class may or may not have all abstract methods. Some of them can be concrete methods
4. A method defined abstract must always be redefined in the subclass, thus making overriding compulsory OR either make subclass itself abstract.
5. Any class that contains one or more abstract methods must also be declared with abstract keyword.
6. There can be no object of an abstract class. That is, an abstract class can not be directly instantiated with the new operator.
7. An abstract class can have parameterized constructors and default constructor is always present in an abstract class.


Encapsulation vs Data Abstraction

Encapsulation is data hiding(information hiding) while Abstraction is detail hiding(implementation hiding).
While encapsulation groups together data and methods that act upon the data, data abstraction deals with exposing the interface to the user and hiding the details of implementation.

Advantages of Abstraction

It reduces the complexity of viewing the things.
Avoids code duplication and increases re-usability.
Helps to increase security of an application or program as only important details are provided to the user.

Study Abstraction : https://www.geeksforgeeks.org/abstraction-in-java-2/

 */
