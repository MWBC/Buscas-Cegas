package buscas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import acoes_estados.Heuristica;
import acoes_estados.HeuristicaMapaRomenia;
import acoes_estados.HeuristicaMundoAspirador;
import problemas.No;
import problemas.Problema;

public class BuscaAEstrela {

	long tempoInicio = System.currentTimeMillis();
	
	public void Busca(Problema problema, Enum inicio, Enum objetivo) {
		
		List<No> borda = new LinkedList<No>();
		List<No> sucessores = new ArrayList<No>();
		No noAtual = new No(inicio, 0, null);
		borda.add(noAtual);
		boolean solucao = false;
		Heuristica heuristica = (problema.nome.equals("Mapa da Romenia"))? (new HeuristicaMapaRomenia()): (new HeuristicaMundoAspirador());
		
		while(!solucao) {
			
			if(borda.isEmpty()) {
				
				System.out.println("Falha!");
				solucao = true;
				
			}else {
				
				noAtual = heuristica.menorCustoEstimado(borda);
				borda.remove(noAtual);
				
				if(problema.testeObjetivo(noAtual, objetivo)) {
					
					problema.CaminhoPercorridoUniforme(noAtual);
					solucao = true;
					
				}else {
					
					sucessores = problema.funcaoSucessora(noAtual.getEstado());
					
					if(sucessores != null) {
						
						for(No no: sucessores) {
							
							No filho = problema.criaNo(noAtual, noAtual.getCusto() + no.getCusto(), no.getEstado(), no.getAcao());
							borda.add(filho);
						}
					}
				}
			}
		}
		
		System.out.println("Tempo total da busca A*: " + (System.currentTimeMillis() - tempoInicio) + "ms");
		System.out.println();
	}
}
