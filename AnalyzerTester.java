import java.io.IOException; //Needed for case of failure
import java.nio.file.Paths; //Needed for locating and opening the file
import java.util.Scanner; //Needed for inout and outputs from and to the file
import java.util.ArrayList; //Needed for making the array

public class AnalyzerTester {
    public static void main (String[] args) throws IOException {

        System.out.print("Enter the name of the file : ");
        Scanner input = new Scanner(System.in);
        String file = input.next();
        input.close();

        ArrayList<Float> List = ReadFile(file);
        
        Analyzer.Max(List); //Finds and prints the max in the array
        Analyzer.Min(List); //Finds and prints the min in the array
        Analyzer.Avg(List); //Adds all elements together and devides by size then prints avg

        List.clear(); //Deletes the array when finished
    }

    //Precondition : Dont have a way of reading the file and making the array
    //Postcondition : Reads the file and creates array
    public static ArrayList<Float> ReadFile(String fileName) throws IOException {
        Scanner inFile = new Scanner(Paths.get(fileName),"UTF-8") ;
        
        ArrayList<Float> List = new ArrayList<Float>();

        do {
            float x = inFile.nextInt();
            List.add(x);
        } while (inFile.hasNext()) ; //Checks to see if we reached the end of the file

        inFile.close();

        return List;
    }
}
