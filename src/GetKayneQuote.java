import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;


public class GetKayneQuote {

    public String getQuote(){
        URL url;
        StringBuilder stringBuilder = new StringBuilder();
        Scanner scanner;
        try {
            url = new URL("https://api.kanye.rest");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestProperty("User-Agent", "Mozilla");
            connection.setRequestMethod("GET");
            connection.connect();
            scanner = new Scanner(connection.getInputStream());

            while(scanner.hasNext()){
                stringBuilder.append(scanner.nextLine());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        String quote = stringBuilder.toString();
        quote = quote.substring(9, quote.length()-1);
        return quote;
    }
}