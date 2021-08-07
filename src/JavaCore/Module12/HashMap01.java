package JavaCore.Module12;

import java.util.*;

public class HashMap01 {
    // 1st way to declare HashMap
    Map<String, String> map1 = new HashMap<>();// creates an empty set with hashMap inside with
    // default value length - 16
    // and 0.75 load factor (coefficient of filling)

    // 2nd way to declare HashMap
    Map<String, String> map2 = new HashMap<>(25);// creates an empty set with hashMap inside with
    // manual declared value of length - 25
    // and 0.75 load factor (coefficient of filling)

    // 3rd way to declare HashMap
    // Map<String, String > map3 = new HashMap(25, 0.9);// creates an empty set with hashMap inside with
    // manual declared value of length - 25
    // and 0.9 manual declared value of load factor (coefficient of filling)

    // 4th way to declare HashMap
    Map<String, String> map4 = new HashMap<>();// creating collection

//    map4.put("father","Sam");
//    map4.put("mother","Mary");
//    map4.put("brother","Mike");
//    map4.put("uncle","Alex");
//    map4.put("brother","Dmitri");

    Map<String, String> meMap = new HashMap<>(map4);// create set with values of 1st created collection inside

}
