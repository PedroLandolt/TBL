package pt.up.fe.lendea.model;

import javax.sql.ConnectionPoolDataSource;
import java.util.Objects;

public class Position {
    private final int x;
    private final int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Position getLeft() {
        return new Position(x - 1, y);
    }

    public Position getRight() {
        return new Position(x + 1, y);
    }

    public Position getUp() {
        return new Position(x, y - 1);
    }

    public Position getDown() {
        return new Position(x, y + 1);
    }

    public Position getRandomNeighbour() {
        int n = (int) (Math.random() * 4);
        switch (n) {
            case 0:
                return getRight();
            case 1:
                return getDown();
            case 2:
                return getUp();
            default:
                return getLeft();
        }
    }

    public Position moveSide() {
        int n = (int) (Math.random() * 2);
        switch (n) {
            case 0:
                return getRight();
            default:
                return getLeft();
        }
    }

    public Position movingShotUp() {
        return getUp();
    }
    public Position movingShotRight() {
        return getRight();
    }
    public Position movingShotDown() {
        return getDown();
    }
    public Position movingShotLeft() {
        return getLeft();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return x == position.x && y == position.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
