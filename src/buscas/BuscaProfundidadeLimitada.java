package buscas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import problemas.No;
import problemas.Problema;

public class BuscaProfundidadeLimitada {

	long tempoInicio = System.currentTimeMillis();
			
	public void Busca(Problema problema, Enum inicio, Enum objetivo, int limite) {
		
		List<No> sucessores = new LinkedList<No>();
		Stack<No> borda = new Stack<No>();
		List<Enum> visitados = new ArrayList<Enum>();
		boolean solucao = false;
		
		No noAtual = new No(inicio, 0, null);
		noAtual.setProfundidade(0);
		borda.push(noAtual);
		
		while(!solucao){
			
			if(borda.size() == 0) {
				
				System.out.println("Falha!");
				solucao = true;
			
			}else {
				
				noAtual = borda.pop();
					
					if(problema.testeObjetivo(noAtual, objetivo)) {
						
						problema.CaminhoPercorrido(noAtual);
						solucao = true;
						
				}else {
				
					if(noAtual.getProfundidade() < limite) {
						
						sucessores = problema.funcaoSucessora(noAtual.getEstado());
						
						if(sucessores != null) {
							
							Collections.shuffle(sucessores);
							visitados.add(noAtual.getEstado());
							
							for(No no: sucessores) {
								
								No filho = problema.criaNo(noAtual, no.getCusto(), no.getEstado(), no.getAcao());
								filho.setProfundidade(noAtual.getProfundidade() +1);
								
								if(!(visitados.contains(filho.getEstado()))) {
									
									borda.push(filho);
								}
								
							}
						}
					}
				

				
				}
			
		}
		}
		
		System.out.println("Tempo total da busca em Profundidade Limitada com " + limite + " de limite: "  + (System.currentTimeMillis() - tempoInicio) + "ms");
		System.out.println();
	}
}
