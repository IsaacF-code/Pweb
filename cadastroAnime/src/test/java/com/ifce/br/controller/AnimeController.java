package com.ifce.br.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ifce.br.model.Anime;
import com.ifce.br.service.AnimeService;



@Controller
public class AnimeController {
	@Autowired
	private AnimeService animService;
	
	@GetMapping("/inicio")
	public String home() {
		return "inicio";
	}
	
	@GetMapping("/inicio/formulario")
	public String formulario() {
		return "formulario";
	}
	
	@GetMapping("/inicio/formulario/salvar")
	public String salvar(Anime anime) {
		animService.cadastrarAnim(anime);
		return "salvou";
	}
	
	@GetMapping("/inicio/lista")
	public ModelAndView listarAnim() {
		List<Anime> anime = animService.listarAnim();
		
		ModelAndView mv = new ModelAndView("lista");
		
		mv.addObject("listar", anime);
		
		return mv;
	}
	
}
