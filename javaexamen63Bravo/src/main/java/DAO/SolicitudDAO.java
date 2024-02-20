package DAO;

import Modelo.Solicitud;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateless
public class SolicitudDAO {

	@PersistenceContext
	private EntityManager em;
	
	public void insert(Solicitud solicitud) {
		em.persist(solicitud);
	}
}
