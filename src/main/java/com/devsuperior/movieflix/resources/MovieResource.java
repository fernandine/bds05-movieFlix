package com.devsuperior.movieflix.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.movieflix.dto.MovieDTO;
import com.devsuperior.movieflix.dto.ReviewDTO;
import com.devsuperior.movieflix.services.MovieService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/movies")
public class MovieResource {

	@Autowired
	private MovieService service;

	@ApiOperation(value="O usuário visitante ou membro seleciona, opcionalmente, um gênero.")
	@GetMapping(value = "/{id}")
	public ResponseEntity<MovieDTO> findById(@PathVariable Long id){
		MovieDTO dto = service.findById(id);
		return ResponseEntity.ok().body(dto);
	}
	
	@ApiOperation(value="O sistema informa título, subtítulo, ano, imagem e sinopse do filme, e também uma listagem dos textos das avaliações daquele filme juntamente com nome do usuário que fez cada avaliação.")
	@GetMapping(value = "/{id}/reviews")
	public ResponseEntity<List<ReviewDTO>> findMovieReview(@PathVariable Long id){
		List<ReviewDTO> list = service.findMovieReview(id);
		return ResponseEntity.ok().body(list);
	}

	@ApiOperation(value="O usuário membro informa, opcionalmente, um texto para avaliação do filme.")
	@GetMapping
	public ResponseEntity<Page<MovieDTO>> findByGenre(
			@RequestParam(value = "genreId", defaultValue = "0") Long genreId, 
			Pageable pageable){
		Page<MovieDTO> page = service.findByGenre(genreId, pageable);
		return ResponseEntity.ok().body(page);
	}

}
