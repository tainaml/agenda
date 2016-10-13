package agenda.aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import agenda.dominio.Contato;
import agenda.dominio.ContatoTelefoneCelular;
import agenda.dominio.ContatoTelefoneComercial;
import agenda.dominio.ContatoTelefoneResidencial;

public class AplAgenda {

	static Scanner scanner;

	private List<Contato> contatos = new ArrayList<Contato>();

	public AplAgenda() {
		scanner = new Scanner(System.in);
	}
	
	public static void main(String[] args) {
		AplAgenda aplAgenda = new AplAgenda();
		
		int opcao = 0;
		do {
			System.out.println("1 - Adicionar Contato");
			System.out.println("2 - Listar Contatos");
			System.out.println("3 - Sair");
			opcao = scanner.nextInt();
			
			if (opcao < 1 || opcao > 3){
				System.out.println("Opcao Invalida");
			} else if (opcao == 1){
				aplAgenda.executarAdicionarTelefone();
			} else if (opcao == 2){
				aplAgenda.imprimirContatos();
			}
		} while (opcao != 3);
	}

	private void adicionarContato(Contato contato) {
		contatos.add(contato);
	}

	private void imprimirContatos() {
		for (Contato contato : contatos){
			System.out.println("Nome: " + contato.getNome() + " | Telefone: " + contato.getContato() + " | Tipo: " + contato.getTipo());
		}
	}

	public void executarMostrarContato() {
		imprimirContatos();
	}

	public void executarAdicionarTelefone() {
		int opcao = 0;
		do {
			System.out.println("1 - Adicionar Telefone Residencial");
			System.out.println("2 - Adicionar Telefone Comercial");
			System.out.println("3 - Adicionar Telefone Celular");
			System.out.println("4 - Sair");
			opcao = scanner.nextInt();
			
			if (opcao < 1 || opcao > 4){
				System.out.println("Opcao Invalida");
			} else if (opcao != 4){
				executarAdicionarTelefone(opcao);
			}
		} while (opcao != 4);
	}
	
	private void executarAdicionarTelefone(int tipo){
		scanner.nextLine();
		
		System.out.print("Digite o nome:");
		String nome = scanner.nextLine();

		if (tipo == 1){
			System.out.print("Digite o telefone Residencial:");
			String telefone = scanner.nextLine();
			
			ContatoTelefoneResidencial contato = new ContatoTelefoneResidencial();
			contato.setNome(nome);
			contato.setContato(telefone);
			
			adicionarContato(contato);
		} else if (tipo == 2){
			System.out.print("Digite o telefone Comercial:");
			String telefone = scanner.nextLine();
			
			ContatoTelefoneComercial contato = new ContatoTelefoneComercial();
			contato.setNome(nome);
			contato.setContato(telefone);
			
			adicionarContato(contato);
		} else if (tipo == 3){
			System.out.print("Digite o telefone Celular:");
			String telefone = scanner.nextLine();
			
			ContatoTelefoneCelular contato = new ContatoTelefoneCelular();
			contato.setNome(nome);
			contato.setContato(telefone);
			
			adicionarContato(contato);
		}
		
		System.out.println("Contato adicionado com sucesso");
		
	}

}
