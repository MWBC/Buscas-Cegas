package acoes_estados;

import java.util.HashMap;
import java.util.List;

import problemas.No;

public class HeuristicaMapaRomenia extends Heuristica{

	public HeuristicaMapaRomenia() {
	
		this.h = new HashMap<Enum, Integer>();
		
		h.put(EstadosMapaRomenia.Arad, 366);
		h.put(EstadosMapaRomenia.Bucareste, 0);
		h.put(EstadosMapaRomenia.Craiova, 160);
		h.put(EstadosMapaRomenia.Drobeta, 242);
		h.put(EstadosMapaRomenia.Eforie, 161);
		h.put(EstadosMapaRomenia.Fagaras, 176);
		h.put(EstadosMapaRomenia.Giurgiu, 77);
		h.put(EstadosMapaRomenia.Hirsova, 151);
		h.put(EstadosMapaRomenia.Iasi, 226);
		h.put(EstadosMapaRomenia.Lugoj, 244);
		h.put(EstadosMapaRomenia.Mehadia, 241);
		h.put(EstadosMapaRomenia.Neamt, 234);
		h.put(EstadosMapaRomenia.Oradea, 380);
		h.put(EstadosMapaRomenia.Pitesti, 100);
		h.put(EstadosMapaRomenia.Rimnicu_Vilcea, 193);
		h.put(EstadosMapaRomenia.Sibiu, 253);
		h.put(EstadosMapaRomenia.Timisoara, 329);
		h.put(EstadosMapaRomenia.Urziceni, 80);
		h.put(EstadosMapaRomenia.Vaslui, 199);
		h.put(EstadosMapaRomenia.Zerind, 374);
		
	}

	@Override
	public No menorDistanciaReta(List<No> borda) {
		
		if(borda.size() == 1) {
			
			return borda.get(0);
		}
		No menor = borda.get(0);
		for(No noBorda: borda) {
			
			if(h.get(noBorda.getEstado()) < h.get(menor.getEstado())) {
				
				menor = noBorda;
			}
		}
		
		return menor;
	}
	
	@Override
	public No menorCustoEstimado(List<No> borda) {
		
		if(borda.size() == 1) {
			
			return borda.get(0);
		}
	
		No menor = borda.get(0);
		
		for(No noBorda: borda) {
			
			if((h.get(noBorda.getEstado()) + noBorda.getCusto()) < (h.get(menor.getEstado()) + menor.getCusto())) {
				
				menor = noBorda;
			}
		}
		
		return menor;
		
	}
	
}