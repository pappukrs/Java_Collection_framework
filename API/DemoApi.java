package API;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class DemoApi {
    public static void main(String[] args) {
        System.out.println("DemoApi get called");

        var uri = "https://fakestoreapi.com/products";
        var request = HttpRequest.newBuilder().uri(URI.create(uri)).GET().build();
        var client = HttpClient.newBuilder().build();

        try {
            // Send sync request
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("Response Code: " + response.statusCode());
            System.out.println("Response Body: " + response.body());
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
