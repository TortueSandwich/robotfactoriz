package projet;

public record Coord(int x, int y) {

    @Override
    public final String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
}
