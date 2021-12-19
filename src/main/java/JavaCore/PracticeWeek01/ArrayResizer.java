package JavaCore.PracticeWeek01;

import java.util.Arrays;

public class ArrayResizer {// task09
    public static void main(String[] args) {
        ToTable toTable = new ToTable(new int[]{1, 2, 3, 4, 5, 6}, 3, 2);
        int[][] ttArray = toTable.resize();
        System.out.println(Arrays.deepToString(ttArray));

        ToLine toLine = new ToLine(new int[][]{{1, 2}, {3, 4}, {5, 6}});
        int[] tlArray = toLine.resize();
        System.out.println(Arrays.toString(tlArray));
    }
}

class ToTable {
    int[] data;
    int x, y;

    public ToTable(int[] data, int x, int y) {
        this.data = data;
        this.x = x;
        this.y = y;
    }

    public int[][] resize() {
        int[][] ttArr = new int[x][y];
        int iterator = 0;// index counter for data array
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                ttArr[i][j] = data[iterator];
                iterator++;
            }
        }
        return ttArr;
    }
}

class ToLine {
    int[][] data;

    public ToLine(int[][] data) {
        this.data = data;
    }

    public int[] resize() {
        int[] tlArr = new int[data.length * data[0].length];
        for (int i = 0; i < data.length; i++) {
//            for (int j = 0; j < data.length - 1; j++) {
//                tlArr[i * data[i].length + j] = data[i][j];
//            }
            System.arraycopy(data[i], 0, tlArr, i * data[i].length, data.length - 1);
        }
        return tlArr;
    }
}
