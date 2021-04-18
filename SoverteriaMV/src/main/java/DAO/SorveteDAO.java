
package DAO;

import java.util.List;

import Entidade.Sorvete;

public interface SorveteDAO {

	public void salvar(Sorvete sorvete);

	public void remover(String nome);

	public void alterar(String nome);

	public Sorvete pesquisar(String nome);

	public List<Sorvete> listarSorvetes();
}
