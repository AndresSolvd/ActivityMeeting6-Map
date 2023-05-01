import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<Character, Integer> myHashMap = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toLowerCase();

        try {
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (Character.isLetter(c)) {
                    myHashMap.put(c, myHashMap.getOrDefault(c, 0) + 1);
                } else {
                    throw new InvalidCharacterException("Invalid input: only alphabet characters accepted");
                }
            }
            for (Map.Entry<Character, Integer> entry : myHashMap.entrySet()) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        } catch (InvalidCharacterException e) {
            System.out.println(e.getMessage());
        }
    }
}

class InvalidCharacterException extends Exception {
    public InvalidCharacterException(String message) {
        super(message);
    }
}
