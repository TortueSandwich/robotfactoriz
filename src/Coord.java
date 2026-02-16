public record Coord(float x, float y) {

    @Override
    public final String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
}
