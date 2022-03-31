import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

public class createPersonnalPage {

    public createPersonnalPage(ArrayList<String> staff_sheet, ArrayList<String> liste_item, String name) throws FileNotFoundException {
        PrintStream fileOut = new PrintStream("/var/www/html/staff/" + name + ".html");
        System.setOut(fileOut);

        ArrayList<String> staff_item = get_staff_item(staff_sheet);


//      ECRITURE DU FICHIER HTML DE L'EMPLOYE
        System.out.println("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Title</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "\n" +
                "<p>" + staff_sheet.get(0) + "</p>\n" +
                "<img></img>" +
                "\n");

        for (String item_basis : liste_item) {
            System.out.println("<div>\n" +
                    "  <input type=\"checkbox\" id=\"item\" name=\"scales\" ");

            if (staff_item.contains(item_basis)) {
                System.out.println("checked");
            }

            System.out.println(">\n" +
                    "  <label for=\"" + item_basis + "\">" + item_basis + "</label>\n" +
                    "</div>");
        }

        System.out.println(
                "\n" +
                        "\n" +
                        "</body>\n" +
                        "</html>");

    }

    private ArrayList<String> get_staff_item(ArrayList<String> staff_sheet) {
        ArrayList<String> test = new ArrayList<>();
        for (int i = 0; i < staff_sheet.size(); i++) {
            if (i > 4) {
                test.add(staff_sheet.get(i));
            }
        }
        return test;
    }

}
