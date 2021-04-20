package Sorveteria.SoverteriaMV;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import DAO.SorveteDAO;
import DAO.SorveteDAOImpl;
import Entidade.Sorvete;

public class App {

	public static void main(String[] args) {

		SorveteDAO sorveteDAO = new SorveteDAOImpl();
		Scanner input = new Scanner(System.in);

		System.out.println("Digite uma opção: " + "\n\t 1 - Adicionar sabor de sorvete."
				+"\n\t 2 - Alterar informações de sorvete."
				+ "\n\t 3 - Pesquisar sabor de sorvete." + "\n\t 4 - Remover sabor de sorvete. "
				+ "\n\t 5 - Listar sabores de sorvete." + "\n\t 6 - Sair do sistema.");
		int opcao = input.nextInt();
		input.nextLine();

		switch (opcao) {
		case 1:

			System.out.println("------ Adicionar Sorvete ------");
			Sorvete adicionarSorvete = new Sorvete();

			System.out.print("Digite o Sabor: ");
			String nomeSorvete = input.nextLine();
			adicionarSorvete.setNome(nomeSorvete);

			System.out.print("Digite o Fabricante: ");
			String fabricanteSorvete = input.nextLine();
			adicionarSorvete.setFabricante(fabricanteSorvete);

			System.out.print("Digite os Ingredientes: ");
			String ingredienteSorvete = input.nextLine();
			adicionarSorvete.setIngrediente(ingredienteSorvete);

			System.out.print("Digite o Status: ");
			String statusSorvete = input.nextLine();
			adicionarSorvete.setStatus(statusSorvete);

			sorveteDAO.salvar(adicionarSorvete);
			break;
			
		case 2:
			
			System.out.println("------ Alterar Sorvete ------");
			System.out.println("Em construção");

			break;

		case 3:

			System.out.println("------ Pesquisar Sorvete ------");

			System.out.println("Digite o sabor do sorvete: ");
			String sorveteSabor = input.nextLine();

			sorveteDAO.pesquisar(sorveteSabor);
			break;

		case 4:
			System.out.println("------ Remover Sorvete ------");
			System.out.println("Digite o sabor do sorvete que deseja remover: ");
			String sorveteRemover = input.nextLine();

			sorveteDAO.remover(sorveteRemover);

			break;

		case 5:
			
			  List<Sorvete> listarSorvetes = new ArrayList<Sorvete>(); for (Sorvete sorvete
			 : listarSorvetes) { System.out.println(sorvete.getNome() + "\n" +
			  sorvete.getFabricante() + "\n" + sorvete.getIngrediente() + "\n" +
			  sorvete.getStatus()); }
			 

			sorveteDAO.listarSorvetes();

			break;

		case 6:
			System.out.println("Sistema sendo encerrado.");
			System.exit(0);
		}

	}
}
