public class Lasagna {
    
    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int minsElapsed) {
        return expectedMinutesInOven() - minsElapsed;
    }
    
    public int preparationTimeInMinutes(int layers) {
        return 2 * layers;
    }
    
    public int totalTimeInMinutes(int layers, int ovenMins) {
        int elapsedTime = preparationTimeInMinutes(layers) + ovenMins;
        return elapsedTime;
    }
}
