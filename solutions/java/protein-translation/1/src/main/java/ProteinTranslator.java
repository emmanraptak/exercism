import java.util.List;
import java.util.ArrayList;
import java.util.LinkedHashMap;

class ProteinTranslator {

    LinkedHashMap<String, String> proteinDict = new LinkedHashMap();

    public ProteinTranslator() {
        proteinDict.put("AUG", "Methionine");
        
        proteinDict.put("UUU", "Phenylalanine");
        proteinDict.put("UUC", "Phenylalanine");

        proteinDict.put("UUA", "Leucine");
        proteinDict.put("UUG", "Leucine");

        proteinDict.put("UCU", "Serine");
        proteinDict.put("UCC", "Serine");
        proteinDict.put("UCA", "Serine");
        proteinDict.put("UCG", "Serine");

        proteinDict.put("UAU", "Tyrosine");
        proteinDict.put("UAC", "Tyrosine");

        proteinDict.put("UGU", "Cysteine");
        proteinDict.put("UGC", "Cysteine");

        proteinDict.put("UGG", "Tryptophan");

        proteinDict.put("UAA", "STOP");
        proteinDict.put("UAG", "STOP");
        proteinDict.put("UGA", "STOP");
    }
    
    List<String> translate(String rnaSequence) {
        
        ArrayList<String> aminoAcids = new ArrayList<String>();
        String[] codons = rnaSequence.split("(?<=\\G.{" + 3 + "})");
        
        for (int i = 0; i < codons.length; i++) {

            String codon = codons[i];

            // Break if the string is empty
            if (codon.equals("")) break;

            // Raise exception if the codon is invalid
            if (!proteinDict.containsKey(codon)) {
                throw new IllegalArgumentException("Invalid codon");
            }

            String currentAminoAcid = proteinDict.get(codon);
            
            if (currentAminoAcid.equals("STOP")) {
                break;
            } else {
                aminoAcids.add(currentAminoAcid);
            }
        }
        return aminoAcids;
    }
}


