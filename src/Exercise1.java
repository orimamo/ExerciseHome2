import java.util.Scanner;

public class Exercise1 {
    public static boolean isExists(String sentence, String word)
    {
        boolean check = false;
        int i=0;
        int j=0;
        while (i<sentence.length() && j<word.length()){
            if (sentence.charAt(i)==word.charAt(j)){
                i++;
                j++;
            }
            else {
                i++;
                j=0;

            }
            if (j==word.length()){
                check =true;
                break;
            }
        }
        return check;
    }


    public static void main(String[] args)
    {
        System.out.println(isExists("I like eating apples", "apple"));
    }

}
