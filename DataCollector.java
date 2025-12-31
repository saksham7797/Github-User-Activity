import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class DataCollector {

    private String userEvents(String userName) throws InterruptedException {
        String addr = "https://api.github.com/users/" + userName + "/events";

        HttpClient client = HttpClient.newHttpClient();
        
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(addr)).build();
        
        HttpResponse<String> response = null;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            System.out.println("Some error occured");
        }         
        return response.body();
    }

    public String parser(String userName) throws InterruptedException {
        String raw = userEvents(userName);
        // System.out.println(raw);
        String event;
        String name;
        int i = 0;
        while(true) {
            int index = raw.indexOf("\"type\":\"", i);
            if(index == -1) {
                break;
            }
            int end = raw.indexOf("\"", index + 8);
            
            event = raw.substring(index+8, end);
            i = end;

            int repoIndex = raw.indexOf("\"repo\":", end);
            int nameIndex = raw.indexOf("\"name\":\"", repoIndex);
            int nameEnd = raw.indexOf("\"", nameIndex + 8);

            name = raw.substring(nameIndex+8, nameEnd);


            String action;
            switch (event) {
                case "PushEvent" -> action = "Pushed commits to";
                case "IssuesEvent" -> action = "Opened an issue in";
                case "WatchEvent" -> action = "Starred";
                case "ForkEvent" -> action = "Forked";
                case "CreateEvent" -> action = "Created";
                default -> action = "Performed action (" + event + ") in";
            }

            System.out.println("- " + action + " " + name);
        }
        return "";
    }
}