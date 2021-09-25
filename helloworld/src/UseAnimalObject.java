public class UseAnimalObject {
    public static void main(String[] args){
        Animal meow = new Animal();
        String aCat = meow.iamACat("Meow Meow");
        System.out.println(aCat);

        Animal jacky = new Animal();
        String aDog = jacky.iamADog("Jacky");
        System.out.println(aDog);

        Animal summer = new Animal();
        String aHarmster = summer.iamAHarmster("Summer");
        System.out.println(aHarmster);
    }

}
