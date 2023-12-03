package br.com.meraki.merakiflix.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSeries(@JsonAlias ("Title") String Titulo,
                          @JsonAlias ("totalSeasons") Integer totalTemporadas,
                          @JsonAlias ("imdbRating") String avaliacao) {
}
