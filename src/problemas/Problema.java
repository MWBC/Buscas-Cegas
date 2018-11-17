package problemas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class Problema {

	public String nome;
	public HashMap<Enum, List<No>> estados;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public HashMap<Enum, List<No>> getEstados() {
		return estados;
	}
	public void setEstados(HashMap<Enum, List<No>> estados) {
		this.estados = estados;
	}
	
	public abstract boolean testeObjetivo(No testado, Enum objetivo);
	public abstract ArrayList<No> funcaoSucessora(Enum estado);
	public abstract void CaminhoPercorrido(No no);
	public abstract void CaminhoPercorridoUniforme(No no);
	public abstract No criaNo(No pai, int custo, Enum estado, Enum acao);
	
}
