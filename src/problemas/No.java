package problemas;

public class No implements Comparable<No>{

	private Enum estado;
	private No pai;
	private int custo;
	private int profundidade = 0;
	private Enum acao;
	
	public No(Enum estado, int custo, Enum acao) {
		
		this.estado = estado;
		this.custo = custo;
		this.acao = acao;
	}
	
	public No(Enum estado, int custo) {
		
		this.estado = estado;
		this.custo = custo;
	}
	
	public Enum getAcao() {
		
		return acao;
	}
	public void setAcao(Enum acao) {
		
		this.acao = acao;
	}
	public Enum getEstado() {
		
		return estado;
	}
	public void setEstado(Enum estado) {
		
		this.estado = estado;
	}
	public No getPai() {
		
		return pai;
	}
	public void setPai(No pai) {
		
		this.pai = pai;
	}
	public int getCusto() {
		
		return custo;
	}
	public void setCusto(int custo) {
		
		this.custo = custo;
	}
	
	public void setProfundidade(int profundidade) {
		
		this.profundidade = profundidade;
	}
	public int getProfundidade() {
		
		return profundidade;
	}

	//método que realiza a comparação dos custos dos nós
	public int compareTo(No comparado) {
		
		if(this.getCusto() < comparado.getCusto()) {
			
			return -1;
		}
		
		if(this.getCusto() > comparado.getCusto()) {
			
			return 1;
		}
		return 0;
	}

	
}
