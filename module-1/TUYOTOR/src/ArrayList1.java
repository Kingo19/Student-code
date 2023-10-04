import java.util.*;
public class ArrayList1 {
    public static void main(String[] args) {
//        PRINTS OUT WITH THE VALUES AND INDEX

        ArrayList<String> king = new ArrayList<String>();
//        ADDING THE VALUE.
        king.add("Cloth");
        king.add("Shoes");
        king.add("Colognes");
        king.add("Accesories");

//        GETTING THE VALUE.

        System.out.println(king.get(2));

//        MODIFYING THE VALUE.
        king.set(3, "Watches");
        System.out.println(king.get(3));

//        REMOVING THE VALUE.
        king.remove(1);  // WE CAN ALSO REMOVE WITH THE INDEX.
        king.remove("Shoes");
        System.out.println(king.get(1));

//        GETTING SIZE OF THE ELEMENT.

        System.out.println(king.size());

//        DOING IT AS A LOOP.

        for (String kingList: king) {
            System.out.println(kingList);
        }




    }
        }
