import java.util.LinkedList;


public class BFS {
    // linked list to hold the next node to be searched
    private final LinkedList<Node> queue = new LinkedList<>();
    //linked list to hold all paths which have been identified
    private final LinkedList<Node> visited = new LinkedList<>();

    // var declarations
    private Square current;
    private Square start;
    private Square end;
    private Knight knight;

    //constructor to send all necessary info to perform search
    public BFS(Square start, Square end, Knight knight){
        this.start = start;
        this.end = end;
        this.knight = knight;
    }

    // returns true when a given square is the destination square
    public boolean success(Square square){
        if(square.getX() == end.getX() && square.getY() == end.getY()){
            return true;
        }else{
            return false;
        }
    }

    public void reconstructPath(LinkedList<Node> path, Square s){

        // var declarations
        int count = 0;
        Square curr = s;

        // list to store the path of moves made
        LinkedList<Square> moves = new LinkedList<>();

        // when the given square is not the start square
        // check which index the given square is and add it to the path list moves
        if(curr != start){
            while(curr != start){
                for(Node x: path){
                    if(curr == x.getChild()){
                        break;
                    }else{
                        count++;
                    }
                }
                //add all the nodes from the visited list that are not the starting square
                curr = path.get(count).getChild();
                moves.addFirst(curr);
                curr = path.get(count).getParent();
                count = 0;
            }
        }else{
            // add the start square to the path
            moves.add(start);
        }
        // display the path and how many moves it took
        System.out.println( "Your path is: " + moves + "\n" + "You made it in " + moves.size() + " moves!");
    }

    public void search(){

        // add the root node to the queue
        queue.add(new Node(start, null));

        //while the queue is not empty loop and set current to the square on the top of the queue
        while(!queue.isEmpty()){

            current = queue.poll().getChild();

            // if the current square is the destination square, then create the path it took to get to it
            if(success(current)){
                reconstructPath(visited, current);
                break;
            }

            // only when the move is a valid move for the knight add that square to the queue and the visited list
            for(Square i: knight.valid(current)){
                if(!visited.contains(i)){
                    queue.add(new Node(i, current));
                    visited.add(new Node(i, current));
                }
            }
        }
    }
}
