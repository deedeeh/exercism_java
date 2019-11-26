import java.util.ArrayList;
import java.util.List;

class Anagram {
    private String anagram;

    public Anagram(String anagram) {
        this.anagram = anagram;
    }

    public List<String> match(List<String> words) {
        List<String> matchedWords = new ArrayList<>();
        for(String word : words) {
            char[] matcher = word.toLowerCase().toCharArray();
            char[] anagramChars = anagram.toLowerCase().toCharArray();
            for(int i = 0; i < matcher.length; i++) {
                for(int j = 0; j < anagramChars.length; j++) {
                    if(matcher[i] == anagramChars[j]) {
                        matchedWords.add(word);
                    }
                }
            }
        }
        return matchedWords;
    }
}
