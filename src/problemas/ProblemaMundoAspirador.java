package problemas;

import acoes_estados.AcoesMundoAspirador;
import acoes_estados.EstadosMundoAspirador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class ProblemaMundoAspirador extends Problema {

	public  ProblemaMundoAspirador() {
		
		this.nome = "Mundo do Aspirador de Pó";
		this.estados = new HashMap<Enum, List<No>>();
		
		List<No> auxEsqSujoSujo = new ArrayList<No>();
		
		auxEsqSujoSujo.add(new No(EstadosMundoAspirador.ESQ_SUJO_SUJO, 1, AcoesMundoAspirador.ESQ));
		auxEsqSujoSujo.add(new No(EstadosMundoAspirador.DIR_SUJO_SUJO, 1, AcoesMundoAspirador.DIR));
		auxEsqSujoSujo.add(new No(EstadosMundoAspirador.ESQ_LIMPO_SUJO, 1, AcoesMundoAspirador.ASP));
		
		estados.put(EstadosMundoAspirador.ESQ_SUJO_SUJO, auxEsqSujoSujo);
		
		List<No> auxDirSujoSujo = new ArrayList<No>();
		
		auxDirSujoSujo.add(new No(EstadosMundoAspirador.DIR_SUJO_SUJO, 1, AcoesMundoAspirador.DIR));
		auxDirSujoSujo.add(new No(EstadosMundoAspirador.ESQ_SUJO_SUJO, 1, AcoesMundoAspirador.ESQ));
		auxDirSujoSujo.add(new No(EstadosMundoAspirador.DIR_SUJO_LIMPO, 1, AcoesMundoAspirador.ASP));
		
		estados.put(EstadosMundoAspirador.DIR_SUJO_SUJO, auxDirSujoSujo);
		
		List<No> auxEsqLimpoSujo = new ArrayList<No>();
		
		auxEsqLimpoSujo.add(new No(EstadosMundoAspirador.ESQ_LIMPO_SUJO, 1, AcoesMundoAspirador.ESQ));
		auxEsqLimpoSujo.add(new No(EstadosMundoAspirador.DIR_LIMPO_SUJO, 1, AcoesMundoAspirador.DIR));
		auxEsqLimpoSujo.add(new No(EstadosMundoAspirador.ESQ_LIMPO_SUJO, 1, AcoesMundoAspirador.ASP));
		
		estados.put(EstadosMundoAspirador.ESQ_LIMPO_SUJO, auxEsqLimpoSujo);
		
		List<No> auxDirLimpoSujo = new ArrayList<No>();
		
		auxDirLimpoSujo.add(new No(EstadosMundoAspirador.DIR_LIMPO_SUJO, 1, AcoesMundoAspirador.DIR));
		auxDirLimpoSujo.add(new No(EstadosMundoAspirador.ESQ_LIMPO_SUJO, 1, AcoesMundoAspirador.ESQ));
		auxDirLimpoSujo.add(new No(EstadosMundoAspirador.DIR_LIMPO_LIMPO, 1, AcoesMundoAspirador.ASP));
		
		estados.put(EstadosMundoAspirador.DIR_LIMPO_SUJO, auxDirLimpoSujo);
		
		List<No> auxDirLimpoLimpo = new ArrayList<No>();
		
		auxDirLimpoLimpo.add(new No(EstadosMundoAspirador.DIR_LIMPO_LIMPO, 1, AcoesMundoAspirador.DIR));
		auxDirLimpoLimpo.add(new No(EstadosMundoAspirador.ESQ_LIMPO_LIMPO, 1, AcoesMundoAspirador.ESQ));
		auxDirLimpoLimpo.add(new No(EstadosMundoAspirador.DIR_LIMPO_LIMPO, 1, AcoesMundoAspirador.ASP));
		
		estados.put(EstadosMundoAspirador.DIR_LIMPO_LIMPO, auxDirLimpoLimpo);
		
		List<No> auxEsqSujoLimpo = new ArrayList<No>();
		
		auxEsqSujoLimpo.add(new No(EstadosMundoAspirador.DIR_SUJO_LIMPO, 1, AcoesMundoAspirador.DIR));
		auxEsqSujoLimpo.add(new No(EstadosMundoAspirador.ESQ_SUJO_LIMPO, 1, AcoesMundoAspirador.ESQ));
		auxEsqSujoLimpo.add(new No(EstadosMundoAspirador.ESQ_LIMPO_LIMPO, 1, AcoesMundoAspirador.ASP));
		
		estados.put(EstadosMundoAspirador.ESQ_SUJO_LIMPO, auxEsqSujoLimpo);
		
		List<No> auxDirSujoLimpo = new ArrayList<No>();
		
		auxDirSujoLimpo.add(new No(EstadosMundoAspirador.DIR_SUJO_LIMPO, 1, AcoesMundoAspirador.DIR));
		auxDirSujoLimpo.add(new No(EstadosMundoAspirador.ESQ_SUJO_LIMPO, 1, AcoesMundoAspirador.ESQ));
		auxDirSujoLimpo.add(new No(EstadosMundoAspirador.DIR_SUJO_LIMPO, 1, AcoesMundoAspirador.ASP));
		
		estados.put(EstadosMundoAspirador.DIR_SUJO_LIMPO, auxDirSujoLimpo);
		
		List<No> auxEsqLimpoLimpo = new ArrayList<No>();
		
		auxEsqLimpoLimpo.add(new No(EstadosMundoAspirador.ESQ_LIMPO_LIMPO, 1, AcoesMundoAspirador.ESQ));
		auxEsqLimpoLimpo.add(new No(EstadosMundoAspirador.DIR_LIMPO_LIMPO, 1, AcoesMundoAspirador.DIR));
		auxEsqLimpoLimpo.add(new No(EstadosMundoAspirador.ESQ_LIMPO_LIMPO, 1, AcoesMundoAspirador.ASP));
		
		estados.put(EstadosMundoAspirador.ESQ_LIMPO_LIMPO, auxEsqLimpoLimpo);
		
		
		
		
		
		
	}
	
	@Override
	public boolean testeObjetivo(No testado, Enum objetivo) {
		if(testado.getEstado().equals(EstadosMundoAspirador.DIR_LIMPO_LIMPO) || testado.getEstado().equals(EstadosMundoAspirador.ESQ_LIMPO_LIMPO)) {
			return true;
		}else {
			return false;
		}
		
		
	}

	@Override
	public ArrayList<No> funcaoSucessora(Enum estado) {
		List<No> possiveisEstados = new ArrayList<No>();
		possiveisEstados = this.estados.get(estado);
		return (ArrayList<No>) possiveisEstados;
	}

	@Override
	public void CaminhoPercorrido(No no) {
		
		List<No> caminho = new LinkedList<No>();
		
		while(no.getPai() != null) {
			
			caminho.add(no);
			no = no.getPai();
		}
		caminho.add(no);
		Collections.reverse(caminho);
		
		for(No x: caminho) {
			
			if(x.getAcao() == null) {
				
				System.out.println("Estado Inicial: " + x.getEstado());
			}else {
				
				System.out.println("Ação Executada: " + x.getAcao() + " || Estado Atual: " + x.getEstado());
			}
			
		}
		
	}

	@Override
	public No criaNo(No pai, int custo, Enum estado, Enum acao) {
		
		No filho = new No(estado, custo, acao);
		filho.setPai(pai);
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
			
			if(x.getAcao() == null) {
				
				System.out.println("Estado Inicial: " + x.getEstado());
			
			}else {
				
				System.out.println("Ação Executada: " + x.getAcao() + " || Estado Atual: " + x.getEstado() + " || Custo: " + x.getCusto());
			}
			
		}
	}
	
	

	
}
