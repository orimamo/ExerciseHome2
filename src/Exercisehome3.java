import java.util.Scanner;

public class Exercisehome3 {
    static final int SIZE_1 = 10;
    static final int SIZE_2 = 11;
    static final int SIZE_3 = 12;

    public static String checkPhoneNumber(String str) {
        boolean check = isDigits(str);
        String str1 = "";
        System.out.println(check);
        if (str.length() > 12 || str.length() < 10) {
            str1 = "";
        }
        if (check) {
            if (str.length() == SIZE_1) {
                if (str.charAt(0) == '0' && str.charAt(1) == '5') {
                    for (int i = 0; i < str.length(); i++) {
                        str1 = str1 + str.charAt(i);
                        if (i == 2) {
                            str1 = str1 + "-";
                        }

                    }
                }
            } else if (str.length() == SIZE_2) {
                if (str.charAt(0) == '0' && str.charAt(1) == '5' && str.charAt(3) == '-') {
                    str1 = str1 + str;
                }
            } else if (str.length() == SIZE_3) {
                if (str.charAt(0) == '9' && str.charAt(1) == '7' && str.charAt(2) == '2') {
                    str1 += "0";
                    for (int i = 3; i < str.length(); i++) {
                        str1 += str.charAt(i);
                        if (i == 4) {
                            str1 += "-";
                        }
                    }
                }

            }
        }
        return str1;
    }
        public static boolean isDigits (String str)
        {
            boolean isdigit = false;
            if (str.length() == SIZE_1 || str.length() == SIZE_3) {
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                        isdigit = true;
                    } else {
                        isdigit = false;
                        break;
                    }

                }
            } else if (str.length() == SIZE_2)
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                        isdigit = true;
                    } else if (str.charAt(3) == '-') {
                        isdigit = true;
                    } else {
                        isdigit = false;
                        break;
                    }

                }
            return isdigit;
        }

        public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter your phone");
            String s = scanner.nextLine();
            System.out.println(checkPhoneNumber(s));
        }


    }
