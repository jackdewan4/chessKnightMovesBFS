public class Board {

    // initialize vars
    private int i, j;
    // set width, height of chess board
    private final int width = 8;
    private final int height = 8;
    // create matrix that stores the chess board
    private Square[][] board;

    public Board(){
        // initialize board matrix
        board = new Square[width][height];

        // set up coordinates of each square on board
        for(int i = 0; i < width; i++){
            for(int j = 0; j < height; j++){
                board[i][j] = new Square(i, j);
            }
        }
    }

    public Square getSquare(int x, int y){
        //retrieve the square at coordinates x, y
        return board[x][y];

    }

   /* public void display(){
        //algorithm for printing out chess board
        for(int i = 0; i < width; i++){
            System.out.println(" ");
            System.out.println("---------------------------------");

            for(int j = 0; j < height; j++){
                System.out.print("| " + " " + " ");
            }
            System.out.print("|");
        }

        System.out.println(" ");
        System.out.println("---------------------------------");
    }*/

}
