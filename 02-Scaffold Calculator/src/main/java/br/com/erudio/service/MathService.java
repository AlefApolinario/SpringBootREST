package br.com.erudio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.erudio.exception.UnsuportedMathOperationException;

@Service
public class MathService {
	
	@Autowired
	ConversorService conversorService;
	
	public Double soma(String numberOne, String numberTwo) throws UnsuportedMathOperationException {
		if(!conversorService.isNumeric(numberOne) || !conversorService.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please set a numeric value");
		}
		
		Double soma =  conversorService.convertToDouble(numberOne) + conversorService.convertToDouble(numberTwo); 
		return soma;
	}
	
	public Double subtracao(String numberOne,String numberTwo) throws UnsuportedMathOperationException {
		if(!conversorService.isNumeric(numberOne) || !conversorService.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please set a numeric value");
		}
		
		Double subtracao =  conversorService.convertToDouble(numberOne) - conversorService.convertToDouble(numberTwo); 
		return subtracao;
	}
	
	public Double multiplicacao(String numberOne,String numberTwo) throws UnsuportedMathOperationException {
		if(!conversorService.isNumeric(numberOne) || !conversorService.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please set a numeric value");
		}
		
		Double multiplicacao =   conversorService.convertToDouble(numberOne) * conversorService.convertToDouble(numberTwo);
		return multiplicacao;
	}
	
	public Double divisao(String numberOne,String numberTwo) throws UnsuportedMathOperationException {
		if(!conversorService.isNumeric(numberOne) || !conversorService.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please set a numeric value");
		}
		
		Double divisao =   conversorService.convertToDouble(numberOne) / conversorService.convertToDouble(numberTwo); 
		return divisao;
	}
	
	public Double media(String numberOne,String numberTwo) throws UnsuportedMathOperationException {
		if(!conversorService.isNumeric(numberOne) || !conversorService.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please set a numeric value");
		}
		
		Double media =   (conversorService.convertToDouble(numberOne) + conversorService.convertToDouble(numberTwo)/2); 
		return media;
	}

	
	public Double raizQuadrada(String numberOne)
			throws Exception {
		if (!conversorService.isNumeric(numberOne)) {
			throw new UnsuportedMathOperationException("Please set a numeric value");
		}

		Double raizquadrada =Math.sqrt(conversorService.convertToDouble(numberOne));
		return raizquadrada;
	}
	
	
}
