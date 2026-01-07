package br.com.lucas.screenmatch.service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiRest {
    public String pesquisar(String endereco){

        URI url = URI.create("http://www.omdbapi.com/?t="+endereco.trim().replace(" ", "+")+"&apikey=6acd3df0"); // trim(): retira os espaços em branco do começo e do fim / replace(): troca os espaços em branco por +

        HttpRequest request = HttpRequest.newBuilder()
            .uri(url) // endereço de onde vamos pedir as informações
            .GET() // define o método http utilizado nessa requisição
            .build(); // encerra o request

        HttpClient client = HttpClient.newHttpClient();

        HttpResponse<String> response = null;

        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        }catch(Exception e){
            e.getMessage();
        }

        String json = response.body();
        return json;
    }
}
