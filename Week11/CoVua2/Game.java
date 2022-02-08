import java.util.ArrayList;

public class Game {
    private Board board;
    private ArrayList<Move> moveHistory = new ArrayList<>();

    public Game(Board board) {
        this.board = board;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public ArrayList<Move> getMoveHistory() {
        return moveHistory;
    }

    /** An especially short bit of Javadoc. */
    public void movePiece(Piece piece, int x, int y) {
        if (piece.canMove(board, x, y)) {
            if (board.getAt(x, y) == null) {
                moveHistory.add(new Move(piece.getCoordinatesX(),
                        piece.getCoordinatesY(), x, y, piece));
                piece.setCoordinatesX(x);
                piece.setCoordinatesY(y);
            } else {
                moveHistory.add(new Move(piece.getCoordinatesX(),
                        piece.getCoordinatesY(), x, y, piece, board.getAt(x, y)));
                board.removeAt(x, y);
                piece.setCoordinatesX(x);
                piece.setCoordinatesY(y);
            }
        } else {
            System.out.println("Can't move");
        }
    }

}
