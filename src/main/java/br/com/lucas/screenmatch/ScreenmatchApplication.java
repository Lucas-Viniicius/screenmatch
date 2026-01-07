package br.com.lucas.screenmatch;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.lucas.screenmatch.model.DadosSerie;
import br.com.lucas.screenmatch.service.ApiRest;
import br.com.lucas.screenmatch.service.ConverteDados;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{

		var api = new ApiRest();
		var json = api.pesquisar("teen wolf");
		// System.out.println(json);

		ConverteDados conversor = new ConverteDados();
		DadosSerie dadosConvertidos = conversor.obterDados(json, DadosSerie.class);

		System.out.println(dadosConvertidos);
	}
}
