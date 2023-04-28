package pt.up.fe.lendea.model.layout.elements;

import pt.up.fe.lendea.model.Position;

public class Element {

    public Element(){}
    private Position position;

    public Element(int x, int y) {
        this.position = new Position(x, y);
    }

    public Position getPosition() {
        return this.position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
