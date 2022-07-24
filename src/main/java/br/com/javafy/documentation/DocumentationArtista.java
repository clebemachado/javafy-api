package br.com.javafy.documentation;

import br.com.javafy.anotations.MagiaResponse;
import br.com.javafy.dto.spotify.artista.ArtistaDTO;
import br.com.javafy.exceptions.SpotifyException;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface DocumentationArtista {

    @Operation(summary = "Exibir um artista",
            description = "Exibir um artista especificado por Id.")
    @MagiaResponse
    public ResponseEntity<ArtistaDTO> artistById(@PathVariable("id") String id)
            throws SpotifyException;

    @Operation(summary = "Faz uma query no artista.",
            description = "Exibir uma lista de artista pesquisada.")
    @MagiaResponse
    public ResponseEntity<List<ArtistaDTO>> searchArtist(String query)
            throws SpotifyException;

}
