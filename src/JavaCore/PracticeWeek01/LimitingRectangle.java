package JavaCore.PracticeWeek01;

public class LimitingRectangle {// task07
    int[][] points;

    public LimitingRectangle(int[][] points) {
        this.points = points;
    }

    public int minValue(int index) {
        int minValue = 10;
        for (int i = 0; i < points.length; i++) {
            if (points[i][index] <= minValue) {
                minValue = points[i][index];
            }
        }
        return minValue;
    }

    public int maxValue(int index) {
        int maxValue = -10;
        for (int i = 0; i < points.length; i++) {
            if (points[i][index] >= maxValue) {
                maxValue = points[i][index];
            }
        }
        return maxValue;
    }

    public int getWidth() {
        return this.maxValue(0) - this.minValue(0);
    }

    public int getHeight() {
        return this.maxValue(1) - this.minValue(1);
    }

    public String getBorders() {
        return this.minValue(1) + ", " + this.maxValue(1) + ", " + this.minValue(0) + ", " + this.maxValue(0);
    }

    public static void main(String[] args) {
        LimitingRectangle rect = new LimitingRectangle(new int[][]{{-1, -2}, {3, 4}});
        System.out.println(rect.getWidth() + ", " + rect.getHeight());
        System.out.println(rect.getBorders());
    }
}

