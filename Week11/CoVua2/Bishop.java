public class Bishop extends Piece {
    public Bishop(int coordinatesX, int coordinatesY) {
        super(coordinatesX, coordinatesY);
    }

    public Bishop(int coordinatesX, int coordinatesY, String color) {
        super(coordinatesX, coordinatesY, color);
    }

    @Override
    public String getSymbol() {
        return "B";
    }

    @Override
    public boolean canMove(Board board, int x, int y) {
        if (Math.abs(getCoordinatesX() - x) != Math.abs(getCoordinatesY() - y)) {
            return false;
        }
        Piece piece = board.getAt(x, y);
        if (piece != null && piece.getColor().equals(getColor())) {
            return false;
        }
        int lx = x - getCoordinatesX();
        int ly = y - getCoordinatesY();

        while (lx != 0 && ly != 0) {
            if (getCoordinatesX() + lx != x && getCoordinatesY() + ly != y
                    && board.getAt(getCoordinatesX()
                    + lx, getCoordinatesY() + ly) != null) {
                return false;
            }
            if (lx > 0) {
                lx--;
            } else {
                lx++;
            }
            if (ly > 0) {
                ly--;
            } else {
                ly++;
            }
        }
        return true;
    }
}

