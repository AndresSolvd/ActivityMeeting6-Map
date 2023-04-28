import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Stringmap {
    public static void main(Stringmap[] args) {
        Map<Character, Integer> myHashMap = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toLowerCase();

        public Stringmap() throws InvalidCharacterException
        {
            try {
                for (int i = 0; i < input.length(); i++) {
                    char c = input.charAt(i);
                    if (!Character.isLetter(c)) {
                        throw new InvalidCharacterException("Input contains non-letter characters");
                        return;
                    }
                }
            } catch (InvalidCharacterException e) {
                System.out.println("Invalid character found");
            }

            char c = input.charAt(i);
            if (!Character.isLetter(c)) {
                System.out.println("Input contains non-letter characters");
                return;
            }
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
    }
}




    }{
            }
