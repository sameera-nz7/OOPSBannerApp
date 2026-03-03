/**
 * OOPS Banner App - UC7
 * 
 * Demonstrates storing character patterns inside an Inner Static Class
 * and printing the word "OOPS" in banner format.
 * 
 * Concepts Covered:
 * - Inner Static Class
 * - Encapsulation
 * - Arrays of Objects
 * - StringBuilder
 * - Abstraction
 * - Separation of Concerns
 */
public class Main {

    /**
     * Inner Static Class
     * Encapsulates a character and its corresponding 7-line banner pattern.
     */
    public static class CharacterPatternMap {

        private final char character;
        private final String[] pattern;

        /**
         * Constructor to initialize character and pattern
         *
         * @param character The character to store
         * @param pattern   The 7-line banner pattern of the character
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for character
         *
         * @return stored character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for pattern
         *
         * @return 7-line pattern array
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Utility method to retrieve pattern for a given character
     *
     * @param ch character whose pattern is required
     * @param patterns array of CharacterPatternMap objects
     * @return pattern array if found, otherwise null
     */
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] patterns) {
        for (CharacterPatternMap cp : patterns) {
            if (cp.getCharacter() == ch) {
                return cp.getPattern();
            }
        }
        return null;
    }

    /**
     * Utility method to print banner for a given word
     *
     * @param word word to display in banner format
     * @param patterns array of CharacterPatternMap objects
     */
    public static void printBanner(String word, CharacterPatternMap[] patterns) {

        int height = 7; // Each character pattern has 7 rows

        for (int row = 0; row < height; row++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (int i = 0; i < word.length(); i++) {

                char currentChar = word.charAt(i);
                String[] charPattern = getCharacterPattern(currentChar, patterns);

                if (charPattern != null) {
                    lineBuilder.append(charPattern[row]).append("  ");
                }
            }

            System.out.println(lineBuilder.toString());
        }
    }

    /**
     * Main Method
     *
     * Program execution starts here.
     */
    public static void main(String[] args) {

        // Define patterns for O, P, S

        CharacterPatternMap patternO = new CharacterPatternMap('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        CharacterPatternMap patternP = new CharacterPatternMap('P', new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        });

        CharacterPatternMap patternS = new CharacterPatternMap('S', new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        });

        // Array of CharacterPatternMap objects
        CharacterPatternMap[] patterns = { patternO, patternP, patternS };

        // Print OOPS banner
        printBanner("OOPS", patterns);
    }
}
