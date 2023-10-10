import java.util.*;
public class Map1 {
    public static void main(String[] args) {

//        PRINTS OUT WITH THE KEY AND VALUE.
//        FOR A VALUE WE MUST HAVE ONLY ONE KEY.

        Map <Integer, String> yotor = new HashMap<Integer, String>();
        yotor.put(1, "Addis Ababa");
        yotor.put(2, "Kombolcha");
        yotor.put(3, "Bahirdar");
        yotor.put(4, "Mekelle");

//        TO GET THE WITH THE KEY "NOT INDEX!!!"
        System.out.println(yotor.get(2));

//        TO REMOVE WITH THE KEY "NOT INDEX!!!"

        yotor.remove(3);
        System.out.println(yotor.get(3));

//      CONTAINS VALUE AND KEY "BOOLEAN"
        System.out.println(yotor.containsKey(8));

        //      CONTAINS VALUE AND VALUE "BOOLEAN"
        System.out.println(yotor.containsValue("WELKITE"));

//        CONTAINS SIZE
        System.out.println(yotor.size());

//        PRINTING ONLY THE VALUE AND KEY
        System.out.println(yotor.values());
        System.out.println(yotor.keySet());

//        DOING IT WITH A LOOP.
        for (Map.Entry<Integer, String> Yotor1: yotor.entrySet()) {
            int key = Yotor1.getKey();
            String value = Yotor1.getValue();
            System.out.println(key + "- " + value);
        }
    }

}
