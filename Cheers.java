//feedback

/*
Great work boaz!
*/

// Prints a crowd cheering output.
public class Cheers {
    public static void main(String[] args) {
        String RUNI = args[0];
        int num = Integer.parseInt(args[1]);

        String anLetters = "AEFHILMNORSX";

        for (int i = 0; i < RUNI.length(); i++) {
            char c = RUNI.charAt(i);
            char upper = Character.toUpperCase(c);

            boolean useAn = anLetters.indexOf(upper) >= 0;
            String article = useAn ? "an" : "a";
            String spacing = useAn ? " " : "  ";

            System.out.println("Give me " + article + spacing + upper + ": " + upper + "!");
        }

        System.out.println("What does that spell?");
        String shouted = RUNI.toUpperCase();
        for (int j = 0; j < num; j++) {
            System.out.println(shouted + "!!!");
        }
    }
}
