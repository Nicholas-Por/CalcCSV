package sample;
//this will have to change according to how you update the text
//output file, or rather the CSV file
import java.io.FileReader;
import java.util.List;
import com.opencsv;

public class CSVReader {
    private static final String CSV_FILE_PATH
            = "D:\\EclipseWorkSpace\\CSVOperations\\results.csv"; //(csv data file location)
   // private static final String CSV_FILE_CUSTOM_SEPERATOR
           // = "D:\\EclipseWorkSpace\\CSVOperations\\results_semicolon_Seperator.csv";

    public static void main(String[] args) {

        System.out.println("Read Data Line by Line With Header \n");
        readDataLineByLine(CSV_FILE_PATH);
        System.out.println("_______________________________________________");

      //  System.out.println("Read All Data at Once and Hide the Header also \n");
       // readAllDataAtOnce(CSV_FILE_PATH);
       // System.out.println("_______________________________________________");

        //System.out.println("Custom Seperator here semi-colon\n");
       // readDataFromCustomSeperator(CSV_FILE_CUSTOM_SEPERATOR);
       // System.out.println("_______________________________________________");
    }

    public static void readDataLineByLine(String file) {

        try {

            // Create an object of filereader
            // class with CSV file as a parameter.
            FileReader filereader = new FileReader(file);

            // create csvReader object passing
            // file reader as a parameter
            CSVReader csvReader = new CSVReader(filereader);
            String[] nextRecord;

            // we are going to read data line by line
            while ((nextRecord = csvReader.readNext()) != null) {
                for (String cell : nextRecord) {
                    System.out.print(cell + "\t");
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

