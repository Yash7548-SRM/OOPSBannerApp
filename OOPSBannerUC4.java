public class OOPSBannerUC4 {

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

        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = String.join(" ",
                    O[i],   
                    O[i],   
                    P[i],   
                    S[i]    
            );
        }

        for (String line : banner) {
            System.out.println(line);
        }
    }
}