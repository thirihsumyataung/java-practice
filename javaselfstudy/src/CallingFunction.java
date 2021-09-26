public class CallingFunction {
    public static void main(String[] args){
        String aString= "Hey , there";
        addExclamation(aString);
        addExclamation("Pizza");
        addExclamation("Hot Dog");
        addExclamation("Have a nice day");
        addExclamation("Stay Safe");
        String question1 = addQuestionMark("What is your name");
        System.out.println(question1);
        String question2 = addQuestionMark("What is your phone number");
        System.out.println(question2) ;
    }
    //this function call will add exclamation mark at the end of String
    public static void addExclamation(String str){
        System.out.println(str + " ! ");
    }
    //return the result as the variable
    public static String addQuestionMark (String str){
        return str + "?";
    }

}
