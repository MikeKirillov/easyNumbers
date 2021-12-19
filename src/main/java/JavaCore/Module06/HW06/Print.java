package JavaCore.Module06.HW06;

public class Print {
    public void print(int haha) {
        System.out.println(haha);
    }

    public void print(String haha) {
        System.out.println(haha);
    }

    public void print(int[] haha) {
        StringBuilder sb = new StringBuilder();
        for (int j : haha) {
            sb.append(j).reverse().append(" ");
        }
        System.out.println(sb);
    }

    public void print(String[] haha) {
        StringBuilder sb = new StringBuilder();
        for (String s : haha) {
            sb.append(s).append(" ");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        Print print = new Print();
        print.print(10);
        print.print("SALAM");
        print.print(new int[]{1,2,3});
        print.print(new String[]{"13","41"});
    }
}
