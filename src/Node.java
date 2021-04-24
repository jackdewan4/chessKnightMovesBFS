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

//    public void setNode(Square child, Square parent){
//        //initialize child, parent nodes
//        this.child = child;
//        this.parent = parent;
//    }

    public Square getChild(){
        // retrieve child node
        return child;
    }

    public Square getParent(){
        // retrieve parent node
        return parent;
    }
}
