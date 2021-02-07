package br.com.tradutor.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Traduzir {

	public Traduzir() {
		// TODO Auto-generated constructor stub
	}

	public String lerCSV(String palavraPortugues) throws IOException {
		BufferedReader br = null;
		String armazenaLinha = "";
		String leituraLinha = "";
		String[] linha = null;
		String[] coluna = null;
		String resultado = "";
		
		List<String[]> dicionario = new ArrayList<String[]>();
		Traduzir traduzir = new Traduzir();
		
		try {
			br = new BufferedReader(new FileReader("C:\\workspace-pessoal\\Tradutor\\WebContent\\arq\\Dicionario.csv"));
			
			while ((leituraLinha = br.readLine()) != null) {
				armazenaLinha = armazenaLinha + "\n" + leituraLinha;
			}
			
			linha = armazenaLinha.split("\n");
			
			for (int i = 0; i < linha.length; i++) {
				coluna = linha[i].split(";");
				dicionario.add(coluna);
			}
			
			return traduzir.traduz(dicionario, palavraPortugues);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return "Não foi possível realizar a tradução.";
	}
	
	
	
	
	public String traduz(List<String[]> dicionario, String palavraPortugues) {
		
		for (int i = 0; i < dicionario.size(); i++) {
			String tmpPalavra = dicionario.get(i)[0];
			if(tmpPalavra.equals(palavraPortugues)) {
				return dicionario.get(i)[1];
			}
		}
		
		return "Palavra não encontrada no dicionário.";
	}
	
}
