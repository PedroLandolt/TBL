package pt.up.fe.lendea.model.layout.elements;


public class Shot extends Element {

    float floatX;
    boolean up;
    boolean right;
    boolean down;
    boolean left;

    public Shot(int x, int y, boolean up, boolean right, boolean down, boolean left) {
        super(x,y);
        this.floatX = x;
        this.up = up;
        this.right = right;
        this.down = down;
        this.left = left;
    }

    public boolean getDirectionUp() {return this.up;}
    public boolean getDirectionRight() {return this.right;}
    public boolean getDirectionDown() {return this.down;}
    public boolean getDirectionLeft() {return this.left;}
}
