import java.util.Scanner;

public class PigLatin {


    public static void main(String[] args) {

        String userInput = userInput();
        print(userInput, translateTxt(userInput));


    }

    public static String userInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hi! That's the Pig Latin Translate. Enter your word or phrase on English below: ");
        String userInput = scan.nextLine();
        return userInput;
    }

    public static String translateTxt(String userInput) {
        String result = "";
        String[] words = userInput.split(" ");
        for (int i = 0; i < words.length; i++) {
            result += translateWord(words[i]);
        }
        return result;
    }

    public static String translateWord(String word) {

        char[] c = word.toCharArray();
        int length = countConsonantsClusters(word);


        if (c[0] == 'a' || c[0] == 'o' || c[0] == 'i' || c[0] == 'e' || c[0] == 'u') {
            return word + "way";
        }


        if (length > 1) {
            String cluster = word.substring(0, length);
            String afterCluster = word.substring(length);
            return afterCluster + cluster + "ay";
        } else {
            String newSubs1 = word.substring(1, word.length() + c[0]);
            return newSubs1 + "ay";
        }

    }


    public static void print(String userInput, String translateTxt) {
        System.out.println("You entered " + userInput + "\nAfter translating " + translateTxt);
    }

    public static int countConsonantsClusters(String userInput) {
        int count = 0;
        char[] c = userInput.toCharArray();

        for (int i = 0; i < c.length; i++) {

            if (c[i] == 'b' || c[i] == 'c' || c[i] == 'd' || c[i] == 'f' || c[i] == 'g' || c[i] == 'l' || c[i] == 'm' || c[i] == 'n' || c[i] == 'p' || c[i] == 'h') {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

}

