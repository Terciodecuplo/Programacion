public class MixedChess {

    static final char L_UPPER_CORNER = '\u250C';
    static final char R_UPPER_CORNER = '\u2510';
    static final char L_BOT_CORNER = '\u2514';
    static final char R_BOT_CORNER = '\u2518';
    static final char HORIZONTAL_LINE = '\u2500';
    static final char VERTICAL_LINE = '\u2502';
    static final char FIRST_ROW_INTERSECTION = '\u252C';
    static final char LAST_ROW_INTERSECTION = '\u2534';
    static final char L_MID_INTERSECTION = '\u2524';
    static final char R_MID_INTERSECTION = '\u251C';
    static final char CROSS_INTERSECTION = '\u253C';
    static final char WHITE_SQUARE = '\u2591';
    static final char BLACK_SQUARE = '\u2588';
    static final int COLUMN = 25;
    static final int ROW = 17;

    public static void main(String[] args) {
        char[][] boardChess = new char[ROW][COLUMN];
        fillBoard(boardChess);
        printBoard(boardChess);
    }

    public static void fillBoard(char [][] boardChess){
        for (int i = 0; i < boardChess.length; i++) {
            for(int j = 0; j < boardChess[i].length; j++){
                if(i == 0 && j == 0) {
                    boardChess[i][j] = L_UPPER_CORNER;
                } else if (i == (boardChess.length - 1) && j == (boardChess[i].length - 1)) {
                    boardChess[i][j] = R_BOT_CORNER;
                    boardChess[i][j - 1] = HORIZONTAL_LINE;
                    boardChess[i][j - 2] = HORIZONTAL_LINE;
                } else if (i == 0 && j == (boardChess[i].length - 1)) {
                    boardChess[i][j] = R_UPPER_CORNER;
                    boardChess[i][j - 1] = HORIZONTAL_LINE;
                    boardChess[i][j - 2] = HORIZONTAL_LINE;
                } else if (i == (boardChess.length-1) && j == 0) {
                    boardChess[i][j] = L_BOT_CORNER;
                } else {
                    if ((i % 2) == 0 && j == 0) {
                        boardChess[i][j] = R_MID_INTERSECTION;
                    } else if ((i % 2) == 0 && j == (boardChess[i].length-1)) {
                        boardChess[i][j] = L_MID_INTERSECTION;
                        boardChess[i][j - 1] = HORIZONTAL_LINE;
                        boardChess[i][j - 2] = HORIZONTAL_LINE;
                    } else if ((i % 2) != 0 && (j == 0 || j == boardChess[i].length)) {
                        boardChess[i][j] = VERTICAL_LINE;
                    } else if ((i % 2) != 0 && (j % 3) == 0 && i > 0 && i < (boardChess.length - 1)) {
                        boardChess[i][j] = VERTICAL_LINE;
                        boardChess[i][j - 1] = BLACK_SQUARE;
                        boardChess[i][j - 2] = WHITE_SQUARE;
                    } else if ((i % 2) == 0 && (j % 3) == 0 && i > 0 && i < (boardChess.length - 1)) {
                        boardChess[i][j] = CROSS_INTERSECTION;
                        boardChess[i][j - 1] = HORIZONTAL_LINE;
                        boardChess[i][j - 2] = HORIZONTAL_LINE;
                    } else if (i == 0 && (j % 3) == 0) {
                        boardChess[i][j] = FIRST_ROW_INTERSECTION;
                        boardChess[i][j - 1] = HORIZONTAL_LINE;
                        boardChess[i][j - 2] = HORIZONTAL_LINE;
                    } else if (i == (boardChess.length - 1) && (j % 3) == 0) {
                        boardChess[i][j] = LAST_ROW_INTERSECTION;
                        boardChess[i][j - 1] = HORIZONTAL_LINE;
                        boardChess[i][j - 2] = HORIZONTAL_LINE;
                    }
                }
            }
        }
    }

    public static void printBoard(char[][] boardChess) {
        for (int i = 0; i < boardChess.length; i++) {
            for (int j = 0; j < boardChess[i].length; j++) {
                System.out.print(boardChess[i][j]);
            }
            System.out.println();
        }
    }
}