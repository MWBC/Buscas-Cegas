package buscas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import problemas.No;
import problemas.Problema;

public class BuscaCustoUniforme {

	long tempoInicio = System.currentTimeMillis();
	
	public void Busca(Problema problema, Enum inicio, Enum objetivo) {
		
		List<No> borda = new LinkedList<No>();
		List<No> sucessores = new ArrayList<No>();
		No noAtual = new No(inicio, 0, null);
		borda.add(noAtual);
		boolean solucao = false;
		List<Enum> visitados = new ArrayList<Enum>();
		boolean estaNaBorda;
		
		while(!solucao) {
			
			estaNaBorda = false;
			
			if(borda.isEmpty()) {
				
				System.out.println("Falha!");
				solucao = true;
				
			}else {
				
				noAtual = borda.get(0);
				borda.remove(0);
				
				if(problema.testeObjetivo(noAtual, objetivo)) {
					
					problema.CaminhoPercorridoUniforme(noAtual);
					solucao = true;
				
				}else {
					
					visitados.add(noAtual.getEstado());
					sucessores = problema.funcaoSucessora(noAtual.getEstado());
					
					if(sucessores != null) {
						
						for(No no: sucessores) {
							
							No filho = problema.criaNo(noAtual, no.getCusto() + noAtual.getCusto(), no.getEstado(), no.getAcao());
							
							if(!(visitados.contains(filho.getEstado()))) {
								
								for(No y: borda) {
									
									if(y.getEstado().equals(filho.getEstado())) { 
										
										estaNaBorda = true;
										
										if(y.getCusto() > filho.getCusto()) {
											
											borda.remove(y);
											borda.add(filho);
											
										}
										
									}
								}
								if(!estaNaBorda) {
									
									borda.add(filho);
								}
								
								Collections.sort(borda);
							}
							
						}
					}
					
				}
				}
		}
			
		System.out.println("Tempo total da busca em Custo Uniforme: " + (System.currentTimeMillis() - tempoInicio) + "ms");
		System.out.println();
		}

}