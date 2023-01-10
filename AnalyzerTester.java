import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class AnalyzerTester {
    public static void main (String[] args) throws IOException {

        System.out.print("Enter the name of the file : ");
        Scanner input = new Scanner(System.in);
        String file = input.next();
        input.close();

        ArrayList<Float> List = ReadFile(file);
        
        Analyzer.Max(List);
        Analyzer.Min(List);
        Analyzer.Avg(List);

        List.clear();
    }

    public static ArrayList<Float> ReadFile(String fileName) throws IOException {
        Scanner inFile = new Scanner(Paths.get(fileName),"UTF-8") ;
        
        ArrayList<Float> List = new ArrayList<Float>();

        do {
            float x = inFile.nextInt();
            List.add(x);
        } while (inFile.hasNext()) ;

        inFile.close();

        return List;
    }
}
