package codeWar;

public class LongestWord {

    public static void main(String[] args) {
        String sentence = "The quick brown fox jumped";
        String result = findLongestInWordSentence(sentence);
        System.out.println("The longest word: " + result);
    }

    public static String findLongestInWordSentence(String sentence) {
        String longestWord = "";
        String[] words = sentence.split( " ");
        for (int count = 0; count < words.length; count++) {
            String tempWord = words[count];
            if (tempWord.length() > longestWord.length()){
                longestWord = tempWord;
            }
        }
        return longestWord;
    }
}