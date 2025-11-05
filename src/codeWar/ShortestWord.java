package codeWar;

public class ShortestWord {
    public static void main(String[] args) {
        String sentence = "I love java what do you love";
        String result = shortestWordInSentence(sentence);
        System.out.println("The shortest word is: " + result);
    }
    public static String shortestWordInSentence(String sentence) {
        String[] words = sentence.split(" ");
        String shortestWord = words[0];
        for (int count = 0; count < words.length; count++){
            String tempWord = words[count];
            if (tempWord.length() < shortestWord.length()){
                shortestWord = tempWord;
            }
        }
        return shortestWord;
    }
}
