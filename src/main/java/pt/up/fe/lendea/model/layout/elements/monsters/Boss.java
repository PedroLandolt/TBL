package pt.up.fe.lendea.model.layout.elements.monsters;

import pt.up.fe.lendea.model.layout.elements.Monster;

public class Boss extends Monster {

    private int health;

    public Boss(int x, int y) {
        super(x, y);
        this.health = 2;
    }

    public int getHealth() {return this.health;}
    public void decreaseHealth() {
        this.health--;
    }
}
