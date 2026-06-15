import java.util.*;
import java.util.stream.Collectors;

class ResistorColor {

    Map<String, Integer> colorCodeMap = new HashMap<String, Integer>() {{
        put("black", 0);
        put("brown", 1);
        put("red", 2);
        put("orange", 3);
        put("yellow", 4);
        put("green", 5);
        put("blue", 6);
        put("violet", 7);
        put("grey", 8);
        put("white", 9);
    }};
    
    
    int colorCode(String color) {

        if (colorCodeMap.containsKey(color)) {
            return colorCodeMap.get(color);
        } else {
                throw new IllegalArgumentException(
                    "Error: " + color + " is not a valid resistor colour");
        }
    }

    String[] colors() {
        List<String> sortedKeys = colorCodeMap.entrySet().stream()
            .sorted(Map.Entry.comparingByValue())
            .map(Map.Entry::getKey)
            .collect(Collectors.toList());
        return sortedKeys.toArray(new String[0]);
    }
}
