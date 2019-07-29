package tictact;

import java.util.Random;
import java.util.Scanner;


public class TicTacT {

    // Array to hold the X or O in each space (Default value: '_')
    public static char[] place = {'_', '_', '_',
                                 '_', '_', '_',
                                 '_', '_', '_'};

    // Variable to hold X or O, whichever team user chooses
    public static char team = '_';

    // Holds X or O, whichever team user does NOT choose!
    public static char opp = '_';

    // Variable to hold user input for Scanner
    public static String userStr;
    
    // Used for method rng (random is outside method to avoid java.lang.stackoverflowerror)
    public static Random random = new Random();
    
    // Used for method pvpOrPve and oppMove to determine whether the second team will be controlled by a pc or npc
    public static String pvp = "_";

    public static void main(String[] args) {

        // Greeting message for user
        System.out.println("WELCOME TO TIC TAC TOE!");

        setup();

    }

    public static void drawBoard() {

        // Draw the game board
        System.out.println("\t    A   B   C");
        System.out.println("\t  .-----------.");
        System.out.println("\t1 |_" + TicTacT.place[0] + "_|_" + TicTacT.place[1] + "_|_" + TicTacT.place[2] + "_|\n");
        System.out.println("\t2 |_" + TicTacT.place[3] + "_|_" + TicTacT.place[4] + "_|_" + TicTacT.place[5] + "_|\n");
        System.out.println("\t3 |_" + TicTacT.place[6] + "_|_" + TicTacT.place[7] + "_|_" + TicTacT.place[8] + "_|");
        System.out.println("\t  '-----------'");

    }

    public static void setup() {

        // Loop to reset the game board
        for (int i = 0; i < 9; i++) {

            TicTacT.place[i] = '_';

        }

        // Print the game board to console
        drawBoard();

        while ((TicTacT.team != 'X') && (TicTacT.team != 'O')) {

            System.out.println("\n\nSelect Your Team! Enter 'X' or 'O' below...");

            System.out.print("Enter your selection: ");
            Scanner input = new Scanner(System.in);
            TicTacT.userStr = input.next();

            switch (TicTacT.userStr.toUpperCase()) {
                case "X":
                    TicTacT.team = 'X';
                    TicTacT.opp = 'O';
                    break;
                case "O":
                    TicTacT.team = 'O';
                    TicTacT.opp = 'X';
                    break;
                default:
                    System.out.println("You entered: " + userStr);
                    System.out.println("This is not a valid option.");
                    System.out.println("Please enter either and X or an O to continue.");
                    break;
            }

        }

        System.out.println("\nYou are Team " + TicTacT.team + "!");

        //Run the game
        game();

    }
// This method can change depending on the other methods
    public static void game() {
        
        checkWin();

    }
    
