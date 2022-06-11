package com.devsuperior.movieflix.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.movieflix.dto.MovieDTO;
import com.devsuperior.movieflix.services.MovieService;

@RestController
@RequestMapping(value = "/movies")
public class MovieResource {

	@Autowired
	private MovieService service;
	
	@GetMapping
	public ResponseEntity<Page<MovieDTO>> findAll(Pageable pageable) {
		PageRequest pageRequest = PageRequest.of(pageable.getPageNumber(), pageable.getPageSize(), Sort.by("title"));
		Page<MovieDTO> list = service.findAll(pageRequest);		
		return ResponseEntity.ok().body(list);
	}
}
