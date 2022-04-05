package JavaCore.Module34;

public class EmptySheet {
    String x = "qqq";
    String y = "qqq";

    public static void main(String[] args) {
        EmptySheet sheet = new EmptySheet();

        String z = sheet.getMsg(sheet.x, sheet.y);

        System.out.print("x + y = " + z);
    }

    private String getMsg(String q, String w) {
        if (q.equals(w)) {
            return q.concat(w);
        } else return null;
    }
}
