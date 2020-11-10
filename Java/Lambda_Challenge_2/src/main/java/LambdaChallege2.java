import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class LambdaChallege2 {
    public static void main(String[] args){

        List<String> topNames2015 = Arrays.asList(
                "Amelia",
                "Olivia",
                "emily",
                "Isla",
                "Ava",
                "oliver",
                "Jack",
                "Charlie",
                "harry",
                "Jacob"
        );

        // Sort and make the firstLetter as caps
        topNames2015.stream().map(element -> element.substring(0,1).toUpperCase() + element.substring(1))
                .sorted()
                .forEach(System.out::println);
        long result = topNames2015.stream().map(element -> element.substring(0,1).toUpperCase() + element.substring(1))
                .filter(name -> name.startsWith("A"))
                .count();
        System.out.println(result);
    }
}
