package Controller;
import java.net.*;
import java.io.*;
/**
 *
 * @author Caleb Cragun
 */
public class HTTP_Ex {
    
    static void urlParts(){
        System.out.println("SHOW URL PIECES");
            try {
                // HTTP_URL to personal website
                URL url = new URL("http://thistleheim-gamecompany.rhcloud.com");
                System.out.println("URL used: " + url.toString());
                System.out.println("Protocol used: " + url.getProtocol());
                System.out.println("Authority used: " + url.getAuthority());
                System.out.println("Host: " + url.getHost());
                System.out.println("Port: " + url.getPort());
                System.out.println("Default port: " + url.getDefaultPort());

            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println();
    }
    
    static void showHTML(){
        System.out.println("SHOW HTML OF URL");
            try {
                URL url = new URL("http://thistleheim-gamecompany.rhcloud.com");
                URLConnection urlConnection = url.openConnection();
                HttpURLConnection connection = null;
                if (urlConnection instanceof HttpURLConnection) {
                    connection = (HttpURLConnection) urlConnection;
                } else {
                    System.out.println("Please enter a URL.");
                    return;
                }
                BufferedReader in = new BufferedReader(
                        new InputStreamReader(connection.getInputStream()));
                String urlString = "";
                String current;
                while ((current = in.readLine()) != null) {
                    urlString += current + "\n";
                }
                System.out.println(urlString);
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println();
    }
}
