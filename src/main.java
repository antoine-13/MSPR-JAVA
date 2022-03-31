import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class main {

    public static void main(String[] args) throws FileNotFoundException {

        File file_liste = new File("/opt/bin/MSPR1/src/GitFile/liste.txt");
        File file_staff = new File("/opt/bin/MSPR1/src/GitFile/staff.txt");
        ArrayList<String> liste;
        ArrayList<String> list_staff;

        ArrayList<String> stuff_staff = new ArrayList<>();

        liste = readFile.read(file_liste,"tabulation");
        list_staff = readFile.read(file_staff,"");

        new createIndex(list_staff);

        for (String staff:list_staff) {
            File temp = new File("/opt/bin/MSPR1/src/GitFile/"+staff+".txt");
            stuff_staff = readFile.read(temp,"");
            new createPersonnalPage(stuff_staff, liste, staff);
//            stuff_staff.add(readFile.read(temp));
        }

    }
}