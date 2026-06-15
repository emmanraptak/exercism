import java.util.*;

class ResistorColorTrio {

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
    
    String label(String[] colors) {
        
        String firstColor = colors[0];
        String secondColor = colors[1];
        String thirdColor = colors[2];
        long baseResistance = (10 * colorCodeMap.get(firstColor) + colorCodeMap.get(secondColor)) * (long) Math.pow(10,colorCodeMap.get(thirdColor));
        
        if (baseResistance >= (int) Math.pow(10,9)) {
            long resistance = baseResistance / (long) Math.pow(10,9);
            return resistance + " gigaohms";
        } else if (baseResistance >= (int) Math.pow(10,6)) {
            long resistance = baseResistance / (long) Math.pow(10,6);
            return resistance + " megaohms";
        } else if (baseResistance >= (int) Math.pow(10,3)) {
            long resistance = baseResistance / (long) Math.pow(10,3);
            return resistance + " kiloohms";
        } else {
            return baseResistance + " ohms";   
        }
    }
}
