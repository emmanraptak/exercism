class NeedForSpeed {

    private int speed;
    private int distance = 0;
    private int batteryDrain;
    private int batteryPercent = 100;
    private int maxDistance;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.maxDistance = (batteryPercent / batteryDrain) * speed;
    }

    public boolean batteryDrained() {
        return batteryPercent < batteryDrain;
    }

    public int distanceDriven() {
        return distance;
    }

    public int maxDistance() {
        return maxDistance;
    }

    public void drive() {
        if (batteryPercent >= batteryDrain) {
            batteryPercent -= batteryDrain;
            distance += speed;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {

    private int distance;
    
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        return car.maxDistance() >= distance;
    }
}
