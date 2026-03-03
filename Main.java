import java.util.HashMap;
import java.util.Map;

/**
 * OOPS Banner App - UC8
 *
 * Uses HashMap to store character patterns
 * and renders the word "OOPS" in banner format.
 *
 * Concepts Used:
 * - HashMap (Collections Framework)
 * - Static Utility Methods
 * - Nested Loops
 * - StringBuilder
 * - Modularity & Separation of Concerns
 */
public class Main {

    /**
     * Builds and returns a HashMap containing
     * character patterns for O, P, and S.
     *
     * @return Map<Character, String[]>
     */
    public static Map<Character, String[]> buildCharacterPatterns() {

        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patternMap.put('P', new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        });

        patternMap.put('S', new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        });

        return patternMap;
    }

    /**
     * Prints banner message using stored patterns.
     *
     * @param message    Word to display
     * @param patternMap Map of character patterns
     */
    public static void printBanner(String message, Map<Character, String[]> patternMap) {

        int height = 7;

        for (int row = 0; row < height; row++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (int i = 0; i < message.length(); i++) {

                char currentChar = message.charAt(i);
                String[] pattern = patternMap.get(currentChar);

                if (pattern != null) {
                    lineBuilder.append(pattern[row]).append("  ");
                }
            }

            System.out.println(lineBuilder.toString());
        }
    }

    /**
     * Main Method
     */
    public static void main(String[] args) {

        Map<Character, String[]> patternMap = buildCharacterPatterns();

        printBanner("OOPS", patternMap);
    }
}
