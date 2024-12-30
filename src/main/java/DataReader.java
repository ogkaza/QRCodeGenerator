import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DataReader {

    public static String readData(String d) throws FileNotFoundException {
        String fileData = "";
        try(BufferedReader br = new BufferedReader(new FileReader(d))){
            String line;
            while((line = br.readLine()) != null){
                fileData += line;
            }
            return fileData;
        } catch (IOException e){
            System.out.println("Error -> " + e.getLocalizedMessage());
        }
        return "Oops";
    }
}
