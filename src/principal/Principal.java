package principal;

import java.util.ArrayList;
import java.util.Arrays;

import acoes_estados.EstadosMapaRomenia;
import acoes_estados.EstadosMundoAspirador;
import buscas.BuscaAEstrela;
import buscas.BuscaAprofundamentoIterativo;
import buscas.BuscaCustoUniforme;
import buscas.BuscaGulosa;
import buscas.BuscaLargura;
import buscas.BuscaProfundidade;
import buscas.BuscaProfundidadeLimitada;
import buscas.BuscaProfundidadeVisitados;
import problemas.ProblemaMapaRomenia;
import problemas.ProblemaMundoAspirador;

public class Principal {

	public static void main(String[] args) {

		//Buscas em Largura
		//System.out.println("Busca em Largura:");
		//System.out.println();
		//BuscaLargura busca = new BuscaLargura();
		//busca.Busca(new ProblemaMapaRomenia(), EstadosMapaRomenia.Zerind, EstadosMapaRomenia.Bucareste);
		//busca.Busca(new ProblemaMundoAspirador(), EstadosMundoAspirador.DIR_SUJO_SUJO, null);
		
		//Buscas em Profundidade
		//System.out.println("Busca em Profundidade");
		//System.out.println();
		//BuscaProfundidade busca2 = new BuscaProfundidade();
		//busca2.Busca(new ProblemaMapaRomenia(), EstadosMapaRomenia.Zerind, EstadosMapaRomenia.Bucareste);
		//busca2.Busca(new ProblemaMundoAspirador(), EstadosMundoAspirador.DIR_SUJO_SUJO, null);
		
		//Buscas em Profundidade Limitada
		//System.out.println("Busca em Profundidade Limitada");
		//System.out.println();
		//BuscaProfundidadeLimitada busca3 = new BuscaProfundidadeLimitada();
		//busca3.Busca(new ProblemaMapaRomenia(), EstadosMapaRomenia.Zerind, EstadosMapaRomenia.Bucareste, 4);
		//busca3.Busca(new ProblemaMundoAspirador(), EstadosMundoAspirador.DIR_SUJO_SUJO, null, 3);
		
		//Buscas em Aprofundamento Iterativo
		//System.out.println("Busca em Aprofundamento Iterativo");
		//System.out.println();
		//BuscaAprofundamentoIterativo busca4 = new BuscaAprofundamentoIterativo();
		//busca4.Busca(new ProblemaMapaRomenia(), EstadosMapaRomenia.Zerind, EstadosMapaRomenia.Bucareste, 4);
		//busca4.Busca(new ProblemaMundoAspirador(), EstadosMundoAspirador.DIR_SUJO_SUJO, null, 3);
		
		//Busca de Custo Uniforme
		System.out.println("Busca de Custo Uniforme");
		BuscaCustoUniforme busca5 = new BuscaCustoUniforme();
		System.out.println();
		//busca5.Busca(new ProblemaMundoAspirador(), EstadosMundoAspirador.DIR_SUJO_SUJO, null);
		busca5.Busca(new ProblemaMapaRomenia(), EstadosMapaRomenia.Zerind, EstadosMapaRomenia.Bucareste);
		
		//Busca em Profundidade com Lista de Visitados
		//System.out.println("Busca em Profundidade com Lista de Visitados");
		//System.out.println();
		//BuscaProfundidadeVisitados busca6 = new BuscaProfundidadeVisitados();
		//busca6.Busca(new ProblemaMapaRomenia(), EstadosMapaRomenia.Zerind, EstadosMapaRomenia.Bucareste);
		//busca6.Busca(new ProblemaMundoAspirador(), EstadosMundoAspirador.DIR_SUJO_SUJO, null);
		
		//Busca Gulosa pela Melhor Escolha
		//System.out.println("Busca Gulosa pela Melhor Escolha");
		//System.out.println();
		//BuscaGulosa busca7 = new BuscaGulosa();
		//busca7.Busca(new ProblemaMapaRomenia(), EstadosMapaRomenia.Arad, EstadosMapaRomenia.Bucareste);
		//busca7.Busca(new ProblemaMundoAspirador(), EstadosMundoAspirador.DIR_SUJO_SUJO, null);
		
		//Busca A*
		System.out.println("Busca A*");
		System.out.println();
		BuscaAEstrela busca8 = new BuscaAEstrela();
		busca8.Busca(new ProblemaMapaRomenia(), EstadosMapaRomenia.Arad, EstadosMapaRomenia.Bucareste);
		//busca8.Busca(new ProblemaMundoAspirador(), EstadosMundoAspirador.DIR_SUJO_SUJO, null);
		
	}

}
