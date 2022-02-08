import java.util.ArrayList;

public class Board {
    public static final int WIDTH = 8;

    public static final int HEIGHT = 8;

    private ArrayList<Piece> pieces = new ArrayList<>();

    public Board() {
    }

    /** An especially short bit of Javadoc. */
    public boolean validate(int x, int y) {
        if (1 <= x && x <= 8 && y <= 8 && 1 <= y) {
            return true;
        }
        return false;
    }

    /** An especially short bit of Javadoc. */
    public void addPiece(Piece piece) {
        boolean check = true;
        for (int i = 0; i < this.pieces.size(); i++) {
            if (this.pieces.get(i).checkPosition(piece)) {
                check = false;
                break;
            }
        }
        if (check) {
            this.pieces.add(piece);
        }
    }

    public ArrayList<Piece> getPieces() {
        return pieces;
    }

    public void setPieces(ArrayList<Piece> pieces) {
        this.pieces = pieces;
    }

    /** An especially short bit of Javadoc. */
    public Piece getAt(int x, int y) {
        if (1 <= x && 1 <= y && x <= 8 && y <= 8) {
            for (int i = 0; i < this.pieces.size(); i++) {
                if (this.pieces.get(i).getCoordinatesX() == x
                        && this.pieces.get(i).getCoordinatesY() == y) {
                    return this.pieces.get(i);
                }
            }
        }
        return null;
    }

    /** An especially short bit of Javadoc. */
    public void removeAt(int x, int y) {
        if (1 <= x && x <= 8 && y <= 8 && 1 <= y) {
            for (int i = 0; i < this.pieces.size(); i++) {
                if (this.pieces.get(i).getCoordinatesX() == x
                        && this.pieces.get(i).getCoordinatesY() == y) {
                    this.pieces.remove(this.pieces.get(i));
                    break;
                }
            }
        }
    }

}
