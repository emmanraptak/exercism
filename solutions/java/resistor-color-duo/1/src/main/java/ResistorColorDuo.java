import java.util.*;

class ResistorColorDuo {

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
    
    int value(String[] colors) {
        String firstColor = colors[0];
        String secondColor = colors[1];
        return 10 * colorCodeMap.get(firstColor) + colorCodeMap.get(secondColor);
    }
}