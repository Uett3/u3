package h3;

public class H3_main {
    public static void main(String[] args){

        int max = 23;
        int fix = 21;
        int wartend = 1;
        boolean istVoll false;

        int freiePlätze = max - fix;

        istVoll = false;
        if (fix < max){

            if(wartend < freiePlätze){
                fix += wartend;
                wartend = 0;
            }else{
                fix += freiePlätze;
                wartend -= freiePlätze;
                istVoll = true;
            }

        } else {
            istVoll = true;
        }

        /* System.out.println(max);
        System.out.println(fix);
        System.out.println(wartend);
        System.out.println(istVoll);

         */
    }
}
