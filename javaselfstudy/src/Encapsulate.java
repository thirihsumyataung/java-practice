class Encapsulate {
    private String str;
    private int age;
    private String message;

    public int getAge() {
        return age;
    }

    public String getName (){
        return str;
    }

    public String getGreeting(){
        return "Hello, "+str+ " How are you ? ";
    }

    public String getMessage (){
        return message;
    }


    public void setName(String string){
        str = string;
    }

    public void setAge(int userAge){
        age = userAge;
    }
    public void setMessage(String msg){
       message = msg;
    }
}

/*

Note: Encapsulation is also known as Data Hiding
      If a data member of a class is private, it means it can only be accessed within the same class.
      No outside class can access the private data member ( variable ) of other class.
      If we setup public setter and getter methods to update and read the private data fields,
      then the outside class can access that private data fields via public method.

Advantages of encapsulation:
1. It can improve flexibility,maintainability and re-usability.
2. data fields can be read-only "if we don't define setter method" or write-only "if we don't define getter method"
3. Data-hiding : so user would not know what is going on behind the scene and would only know
 to update the field call set method and to read the field call get method but what these set and get methods doing are purely hidden.
Encapsulation Link to study : https://beginnersbook.com/2013/05/encapsulation-in-java/
 */