    public static void playerMove(){
        
        // Local variable to run loop
        boolean loop = true;

        if("y".equals(TicTacT.pvp)){
        System.out.println("IT'S PLAYER ONE'S TURN!");
        }
        else if("n".equals(TicTacT.pvp)){
        System.out.println("IT'S YOUR TURN!");
        }
        
        drawBoard();

        do {

            System.out.println("\n\nChoose a column and row (EXAMPLE: A1)\n");

            System.out.print("Enter your selection: ");
            Scanner input = new Scanner(System.in);
            TicTacT.userStr = input.next().toUpperCase();

            switch (TicTacT.userStr) {

                case "A1":
                    if (TicTacT.place[0] == '_') {

                        TicTacT.place[0] = TicTacT.team;
                        oppMove();
                        loop = false;

                    } else if (TicTacT.place[0] == TicTacT.team) {
                        System.out.println("\nThere is an " + TicTacT.team + " there!");

                    } else if (TicTacT.place[0] == TicTacT.opp) {
                        System.out.println("\n There is an "+ TicTacT.opp +" there!");
                    }
                    ;
                    break;

                case "B1":
                    if (TicTacT.place[1] == '_') {

                        TicTacT.place[1] = TicTacT.team;
                        oppMove();
                        loop = false;

                    } else if (TicTacT.place[1] == TicTacT.team) {
                        System.out.println("\nThere is an " + TicTacT.team + " there!");

                    } else if (TicTacT.place[1] == TicTacT.opp) {
                        System.out.println("\n There is an "+ TicTacT.opp +" there!");
                    }
                    ;
                    break;
                case "C1":
                    if (TicTacT.place[2] == '_') {

                        TicTacT.place[2] = TicTacT.team;
                        oppMove();
                        loop = false;

                    } else if (TicTacT.place[2] == TicTacT.team) {
                        System.out.println("\nThere is an " + TicTacT.team + " there!");

                    } else if (TicTacT.place[2] == TicTacT.opp) {
                        System.out.println("\n There is an "+ TicTacT.opp +" there!");
                    }
                    ;
                    break;
                case "A2":
                    if (TicTacT.place[3] == '_') {

                        TicTacT.place[3] = TicTacT.team;
                        oppMove();
                        loop = false;

                    } else if (TicTacT.place[3] == TicTacT.team) {
                        System.out.println("\nThere is an " + TicTacT.team + " there!");

                    } else if (TicTacT.place[3] == TicTacT.opp) {
                        System.out.println("\n There is an "+ TicTacT.opp +" there!");
                    }
                    ;
                    break;
                case "B2":
                    if (TicTacT.place[4] == '_') {

                        TicTacT.place[4] = TicTacT.team;
                        oppMove();
                        loop = false;

                    } else if (TicTacT.place[4] == TicTacT.team) {
                        System.out.println("\nThere is an " + TicTacT.team + " there!");

                    } else if (TicTacT.place[4] == TicTacT.opp) {
                        System.out.println("\n There is an "+ TicTacT.opp +" there!");
                    }
                    ;
                    break;
                case "C2":
                    if (TicTacT.place[5] == '_') {

                        TicTacT.place[5] = TicTacT.team;
                        oppMove();
                        loop = false;

                    } else if (TicTacT.place[5] == TicTacT.team) {
                        System.out.println("\nThere is an " + TicTacT.team + " there!");

                    } else if (TicTacT.place[5] == TicTacT.opp) {
                        System.out.println("\n There is an "+ TicTacT.opp +" there!");
                    }
                    ;
                    break;
                case "A3":
                    if (TicTacT.place[6] == '_') {

                        TicTacT.place[6] = TicTacT.team;
                        oppMove();
                        loop = false;

                    } else if (TicTacT.place[6] == TicTacT.team) {
                        System.out.println("\nThere is an " + TicTacT.team + " there!");

                    } else if (TicTacT.place[6] == TicTacT.opp) {
                        System.out.println("\n There is an "+ TicTacT.opp +" there!");
                    }
                    ;
                    break;
                case "B3":
                    if (TicTacT.place[7] == '_') {

                        TicTacT.place[7] = TicTacT.team;
                        oppMove();
                        loop = false;

                    } else if (TicTacT.place[7] == TicTacT.team) {
                        System.out.println("\nThere is an " + TicTacT.team + " there!");

                    } else if (TicTacT.place[7] == TicTacT.opp) {
                        System.out.println("\n There is an "+ TicTacT.opp +" there!");
                    }
                    ;
                    break;
                case "C3":
                    if (TicTacT.place[8] == '_') {

                        TicTacT.place[8] = TicTacT.team;
                        oppMove();
                        loop = false;

                    } else if (TicTacT.place[8] == TicTacT.team) {
                        System.out.println("\nThere is an " + TicTacT.team + " there!");

                    } else if (TicTacT.place[8] == TicTacT.opp) {
                        System.out.println("\n There is an "+ TicTacT.opp +" there!");
                    }
                    ;
                    break;

            }

        } while (loop);

        checkWin();
    
    }
    
