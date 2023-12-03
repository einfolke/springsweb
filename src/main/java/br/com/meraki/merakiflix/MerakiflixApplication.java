package br.com.meraki.merakiflix;

import br.com.meraki.merakiflix.model.DadosSeries;
import br.com.meraki.merakiflix.service.ConsumoAPI;
import br.com.meraki.merakiflix.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MerakiflixApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MerakiflixApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoApi = new ConsumoAPI();
		var json = consumoApi.obterDados("https://www.omdbapi.com/?t=supernatural&apikey=9521fe11");
		System.out.println(json);
		ConverteDados conversor = new ConverteDados();
		DadosSeries dados = conversor.obterdados(json, DadosSeries.class);
		System.out.println(dados);
	}
}

