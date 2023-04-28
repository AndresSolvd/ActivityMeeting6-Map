
import java.util.*;

public class Main {
    public static void main(Stringmap[] args) {
        System.out.println("Hello world!");
        Map<Character, Integer> counts = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        Stringmap input = scanner.nextLine().toLowerCase();

        public main()
        throws InvalidCharacterException
        {
            }

        Map<Character, Integer> countMap = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!Character.isLetter(c)) {
                System.out.println("Input contains non-letter characters");
                return;
            }
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }


}