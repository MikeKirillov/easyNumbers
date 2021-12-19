package JavaCore.Module07;

import java.util.Arrays;
import java.util.Comparator;

public class Sorting {
    public static void main(String[] args) {
        String[] arrays = {"баркас", "елка", "ёлка", "баржа", "арбузы", "тыква", null};
//        Arrays.sort(arrays);

//        ComparatorByLength comp = new ComparatorByLength(); // look at alternate view
//        Arrays.sort(arrays, comp);

        Arrays.sort(arrays, new ComparatorByLength());// alternate view
        System.out.println(Arrays.toString(arrays));
    }
}

class ComparatorByLength implements Comparator<String> {

    @Override
    public int compare(String arg0, String arg1){
        if (arg0 == null) return 1;
        if (arg1 == null) return -1;
        return arg0.length() - arg1.length();
    }
}