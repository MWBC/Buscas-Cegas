package problemas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import acoes_estados.EstadosMapaRomenia;

public class ProblemaMapaRomenia extends Problema {
	
	public  ProblemaMapaRomenia() {
		
		this.nome = "Mapa da Romenia";
		this.estados = new HashMap<Enum, List<No>>();
		
		List<No> auxZ = new ArrayList<No>();
		
		auxZ.add(new No(EstadosMapaRomenia.Arad, 75));
		auxZ.add(new No(EstadosMapaRomenia.Oradea, 71));
		
		estados.put(EstadosMapaRomenia.Zerind, auxZ);
		
		List<No> auxO = new ArrayList<No>();
		
		auxO.add(new No(EstadosMapaRomenia.Zerind, 71));
		auxO.add(new No(EstadosMapaRomenia.Sibiu, 151));
		
		estados.put(EstadosMapaRomenia.Oradea, auxO);
		
		List<No> auxA = new ArrayList<No>();
		
		auxA.add(new No(EstadosMapaRomenia.Zerind, 75));
		auxA.add(new No(EstadosMapaRomenia.Sibiu, 140));
		auxA.add(new No(EstadosMapaRomenia.Timisoara, 118));
		
		estados.put(EstadosMapaRomenia.Arad, auxA);
		
		List<No> auxS = new ArrayList<No>();
		
		auxS.add(new No(EstadosMapaRomenia.Arad, 140));
		auxS.add(new No(EstadosMapaRomenia.Oradea, 151));
		auxS.add(new No(EstadosMapaRomenia.Fagaras, 99));
		auxS.add(new No(EstadosMapaRomenia.Rimnicu_Vilcea, 80));
		
		estados.put(EstadosMapaRomenia.Sibiu, auxS);
		
		List<No> auxT = new ArrayList<No>();
		
		auxT.add(new No(EstadosMapaRomenia.Arad, 118));
		auxT.add(new No(EstadosMapaRomenia.Lugoj, 111));
		
		estados.put(EstadosMapaRomenia.Timisoara, auxT);
		
		List<No> auxL = new ArrayList<No>();
		
		auxL.add(new No(EstadosMapaRomenia.Timisoara, 111));
		auxL.add(new No(EstadosMapaRomenia.Mehadia, 70));
		
		estados.put(EstadosMapaRomenia.Lugoj, auxL);
		
		List<No> auxM = new ArrayList<No>();
		
		auxM.add(new No(EstadosMapaRomenia.Lugoj, 70));
		auxM.add(new No(EstadosMapaRomenia.Drobeta, 75));
		
		estados.put(EstadosMapaRomenia.Mehadia, auxM);
		
		List<No> auxD = new ArrayList<No>();
		
		auxD.add(new No(EstadosMapaRomenia.Mehadia, 75));
		auxD.add(new No(EstadosMapaRomenia.Craiova, 120));
		
		estados.put(EstadosMapaRomenia.Drobeta, auxD);
		
		List<No> auxC = new ArrayList<No>();
		
		auxC.add(new No(EstadosMapaRomenia.Drobeta, 120));
		auxC.add(new No(EstadosMapaRomenia.Rimnicu_Vilcea, 146));
		auxC.add(new No(EstadosMapaRomenia.Pitesti, 138));
		
		estados.put(EstadosMapaRomenia.Craiova, auxC);
		
		List<No> auxR = new ArrayList<No>();
		
		auxR.add(new No(EstadosMapaRomenia.Sibiu, 80));
		auxR.add(new No(EstadosMapaRomenia.Craiova, 146));
		auxR.add(new No(EstadosMapaRomenia.Pitesti, 97));
		
		estados.put(EstadosMapaRomenia.Rimnicu_Vilcea, auxR);
		
		List<No> auxP = new ArrayList<No>();
		
		auxP.add(new No(EstadosMapaRomenia.Rimnicu_Vilcea, 97));
		auxP.add(new No(EstadosMapaRomenia.Craiova, 138));
		auxP.add(new No(EstadosMapaRomenia.Bucareste, 101));
		
		estados.put(EstadosMapaRomenia.Pitesti, auxP);
		
		List<No> auxF = new ArrayList<No>();
		
		auxF.add(new No(EstadosMapaRomenia.Sibiu, 99));
		auxF.add(new No(EstadosMapaRomenia.Bucareste, 211));
		
		estados.put(EstadosMapaRomenia.Fagaras, auxF);
		
		List<No> auxB = new ArrayList<No>();
		
		auxB.add(new No(EstadosMapaRomenia.Fagaras, 211));
		auxB.add(new No(EstadosMapaRomenia.Pitesti, 101));
		auxB.add(new No(EstadosMapaRomenia.Giurgiu, 90));
		auxB.add(new No(EstadosMapaRomenia.Urziceni, 85));
		
		estados.put(EstadosMapaRomenia.Bucareste, auxB);
		
		List<No> auxG = new ArrayList<No>();
		
		auxG.add(new No(EstadosMapaRomenia.Bucareste, 90));
		
		estados.put(EstadosMapaRomenia.Giurgiu, auxG);
		
		List<No> auxU = new ArrayList<No>();
		
		auxU.add(new No(EstadosMapaRomenia.Bucareste, 85));
		auxU.add(new No(EstadosMapaRomenia.Vaslui, 142));
		auxU.add(new No(EstadosMapaRomenia.Hirsova, 98));
		
		estados.put(EstadosMapaRomenia.Urziceni, auxU);
		
		List<No> auxH = new ArrayList<No>();
		
		auxH.add(new No(EstadosMapaRomenia.Urziceni, 98));
		auxH.add(new No(EstadosMapaRomenia.Eforie, 86));
		
		estados.put(EstadosMapaRomenia.Hirsova, auxH);
		
		List<No> auxE = new ArrayList<No>();
		
		auxE.add(new No(EstadosMapaRomenia.Hirsova, 86));
		
		estados.put(EstadosMapaRomenia.Eforie, auxE);
		
		List<No> auxV = new ArrayList<No>();
		
		auxV.add(new No(EstadosMapaRomenia.Urziceni, 142));
		auxV.add(new No(EstadosMapaRomenia.Iasi, 92));
		
		estados.put(EstadosMapaRomenia.Vaslui, auxV);
		
		List<No> auxI = new ArrayList<No>();
		
		auxI.add(new No(EstadosMapaRomenia.Vaslui, 92));
		auxI.add(new No(EstadosMapaRomenia.Neamt, 87));
		
		estados.put(EstadosMapaRomenia.Iasi, auxI);
		
		List<No> auxN = new ArrayList<No>();
		
		auxN.add(new No(EstadosMapaRomenia.Iasi, 87));
		
		estados.put(EstadosMapaRomenia.Neamt, auxN);
		
	}
	@Override
	public boolean testeObjetivo(No testado, Enum objetivo) {
		
		if(testado.getEstado().equals(objetivo)) {
			return true;
		}
		
		return false;
	}

