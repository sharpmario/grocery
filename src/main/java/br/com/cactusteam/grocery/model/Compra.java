package br.com.cactusteam.grocery.model;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class Compra {
	
	private Long id;
	private List<Item> itens;
	private LocalDate data;
	
	private Estabelecimento estabelecimento;
	
	public List<Item> getItens(){
		return Collections.unmodifiableList(itens);
	}

}