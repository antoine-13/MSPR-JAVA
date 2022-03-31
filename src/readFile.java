import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class readFile {

    /**
     * Read the file line by line and display it
     *
     * @param file File to read
     * @return
     */
    public static ArrayList<String> read(File file, String mode) {
        ArrayList<String> item = new ArrayList<>();
        try {
            FileReader reader = new FileReader(file);
            BufferedReader buffered = new BufferedReader(reader);
            while (true) {
                String line = buffered.readLine();
                if (line == null) {
                    break;
                }

                if (mode.equals("tabulation")) { // utilisé pour récupérer les items présents dans la liste
                    String reg = ("\t");
                    String[] res = line.split(reg);
                    item.add(res[0]);
                }
                else {
                    item.add(line);
                }
            }
            buffered.close();
        } catch (IOException ex) {
            System.out.println("Erreur détectée dans la lecture");
        }
        return item;
    }



}