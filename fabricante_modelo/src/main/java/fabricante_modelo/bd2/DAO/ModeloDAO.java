package fabricante_modelo.bd2.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import fabricante_modelo.bd2.modal.Modelo;
import fabricante_modelo.bd2.utils.HibernateUtil;

public class ModeloDAO {

	public void getAllModels() {
		EntityManager em = HibernateUtil.getEntityManager();
		String sql = "SELECT m FROM modelos m";
		TypedQuery<Modelo> query = em.createQuery(sql, Modelo.class);
		List<Modelo> models = query.getResultList();
		System.out.println("modelos: " + models);
	}
	
	public void getModelosByCod(Integer cod) {
		EntityManager em = HibernateUtil.getEntityManager();
		String sql = "SELECT M FROM MODELOS M WHERE M.COD_FAB = :COD";
		TypedQuery<Modelo> query = em.createQuery(sql, Modelo.class);
		query.setParameter("cod", cod);
		Modelo fabricantes = query.getSingleResult();
		System.out.println("Modelo por código: " + fabricantes);
	}
	
	public void deleteModelo(Integer cod) {
		EntityManager em = HibernateUtil.getEntityManager();
		Modelo model = em.find(Modelo.class, cod);
		if(model != null) {
			em.getTransaction().begin();
			em.remove(model);
			em.getTransaction().commit();
		}else {
			System.out.println("Modelo: " + cod + "não encontrado!");
		}
	}
	
	public void insertModelo(Modelo model) {
		EntityManager em = HibernateUtil.getEntityManager();
		em.getTransaction().begin();
		em.merge(model);
		em.getTransaction().commit();
		System.out.println("Valor gerado pelo Insert na tabela MODELO: " + model.getId());
	}
	
	public void updateModelo(Modelo model) {
		EntityManager em = HibernateUtil.getEntityManager();
		
		Modelo objCargo = em.find(Modelo.class, model.getId());
				if(objCargo != null) {
					em.getTransaction().begin();
					em.merge(model);
					em.getTransaction().commit();
				}else {
					System.out.println("Modelo" + model.getId() + "não encontrado!");
				}
	}
	
	
}
