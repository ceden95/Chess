import java.util.Scanner;
/**
 * the class prints all the possible options the knight can move to on the board
 * according to the input the user gives.
 * it also doesn't print the irrelevant option 
 * (possible moves wcich are out of the board limits)
 *
 * @author (eden cohen)
 * @version (V 1.0)
 */
public class Knight
{
    public static void main(String[] args) {

        final int MAX_BOARD = 8;//max limit chessmen can be on the board
        final int MIN_BOARD = 1;//minimum limit chessmen can be on the board

        Scanner scan = new Scanner(System.in);

        System.out.println ("This program reads two integers which " +
            "represent the knight's location on the chess board: ");
        System.out.println ("Please enter the number of row");
        int row = scan.nextInt();
        System.out.println ("Please enter the number of column");
        int col = scan.nextInt(); 

        //ckecks if input is on the board's limit. 
        if ((row > MAX_BOARD) || (row < MIN_BOARD)){//if row is off the limit
            System.out.println("lnput is illegal");
            return;
        }
        if ((col > MAX_BOARD) || (col < MIN_BOARD)){//if column is off the limit
            System.out.println("lnput is illegal");
            return;
        }

        System.out.println("Moves:");
        //prints only the possible steps on the borad
        if ((row - 2) >= MIN_BOARD ) { //knight goes left and up\down
            if ((col - 1) >= MIN_BOARD){
                System.out.println((row - 2) + " " + (col - 1)); 
            }
            if ((col + 1) <= MAX_BOARD){
                System.out.println((row - 2) + " " + (col + 1)); 
            }
        }

        if ((row + 2) <= MAX_BOARD ) { //knight goes right and up\down
            if ((col - 1) >= MIN_BOARD){
                System.out.println((row + 2) + " " + (col - 1)); 
            }
            if ((col + 1) <= MAX_BOARD){
                System.out.println((row + 2) + " " + (col + 1)); 
            }
        }

        if ((col - 2) >= MIN_BOARD ) {//knight goes up and left\right
            if ((row - 1) >= MIN_BOARD){
                System.out.println((row - 1) + " " + (col - 2)); 
            }
            if ((row + 1) <= MAX_BOARD){
                System.out.println((row + 1) + " " + (col - 2)); 
            }
        }

        if ((col + 2) <= MAX_BOARD) {//knight goes down and left\right
            if ((row - 1) >= MIN_BOARD){
                System.out.println((row - 1) + " " + (col + 2)); 
            }
            if ((row + 1) <= MAX_BOARD){
                System.out.println((row + 1) + " " + (col + 2)); 
            }
        }

    }// end of method main 
} //end of class Knight
