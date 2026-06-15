class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {

        String stringOfNumber = Integer.toString(numberToCheck);
        char[] digitsOfNumber = stringOfNumber.toCharArray();

        int result = 0;
        int lengthOfNumber = stringOfNumber.length();

        for (int i = 0; i < lengthOfNumber; i++) {
            result += Math.pow(Character.getNumericValue(digitsOfNumber[i]), lengthOfNumber);
        }
        
        return result == numberToCheck;
    }

}
