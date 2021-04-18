package Sorveteria.SoverteriaMV;

import javax.persistence.EntityManager;

import Util.JpaUtil;

public class TesteConexaoJPA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManager ent = JpaUtil.getEntityManager();
		System.out.println(ent.isOpen());

	}

}
