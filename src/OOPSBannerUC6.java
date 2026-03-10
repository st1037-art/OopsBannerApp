public class OOPSBannerUC6 {

    // Method to generate pattern for O
    public static String[] getOPattern() {
        return new String[]{
                String.join("", " ", "*", "*", "*", "*", "*", " "),
                String.join("", "*", " ", " ", " ", " ", " ", "*"),
                String.join("", "*", " ", " ", " ", " ", " ", "*"),
                String.join("", "*", " ", " ", " ", " ", " ", "*"),
                String.join("", "*", " ", " ", " ", " ", " ", "*"),
                String.join("", "*", " ", " ", " ", " ", " ", "*"),
                String.join("", " ", "*", "*", "*", "*", "*", " ")
        };
    }

    // Method to generate pattern for P
    public static String[] getPPattern() {
        return new String[]{
                String.join("", "*", "*", "*", "*", "*", " "),
                String.join("", "*", " ", " ", " ", " ", "*"),
                String.join("", "*", " ", " ", " ", " ", "*"),
                String.join("", "*", "*", "*", "*", "*", " "),
                String.join("", "*", " ", " ", " ", " ", " "),
                String.join("", "*", " ", " ", " ", " ", " "),
                String.join("", "*", " ", " ", " ", " ", " ")
        };
    }

    // Method to generate pattern for S
    public static String[] getSPattern() {
        return new String[]{
                String.join("", " ", "*", "*", "*", "*", "*"),
                String.join("", "*", " ", " ", " ", " ", " "),
                String.join("", "*", " ", " ", " ", " ", " "),
                String.join("", " ", "*", "*", "*", "*", " "),
                String.join("", " ", " ", " ", " ", "*"),
                String.join("", " ", " ", " ", " ", "*"),
                String.join("", "*", "*", "*", "*", "*", " ")
        };
    }

    public static void main(String[] args) {

        String[] O = getOPattern();
        String[] P = getPPattern();
        String[] S = getSPattern();

        // Print banner using loop
        for (int i = 0; i < 7; i++) {
            System.out.println(O[i] + "  " + O[i] + "  " + P[i] + "  " + S[i]);
        }
    }
}