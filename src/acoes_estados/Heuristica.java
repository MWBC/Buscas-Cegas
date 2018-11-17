package acoes_estados;

import java.util.HashMap;
import java.util.List;

import problemas.No;

public abstract class Heuristica {

	public HashMap<Enum, Integer> h;
	
	public abstract No menorDistanciaReta(List<No> borda);
	public abstract No menorCustoEstimado(List<No> borda);
	
}