    public static void oppMove() {
        
        if("y".equals(TicTacT.pvp)){
            
        // Local variable to run loop
        boolean loop = true;

            System.out.println("IT'S PLAYER'S TWO TURN!");
        
        drawBoard();

        do {

            System.out.println("\n\nChoose a column and row (EXAMPLE: A1)\n");

            System.out.print("Enter your selection: ");
            Scanner input = new Scanner(System.in);
            TicTacT.userStr = input.next().toUpperCase();

            switch (TicTacT.userStr) {

                case "A1":
                    if (TicTacT.place[0] == '_') {

                        TicTacT.place[0] = TicTacT.opp;
                        loop = false;

                    } else if (TicTacT.place[0] == TicTacT.team) {
                        System.out.println("\nThere is an " + TicTacT.team + " there!");

                    } else if (TicTacT.place[0] == TicTacT.opp) {
                        System.out.println("\n There is an "+ TicTacT.opp +" there!");
                    }
                    ;
                    break;

                case "B1":
                    if (TicTacT.place[1] == '_') {

                        TicTacT.place[1] = TicTacT.opp;
                        loop = false;

                    } else if (TicTacT.place[1] == TicTacT.team) {
                        System.out.println("\nThere is an " + TicTacT.team + " there!");

                    } else if (TicTacT.place[1] == TicTacT.opp) {
                        System.out.println("\n There is an "+ TicTacT.opp +" there!");
                    }
                    ;
                    break;
                case "C1":
                    if (TicTacT.place[2] == '_') {

                        TicTacT.place[2] = TicTacT.opp;
                        loop = false;

                    } else if (TicTacT.place[2] == TicTacT.team) {
                        System.out.println("\nThere is an " + TicTacT.team + " there!");

                    } else if (TicTacT.place[2] == TicTacT.opp) {
                        System.out.println("\n There is an "+ TicTacT.opp +" there!");
                    }
                    ;
                    break;
                case "A2":
                    if (TicTacT.place[3] == '_') {

                        TicTacT.place[3] = TicTacT.opp;
                        loop = false;

                    } else if (TicTacT.place[3] == TicTacT.team) {
                        System.out.println("\nThere is an " + TicTacT.team + " there!");

                    } else if (TicTacT.place[3] == TicTacT.opp) {
                        System.out.println("\n There is an "+ TicTacT.opp +" there!");
                    }
                    ;
                    break;
                case "B2":
                    if (TicTacT.place[4] == '_') {

                        TicTacT.place[4] = TicTacT.opp;
                        loop = false;

                    } else if (TicTacT.place[4] == TicTacT.team) {
                        System.out.println("\nThere is an " + TicTacT.team + " there!");

                    } else if (TicTacT.place[4] == TicTacT.opp) {
                        System.out.println("\n There is an "+ TicTacT.opp +" there!");
                    }
                    ;
                    break;
                case "C2":
                    if (TicTacT.place[5] == '_') {

                        TicTacT.place[5] = TicTacT.opp;
                        loop = false;

                    } else if (TicTacT.place[5] == TicTacT.team) {
                        System.out.println("\nThere is an " + TicTacT.team + " there!");

                    } else if (TicTacT.place[5] == TicTacT.opp) {
                        System.out.println("\n There is an "+ TicTacT.opp +" there!");
                    }
                    ;
                    break;
                case "A3":
                    if (TicTacT.place[6] == '_') {

                        TicTacT.place[6] = TicTacT.opp;
                        loop = false;

                    } else if (TicTacT.place[6] == TicTacT.team) {
                        System.out.println("\nThere is an " + TicTacT.team + " there!");

                    } else if (TicTacT.place[6] == TicTacT.opp) {
                        System.out.println("\n There is an "+ TicTacT.opp +" there!");
                    }
                    ;
                    break;
                case "B3":
                    if (TicTacT.place[7] == '_') {

                        TicTacT.place[7] = TicTacT.opp;
                        loop = false;

                    } else if (TicTacT.place[7] == TicTacT.team) {
                        System.out.println("\nThere is an " + TicTacT.team + " there!");

                    } else if (TicTacT.place[7] == TicTacT.opp) {
                        System.out.println("\n There is an "+ TicTacT.opp +" there!");
                    }
                    ;
                    break;
                case "C3":
                    if (TicTacT.place[8] == '_') {

                        TicTacT.place[8] = TicTacT.opp;
                        loop = false;

                    } else if (TicTacT.place[8] == TicTacT.team) {
                        System.out.println("\nThere is an " + TicTacT.team + " there!");

                    } else if (TicTacT.place[8] == TicTacT.opp) {
                        System.out.println("\n There is an "+ TicTacT.opp +" there!");
                    }
                    ;
                    break;

            }

        } while (loop);

        checkWin();
        
        }

       else if("n".equals(TicTacT.pvp)){
        
        while (true) {

            if ((TicTacT.place[0] == '_') || (TicTacT.place[1] == '_') || (TicTacT.place[2] == '_') || (TicTacT.place[3] == '_') || (TicTacT.place[4] == '_') || (TicTacT.place[5] == '_') || (TicTacT.place[6] == '_') || (TicTacT.place[7] == '_') || (TicTacT.place[8] == '_')) {

                //Potential winning moves for opp
                if (TicTacT.place[0] != TicTacT.team && TicTacT.place[1] != TicTacT.team && TicTacT.place[2] != TicTacT.team) {
                    
                    int x = rng(0,2);
                
                if(TicTacT.place[x] == '_'){
                
                 TicTacT.place[x] = TicTacT.opp; 
                 checkWin();
                 break;
                    
                } else{
                    
                    oppMove();
                    break;
                    
                }

            } else if (TicTacT.place[3] != TicTacT.team && TicTacT.place[4] != TicTacT.team && TicTacT.place[5] != TicTacT.team){
                
                    int x = rng(3,5);
                
                if(TicTacT.place[x] == '_'){
                
                 TicTacT.place[x] = TicTacT.opp; 
                 checkWin();
                 break;
                    
                } else{
                    
                    oppMove();
                    break;
                    
                }
            
            } else if (TicTacT.place[6] != TicTacT.team && TicTacT.place[7] != TicTacT.team && TicTacT.place[8] != TicTacT.team){
                
                int x = rng(6,8);
                
                if(TicTacT.place[x] == '_'){
                
                 TicTacT.place[x] = TicTacT.opp; 
                 checkWin();
                 break;
                    
                } else{
                    
                    oppMove();
                    break;
                    
                }
            
            } else if (TicTacT.place[0] != TicTacT.team && TicTacT.place[4] != TicTacT.team && TicTacT.place[8] != TicTacT.team){
                
                int x = rng(0,8);
                
                if (TicTacT.place[0] == '_' && TicTacT.place[0] == x){
                
                    TicTacT.place[x] = TicTacT.opp;
                    checkWin();
                    break;
                    
                } else if (TicTacT.place[4] == '_' && TicTacT.place[4] == x){
                
                    TicTacT.place[x] = TicTacT.opp;
                    checkWin();
                    break;
                    
                } else if (TicTacT.place[8] == '_' && TicTacT.place[8] == x){
                
                    TicTacT.place[x] = TicTacT.opp;
                    checkWin();
                    break;
                    
                }
            } else if (TicTacT.place[1] != TicTacT.team && TicTacT.place[4] != TicTacT.team && TicTacT.place[7] != TicTacT.team){
                
                int x = rng(0,8);
                
                if (TicTacT.place[1] == '_' && TicTacT.place[1] == x){
                
                    TicTacT.place[x] = TicTacT.opp;
                    checkWin();
                    break;
                    
                } else if (TicTacT.place[4] == '_' && TicTacT.place[4] == x){
                
                    TicTacT.place[x] = TicTacT.opp;
                    checkWin();
                    break;
                    
                } else if (TicTacT.place[7] == '_' && TicTacT.place[7] == x){
                
                    TicTacT.place[x] = TicTacT.opp;
                    checkWin();
                    break;
                    
                }
            } else if (TicTacT.place[2] != TicTacT.team && TicTacT.place[4] != TicTacT.team && TicTacT.place[6] != TicTacT.team){
                
                int x = rng(0,8);
                
                if (TicTacT.place[2] == '_' && TicTacT.place[2] == x){
                
                    TicTacT.place[x] = TicTacT.opp;
                    checkWin();
                    break;
                    
                } else if (TicTacT.place[4] == '_' && TicTacT.place[4] == x){
                
                    TicTacT.place[x] = TicTacT.opp;
                    checkWin();
                    break;
                    
                } else if (TicTacT.place[6] == '_' && TicTacT.place[6] == x){
                
                    TicTacT.place[x] = TicTacT.opp;
                    checkWin();
                    break;
                    
                }
            } else if (TicTacT.place[0] != TicTacT.team && TicTacT.place[3] != TicTacT.team && TicTacT.place[6] != TicTacT.team){
                
                int x = rng(0,8);
                
                if (TicTacT.place[0] == '_' && TicTacT.place[0] == x){
                
                    TicTacT.place[x] = TicTacT.opp;
                    checkWin();
                    break;
                    
                } else if (TicTacT.place[3] == '_' && TicTacT.place[3] == x){
                
                    TicTacT.place[x] = TicTacT.opp;
                    checkWin();
                    break;
                    
                } else if (TicTacT.place[6] == '_' && TicTacT.place[6] == x){
                
                    TicTacT.place[x] = TicTacT.opp;
                    checkWin();
                    break;
                    
                }
            } else if (TicTacT.place[2] != TicTacT.team && TicTacT.place[5] != TicTacT.team && TicTacT.place[8] != TicTacT.team){
                
                int x = rng(0,8);
                
                if (TicTacT.place[2] == '_' && TicTacT.place[2] == x){
                
                    TicTacT.place[x] = TicTacT.opp;
                    checkWin();
                    break;
                    
                } else if (TicTacT.place[5] == '_' && TicTacT.place[5] == x){
                
                    TicTacT.place[x] = TicTacT.opp;
                    checkWin();
                    break;
                    
                } else if (TicTacT.place[8] == '_' && TicTacT.place[8] == x){
                
                    TicTacT.place[x] = TicTacT.opp;
                    checkWin();
                    break;
                    
                } 
            
            } else{

                int x = rng(0,8);
            
                if (TicTacT.place[x] == '_') {

                    TicTacT.place[x] = TicTacT.opp;
                    checkWin();
                    break;
                    
                } else if((TicTacT.place[0] != '_') || (TicTacT.place[1] != '_') || (TicTacT.place[2] != '_') || (TicTacT.place[3] != '_') || (TicTacT.place[4] != '_') || (TicTacT.place[5] != '_') || (TicTacT.place[6] != '_') || (TicTacT.place[7] != '_') || (TicTacT.place[8] != '_')){
                    
                    oppMove();
                    break;
                    
                }
            
            }

            } else {
                
            checkWin();
            break;
            
            }

        }

    }
    }
    
