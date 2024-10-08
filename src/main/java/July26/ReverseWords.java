package July26;

public class ReverseWords {
    public static void main(String[] args) {
        String inputString = "My name is Harshi";
        ReverseWords reverseWords = new ReverseWords();
        reverseWords.reverseWords(inputString);
    }
    public String reverseWords(String s){
        int n = s.length();
        String[] words = s.split(" ");

        for(String word: words)
        {
            char[] characters = word.toCharArray();
            String reversed = "";
            for (int i = characters.length - 1; i >= 0; i--) {
                reversed += characters[i];
            }
            System.out.print
                    (reversed + " ");
        }
        return null;
    }
}
