package buscas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import problemas.Problema;
import problemas.No;

public class BuscaLargura {

	long tempoInicio = System.currentTimeMillis();
	
	public void Busca(Problema problema, Enum inicio, Enum objetivo) {
			
			List<No> sucessores = new ArrayList<No>();
			Queue<No> borda = new LinkedList<No>();
			No noAtual = new No(inicio, 0, null);
			borda.add(noAtual);
			boolean solucao = false;
			
			while(!solucao) {
				
				if(borda.isEmpty()) {
					
					System.out.println("Falha!");
					solucao = true;
					
				}else {
					
					noAtual = borda.poll();
					
					if(problema.testeObjetivo(noAtual, objetivo)) {
						
						problema.CaminhoPercorrido(noAtual);
						solucao = true;
						
						
					}else {
					
						sucessores = problema.funcaoSucessora(noAtual.getEstado());
						if(sucessores != null) {
							
							Collections.shuffle(sucessores);
							
							for(No no: sucessores) {
								
								No filho = problema.criaNo(noAtual, no.getCusto(), no.getEstado(), no.getAcao());
								borda.add(filho);
								
							}
						}
						
					
					}
					
				
			}
				
			}
			
			System.out.println("Tempo total da busca em Largura: " + (System.currentTimeMillis() - tempoInicio) + "ms");
			System.out.println();
		
		

	}



	

}
