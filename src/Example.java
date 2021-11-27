public class Example {
    public static final int ARRYA_SIZE=9;
    public static final int HELP_PRINT_BOARD=3;
    public static char[]  gameBoard = new char[ARRYA_SIZE];
    public static void printBoard (char[] gameBoard){
        for (int i = 0; i<ARRYA_SIZE; i++){
            if (i%HELP_PRINT_BOARD==0){
                System.out.println();
            }
            System.out.print(gameBoard[i] + " ");
        }
    }

    public static void main(String[] args) {
        char [] c1 = {'x','x','x','x','x','x','x','x','x'};
        printBoard(c1);
    }

}
