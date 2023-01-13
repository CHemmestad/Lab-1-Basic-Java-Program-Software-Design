import java.util.ArrayList;

public class Analyzer {
    //Precondition : Dont know which element in the array is the largest
    //Postcondition : Searches array to find largest element and prints result
    public static void Max(ArrayList<Float> list) {
        int size = list.size(); //Finds the size of the array for the average calculations

        float max = '\0';

        for (int x = 0 ; x < size ; x++) {
            float num = list.get(x);
            if ( max == '\0' || num > max ) {
                max = num; //Saves the largest element as it goes through the array
            }
        }

        System.out.println(max); //Prints the results
    }
    //Precondition : Dont know which element in the array is the smallest
    //Postcondition : Searches array to find the smallest element and prints result
    public static void Min(ArrayList<Float> list) {
        int size = list.size();

        float min = '\0';

        for (int x = 0 ; x < size ; x++) {
            float num = list.get(x);
            if ( min == '\0' || num < min ) {
                min = num; //Saves the smallest element as it goes through the array
            }
        }

        System.out.println(min); //Prints the results
    }
    //Precondition : Need to calculate the average from all the elements in the array
    //Postcondition : Adds all the elements of the array together, devides by size of array, then prints results
    public static void Avg(ArrayList<Float> list) {
        int size = list.size();

        float avg = '\0';

        for (int x = 0 ; x < size ; x++) {
            float num = list.get(x);
            if ( avg == '\0' ) {
                avg = num;
            }
            else {
                avg += num; //Adds the elements of the array as it goes through array
            }
        }

        avg = avg/size; //Divides the total by the size of the array for the avg
        System.out.println(avg); //Prints the results
    }
}
