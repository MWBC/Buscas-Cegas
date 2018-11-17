package buscas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import problemas.No;
import problemas.Problema;

public class BuscaAprofundamentoIterativo {

	long tempoInicio = System.currentTimeMillis();
	
	public void Busca(Problema problema, Enum inicio, Enum objetivo, int limite) {
		
		Stack<No> borda = new Stack<No>();
		List<No> sucessores = new LinkedList<No>();
		List<Enum> visitados = new ArrayList<Enum>();
		boolean solucao = false;
		boolean solucaoSFalha = false;
		
		
		for(int i = 0; i <= limite; i++) {
			
			if(solucao && solucaoSFalha) {
				
				break;
			}
			
			solucao = false;
			int limiteAtual = i;
			System.out.println("limite: " + i);
			No noAtual = new No(inicio, 0, null);
			noAtual.setProfundidade(0);
			borda.push(noAtual);
			visitados.clear();
			
			while(!solucao){
				
				if(borda.size() == 0) {
					
					System.out.println("Falha!");
					solucao = true;
				
				}else {
					
					noAtual = borda.pop();
						
					if(problema.testeObjetivo(noAtual, objetivo)) {
						
						problema.CaminhoPercorrido(noAtual);
						solucao = true;
						solucaoSFalha = true;
						
					}else {
					
						if(noAtual.getProfundidade() < limiteAtual) {
							
							sucessores = problema.funcaoSucessora(noAtual.getEstado());
							visitados.add(noAtual.getEstado());
							
							if(sucessores != null) {
								
								Collections.shuffle(sucessores);
								
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
		}

		System.out.println("Tempo total da busca em Aprofundamento Iterativo com " + limite + " de limite: " + (System.currentTimeMillis() - tempoInicio) + "ms");
		System.out.println();
		
	}
}
