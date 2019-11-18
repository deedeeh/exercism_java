import java.lang.reflect.Array;

public class PigLatinTranslator {
    private String pigLatin;

    String translate(String word) {
        if(word.matches("^[aeiou].*")
                || word.startsWith("xr")
                || word.startsWith("yt")) {
            pigLatin = word.concat("ay");
        } else if(word.matches("^[^aeiou].*")) {
            char firstLetter = word.charAt(0);
            pigLatin = word.substring(1).concat(firstLetter + "ay");
        }
        if(word.startsWith("ch")
                || word.startsWith("qu")
                || word.startsWith("th")) {
            String firstTwoLetters = word.substring(0, 2);
            pigLatin = word.substring(2).concat(firstTwoLetters + "ay");
        }
        if(word.matches("^[^aeiou]qu.*")
                || word.startsWith("thr")
                || word.startsWith("sch")) {
            String firstThreeLetters = word.substring(0, 3);
            pigLatin = word.substring(3).concat(firstThreeLetters + "ay");
        } else if(word.matches("^[^aeiou]+y.*")) {
            int endIndex = word.indexOf("y");
            String firstLetters = word.substring(0, endIndex);
            pigLatin = word.substring(endIndex).concat(firstLetters + "ay");
        }
        if(word.matches(".*\\s.*")) {
            String[] words = word.split("\\s+");
            for(int i = 0; i <= words.length; i++) {
                String translated = translate(words[i]);
            }
        }
        return pigLatin;
    }
}
