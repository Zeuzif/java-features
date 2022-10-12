package java9.http;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {

	public static void main(String[] args)
			throws URISyntaxException, IOException, InterruptedException {
		HttpClient httpClient = HttpClient.newHttpClient();

		HttpRequest request = HttpRequest.newBuilder()
				.uri(new URI("https://postman-echo.com/get")).GET().build();

		HttpResponse<String> response = httpClient.send(request,
				HttpResponse.BodyHandlers.ofString());

		System.out.println(
				"Status of operation performed: " + response.statusCode());
		System.out.println(response.version());
	}

}
