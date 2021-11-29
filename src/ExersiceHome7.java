import java.util.Scanner;

public class ExersiceHome7 {
    public static final int ARRAY_SIZE=9;
    public static final int ZERO=0;
    public static final int ONE=1;
    public static final int TWO=2;
    public static final int THREE=3;
    public static final int FOUR=4;
    public static final int FIVE=5;
    public static final int SIX=6;
    public static final int SEVEN=7;
    public static final int EIGHT=8;
    public static final int NINE = 9;
    public static final int TEN=10;
    public static final char x = 'X';
    public static final char o = 'O';
    public static final char minus = '-';
    public static char[] gameBoard = new char[ARRAY_SIZE];
    public static int turn = 1;
    public static void main(String[]args){
        char markPlayer;
        do {
            if (numberPlayer()==TWO){
                markPlayer = 'O';
            }else {
                markPlayer = 'X';
            }
            if (turn ==TEN) {
                System.out.println();
                System.out.println("### Game Over ###");
                break;
            }
            turn++;
        }while (placeSymbolOnBoard(gameBoard, getPostionFromUser(), markPlayer) == false);
        if (checkWinner(gameBoard,markPlayer) != minus ) {
            System.out.println();
            System.out.println();
            System.out.println("Victory");
            System.out.println("Player " + markPlayer + " win");
        }
    }


    public static int numberPlayer(){
        int numberPlayer = (turn%2 + 1);
        return numberPlayer;
    }
    public static void printBoard (char[] gameBoard){
        System.out.print("Game Board");
        for (int i = 0; i < ARRAY_SIZE; i++) {
            if(i%THREE == ZERO){
                System.out.println();
            }
            System.out.print(gameBoard[i]);
        }
    }


    public static boolean isAvailable(char[] gameBoard , int location){
        boolean isAvailable = true;
        if(gameBoard[location-ONE]==x || gameBoard[location-ONE] == o){
            isAvailable=false;
        }
        return isAvailable;
    }


    public static int getPostionFromUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Player "+numberPlayer()+" enter the location on the game board:");
        int location = scanner.nextInt();
        String noLocation = "There is no location on the game board";
        String tryAgian = "Try agian";
        do {
            if (location < ONE || location> NINE) {
                System.out.println(noLocation);
                System.out.println(tryAgian);
                location = scanner.nextInt();
            } else if (isAvailable(gameBoard, location) == false) {
                System.out.println("The location is busy on the game board");
                System.out.println(tryAgian);
                location = scanner.nextInt();
            }
        } while (isAvailable(gameBoard, location) == false);
        return location;
    }

    public static char checkWinner(char[] gameBoard , char markPlayer){
        char winMark = minus;
        if (gameBoard[ZERO] == markPlayer && gameBoard[ONE] == markPlayer && gameBoard[TWO] == markPlayer) {
            winMark = markPlayer;
        } else if (gameBoard[THREE] == markPlayer && gameBoard[FOUR] == markPlayer && gameBoard[FIVE] == markPlayer) {
            winMark = markPlayer;
        } else if (gameBoard[SIX] == markPlayer && gameBoard[SEVEN] == markPlayer && gameBoard[EIGHT] == markPlayer) {
            winMark = markPlayer;
        } else if (gameBoard[ZERO] == markPlayer && gameBoard[THREE] == markPlayer && gameBoard[SIX] == markPlayer) {
            winMark = markPlayer;
        } else if (gameBoard[ONE] == markPlayer && gameBoard[FOUR] == markPlayer && gameBoard[SEVEN] == markPlayer) {
            winMark = markPlayer;
        } else if (gameBoard[TWO] == markPlayer && gameBoard[FIVE] == markPlayer && gameBoard[EIGHT] == markPlayer) {
            winMark = markPlayer;
        } else if (gameBoard[ZERO] == markPlayer && gameBoard[FOUR] == markPlayer && gameBoard[EIGHT] == markPlayer) {
            winMark = markPlayer;
        } else if (gameBoard[TWO] == markPlayer && gameBoard[FOUR] == markPlayer && gameBoard[SIX] == markPlayer) {
            winMark = markPlayer;
        }
        return winMark;
    }


    public static boolean placeSymbolOnBoard(char[] gameBoard , int location , char markPlayer){
        boolean checkWinner = true;
        boolean isAvailable = isAvailable(gameBoard , location);
        if (isAvailable == true){
            gameBoard[location - ONE] = markPlayer;
            printBoard(gameBoard);
            if (turn < SIX) {
                System.out.println();
            }
            if (checkWinner(gameBoard, markPlayer)== minus) {
                checkWinner = false;
                System.out.println();
            }
        }
        return checkWinner;
    }
}

