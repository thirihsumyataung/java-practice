import java.util.ArrayList;
public class Segments {
    // you can also use imports, for example:
// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
        public static int segments;
        public static int counter;
        public static int solution(String S) {
            int count = 0 ;
            ArrayList<Integer> segment = new ArrayList<Integer>();
            // write your code in Java SE 8
            //if (!S.equals(("XXXX"))){
                for ( int i=0 ; i < S.length(); i++){
                    char temp =S.charAt(i);
                    if (temp == '.'){
                        count++;
                        counter = count;
                        segment.add(i);
                        i++;
                        //    if (temp == 'X'){
                        //        continue;
                        //    }
                        if(temp == 'X'){
                            segment.add(i);
                            i++;
                        }
                    //}
                }
                segments = segment.size();
            }

                if (segment.size() == 0){
                        segments = 2;
            }
           // else {
              //  segments = 2;
           // }
            return segments;
        }

        public static void main(String[] args){
            String string1 ="XXXX";
            String string2 = ".X..X";
            String string3 = "XX.XXX..";
            String string4 = "X.XXXXX.X.";
            System.out.println("Segments : " + solution(string1));
            System.out.println("Segments : " + solution(string2));
            System.out.println("Segments : " + solution(string3));
            System.out.println("Segments : " + solution(string4));
        }


}
