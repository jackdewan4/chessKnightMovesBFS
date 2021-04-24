import java.util.LinkedList;

public class Knight {

    // var declarations
    private Square square;

    private Square position;

    public Knight(Square position){
        this.position = position;
    }

    public LinkedList<Square> valid(Square s){

        //LinkedList to store valid moves from a given square
        LinkedList<Square> move = new LinkedList<>();
        square = s;

        //initial vars to store position of knight piece on chess board
        int initX = square.getX();
        int initY = square.getY();

        //vars to store valid moves
        int farRightX = initX + 2;
        int closeRightX = initX + 1;
        int farLeftX = initX - 2;
        int closeLeftX = initX - 1;

        int farUpY = initY + 2;
        int closeUpY = initY + 1;
        int farDowY = initY - 2;
        int closeDowY = initY - 1;

        if(farRightX > -1 && farRightX < 8 && closeUpY > -1 && closeUpY < 8){
            // if move is valid add square to list of valid moves
            Square square = new Square(farRightX, closeUpY);
            move.add(square);

        }

        if(farLeftX > -1 && farLeftX < 8 && closeUpY > -1 && closeUpY < 8){
            // if move is valid add square to list of valid moves
            Square square = new Square(farLeftX, closeUpY);
            move.add(square);

        }

        if(farRightX > -1 && farRightX < 8 && closeDowY > -1 && closeDowY < 8){
            // if move is valid add square to list of valid moves
            Square square = new Square(farRightX, closeDowY);
            move.add(square);

        }

        if(farLeftX > -1 && farLeftX < 8 && closeDowY > -1 && closeDowY < 8){
            // if move is valid add square to list of valid moves
            Square square = new Square(farLeftX, closeDowY);
            move.add(square);

        }

        if(closeRightX > -1 && closeRightX < 8 && farUpY > -1 && farUpY < 8){
            // if move is valid add square to list of valid moves
            Square square = new Square(closeRightX, farUpY);
            move.add(square);

        }

        if(closeLeftX > -1 && closeLeftX < 8 && farUpY > -1 && farUpY < 8){
            // if move is valid add square to list of valid moves
            Square square = new Square(closeLeftX, farUpY);
            move.add(square);

        }

        if(closeRightX > -1 && closeRightX < 8 && farDowY > -1 && farDowY < 8){
            // if move is valid add square to list of valid moves
            Square square = new Square(closeRightX, farDowY);
            move.add(square);

        }

        if(closeLeftX > -1 && closeLeftX < 8 && farDowY > -1 && farDowY < 8){
            // if move is valid add square to list of valid moves
            Square square = new Square(closeLeftX, farDowY);
            move.add(square);

        }

        // return the list of valid move
        return move;
    }

}
