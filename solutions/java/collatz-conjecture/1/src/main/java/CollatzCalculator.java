class CollatzCalculator {

    int computeStepCount(int start) {
        int numSteps = 0;
        int current = start;

        if (start < 1) {
            throw new IllegalArgumentException("Only positive integers are allowed");
        }
        
        while (current != 1) {
            numSteps++;
            if (current % 2 == 0) {
                current = current / 2;
            } else {
                current = 3 * current + 1;
            }
        }
        
        return numSteps;
    }

}
