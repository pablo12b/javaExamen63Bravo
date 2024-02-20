package DAO;

import Modelo.Cuota;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateless
public class CuotaDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public void insert(Cuota cuota) {
		em.persist(cuota);
	}
}
