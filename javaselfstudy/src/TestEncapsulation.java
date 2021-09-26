public class TestEncapsulation {
    public static void main(String[] args){
        Encapsulate person = new Encapsulate();
        person.setName("Mori");
        person.setAge(25);
        person.setMessage("Everything will be ok.");
        System.out.println("My name is : " + person.getName());
        System.out.println("I am "+ person.getAge());
        System.out.println(person.getMessage());
        System.out.println(person.getGreeting());
    }
}
