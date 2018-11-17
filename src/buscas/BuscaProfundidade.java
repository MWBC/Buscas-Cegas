package buscas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

import problemas.No;
import problemas.Problema;

public class BuscaProfundidade {
	
	long tempoInicio = System.currentTimeMillis();
	
	public void Busca(Problema problema, Enum inicio, Enum destino) {
		
		List<No> sucessores = new ArrayList<No>();
		boolean solucao = false;
		Stack<No> borda = new Stack<No>();
		No noAtual = new No(inicio, 0, null);
		borda.push(noAtual);
		
		while(!solucao) {
			
			if(borda.empty()) {
				System.out.println("Falha!");
				solucao = true;
				
			}else {
				
				noAtual = borda.pop();

				if(problema.testeObjetivo(noAtual, destino)) {
					
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
		
		System.out.println("Tempo total da busca em Profundidade: " + (System.currentTimeMillis() - tempoInicio) + "ms");
		System.out.println();
	}
}
