package h1;

public class H1_main {
    public static void main(String[] args){
        double guthaben = -10;
        double monEingang = 10;
        int rating = 0;

        boolean warnhinweis = true;
        boolean negativ = true;

        if (guthaben < 0){
            negativ = true;
        } else {
            negativ = false;
        }
        if (guthaben > 0){
            rating += 3;
        }
        if (guthaben == 0){
            rating += 2;
        }
        if (guthaben < 0 && monEingang >= (guthaben * -1)){
            rating += 1;
        }

        if (guthaben < 0 && monEingang < (guthaben * -1)){
            rating -= 1;
        }

        if (guthaben < 0 && monEingang < (guthaben * -1) && rating < 0){
            warnhinweis = true;
        } else {
            warnhinweis = false;
        }

    }
}