    public static void pvpOrPve(){
        
        while(!"y".equals(TicTacT.pvp) || !"n".equals(TicTacT.pvp)){
        
            System.out.println("Play player vs player? [y/n]");
            Scanner sc = new Scanner(System.in);
            TicTacT.pvp = sc.next();
            
            if(!"_".equals(TicTacT.pvp)){
                break;
            }
        
        
        }
        
    }

    public static void checkWin() {
        
        // decide to pvp or not to
        if("_".equals(TicTacT.pvp)){
        pvpOrPve();
        }
        
        //See if X has won the game
        if ((TicTacT.place[0] == 'X') && (TicTacT.place[1] == 'X') && (TicTacT.place[2] == 'X')) {
            System.out.println("\n\n\n\tX WINS!!!");
            drawBoard();
            playAgain();
            System.out.println("\n\n");
        } else if ((TicTacT.place[3] == 'X') && (TicTacT.place[4] == 'X') && (TicTacT.place[5] == 'X')) {
            System.out.println("\n\n\n\tX WINS!!!");
            drawBoard();
            playAgain();
            System.out.println("\n\n");
        } else if ((TicTacT.place[6] == 'X') && (TicTacT.place[7] == 'X') && (TicTacT.place[8] == 'X')) {
            System.out.println("\n\n\n\tX WINS!!!");
            drawBoard();
            playAgain();
            System.out.println("\n\n");
        } else if ((TicTacT.place[0] == 'X') && (TicTacT.place[4] == 'X') && (TicTacT.place[8] == 'X')) {
            System.out.println("\n\n\n\tX WINS!!!");
            drawBoard();
            playAgain();
            System.out.println("\n\n");
        } else if ((TicTacT.place[1] == 'X') && (TicTacT.place[4] == 'X') && (TicTacT.place[7] == 'X')) {
            System.out.println("\n\n\n\tX WINS!!!");
            drawBoard();
            playAgain();
            System.out.println("\n\n");
        } else if ((TicTacT.place[2] == 'X') && (TicTacT.place[4] == 'X') && (TicTacT.place[6] == 'X')) {
            System.out.println("\n\n\n\tX WINS!!!");
            drawBoard();
            playAgain();
            System.out.println("\n\n");
        } else if ((TicTacT.place[0] == 'X') && (TicTacT.place[3] == 'X') && (TicTacT.place[6] == 'X')) {
            System.out.println("\n\n\n\tX WINS!!!");
            drawBoard();
            playAgain();
            System.out.println("\n\n");
        } else if ((TicTacT.place[2] == 'X') && (TicTacT.place[5] == 'X') && (TicTacT.place[8] == 'X')) {
            System.out.println("\n\n\n\tX WINS!!!");
            drawBoard();
            playAgain();
            System.out.println("\n\n");
        }
        //Now, see if O won
        if ((TicTacT.place[0] == 'O') && (TicTacT.place[1] == 'O') && (TicTacT.place[2] == 'O')) {
            System.out.println("\n\n\n\tO WINS!!!");
            drawBoard();
            playAgain();
            System.out.println("\n\n");
        } else if ((TicTacT.place[3] == 'O') && (TicTacT.place[4] == 'O') && (TicTacT.place[5] == 'O')) {
            System.out.println("\n\n\n\tO WINS!!!");
            drawBoard();
            playAgain();
            System.out.println("\n\n");
        } else if ((TicTacT.place[6] == 'O') && (TicTacT.place[7] == 'O') && (TicTacT.place[8] == 'O')) {
            System.out.println("\n\n\n\tO WINS!!!");
            drawBoard();
            playAgain();
            System.out.println("\n\n");
        } else if ((TicTacT.place[0] == 'O') && (TicTacT.place[4] == 'O') && (TicTacT.place[8] == 'O')) {
            System.out.println("\n\n\n\tO WINS!!!");
            drawBoard();
            playAgain();
            System.out.println("\n\n");
        } else if ((TicTacT.place[1] == 'O') && (TicTacT.place[4] == 'O') && (TicTacT.place[7] == 'O')) {
            System.out.println("\n\n\n\tO WINS!!!");
            drawBoard();
            playAgain();
            System.out.println("\n\n");
        } else if ((TicTacT.place[2] == 'O') && (TicTacT.place[4] == 'O') && (TicTacT.place[6] == 'O')) {
            System.out.println("\n\n\n\tO WINS!!!");
            drawBoard();
            playAgain();
            System.out.println("\n\n");
        } else if ((TicTacT.place[0] == 'O') && (TicTacT.place[3] == 'O') && (TicTacT.place[6] == 'O')) {
            System.out.println("\n\n\n\tO WINS!!!");
            drawBoard();
            playAgain();
            System.out.println("\n\n");
        } else if ((TicTacT.place[2] == 'O') && (TicTacT.place[5] == 'O') && (TicTacT.place[8] == 'O')) {
            System.out.println("\n\n\n\tO WINS!!!");
            drawBoard();
            playAgain();
            System.out.println("\n\n");
            
        // if no tie then start game.
        }
        else{
            playerMove();
        }

    }

    public static void playAgain() {

        System.out.print("\n\nPlay again? [y/n]:\n");
        Scanner input = new Scanner(System.in);
        TicTacT.userStr = input.next().toLowerCase();

        if (userStr.equals("y")) {
            TicTacT.team = '_';
            TicTacT.opp = '_';
            setup();
        } else {

            System.exit(0);

        }
    }
    
    public static int rng(int min,int max){
        
    int x = random.nextInt(max + 1 - min) + min;;      
    
    return x;      
    }

}
