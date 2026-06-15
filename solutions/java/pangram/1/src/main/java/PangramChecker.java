import java.util.stream.Collectors;
import java.util.*;

public class PangramChecker {

    public boolean isPangram(String input) {

        // Extract all the irrelevant characters
        // e.g. whitespace and punctuation
        String sentence = input.replaceAll("[^a-zA-Z]", "");
        sentence = sentence.toLowerCase();

        // Create a set of the distinct characters
        Set<Character> distinctChars = sentence.chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.toSet());
        
        return distinctChars.size() == 26;
    }

}
