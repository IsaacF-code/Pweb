package com.ifce.br.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifce.br.model.Anime;
import com.ifce.br.repository.AnimeRepository;

@Service
public class AnimeService {
	
	@Autowired
	private AnimeRepository animRepo;
	
	public void cadastrarAnim(Anime anime) {
		animRepo.save(anime);
	}

	public List<Anime> listarAnim() {
		
		return animRepo.findAll();
	}
	
	
}
