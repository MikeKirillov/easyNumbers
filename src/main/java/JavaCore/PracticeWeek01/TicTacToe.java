package JavaCore.PracticeWeek01;

import java.util.Arrays;

public class TicTacToe {// task11
    int x, y;
    String[][] board;
    String currentPlayer, a = "X", b = "0", c = "-";

    public TicTacToe() {
        newGame();
    }

    void newGame() {
        board = new String[][]{{c, c, c}, {c, c, c}, {c, c, c}};
        currentPlayer = a;
    }

    String[][] getField() {
        return board;
    }

    String makeMove(int x, int y) {
        int i = x - 1;
        int j = y - 1;

        String check = this.checkGame();// checking board

        // checking for game ending
        if (check != null) return "Game was ended";

        // checking for game ending
        if (!board[i][j].equals(c)) return "Cell " + x + "," + y + " is already occupied";

        board[i][j] = currentPlayer;// replace X with 0 or 0 with X
        check = checkGame();// checking board

        if (check != null) {// checking for winner
            if (check.equals(a)) return "Player X won";
            else if (check.equals(b)) return "Player 0 won";
            else return "Drawn";
        }

        if (currentPlayer.equals(a)) currentPlayer = b;
        else currentPlayer = a;
        return "Move completed";
    }

    String checkGame() {
//        boolean check = true;
        for (int i = 0; i < this.board.length; i++) {// check for triple X in a row
            boolean check = true;
            for (int j = 0; j < this.board.length; j++) {
                if (board[i][j].equals(b) || board[i][j].equals(c)) check = false;
            }
            if (check) return a;
        }

        for (int i = 0; i < this.board.length; i++) {// check for triple 0 in a row
            boolean check = true;
            for (int j = 0; j < this.board.length; j++) {
                if (board[i][j].equals(a) || board[i][j].equals(c)) check = false;
            }
            if (check) return b;
        }

        for (int i = 0; i < this.board.length; i++) {// check for triple X in a column
            boolean check = true;
            for (int j = 0; j < this.board.length; j++) {
                if (board[j][i].equals(b) || board[j][i].equals(c)) check = false;
            }
            if (check) return a;
        }

        for (int i = 0; i < this.board.length; i++) {// check for triple 0 in a column
            boolean check = true;
            for (int j = 0; j < this.board.length; j++) {
                if (board[j][i].equals(a) || board[j][i].equals(c)) check = false;
            }
            if (check) return b;
        }

        // checking diagonals
        String[] diagonalOne = new String[]{board[0][0], board[1][1], board[2][2]};
        String[] diagonalTwo = new String[]{board[0][2], board[1][1], board[2][0]};

        boolean check = true;
        for (int i = 0; i < diagonalOne.length; i++) {
            if (diagonalOne[i].equals(b) || diagonalOne[i].equals(c)) check = false;
        }
        if (check) return a;
        else {
            check = true;
            for (int i = 0; i < diagonalOne.length; i++) {
                if (diagonalOne[i].equals(a) || diagonalOne[i].equals(c)) check = false;
            }
            if (check) return b;
        }

        check = true;
        for (int i = 0; i < diagonalTwo.length; i++) {
            if (diagonalTwo[i].equals(a) || diagonalTwo[i].equals(c)) check = false;
        }
        if (check) return b;
        else {
            check = true;
            for (int i = 0; i < diagonalTwo.length; i++) {
                if (diagonalTwo[i].equals(b) || diagonalTwo[i].equals(c)) check = false;
            }
            if (check) return a;
        }
// draw
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j].equals(c)) return null;
            }
        }
        return "DRAW";
    }

    public static void main(String[] args) {
        TicTacToe board = new TicTacToe();
        System.out.println(board.makeMove(1, 1));
        System.out.println(Arrays.deepToString(board.getField()));
        System.out.println(board.makeMove(1, 1));
        System.out.println(Arrays.deepToString(board.getField()));
        System.out.println(board.makeMove(1, 2));
        System.out.println(Arrays.deepToString(board.getField()));
        System.out.println(board.makeMove(2, 1));
        System.out.println(Arrays.deepToString(board.getField()));
        System.out.println(board.makeMove(2, 2));
        System.out.println(Arrays.deepToString(board.getField()));
        System.out.println(board.makeMove(3, 1));
        System.out.println(Arrays.deepToString(board.getField()));
        System.out.println(board.makeMove(2, 2));
    }
}
