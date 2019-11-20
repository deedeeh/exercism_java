class ReverseString {

    String reverse(String inputString) {
        StringBuilder reversedString = new StringBuilder(inputString);
        return reversedString.reverse().toString();
    }

}