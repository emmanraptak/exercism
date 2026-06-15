import java.util.*;

class RnaTranscription {

    HashMap<Character, Character> DNAtoRNA = new HashMap<>();

    public RnaTranscription() {
        DNAtoRNA.put('G', 'C');
        DNAtoRNA.put('C', 'G');
        DNAtoRNA.put('T', 'A');
        DNAtoRNA.put('A', 'U');
    }
    
    String transcribe(String dnaStrand) {
        char[] dnaStrandChars = dnaStrand.toCharArray();
        char[] rnaStrandChars = new char[dnaStrandChars.length];
        for (int i = 0; i < dnaStrandChars.length; i++) {
            rnaStrandChars[i] = DNAtoRNA.get(dnaStrandChars[i]);
        }
        String rnaStrand = new String(rnaStrandChars);
        return rnaStrand;
    }

}
