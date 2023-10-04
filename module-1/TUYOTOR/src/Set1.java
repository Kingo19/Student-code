import java.util.HashSet;
import java.util.Set;

public class Set1 {
    public static void main(String[] args) {

//        ALL THE SAME CONCEPT WITH ARRAY LIST EXCEPT REPEAT IN THE CONDITION.

        Set<String> days = new HashSet<String>();
            days.add("Monday");
            days.add("Tuesday");
            days.add("Wednesday");
            days.add("Thursday");
            days.add("Friday");
            days.add("Saturday");
            days.add("Sunday");

//            We ONLY access the values only with their ACTUAL VALUES "NOT INDEX LIKE ARRAY LIST"

        System.out.println(days.contains("March"));


    }
}
