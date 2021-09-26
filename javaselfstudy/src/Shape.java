
//Concept of Abstraction
// Implementation hiding
abstract class Shape {
    String color ;

    // abstract methods
    abstract double area();
    public abstract String toString();

    //constructor
    public Shape(String color){
        System.out.println("Shape constructor is called");
        this.color = color;
    }

    //Concrete method
    public String getColor( ){return color;}
}


