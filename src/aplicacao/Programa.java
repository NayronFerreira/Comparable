package aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entidade.Funcionario;

public class Programa {

	public static void main(String[] args) {
		
		List <Funcionario>lista = new ArrayList<>();
		String path = "C:\\Users\\Nayron\\Downloads\\estudos.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String objeto = br.readLine();
			
			while (objeto!= null) {
				String [] vetor = objeto.split(",");
				Funcionario funcionario = new Funcionario(vetor[0], Double.parseDouble(vetor[1]));
				lista.add(funcionario);
				objeto= br.readLine();
			}
			
			Collections.sort(lista);
			for( Funcionario x : lista) {
				System.out.println(x.getNome()+", "+ x.getSalario());
			}
			
			
			
		}catch(IOException x) {}

	}

}
