package buscas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import problemas.No;
import problemas.Problema;

public class BuscaProfundidadeVisitados {

	long tempoInicio = System.currentTimeMillis();
	public void Busca(Problema problema, Enum inicio, Enum objetivo) {
		
		List<No> sucessores = new ArrayList<No>();
		List<Enum> visitados = new LinkedList<Enum>();
		Stack<No> borda = new Stack<No>();
		boolean solucao = false;
		No noAtual = new No(inicio, 0, null);
		borda.push(noAtual);
		
		while(!solucao) {
			
			if(borda.empty()) {
				
				System.out.println("Falha!");
				solucao = true;
			
			}else {
				
				noAtual = borda.pop();
				
				if(problema.testeObjetivo(noAtual, objetivo)) {
					
					problema.CaminhoPercorrido(noAtual);
					solucao = true;
				
				}else {
					
					visitados.add(noAtual.getEstado());
					sucessores = problema.funcaoSucessora(noAtual.getEstado());
					
					if(sucessores != null) {
						
						Collections.shuffle(sucessores);
						
						for(No no: sucessores) {
							
							No filho = problema.criaNo(noAtual, no.getCusto(), no.getEstado(), no.getAcao());
							
							if(!(visitados.contains(no.getEstado()))) {
								
								borda.push(filho);
							}
							
							
						}
					}

				}
			}
		}
		
		System.out.println("Tempo total da busca em Profundidade com Lista de Visitados: " + (System.currentTimeMillis() - tempoInicio) + "ms");
		System.out.println();
	}
}
