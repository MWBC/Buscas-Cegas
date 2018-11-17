package acoes_estados;

import java.util.HashMap;
import java.util.List;

import problemas.No;

public class HeuristicaMundoAspirador extends Heuristica{
	
	public HeuristicaMundoAspirador() {
		
		h = new HashMap<Enum, Integer>();
		h.put(EstadosMundoAspirador.DIR_LIMPO_LIMPO, 0);
		h.put(EstadosMundoAspirador.DIR_LIMPO_SUJO, 1);
		h.put(EstadosMundoAspirador.DIR_SUJO_LIMPO, 1);
		h.put(EstadosMundoAspirador.DIR_SUJO_SUJO, 2);
		h.put(EstadosMundoAspirador.ESQ_LIMPO_LIMPO, 0);
		h.put(EstadosMundoAspirador.ESQ_LIMPO_SUJO, 1);
		h.put(EstadosMundoAspirador.ESQ_SUJO_LIMPO, 1);
		h.put(EstadosMundoAspirador.ESQ_SUJO_SUJO, 2);
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
