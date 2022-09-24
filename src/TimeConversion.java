
// Program that convert (sec or min,sec) into the format (hr min sec)

public class TimeConversion {
    public static void main(String[] A) {

        String time= getduration(65, 45);
        System.out.println(time);
        String time1= getduration(234567);
        System.out.println(time1);

    }

    public static String getduration(int m , int s){
        if (m<0 || (s<0 || s>59)){
            return ("invalid input");
        }else {
            int h = m/60;
            int m1 = m%60;
            String st = (h+"h "+m1+"m "+s+"s");
            return st;
        }
    }
    public static String getduration(int sec){
        if (sec<0){
            return ("invalid input");
        }else {
            int min = sec / 60;
            int sec1 = sec % 60;
            String s1= getduration(min , sec1);
            return s1;
        }

    }
}
