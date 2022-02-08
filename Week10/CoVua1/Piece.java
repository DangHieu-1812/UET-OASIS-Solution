public abstract class Piece {
    private int coordinatesX;
    private int coordinatesY;
    private String color;

    /** An especially short bit of Javadoc. */
    public Piece(int coordinatesX, int coordinatesY) {
        if (1 <= coordinatesX && 1 <= coordinatesY && coordinatesX <= 8 && coordinatesY <= 8) {
            this.coordinatesX = coordinatesX;
            this.coordinatesY = coordinatesY;
        }
    }

    /** An especially short bit of Javadoc. */
    public Piece(int coordinatesX, int coordinatesY, String color) {
        if (1 <= coordinatesX && coordinatesX <= 8 && 1 <= coordinatesY && coordinatesY <= 8) {
            this.coordinatesX = coordinatesX;
            this.coordinatesY = coordinatesY;
        }
        if (color.equals("white") || color.equals("black")) {
            this.color = color;
        }
    }

    public abstract String getSymbol();

    public abstract boolean canMove(Board board, int x, int y);

    public int getCoordinatesX() {
        return coordinatesX;
    }

    public void setCoordinatesX(int coordinatesX) {
        this.coordinatesX = coordinatesX;
    }

    public int getCoordinatesY() {
        return coordinatesY;
    }

    public void setCoordinatesY(int coordinatesY) {
        this.coordinatesY = coordinatesY;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /** An especially short bit of Javadoc. */
    public boolean checkPosition(Piece p) {
        if (!((1 <= p.getCoordinatesX() && p.getCoordinatesX() <= 8)
                && (1 <= p.getCoordinatesY() && p.getCoordinatesY() <= 8))) {
            return false;
        }
        if ((p.getCoordinatesX() == this.coordinatesX)
                && (p.getCoordinatesY() == this.coordinatesY)) {
            return true;
        }
        return false;
    }

}


