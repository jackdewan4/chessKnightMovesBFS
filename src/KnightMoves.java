import java.util.Scanner;

public class KnightMoves {

    public static void main(String [] args){
        // obj declarations
        Scanner input = new Scanner(System.in);
        Board board = new Board();

        //var declarations
        String[] strCurr = null;
        String[] strNext = null;
        int[] currPos = new int[2];
        int[] nextPos = new int[2];


        //board.display();

        // take the user input for the starting position of the knight
        System.out.println("Enter your knight's current position on the chess board by separating the coordinates with a space");
        strCurr = input.nextLine().split(" ");

        // take the user inputted coordinates and store them in an integer array
        for(int i = 0; i < 2; i++){
            try{
                currPos[i] = Integer.parseInt(strCurr[i]);
            }catch(Exception e){
                System.out.println("Invalid input");
            }
        }

        // take the user input for the destination position of the knight
        System.out.println("Enter the position on the chess board you would like to move your knight to by separating the coordinates with a space");
        strNext = input.nextLine().split(" ");

        // take the user inputted coordinates and store them in an integer array
        for(int i = 0; i < 2; i++){
            try{
                nextPos[i] = Integer.parseInt(strNext[i]);
            }catch(Exception e){
                System.out.println("Invalid input");
            }
        }
        //set the start square as the user input -1 to fit into the 8*8 matrix as it starts at 0
        Square start = board.getSquare(currPos[0] -1, currPos[1] -1);

        //set the destination square as the user input -1 to fit into the 8*8 matrix as it starts at 0
        Square end = board.getSquare(nextPos[0] -1, nextPos[1] -1);

        // set the knights coordinates at the start square
        Knight knight = new Knight(start);

        //use the bfs search algorithm to find the shortest path to the destination square
        BFS search = new BFS(start, end, knight);
        search.search();

    }
}
