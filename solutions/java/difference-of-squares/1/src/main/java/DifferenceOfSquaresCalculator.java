class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        int sum = (int) (0.5 * input * (input + 1));
        return (int) Math.pow(sum, 2);
    }

    int computeSumOfSquaresTo(int input) {
        int sum = 0;
        for (int i = 1; i < input + 1; i++) {
            sum += (int) Math.pow(i, 2);
        }
        return sum;
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

}
