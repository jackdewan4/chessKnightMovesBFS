
//Node class
public class Node {

    //var declarations
    private Square child;
    private Square parent;

    // constructor to set child and parent
    public Node(Square discovered, Square last){
        //initialize child, parent nodes
        child = discovered;
        parent = last;
    }

    public Square getChild(){
        // retrieve child node
        return child;
    }

    public Square getParent(){
        // retrieve parent node
        return parent;
    }
}
