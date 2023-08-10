package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.Exceptions.ErroDeConversaoDeAnoExeption;
import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {

        var scanner = new Scanner(System.in);
        var busca = "";
        var titulos = new ArrayList<Titulo>();
        var gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();


        while (!busca.equalsIgnoreCase("sair")) {
            System.out.print("Digite um filme para buscar: ");
            var filmeProcurado = scanner.next();

            if (filmeProcurado.equalsIgnoreCase("sair")) {
                break;
            }
            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(
                                "https://www.omdbapi.com/?t="
                                        + filmeProcurado.replace(" ", "+")
                                        + "&apikey=599c9261"))
                        .build();

                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
                String json = response.body();

                System.out.println(json);

                var meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
                System.out.println(meuTituloOmdb);

                var meuTitulo = new Titulo(meuTituloOmdb);
                System.out.println("---------");
                System.out.println(meuTitulo);

                titulos.add(meuTitulo);
            } catch (NumberFormatException e) {
                System.out.println("Aconteceu um erro de conversão");
                System.out.println(e.getMessage());
            } catch (ErroDeConversaoDeAnoExeption e) {
                System.out.println(e.getMessage());
            }

        }

        var escrita = new FileWriter("filmes.json");
        escrita.write(gson.toJson(titulos));
        escrita.close();
        System.out.println("O programa finalizou corretamente.");

    }
}
