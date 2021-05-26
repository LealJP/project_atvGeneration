package com.atividades.app.atividadesAula23.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/AtividadesAula23")
public class AtividadesAula23Controller {
	
	@GetMapping
	public String exercicio1() {
		return "Atividade 1 \n\nPara realizar essa primeira atividade eu utilizei as mentalidades de crescimento e"
				+ " persistência, além da habilidade de atenção aos detalhes.";
	}
	
	@GetMapping("/rota2")
	public String exercicio2() {
		return "Atividade 2 - Meus objetivos de aprendizagem para essa semana: \n\n1.Entender corretamente o "
				+ " funcionamento do framework Spring Boot. \n2. Entender corretamente para que"
				+ " serve e o funcionamento das camadas de uma aplicação web. \n3.Aprender como tratar"
				+ " status de erros range 4xx (erros do cliente). ";
	}
	

}
