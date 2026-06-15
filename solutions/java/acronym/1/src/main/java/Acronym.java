class Acronym {

    String acronym;
    
    Acronym(String phrase) {
        String[] words = phrase.split("[\\s-]+");

        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("[^a-zA-Z]", "");
        }
        
        char[] acronymLetters = new char[words.length];
        for (int i = 0; i < words.length; i++) {
            acronymLetters[i] = words[i].charAt(0);
        }
        String acronymLower = new String(acronymLetters);
        acronym = acronymLower.toUpperCase();
    }

    String get() {
        return acronym;
    }

}
