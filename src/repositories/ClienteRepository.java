package repositories;

import java.io.PrintWriter;

import entities.Cliente;

public class ClienteRepository {
	public void gravarArquivo(Cliente cliente) {
		try {
			PrintWriter printWriter = new PrintWriter("c:\\temp\\cliente.txt");
			
			printWriter.write("\nID do cliente.......: " + cliente.getIdCliente());
			printWriter.write("\nNome do cliente.....: " + cliente.getNome());
			printWriter.write("\nEmail do cliente....: " + cliente.getEmail());
			printWriter.write("\nCPF do cliente......: " + cliente.getCpf());
			
			printWriter.flush();
			printWriter.close();
		}
		catch(Exception e) {
			System.out.println("\nOcorreu um erro ao gravar um arquivo " + e.getMessage());
			
		}
	}
}
