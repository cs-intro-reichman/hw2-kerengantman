//feedback

/*
Great work boaz!
*/

// Prints a crowd cheering output.
public class Cheers {
    public static void main(String[] args) {
        String RUNI = args[0];
        String number = args[1];
        int num = Integer.parseInt(number);
        String vowels = "AEFHILMNORSXaefhlmnorsx";
        int i = 0;
        while (i < RUNI.length()) {
            char c = RUNI.charAt(i);
            if (vowels.indexOf(c) == -1) {
                
                System.out.println("GIVE me a " + c +": " + c + "!");
            } else {
                System.out.println("GIVE me an " + c + ":" + c + "!");
            }
            i++;
        }
        System.out.println("What does that spell?");
        for (int j = 0; j < num; j++) {
            System.out.println(RUNI + "!!!");
        }
    }
}
