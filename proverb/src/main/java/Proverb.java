class Proverb {
    private String[] words;
    private String sentence = "";

    Proverb(String[] words) {
        this.words = words;
    }

    String recite() {
        if(words.length <= 1) {
            for(String word : words) {
                sentence = String.format("And all for the want of a %s.", word);
            }
        } else {
            for(int i = 0; i < words.length - 1; i++) {
                sentence += String.format("For want of a %s the %s was lost.\n",
                        words[i],
                        words[i + 1]);
            }
            sentence += String.format("And all for the want of a %s.", words[0]);
        }
        return sentence;
    }
}
