package JavaCore.Module11;

public class IOUB {
    public static void main(String[] args) {
        int[] array = {1, 2, -1, 5, 3};
        int s = 0, i;

        for (i = 0; i <= array.length; i++) {// must be '<' but not '<='
            s = s + array[i];
        }
        System.out.println(s);
    }
}