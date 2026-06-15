class ReverseString {

    String reverse(String inputString) {
        char[] inputStringChars = inputString.toCharArray();
        char[] reversedStringChars = new char[inputString.length()];

        for (int i =0; i < inputString.length(); i++) {
            reversedStringChars[i] = inputStringChars[inputString.length()-1-i];
        }

        String reversedString = new String(reversedStringChars);
        
        return reversedString;
    }
  
}
