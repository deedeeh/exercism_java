import java.util.HashMap;

class TwelveDays {
    private HashMap<Integer, String[]> versesDifferences = new HashMap<>();
    private StringBuilder verses = new StringBuilder();

    private HashMap<Integer, String[]> addDifferences() {
        versesDifferences.put(1, new String[]{"first", "a Partridge in a Pear Tree.\n"});
        versesDifferences.put(2, new String[]{"second", String.format("two Turtle Doves, and %s", versesDifferences.get(1)[1])});
        versesDifferences.put(3, new String[]{"third", String.format("three French Hens, %s", versesDifferences.get(2)[1])});
        versesDifferences.put(4, new String[]{"fourth", String.format("four Calling Birds, %s", versesDifferences.get(3)[1])});
        versesDifferences.put(5, new String[]{"fifth", String.format("five Gold Rings, %s", versesDifferences.get(4)[1])});
        versesDifferences.put(6, new String[]{"sixth", String.format("six Geese-a-Laying, %s", versesDifferences.get(5)[1])});
        versesDifferences.put(7, new String[]{"seventh", String.format("seven Swans-a-Swimming, %s", versesDifferences.get(6)[1])});
        versesDifferences.put(8, new String[]{"eighth", String.format("eight Maids-a-Milking, %s", versesDifferences.get(7)[1])});
        versesDifferences.put(9, new String[]{"ninth", String.format("nine Ladies Dancing, %s", versesDifferences.get(8)[1])});
        versesDifferences.put(10, new String[]{"tenth", String.format("ten Lords-a-Leaping, %s", versesDifferences.get(9)[1])});
        return versesDifferences;
    }

    String verse(int verseNumber) {
        String[] getDifferences = addDifferences().get(verseNumber);
        if(getDifferences.length < 3) {
            for(int i = 0; i < getDifferences.length - 1; i++) {
                verses.append(String.format("On the %s day of Christmas my true love gave to me: %s",
                        getDifferences[i],
                        getDifferences[i + 1])
                );
            }
        }
        return verses.toString();
    }

    String verses(int startVerse, int endVerse) {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }
    
    String sing() {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }
}
