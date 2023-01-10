import java.util.ArrayList;

public class Analyzer {
    public static void Max(ArrayList<Float> list) {
        int size = list.size();

        float max = '\0';

        for (int x = 0 ; x < size ; x++) {
            float num = list.get(x);
            if ( max == '\0' || num > max ) {
                max = num;
            }
        }

        System.out.println(max);
    }
    public static void Min(ArrayList<Float> list) {
        int size = list.size();

        float min = '\0';

        for (int x = 0 ; x < size ; x++) {
            float num = list.get(x);
            if ( min == '\0' || num < min ) {
                min = num;
            }
        }

        System.out.println(min);
    }
    public static void Avg(ArrayList<Float> list) {
        int size = list.size();

        float avg = '\0';

        for (int x = 0 ; x < size ; x++) {
            float num = list.get(x);
            if ( avg == '\0' ) {
                avg = num;
            }
            else {
                avg += num;
            }
        }

        avg = avg/size;
        System.out.println(avg);
    }
}
