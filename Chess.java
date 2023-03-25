import java.util.Scanner; 
/**
 * the class gets an input from user of two chessmen and their possition on the board.
 * the output return an answer of which chessmen threats on the other(if there is a threat),
 * for an exapmle- "bishop threats rook".
 * if there's no threat- output is "no threat"
 *
 *chessmen must be different, their start position must be on the board limits 
 *and in a different position on the board.
 *
 * @author (eden cohen)
 * @version (V1.0)
 */
public class Chess
{
    public static void main (String [] args)
    {
        final int MAX_BOARD = 8;//max limit chessmen can be on the board
        final int MIN_BOARD = 1;//minimum limit chessmen can be on the board

        Scanner scan = new Scanner (System.in);
        System.out.println("Please enter the type"+
            " of the first chessman");
        char first = scan.next().charAt(0);
        System.out.println ("Please enter the number of row");
        int row1 = scan.nextInt();
        System.out.println("Please enter the number of column");
        int col1 = scan.nextInt();
        System.out.println("Please enter the type"+
            " of the second chessman");
        char second = scan.next().charAt(0);
        System.out.println("Please enter the number of row");
        int row2 = scan.nextInt();
        System.out.println("Please enter the number of column");
        int col2 = scan.nextInt();

        int isThreat = 0; // to check at the end if the value changed as an indication to if there was a threat or wasn't

        //checks if chessmen are not the same
        if (first == second){
            System.out.println("Chessmen should be different from each other");
            return;
        }

        //checks if chessmen are on the board limits 
        if ((row1 > MAX_BOARD) || (MIN_BOARD > row1)){
            System.out.println("Position is not legal");
            return;
        }
        if ((col1 > MAX_BOARD) || (MIN_BOARD > col1)){
            System.out.println("Position is not legal");
            return;
        }
        if ((row2 > MAX_BOARD) || (MIN_BOARD > row2)){
            System.out.println("Position is not legal");
            return;
        }
        if ((col2 > MAX_BOARD) || (MIN_BOARD > col2)){
            System.out.println("Position is not legal");
            return;
        }

        //checks if chessmen are not at the same position
        if (col1 == col2 && row1 == row2){
            System.out.println("Chessmen positions should not be identical");
            return;
        }

        String firstName; //declaration of chessman #1 for print
        String secondName;//declaration of chessman #2 for print

        //declaration of the first and second choise from input
        if (first == 'r'){
            firstName = "rook";  
        }else if (first == 'b'){
            firstName = "bishop";  
        }else if (first == 'k'){
            firstName = "knight";  
        }else{
            firstName = "not a chessmen"; // default for firstName string
        }
        if (second == 'r'){
            secondName = "rook";  
        }else if (second == 'b'){
            secondName = "bishop";  
        }else if (second == 'k'){
            secondName = "knight";  
        }else{
            secondName = "not a chessmen";// default for secondName string
        }

        //if one of chessmen is rook
        if (first == 'r' || second == 'r'){
            if (first == 'r'){
                if (row1 == row2){
                    isThreat = 1;
                    System.out.println("rook threats " + secondName);
                }
                if (col1 == col2){
                    isThreat = 1;
                    System.out.println("rook threats " + secondName);
                }
            }
            if (second == 'r'){
                if (row1 == row2){
                    isThreat = 1;
                    System.out.println("rook threats " + firstName);
                }
                if (col1 == col2){
                    isThreat = 1;
                    System.out.println("rook threats " + firstName);
                }
            }
        }

        //if one of chessmen is knight
        if (first == 'k' || second == 'k'){
            if (first == 'k'){
                if ((row1 + 2) == row2 && ((col1 + 1) == col2 || (col1 - 1) == col2)){
                    isThreat = 1;
                    System.out.println("knight threats " + secondName);
                }
                if ((row1 - 2) == row2 && ((col1 + 1) == col2 || (col1 - 1) == col2)){
                    isThreat = 1;
                    System.out.println("knight threats " + secondName);
                }
                if ((col1 + 2) == col2 && ((row1 + 1) == row2 || (row1 - 1) == row2)){
                    isThreat = 1;
                    System.out.println("knight threats " + secondName);
                }
                if ((col1 - 2) == col2 && ((row1 + 1) == row2 || (row1 - 1) == row2)){
                    isThreat = 1;
                    System.out.println("knight threats " + secondName);
                }
            }

            if (second == 'k'){
                if ((row2 + 2) == row1 && ((col2 + 1) == col1 || (col2 - 1) == col1)){
                    isThreat = 1;
                    System.out.println("knight threats " + firstName);
                }
                if ((row2 - 2) == row1 && ((col2 + 1) == col1 || (col2 - 1) == col1)){
                    isThreat = 1;
                    System.out.println("knight threats " + firstName);
                }
                if ((col2 + 2) == col1 && ((row2 + 1) == row1 || (row2 - 1) == row1)){
                    isThreat = 1;
                    System.out.println("knight threats " + firstName);
                }
                if ((col2 - 2) == col1 && ((row2 + 1) == row1 || (row2 - 1) == row1)){
                    isThreat = 1;
                    System.out.println("knight threats " + firstName);
                }
            }
        }

        //if one of chessmen is bishop
        if (first == 'b' || second == 'b'){
            if (first == 'b'){
                if ((row1 - row2) == (col1 - col2)){
                    isThreat = 1;
                    System.out.println("bishop threats " + secondName);
                }
                if ((row2 - row1) == (col1 - col2)){
                    isThreat = 1;
                    System.out.println("bishop threats " + secondName);
                }
            }

            if (second == 'b'){
                if ((row2 - row1) == (col2 - col1)){
                    isThreat = 1;
                    System.out.println("bishop threats " + firstName);
                }
                if ((row1 - row2) == (col2 - col1)){
                    isThreat = 1;
                    System.out.println("bishop threats " + firstName);
                }
            }
        }

        // if there is no threat on chessboard
        if (isThreat == 0){
            System.out.println("no threat");
        }
    }// end of method main 
}//end of class Chess 
