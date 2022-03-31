import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

public class createIndex {

    public createIndex(ArrayList<String> List_Staff) throws FileNotFoundException {
        PrintStream fileOut = new PrintStream("/var/www/html/index.html");
        System.setOut(fileOut);

        java.util.Collections.sort(List_Staff);

        System.out.println("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Title</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "\n" +
                "<h1>INDEX</h1>\n" +
                "\n" +
                "<p>Liste des employés : </p>\n" +
                "\n");
        for (String staff : List_Staff) {
            System.out.println("<li><a href='staff/"+staff+".html'>"+staff+"</a>");
        }
        System.out.println(
                "\n" +
                        "\n" +
                        "</body>\n" +
                        "</html>");
    }


}
