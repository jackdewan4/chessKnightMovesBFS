public class Square {
    // set x and y coordinate variables
    private int x;
    private int y;
    // square constructor
    public Square(int i, int j){
        //set coordinates of square
        x = i;
        y = j;
    }

    // coordinate set up for square
    public void setXY(int x, int y){
        //set coordinates of square
        this.x = x;
        this.y = y;
    }

    // retrieve value of x coordinate
    public int getX(){
        return x;
    }

    // retrieve value of y coordinate
    public int getY(){
        return y;
    }

    public String toString(){
        String coordinates;
        // set toString to display path with the correct coordinates, add one to match user input
        coordinates = "[" + (x+1) + "," + (y+1) + "]";

        return coordinates;
    }
}
