package Sorveteria.SoverteriaMV;

import java.util.Scanner;

import DAO.SorveteDAO;
import DAO.SorveteDAOImpl;
import Entidade.Sorvete;

public class App {

	private Sorvete sorvete;

	public static void main(String[] args) {

		SorveteDAO sorveteDAO = new SorveteDAOImpl();
		Scanner input = new Scanner(System.in);

		System.out.println("Digite uma opção: " + "\n\t 1 - Adicionar sabor de sorvete."
				+ "\n\t 2 - Pesquisar sabor de sorvete." + "\n\t 3 - Remover sabor de sorvete. "
				+ "\n\t 4 - Listar sabores de sorvete." + "\n\t 5 - Sair do sistema.");
		int opcao = input.nextInt();

		switch (opcao) {

		case 1:
			System.out.println("------ Adicionar Sorvete ------");
			Sorvete adicionarSorvete = new Sorvete();

			System.out.print("Digite o Sabor: ");
			adicionarSorvete.setNome(input.nextLine());
			input.next();

			System.out.println("Digite o Fabricante: ");
			adicionarSorvete.setFabricante(input.nextLine());
			input.next();

			System.out.println("Digite os Ingredientes: ");
			adicionarSorvete.setIngrediente(input.nextLine());
			input.next();

			System.out.print("Digite o Status: ");
			adicionarSorvete.setStatus(input.nextLine());
			input.next();
			
			sorveteDAO.salvar(adicionarSorvete);

		case 2:
			System.out.println("------ Pesquisar Sorvete ------");
			System.out.println("Digite o sabor do sorvete: ");
			String sorvetePesquisar = input.nextLine();
			sorveteDAO.pesquisar(sorvetePesquisar);

		case 3:
			System.out.println("------ Pesquisar Sorvete ------");
			System.out.println("Digite o sabor do sorvete que deseja remover: ");
			String sorveteRemover = input.nextLine();
			sorveteDAO.remover(sorveteRemover);

		case 4:
			sorveteDAO.listarSorvetes();

		case 5:
			System.out.println("Sistema sendo encerrado.");
			System.exit(0);
		}

	}
}
