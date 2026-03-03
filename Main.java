public class Main {

    public static void main(String[] args) {

        String[] o = getOPattern();
        String[] p = getPPattern();
        String[] s = getSPattern();

        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = String.join(" ",
                    o[i], o[i], p[i], s[i]);
        }

        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Method for O
    public static String[] getOPattern() {
        return new String[] {
                " ******** ",
                " *      * ",
                " *      * ",
                " *      * ",
                " *      * ",
                " *      * ",
                " ******** "
        };
    }

    // Method for P
    public static String[] getPPattern() {
        return new String[] {
                " ******** ",
                " *      * ",
                " *      * ",
                " ******** ",
                " *        ",
                " *        ",
                " *        "
        };
    }

    // Method for S
    public static String[] getSPattern() {
        return new String[] {
                " *******  ",
                " *        ",
                " *        ",
                " *******  ",
                "        * ",
                "        * ",
                " *******  "
        };
    }
}


