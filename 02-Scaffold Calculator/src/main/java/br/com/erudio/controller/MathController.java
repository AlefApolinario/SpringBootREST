package br.com.erudio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.service.MathService;

@RestController
public class MathController {

	@Autowired
	MathService mathService;

	@RequestMapping(value = "/soma/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double soma(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo)
			throws Exception {
		Double soma = mathService.soma(numberOne, numberTwo);
		return soma;
		
	}

	@RequestMapping(value = "/subtracao/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double subtracao(@PathVariable("numberOne") String numberOne,@PathVariable("numberTwo") String numberTwo) throws Exception {
		Double subtracao = mathService.subtracao(numberOne, numberTwo);
		return subtracao;
	}

	@RequestMapping(value = "/multiplicacao/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double multiplicacao(@PathVariable("numberOne") String numberOne,@PathVariable("numberTwo") String numberTwo) throws Exception {
		Double multiplicacao = mathService.multiplicacao(numberOne, numberTwo);
		return multiplicacao;
	}

	@RequestMapping(value = "/divisao/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double divisao(@PathVariable("numberOne") String numberOne,@PathVariable("numberTwo") String numberTwo) throws Exception {
		Double divisao = mathService.divisao(numberOne, numberTwo);
		return divisao;
	}

	@RequestMapping(value = "/media/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double media(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo)
			throws Exception {
		Double media = mathService.media(numberOne, numberTwo);
		return media;

	}

	@RequestMapping(value = "/raizquadrada/{numberOne}", method = RequestMethod.GET)
	public Double sum(@PathVariable("numberOne") String numberOne) throws Exception {
		Double raizQuadrada = mathService.raizQuadrada(numberOne);
		return raizQuadrada;
	}

}
