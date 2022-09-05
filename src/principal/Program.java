package principal;

import java.util.Scanner;

import entities.Cliente;
import repositories.ClienteRepository;

public class Program {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Cliente cliente = new Cliente();

		try {
			System.out.print("Digite o ID do cliente......:");
			cliente.setIdCliente(Integer.parseInt(scanner.nextLine()));

			System.out.print("Digite o nome do cliente....:");
			cliente.setNome(scanner.nextLine());

			System.out.print("Digite o email do cliente.:");
			cliente.setEmail(scanner.nextLine());

			System.out.print("Digite o CPF do cliente...:");
			cliente.setCpf(scanner.nextLine());
		} catch (Exception e) {

			System.out.println("\nOcorreu algum erro");
			System.out.println(e.getMessage());

		}

		System.out.println("\nDADOS DO CLIENTE");

		System.out.println("\tID: " + cliente.getIdCliente());
		System.out.println("\tNome: " + cliente.getNome());
		System.out.println("\tCPF: " + cliente.getCpf());
		System.out.println("\tEmail " + cliente.getEmail());
		
		ClienteRepository clienteRepository = new ClienteRepository();
		clienteRepository.gravarArquivo(cliente);
	}
}
