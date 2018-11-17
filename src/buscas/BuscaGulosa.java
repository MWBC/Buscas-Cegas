package buscas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import acoes_estados.Heuristica;
import acoes_estados.HeuristicaMapaRomenia;
import acoes_estados.HeuristicaMundoAspirador;
import problemas.No;
import problemas.Problema;
import problemas.ProblemaMapaRomenia;


public class BuscaGulosa {

	long tempoInicio = System.currentTimeMillis();
	
	public void Busca(Problema problema, Enum origem, Enum destino) {
		
		List<No> borda = new LinkedList<No>();
		No noAtual = new No(origem, 0, null);
		borda.add(noAtual);
		boolean solucao = false;
		List<No> sucessores = new ArrayList<No>();
		Heuristica heuristica;
		heuristica = (Heuristica) (problema.nome.equals("Mapa da Romenia")? new HeuristicaMapaRomenia(): new HeuristicaMundoAspirador());
		
		while(!solucao) {
			
			if(borda.isEmpty()) {
				
				System.out.println("Falha!");
				solucao = true;
			
			}else {
			
				noAtual = heuristica.menorDistanciaReta(borda);
				borda.remove(noAtual);
				
				if(problema.testeObjetivo(noAtual, destino)) {
					
					problema.CaminhoPercorrido(noAtual);
					solucao = true;
				
				}else {
					
					sucessores = problema.funcaoSucessora(noAtual.getEstado());
					
					if(sucessores != null) {
						
						for(No no: sucessores) {
							
							No filho = problema.criaNo(noAtual, no.getCusto(), no.getEstado(), no.getAcao());
							borda.add(filho);
						}
					}
				}
			}
		}
		
		System.out.println("Tempo total da busca Gulosa: " + (System.currentTimeMillis() - tempoInicio) + "ms");
		System.out.println();
	}
}
