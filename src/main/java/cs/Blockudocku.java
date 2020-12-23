package cs;

public class Blockudocku {
    int [][] board;
    Boolean gameOver = false;
    enum Piece {
        A, B, C, D, E, F, G, H
    }

    public Blockudocku(){
        board = new int[9][9];
    }

    public void placeA(int x, int y){
        board[y][x] = 1;
        board[y+1][x] = 1;
        board[y+2][x] = 1;
        board[y+2][x+1] = 1;
        board[y+2][x+2] = 1;
    }

    public void placeB(int x, int y){
        board[y][x] = 1;
        board[y][x-1] = 1;
        board[y][x-2] = 1;
        board[y+1][x] = 1;
        board[y+2][x] = 1;
    }

    public void placeC(int x, int y){
        board[y][x] = 1;
        board[y][x-1] = 1;
        board[y][x-2] = 1;
    }

    public void placeD(int x, int y){
        board[y][x] = 1;
        board[y+1][x] = 1;
        board[y+2][x] = 1;
    }
    public void placeE(int x, int y){
        board[y][x] = 1;
        board[y+1][x] = 1;
        board[y+2][x-1] = 1;
        board[y+2][x] = 1;
        board[y+2][x+1] = 1;
    }

    public void placeF(int x, int y){
        board[y][x] = 1;
        board[y][x-1] = 1;
        board[y][x-2] = 1;
        board[y+1][x-1] = 1;
        board[y+2][x-1] = 1;
    }

    public void placeG(int x, int y){
        board[y][x] = 1;
        board[y+1][x] = 1;
        board[y+2][x] = 1;
        board[y+2][x+1] = 1;
    }

    public void placeH(int x, int y){
        board[y][x] = 1;
        board[y][x-1] = 1;
        board[y+1][x-1] = 1;
        board[y+2][x-1] = 1;
    }



    public Boolean validatePlacement(Piece piece, int x, int y) {
        switch (piece) {
            case A:
                return board[y][x] != 1 && board[y+1][x] != 1 && board[y+2][x] != 1 && board[y+2][x+1] != 1 && board[y+2][x+2] != 1;

            case B:
                return board[y][x] != 1 && board[y][x-1] != 1 && board[y][x-2] != 1 && board[y+1][x] != 1 && board[y+2][x] != 1;

            case C:
                return board[y][x] != 1 && board[y][x-1] != 1 && board[y][x-2] != 1;

            case D:
                return board[y][x] != 1 && board[y+1][x] != 1 && board[y+2][x] != 1;

            case E:
                return board[y][x] != 1 && board[y+1][x] != 1 && board[y+2][x-1] != 1 && board[y+2][x] != 1 && board[y+2][x+1] != 1;

            case F:
                return board[y][x] != 1 && board[y][x-1] != 1 && board[y][x-2] != 1 && board[y+1][x-1] != 1 && board[y+2][x-1] != 1;

            case G:
                return board[y][x] != 1 && board[y+1][x] != 1 && board[y+2][x] != 1 && board[y+2][x+1] != 1;

            case H:
                return board[y][x] != 1 && board[y][x-1] != 1 && board[y+1][x-1] != 1 && board[y+2][x-1] != 1;
        }
        return false;
    }

    public Boolean placePiece(Piece piece, int x, int y) {
        if (Boolean.FALSE.equals(validatePlacement(piece, x, y))) return false;

        switch (piece) {
            case A:
                placeA(x, y);
                break;
            case B:
                placeB(x, y);
                break;
            case C:
                placeC(x, y);
                break;
            case D:
                placeD(x, y);
                break;
            case E:
                placeE(x, y);
                break;
            case F:
                placeF(x, y);
                break;
            case G:
                placeG(x, y);
                break;
            case H:
                placeH(x, y);
                break;
        }
        return true;
    }
}
