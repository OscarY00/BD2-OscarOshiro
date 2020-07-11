package fabricante_modelo.bd2.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import fabricante_modelo.bd2.modal.Fabricante;
import fabricante_modelo.bd2.utils.HibernateUtil;

public class FabricanteDAO{

	public void getAllFabricantes() {
		EntityManager em = HibernateUtil.getEntityManager();
		String sql = "SELECT f FROM FABRICANTE f";
		TypedQuery<Fabricante> query = em.createQuery(sql, Fabricante.class);
		List<Fabricante> fabricantes = query.getResultList();
		System.out.println("Fabricantes: " + fabricantes);
	}
	
	
	public void getFabricanteByCod(Integer cod) {
		EntityManager em = HibernateUtil.getEntityManager();
		String sql = "select f from fabricante f where f.cod_fab = :cod";
		
		TypedQuery<Fabricante> query = em.createQuery(sql, Fabricante.class);
		query.setParameter("cod", cod);
		
		Fabricante fabricas = query.getSingleResult();
		
		System.out.println("Fabricantes por códigos: " + fabricas);
	}
	
	public void deleteFabricante(Integer cod) {
		EntityManager em = HibernateUtil.getEntityManager();
		Fabricante fabricante = em.find(Fabricante.class, cod);
		if(fabricante != null) {
			em.getTransaction().begin();
			em.remove(fabricante);
			em.getTransaction().commit();
		}else {
			System.out.println("Fabricante " + cod + "não encontrada");
		}
	}
	
	public void insertNewFabricante(Fabricante fab) {
		EntityManager em = HibernateUtil.getEntityManager();
		
		em.getTransaction().begin();
		em.persist(fab);
		em.getTransaction().commit();
		
		System.out.println("Valor gerado pelo insert: " + fab.getCod());
	}
	
	public void updateFabricante(Fabricante fab) {
		EntityManager em = HibernateUtil.getEntityManager();
		
		Fabricante objCargo = em.find(Fabricante.class, fab.getCod());
		if(objCargo != null) {
			em.getTransaction().begin();
			em.merge(fab);
			em.getTransaction().commit();
		}else {
			System.out.println("Fabricante" + fab.getCod() + "não encotrado.");
		}
	}
}
