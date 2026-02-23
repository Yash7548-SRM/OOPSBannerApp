public class OOPSBannerUC3 {

    public static void main(String[] args) {

        String[] O = {
                "  *****  ",
                " **   ** ",
                "**     **",
                "**     **",
                "**     **",
                " **   ** ",
                "  *****  "
        };

        String[] P = {
                "*******  ",
                "**    ** ",
                "**    ** ",
                "*******  ",
                "**       ",
                "**       ",
                "**       "
        };

        String[] S = {
                "  ****** ",
                " **      ",
                "**       ",
                "  *****  ",
                "       **",
                " **    **",
                "  ****** "
        };

        // Print O O P S (7 rows)
        for (int i = 0; i < 7; i++) {

            String line = String.join(" ",
                    O[i],   // First O
                    O[i],   // Second O
                    P[i],   // P
                    S[i]    // S
            );

            System.out.println(line);
        }
    }
}