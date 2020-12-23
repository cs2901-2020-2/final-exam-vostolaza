package cs;

public class Blockudocku {
    int [][] board;
    Boolean gameOver = false;
    int points = 0;
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
        boolean res = false;
        switch (piece) {
            case A:
                res = board[y][x] != 1 && board[y+1][x] != 1 && board[y+2][x] != 1 && board[y+2][x+1] != 1 && board[y+2][x+2] != 1;
                break;
            case B:
                res = board[y][x] != 1 && board[y][x-1] != 1 && board[y][x-2] != 1 && board[y+1][x] != 1 && board[y+2][x] != 1;
                break;
            case C:
                res = board[y][x] != 1 && board[y][x-1] != 1 && board[y][x-2] != 1;
                break;
            case D:
                res = board[y][x] != 1 && board[y+1][x] != 1 && board[y+2][x] != 1;
                break;
            case E:
                res = board[y][x] != 1 && board[y+1][x] != 1 && board[y+2][x-1] != 1 && board[y+2][x] != 1 && board[y+2][x+1] != 1;
                break;
            case F:
                res = board[y][x] != 1 && board[y][x-1] != 1 && board[y][x-2] != 1 && board[y+1][x-1] != 1 && board[y+2][x-1] != 1;
                break;
            case G:
                res = board[y][x] != 1 && board[y+1][x] != 1 && board[y+2][x] != 1 && board[y+2][x+1] != 1;
                break;
            case H:
                res = board[y][x] != 1 && board[y][x-1] != 1 && board[y+1][x-1] != 1 && board[y+2][x-1] != 1;
                break;
        }
        return res;
    }

    public void validateHorizontal(){
        for (int i = 0; i < 9; i++){
            boolean line = true;
            for (int j = 0; j < 9; j++){
                if (board[i][j] == 0){
                    line = false;
                    break;
                }
            }
            if (line)
                points += 120;
        }
    }

    public void validateVertical(){
        for (int i = 0; i < 9; i++){
            boolean line = true;
            for (int j = 0; j < 9; j++){
                if (board[j][i] == 0){
                    line = false;
                    break;
                }
            }
            if (line)
                points += 120;
        }
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
