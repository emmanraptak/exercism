public class Lasagna {
    
    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int minsElapsed) {
        return 40 - minsElapsed;
    }
    
    public int preparationTimeInMinutes(int layers) {
        return 2 * layers;
    }
    
    public int totalTimeInMinutes(int layers, int minsElapsed) {
        int elapsedTime = preparationTimeInMinutes(layers) + minsElapsed;
        return elapsedTime;
    }
}
