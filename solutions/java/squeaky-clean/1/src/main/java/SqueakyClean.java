class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder strBuilder = new StringBuilder();
        char[] asArray = identifier.toCharArray();
        
        for (int i = 0; i < identifier.length(); i++) {
            if (Character.isWhitespace(asArray[i])) {
                strBuilder.append('_');
            } else if (asArray[i] == '-') {
                strBuilder.append(Character.toUpperCase(asArray[++i]));           
            } else if (Character.isLetter(asArray[i]) || Character.isDigit(asArray[i])) {
                switch(asArray[i]) {
                    case '4':
                        strBuilder.append('a');
                        break;
                    case '3':
                        strBuilder.append('e');
                        break;
                    case '0':
                        strBuilder.append('o');
                        break;
                    case '1':
                        strBuilder.append('l');
                        break;
                    case '7':
                        strBuilder.append('t');
                        break;
                    default:
                        strBuilder.append(asArray[i]);
                        break;
                }
            }
        }
        return strBuilder.toString();
    }
}
