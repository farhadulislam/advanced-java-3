package multithreadingDemo1;

import com.sun.deploy.net.HttpRequest;
import sun.net.www.http.HttpClient;

import java.net.URI;

public class HttpClientDemo {

    public static void main (String [] args){

        HttpClient client = HttpClient.newHttpClient();

        HttpClient request = HttpRequest.newBuilder(URI.create("https://wwww.pluralsight.com")).build();
    }
}
