package DAO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import Entidade.Sorvete;
import Util.JpaUtil;

public class SorveteDAOImpl implements SorveteDAO {

	private EntityManager ent;
	private EntityTransaction tx;

	@Override
	public void salvar(Sorvete sorvete) {
		// TODO Auto-generated method stub
		try {
			this.ent = JpaUtil.getEntityManager();
			tx = ent.getTransaction();
			tx.begin();
			ent.persist(sorvete);
			tx.commit();

		} catch (Exception e) {
			if (ent.isOpen()) {
				tx.rollback();
			}
		} finally {
			if (ent.isOpen()) {
				ent.close();
			}
		}
	}

	@Override
	public void remover(String nome) {
		// TODO Auto-generated method stub
		try {
			this.ent = JpaUtil.getEntityManager();
			Sorvete sorveteRemover = ent.find(Sorvete.class, nome);
			tx = ent.getTransaction();
			tx.begin();
			ent.remove(sorveteRemover);
			tx.commit();

		} catch (Exception e) {
			if (ent.isOpen()) {
				tx.rollback();
			}
		} finally {
			if (ent.isOpen()) {
				ent.close();
			}
		}

	}

	@Override
	public void alterar(String nome) {
		// TODO Auto-generated method stub
		try {
			this.ent = JpaUtil.getEntityManager();
			Sorvete sorveteAlterar = ent.find(Sorvete.class, nome);
			tx = ent.getTransaction();
			tx.begin();
			ent.merge(sorveteAlterar);
			tx.commit();

		} catch (Exception e) {
			if (ent.isOpen()) {
				tx.rollback();
			}
		} finally {
			if (ent.isOpen()) {
				ent.close();
			}
		}

	}

	@Override
	public Sorvete pesquisar(String nome) {
		// TODO Auto-generated method stub
		this.ent = JpaUtil.getEntityManager();
		Sorvete sorvetePesquisar = ent.find(Sorvete.class, nome);

		/* Solução criada só pra monstrar no console */

		System.out.println(sorvetePesquisar.getNome());
		System.out.println(sorvetePesquisar.getFabricante());
		System.out.println(sorvetePesquisar.getIngrediente());
		System.out.println(sorvetePesquisar.getStatus());
		return sorvetePesquisar;
	}

	@Override
	public List<Sorvete> listarSorvetes() {
		// TODO Auto-generated method stub
		List<Sorvete> sorvetes = new ArrayList<Sorvete>();
		this.ent = JpaUtil.getEntityManager();

		Query query = ent.createQuery("from * SORVETE");

		sorvetes = query.getResultList();
		return sorvetes;
	}

}
