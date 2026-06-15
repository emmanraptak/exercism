import java.util.ArrayList;

class NaturalNumber {

    Classification classification;
    
    NaturalNumber(int number) {

        if (number <= 0) {
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }
        
        // Identify prime factors
        ArrayList<Integer> pFactors = primeFactors(number);

        // Compute aliquot sum
        int aliquotSum = 0;
        for (Integer factor : pFactors) {
            aliquotSum += factor;
        }

        // Classify number
        if (number == aliquotSum) {
            classification = Classification.PERFECT;
        } else if (number < aliquotSum) {
            classification = Classification.ABUNDANT;
        } else {
            classification = Classification.DEFICIENT;
        }
    }

    private ArrayList<Integer> primeFactors(int number) {
        ArrayList<Integer> factors = new ArrayList<Integer>();
        int maxNumberToCheck = (int) (number / 2);
        for (int i = 1; i < maxNumberToCheck + 1; i++) {
            if (number % i == 0) {
                factors.add(i);
            }
        }
        return factors;
    }

    Classification getClassification() {
        return classification;
    }
}
