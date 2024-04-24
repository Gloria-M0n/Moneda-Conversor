import com.google.gson.*;

import java.io.*;
import java.net.*;
import java.net.http.*;

public class ConversorMonedas {
    private static final String API_KEY = "beb6278aa6332bc7f99fce01";
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/"+API_KEY+"/latest/USD";
    public static double convertirMonedas(String monedaOrigen, String monedaDestino, double cantidad) {
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(API_URL))
                .build();

        try {
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
            Gson gson = new Gson();
            JsonObject jsonObject = gson.fromJson(response.body(), JsonObject.class);
            JsonObject rates = jsonObject.getAsJsonObject("conversion_rates");

            double tasaDeCambioOrigen = rates.get(monedaOrigen).getAsDouble();
            double tasaDeCambioDestino = rates.get(monedaDestino).getAsDouble();

            return cantidad * (tasaDeCambioDestino / tasaDeCambioOrigen);
        }catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return -1;
        }
    }
}
