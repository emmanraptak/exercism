class PrimeCalculator {

    int nth(int nth) {

        if (nth < 1) {
            throw new IllegalArgumentException("Can only get nth prime number for positive n!");
        }
        
        int currentNumber = 1;
        int lastPrime = 0;
        
        while (lastPrime < nth) {
            currentNumber++;
            if (isPrime(currentNumber)) {
                lastPrime++;
            }
        }
        return currentNumber;
    }

    boolean isPrime(int n) {
        int maxPossibleFactor = (int) (n / 2) + 1;
        for (int i = 2; i < maxPossibleFactor; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
}
