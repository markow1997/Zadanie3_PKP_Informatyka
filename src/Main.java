import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        GetKayneQuote getKayneQuote = new GetKayneQuote();
        LinkedList<String> listQoutes = new LinkedList<>();
        String downloadQoute;
        Scanner scanner;
        String sprawdz;

        System.out.println("\n======================================");
        System.out.println("Aby pobierać kolejne cytaty wpisz next");
        System.out.println("======================================");
        do
        {
            downloadQoute = getKayneQuote.getQuote();
            System.out.println(downloadQoute);
            listQoutes.add(downloadQoute);
            scanner = new Scanner(System.in);
            sprawdz = scanner.next();
        }while (sprawdz.hashCode() == ("next".hashCode()));


        System.out.println("\n======================");
        System.out.println("Zapisana lista cytatow");
        System.out.println("======================");
        for (String s:listQoutes) {
            System.out.println(s);
        }
        
    }
}
