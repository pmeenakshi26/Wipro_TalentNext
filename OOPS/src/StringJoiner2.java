
import java.util.StringJoiner;

public class StringJoiner2 {
    public static void main(String[] args) {
        // Create first StringJoiner with hyphen separator
        StringJoiner s1 = new StringJoiner("-");
        s1.add("Delhi");
        s1.add("Mumbai");

        // Create second StringJoiner with hyphen separator
        StringJoiner s2 = new StringJoiner("-");
        s2.add("Chennai");
        s2.add("Kolkata");

        // i) s1 merged to s2
        StringJoiner merged1 = new StringJoiner("-");
        merged1.merge(s2); // add s2 first
        merged1.merge(s1); // then s1
        System.out.println("s1 merged to s2: " + merged1);

        // ii) s2 merged to s1
        StringJoiner merged2 = new StringJoiner("-");
        merged2.merge(s1); // add s1 first
        merged2.merge(s2); // then s2
        System.out.println("s2 merged to s1: " + merged2);
    }
}