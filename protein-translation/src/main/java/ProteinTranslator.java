import java.util.ArrayList;
import java.util.List;

class ProteinTranslator {

    List<String> translate(String rnaSequence) {
        List<String> flattedMultipleProteins = new ArrayList<>();
        List<String> translateMultiple = new ArrayList<>();
        if(rnaSequence.length() > 3 && !rnaSequence.startsWith("UAG")) {
            for(int i = 0; i < rnaSequence.length(); i+=3) {
                String codon = rnaSequence.substring(i, i + 3);
                if(codon.equals("UAG") || codon.equals("UAA") || codon.equals("UGA")) break;
                translateMultiple.add(translateCodons(codon).toString());
            }
            for(String singleProtein : translateMultiple) {
                String protein =  singleProtein.substring(1, singleProtein.length() - 1);
                flattedMultipleProteins.add(protein);
            }
            return flattedMultipleProteins;

        }
        return translateCodons(rnaSequence);
    }

    List<String> translateCodons(String rnaSequence) {
        List<String> translated = new ArrayList<>();
        switch(rnaSequence) {
            case "AUG":
                translated.add("Methionine");
                break;
            case "UUU": case "UUC":
                translated.add("Phenylalanine");
                break;
            case "UUA": case "UUG":
                translated.add("Leucine");
                break;
            case "UCU": case "UCC": case "UCA": case "UCG":
                translated.add("Serine");
                break;
            case "UAU": case "UAC":
                translated.add("Tyrosine");
                break;
            case "UGU": case "UGC":
                translated.add("Cysteine");
                break;
            case "UGG":
                translated.add("Tryptophan");
                break;
        }
        return translated;
    }
}