//תוכנית 3:
// ניתן לכתוב מספר טלפון סלולרי ישראלי באופן תקין במספר צורות: עם הסימן מקף (-) אחרי הקידומת ובלעדיו, עם קידומת בינלאומית ובלעדיה. לדוגמה, כל הפורמטים הבאים הם צורות של אותו מספר:
//  1.	0504730464
//  2.	050-4730464
//  3.	972504730464
//  כתבו פונקציה המקבלת מחרוזת כלשהי כפרמטר קלט, ובודקת האם המספר הוא מאחד הפורמטים שצוינו מעלה. אם לא, הפונקציה מחזירה מחרוזת ריקה. אם כן, הפונקציה מנרמלת את המספר לפורמט מספר 2.
// קלט לדוגמה יכול להיות 0501234567, 972501234567, או 050-1234567. בכל אחד מהמקרים הנ"ל, הערך המוחזר צריך להיות 050-1234567.


import java.util.Scanner;

public class Exercisehome3 {
    public static String checkPhoneNumber(String str) {
        String str1 = "";
        if ((str.length() == 10) || str.length() == 11)
        {
            if (str.charAt(0) == '0' && str.charAt(1) == '5')
            {
                if (str.charAt(4) == '-')
                {
                    str1 = str1+str;
                } else if (str.charAt(4) - str.charAt(4) == 0)
                {
                    for (int i=0;i<str.length();i++)
                    {
                        if(i==3){
                            str1 = str1 + "-";

                        }
                        str1 = str1 +str.charAt(i);
                    }

                }
            }
        }
       else if (str.length() == 12) {
            if (str.charAt(0) == '9' && str.charAt(1) == '7' && str.charAt(2) == '2')
            {
                str1 = str1 + "0";
                for (int i=3;i<str.length();i++)
                {
                    if(i==5){
                        str1 = str1 + "-";
                    }
                    str1 = str1 +str.charAt(i);
                }
            } else {
                str1 = "";
            }
        }
       else{
            if (str.length() > 12 || str.length() < 10) {
                str1 = "";
        }

        }
       return str1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your phone");
        String s = scanner.nextLine();
        System.out.println(checkPhoneNumber(s));
    }



}
