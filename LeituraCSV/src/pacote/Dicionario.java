package pacote;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Dicionario {

	public static void main(String[] args) {
		Dicionario obj = new Dicionario();
		obj.lerCSV();

	}

	public void lerCSV() {
		
		BufferedReader br = null;
		String armazenaLinha = "";
		String leituraLinha = "";
		String[] tmpLinha = null;
		String[] tmpColuna = null;
		List<String[]> lista = new ArrayList<String[]>();
		
		try {
			br = new BufferedReader(new FileReader("C:\\Users\\thiag\\OneDrive\\Documents\\Dicionario.csv"));
			
			while ((leituraLinha = br.readLine()) != null) {
				armazenaLinha = armazenaLinha + "\n" + leituraLinha;
			}

			tmpLinha = armazenaLinha.split("\n");

			for (int i = 0; i < tmpLinha.length; i++) { 
				tmpColuna = tmpLinha[i].split(";");
				lista.add(tmpColuna);
			}
			 
			System.out.println(lista.get(2)[0]);
			 

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}