	@Override
	public ArrayList<No> funcaoSucessora(Enum estado) {
		
		List<No> possiveisEstados = new ArrayList<No>();
		possiveisEstados = this.estados.get(estado);
		return (ArrayList<No>)possiveisEstados;
	}
	@Override
	public void CaminhoPercorrido(No no) {
		
		List<No> caminho = new LinkedList<No>();
		int custoTotal = 0;
		
		while(no.getPai() != null) {
			
			caminho.add(no);
			no = no.getPai();
		}
		caminho.add(no);
		Collections.reverse(caminho);
		
		for(No x: caminho) {
			
			System.out.println("Nó: " + x.getEstado() + " || Custo: " + x.getCusto());
			custoTotal += x.getCusto();
		}
		
		System.out.println("Custo total: " + custoTotal);
		
	}
	
	@Override
	public No criaNo(No pai, int custo, Enum estado, Enum acao) {
		No filho = new No(estado, custo);
		filho.setPai(pai);
		filho.setAcao(null);

		return filho;
		
	}
	@Override
	public void CaminhoPercorridoUniforme(No no) {
			
		List<No> caminho = new LinkedList<No>();
		
		while(no.getPai() != null) {
			
			caminho.add(no);
			no = no.getPai();
		}
		caminho.add(no);
		Collections.reverse(caminho);
		
		for(No x: caminho) {
			
			System.out.println("Nó: " + x.getEstado() + " || Custo: " + x.getCusto());
			
		}
			
		}

}