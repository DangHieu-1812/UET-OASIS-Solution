public class Rook extends Piece {
    public Rook(int coordinatesX, int coordinatesY) {
        super(coordinatesX, coordinatesY);
    }

    public Rook(int coordinatesX, int coordinatesY, String color) {
        super(coordinatesX, coordinatesY, color);
    }

    @Override
    public String getSymbol() {
        return "R";
    }

    @Override
    public boolean canMove(Board board, int x, int y) {
        if (!board.validate(x, y)) {
            return false;
        }
        if (x == this.getCoordinatesX() && y == this.getCoordinatesY()) {
            return false;
        }
        if (x != this.getCoordinatesX() && y != this.getCoordinatesY()) {
            return false;
        }

        String direction = (x == this.getCoordinatesX()) ? "Oy" : "Ox";
        if (direction.equals("Ox")) {
            int distance = Math.abs(x - this.getCoordinatesX());
            for (Piece piece : board.getPieces()) {
                if (piece.getCoordinatesY() == this.getCoordinatesY()) {
                    if ((x - this.getCoordinatesX())
                            * (piece.getCoordinatesX() - this.getCoordinatesX()) > 0) {
                        if (distance > Math.abs(piece.getCoordinatesX() - this.getCoordinatesX())) {
                            return false;
                        }
                    }
                }
            }
        } else {
            int distance = Math.abs(y - this.getCoordinatesY());
            for (Piece piece : board.getPieces()) {
                if (piece.getCoordinatesX() == this.getCoordinatesX()) {
                    if ((y - this.getCoordinatesY())
                            * (piece.getCoordinatesY() - this.getCoordinatesY()) > 0) {
                        if (distance > Math.abs(piece.getCoordinatesY() - this.getCoordinatesY())) {
                            return false;
                        }
                    }
                }
            }
        }

        for (Piece piece : board.getPieces()) {
            if (x == piece.getCoordinatesX() && y == piece.getCoordinatesY()) {
                if (piece.getColor().equals(this.getColor())) {
                    return false;
                }
            }
        }
        return true;
    }
}
