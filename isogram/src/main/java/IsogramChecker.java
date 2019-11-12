class IsogramChecker {

    boolean isIsogram(String phrase) {
        String updatedPhrase = phrase.toLowerCase().replaceAll("[\\s-]", "");
        for (char letter : updatedPhrase.toCharArray()) {
            for (int i = updatedPhrase.indexOf(letter) + 1; i < updatedPhrase.length(); i++) {
                if (letter == updatedPhrase.charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }
}
