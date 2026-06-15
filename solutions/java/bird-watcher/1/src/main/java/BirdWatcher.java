
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        int[] birdsLastWeek = new int[] {0, 2, 5, 3, 7, 8, 4};
        return birdsLastWeek;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1] = getToday() + 1;
    }

    public boolean hasDayWithoutBirds() {
        for (int birdCounts : birdsPerDay) {
            if (birdCounts == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int birdCount = 0;
        for (int i = 0; i < Math.min(numberOfDays, birdsPerDay.length); i++) {
            birdCount += birdsPerDay[i];
        }
        return birdCount;
    }

    public int getBusyDays() {
        int numBusyDays = 0;
        for (int birdCounts : birdsPerDay) {
            if (birdCounts >= 5) {
                numBusyDays++;
            }
        }
        return numBusyDays;
    }
}
