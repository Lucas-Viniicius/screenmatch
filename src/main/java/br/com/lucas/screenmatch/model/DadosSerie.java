package br.com.lucas.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true) // serve para ele não tentar converter oq não está dentro do record, e acabar gerando um erro
public record DadosSerie(@JsonAlias({"Title", "Titulo"}) String titulo, // com esse JsonAlias, vce pode criar um array de palavras para ele procurar alguam e associas com tiutlo
                        @JsonAlias("totalSeasons") Integer totalTemporadas,
                        @JsonAlias("imdbRating") String avaliacoes ) {
}
