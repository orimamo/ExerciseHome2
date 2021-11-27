import java.util.Scanner;

public class ExersiceHome7 {
        public static final int ARRYA_SIZE=9;
        public static final int HELP_PRINT_BOARD=3;
        public static char[]  gameBoard = new char[ARRYA_SIZE];
        public static void main (String[]args){

            getPostionFromUse();
        }
        public static void printBoard (char[] gameBoard){
            for (int i = 0; i<ARRYA_SIZE; i++){
                if (i%HELP_PRINT_BOARD==0){
                    System.out.println();
                }
                System.out.print(gameBoard[i] + " ");
            }
        }
        public static boolean isAvailable(char[] gameBoard , int arrayLocation){
            boolean isAvilable = true;
            if ((gameBoard[arrayLocation]=='X') || (gameBoard[arrayLocation]=='0')){
                isAvilable = false;
            }
            return isAvilable;
        }
        public static void getPostionFromUse(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the location on the game board:");
            int location = scanner.nextInt();
            do {
                if (location < 1){
                    System.out.println("There is no location on the game board");
                    System.out.println("Try agian");
                    location = scanner.nextInt();
                }
                if (location >9){
                    System.out.println("There is no location on the game board");
                    System.out.println("Try agian");
                    location = scanner.nextInt();
                }else if(isAvailable(gameBoard , location) == false){
                    System.out.println("The location is busy on the game board");
                    System.out.println("Try agian");
                    location = scanner.nextInt();
                }
            } while (isAvailable(gameBoard,location) == false );
        }
        //public static char checkWinner(char[] gameBoard){

       // }
    }
